package com.squaresaresquare.github.util;

import com.mojang.blaze3d.platform.NativeImage;
import com.squaresaresquare.github.config.Config;
import org.apache.logging.log4j.util.TriConsumer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ImageManipulation {
    private static final int MAX_PIXEL_ART_MULTIPLE = 128;
    private static final int TILE_COLOR_TOLERANCE = 32;
    private static final int MAX_OFF_COLOR_PIXELS_PER_TILE = 1;

    public static BufferedImage decode(byte[] bytes) throws IOException {
        return ImageIO.read(new ByteArrayInputStream(bytes));
    }

    public static byte[] encode(BufferedImage image) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        ImageIO.write(image, "png", stream);
        return stream.toByteArray();
    }

    public static void processByteArrayInChunks(byte[] input, TriConsumer<byte[], Integer, Integer> consumer) {
        int packetSize = Config.COMMON.packetSize;
        int splits = (int)Math.ceil((double)input.length / packetSize);
        int split = 0;

        for (int i = 0; i < input.length; i += packetSize) {
            byte[] b = Arrays.copyOfRange(input, i, Math.min(input.length, i + packetSize));
            consumer.accept(b, split, splits);
            split++;
        }
    }

    public static NativeImage bufferedToNative(BufferedImage image) {
        NativeImage nativeImage = new NativeImage(image.getWidth(), image.getHeight(), false);
        ColorModel model = image.getColorModel();

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Object elements = image.getRaster().getDataElements(x, y, null);
                int abgr = model.getAlpha(elements) << 24 | model.getBlue(elements) << 16 | model.getGreen(elements) << 8 | model.getRed(elements);
                nativeImage.setPixelABGR(x, y, abgr);
            }
        }

        return nativeImage;
    }

    // $VF: Unable to simplify switch on enum
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    public static BufferedImage resizeImage(BufferedImage in) {
        int w = in.getWidth();
        int h = in.getHeight();

        float z = Math.min((float)Config.CLIENT.thumbnailSize / w, (float)Config.CLIENT.thumbnailSize / h);
        if (z < 0.032) {
            z = 0.032F;
        }

        if (z < 1.0F) {
            w = (int)(w * z);
            h = (int)(h * z);
        }

        if (w == in.getWidth()) {
            return in;
        }

        BufferedImage out = new BufferedImage(w, h, 2);
        resize(out, in, (float)in.getWidth() / w, 0, 0);
        return out;
    }

    private static int HSBtoARGB(float[] hsv, int alpha) {
        int colorNoAlpha = Color.HSBtoRGB(hsv[0], hsv[1], hsv[2]) & 16777215;
        return alpha << 24 | colorNoAlpha;
    }

    public static void resize(BufferedImage image, BufferedImage source, float zoom, int ox, int oy) {
        ColorModel sourceModel = source.getColorModel();

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int red = 0;
                int green = 0;
                int blue = 0;
                int alpha = 0;
                int samples = 0;

                for (int px = Math.max(0, (int)(ox + zoom * x)); px < Math.min(source.getWidth(), ox + zoom * (x + 1)); px++) {
                    for (int py = Math.max(0, (int)(oy + zoom * y)); py < Math.min(source.getHeight(), oy + zoom * (y + 1)); py++) {
                        Object elements = source.getRaster().getDataElements(px, py, null);
                        red += sourceModel.getRed(elements);
                        green += sourceModel.getGreen(elements);
                        blue += sourceModel.getBlue(elements);
                        alpha += sourceModel.getAlpha(elements);
                        samples++;
                    }
                }

                if (samples > 0) {
                    red /= samples;
                    green /= samples;
                    blue /= samples;
                    alpha /= samples;
                }

                image.setRGB(x, y, alpha << 24 | red << 16 | green << 8 | blue);
            }
        }
    }

    public static void dither(BufferedImage image, double dither) {
        ColorModel model = image.getColorModel();
        float[] hsv = new float[3];

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Object elements = image.getRaster().getDataElements(x, y, null);
                Color.RGBtoHSB(model.getRed(elements), model.getGreen(elements), model.getBlue(elements), hsv);

                for (int i = 1; i < 3; i++) {
                    if (x % 2 == y % 2) {
                        hsv[i] = (float)Math.min(1.0, hsv[i] + dither * 0.5);
                    } else {
                        hsv[i] = (float)Math.max(0.0, hsv[i] - dither * 0.5);
                    }
                }

                image.setRGB(x, y, HSBtoARGB(hsv, model.getAlpha(elements)));
            }
        }
    }

    public static void reduceColors(BufferedImage image, int bins) {
        float[] hsv = new float[3];
        float[][] hist = new float[3][256];
        int EXCLUDE_HUE = 1;
        ColorModel model = image.getColorModel();
        int base = image.getWidth() * image.getHeight();

        for (int channel = 1; channel < 3; channel++) {
            for (int x = 0; x < 256; x++) {
                hist[channel][x] = base / 255.0F;
            }
        }

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Object elements = image.getRaster().getDataElements(x, y, null);
                Color.RGBtoHSB(model.getRed(elements), model.getGreen(elements), model.getBlue(elements), hsv);

                for (int i = 0; i < 3; i++) {
                    hist[i][toByte(hsv[i])]++;
                }
            }
        }

        int binSize = (image.getWidth() * image.getHeight() + base) / bins;
        float[][] lookup = new float[3][256];

        for (int channel = 1; channel < 3; channel++) {
            int start = 0;

            for (int bin = 0; bin < bins; bin++) {
                int end = start;
                int sum = 0;

                int pixels;
                for (pixels = 0; pixels <= binSize && end < 256; end++) {
                    float v = hist[channel][end];
                    pixels += (int)v;
                    sum += (int)(end * v);
                }

                for (int b = start; b < end; b++) {
                    lookup[channel][b] = (float)sum / pixels / 255.0F;
                }

                start = end;
            }
        }

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Object elements = image.getRaster().getDataElements(x, y, null);
                Color.RGBtoHSB(model.getRed(elements), model.getGreen(elements), model.getBlue(elements), hsv);

                for (int channel = 1; channel < 3; channel++) {
                    hsv[channel] = lookup[channel][toByte(hsv[channel])];
                }

                image.setRGB(x, y, HSBtoARGB(hsv, model.getAlpha(elements)));
            }
        }
    }

    private static int toByte(float v) {
        return Math.min(255, Math.max(0, (int)(v * 255.0F)));
    }

    public static int getCurrentImagePixelZoomCache(BufferedImage currentImage, int zoomCache) {
        return zoomCache < 0 ? scanForPixelArtMultiple(currentImage) : zoomCache;
    }

    public static BufferedImage pixelateImage(BufferedImage currentImage, ImageManipulationsPixelatorSettings settings, int zoomCache) {
        BufferedImage pixelatedImage = new BufferedImage(settings.resolution * settings.width, settings.resolution * settings.height, 2);
        float zoom;
        if (settings.pixelArt) {
            if (zoomCache < 0) {
                zoom = getCurrentImagePixelZoomCache(currentImage, zoomCache);
            } else {
                zoom = zoomCache;
            }
        } else {
            float fx = (float)currentImage.getWidth() / pixelatedImage.getWidth();
            float fy = (float)currentImage.getHeight() / pixelatedImage.getHeight();
            zoom = (float)(Math.min(fx, fy) / settings.zoom);
        }

        int ox = (int)((currentImage.getWidth() - pixelatedImage.getWidth() * zoom) * settings.offsetX);
        int oy = (int)((currentImage.getHeight() - pixelatedImage.getHeight() * zoom) * settings.offsetY);
        if (settings.pixelArt) {
            ox = ox / (int)zoom * (int)zoom;
            oy = oy / (int)zoom * (int)zoom;
        }

        resize(pixelatedImage, currentImage, zoom, ox, oy);
        if (settings.dither > 0.0 && !settings.pixelArt) {
            if (settings.colors > 1) {
                dither(pixelatedImage, settings.dither / settings.colors);
            } else {
                dither(pixelatedImage, settings.dither / 16.0);
            }
        }

        if (settings.colors > 1 && !settings.pixelArt) {
            reduceColors(pixelatedImage, settings.colors);
        }

        return pixelatedImage;
    }

    public static int scanForPixelArtMultiple(BufferedImage image) {
        int maxMultiple = Math.min(64, Math.min(image.getWidth(), image.getHeight()));

        for (int multiple = maxMultiple; multiple > 1; multiple--) {
            if (image.getWidth() % multiple == 0 && image.getHeight() % multiple == 0 && isPixelArtMultiple(image, multiple)) {
                return multiple;
            }
        }

        return 1;
    }

    private static boolean isPixelArtMultiple(BufferedImage image, int multiple) {
        int tileX = 0;

        while (tileX < image.getWidth()) {
            for (int tileY = 0; tileY < image.getHeight(); tileY += multiple) {
                if (!isSingleColorTile(image, tileX, tileY, multiple)) {
                    return false;
                }
            }

            tileX += multiple;
        }

        return true;
    }

    private static boolean isSingleColorTile(BufferedImage image, int tileX, int tileY, int size) {
        long red = 0L;
        long green = 0L;
        long blue = 0L;
        long alpha = 0L;
        int samples = size * size;

        for (int x = tileX; x < tileX + size; x++) {
            for (int y = tileY; y < tileY + size; y++) {
                int color = image.getRGB(x, y);
                red += color >> 16 & 0xFF;
                green += color >> 8 & 0xFF;
                blue += color & 0xFF;
                alpha += color >> 24 & 0xFF;
            }
        }

        int averageRed = (int)(red / samples);
        int averageGreen = (int)(green / samples);
        int averageBlue = (int)(blue / samples);
        int averageAlpha = (int)(alpha / samples);
        int offColorPixels = 0;

        for (int x = tileX; x < tileX + size; x++) {
            for (int y = tileY; y < tileY + size; y++) {
                int color = image.getRGB(x, y);
                if (!isCloseColor(color, averageRed, averageGreen, averageBlue, averageAlpha)) {
                    if (++offColorPixels > 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static boolean isCloseColor(int color, int red, int green, int blue, int alpha) {
        return Math.abs((color >> 16 & 0xFF) - red) <= 16
                && Math.abs((color >> 8 & 0xFF) - green) <= 16
                && Math.abs((color & 0xFF) - blue) <= 16
                && Math.abs((color >> 24 & 0xFF) - alpha) <= 16;
    }
}
