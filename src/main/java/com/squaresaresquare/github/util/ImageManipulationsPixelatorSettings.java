package com.squaresaresquare.github.util;


import com.squaresaresquare.github.config.Config;
import java.awt.image.BufferedImage;

public final class ImageManipulationsPixelatorSettings {
   public double dither;
   public int colors;
   public int resolution;
   public int width;
   public int height;
   public double offsetX;
   public double offsetY;
   public double zoom;
   public boolean pixelArt;
   public boolean hidden = true;
   public boolean nsfw;

   public ImageManipulationsPixelatorSettings(
      double dither, int colors, int resolution, int width, int height, double offsetX, double offsetY, double zoom, boolean pixelArt
   ) {
      this.dither = dither;
      this.colors = colors;
      this.resolution = resolution;
      this.width = width;
      this.height = height;
      this.offsetX = offsetX;
      this.offsetY = offsetY;
      this.zoom = zoom;
      this.pixelArt = pixelArt;
   }

   public ImageManipulationsPixelatorSettings(BufferedImage currentImage) {
      this(currentImage, Config.COMMON.minPaintingResolution, Config.COMMON.maxPaintingResolution);
   }

   ImageManipulationsPixelatorSettings(BufferedImage currentImage, int minResolution, int maxResolution) {
      this(0.0, 10, Math.clamp(64L, minResolution, maxResolution), 1, 1, 0.5, 0.5, 1.0, false);
      double target = (double)currentImage.getWidth() / currentImage.getHeight();
      double bestScore = 100.0;
      double d = Math.sqrt(currentImage.getWidth() * currentImage.getWidth() + currentImage.getHeight() * currentImage.getHeight());
      double dw = currentImage.getWidth() / d;
      double dh = currentImage.getHeight() / d;

      for (double diagonal = 3.0; diagonal < 6.0; diagonal += target) {
         int pw = (int)Math.ceil(dw * diagonal);
         int ph = (int)Math.ceil(dh * diagonal);
         double e = Math.abs((double)pw / ph - target) * Math.sqrt(5 + this.width + this.height);
         if (e < bestScore) {
            this.width = Math.max(1, Math.min(16, pw));
            this.height = Math.max(1, Math.min(16, ph));
            bestScore = e;
         }
      }
   }
}
