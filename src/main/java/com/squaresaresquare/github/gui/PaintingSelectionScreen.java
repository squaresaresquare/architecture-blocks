package com.squaresaresquare.github.gui;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.MouseButtonEvent; // NEW Input System
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier; // Correct Mojang Name
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.world.entity.player.Inventory;

import java.util.ArrayList;
import java.util.List;

public class PaintingSelectionScreen extends Screen {

    private final List<Holder.Reference<PaintingVariant>> cachedVariants = new ArrayList<>();
    private static final Identifier BACKGROUND_TEXTURE = Identifier.fromNamespaceAndPath("architecture-blocks", "textures/gui/container/painting_station.png");

    private static final int SLOT_SIZE = 36;
    private static final int COLUMNS = 8;
    private static final int START_Y = 40;

    public PaintingSelectionScreen() {
        super(Component.literal("Select Painting Variant"));
    }

    @Override
    protected void init() {
        super.init();
        // Read directly from the client connection registry lookup if active
        if (this.minecraft != null && this.minecraft.getConnection() != null) {
            var lookup = this.minecraft.getConnection().registryAccess().lookupOrThrow(Registries.PAINTING_VARIANT);
            this.cachedVariants.addAll(lookup.listElements().toList());
        }
    }

    @Override
    public void extractRenderState(GuiGraphicsExtractor graphicsExtractor, int mouseX, int mouseY, float partialTick) {
        super.extractRenderState(graphicsExtractor, mouseX, mouseY, partialTick);

        if (this.cachedVariants.isEmpty()) return;

        int startX = graphicsExtractor.guiWidth() / 2 - 150;

        for (int i = 0; i < this.cachedVariants.size(); i++) {
            Holder.Reference<PaintingVariant> variantHolder = this.cachedVariants.get(i);
            PaintingVariant variant = variantHolder.value();

            int col = i % COLUMNS;
            int row = i / COLUMNS;
            int x = startX + (col * SLOT_SIZE);
            int y = START_Y + (row * SLOT_SIZE);

            // Light gray highlight check if mouse coordinates hover over the active grid bounding box
            int backgroundColor = isMouseOverSlot(mouseX, mouseY, x, y) ? 0xFF666666 : 0xFF444444;
            graphicsExtractor.fill(x, y, x + SLOT_SIZE - 2, y + SLOT_SIZE - 2, backgroundColor);

            // FIX: Using your variantHolder.key().identifier() conversion method
            renderPaintingIcon(graphicsExtractor, variantHolder.key().identifier(), x + 2, y + 2, SLOT_SIZE - 6, variant.width(), variant.height());
        }
    }

    private void renderPaintingIcon(GuiGraphicsExtractor graphicsExtractor, Identifier variantLocation, int x, int y, int targetSize, int blocksWidth, int blocksHeight) {
        Identifier spritePath = variantLocation.withPrefix("painting/");

        // FIXED: Using your shorter minecraft.getAtlasManager() lookups direct chain path
        var atlasManager = this.minecraft.getAtlasManager();
        var paintingAtlas = atlasManager.getAtlasOrThrow(Identifier.withDefaultNamespace("paintings"));
        TextureAtlasSprite sprite = paintingAtlas.getSprite(spritePath);

        if (sprite != null) {
            float ratio = (float) blocksWidth / (float) blocksHeight;
            int renderWidth = targetSize;
            int renderHeight = targetSize;

            if (ratio > 1.0f) {
                renderHeight = (int) (targetSize / ratio);
                y += (targetSize - renderHeight) / 2;
            } else if (ratio < 1.0f) {
                renderWidth = (int) (targetSize * ratio);
                x += (targetSize - renderWidth) / 2;
            }

            graphicsExtractor.blit(
                    RenderPipelines.GUI_TEXTURED,
                    sprite.atlasLocation(),
                    x, y,
                    0, 0,
                    renderWidth, renderHeight,
                    sprite.getX(), sprite.getY()
            );
        }
    }

    /**
     * FIXED 26.2 SELECTION PATTERN: Listening to the actual structural MouseButtonEvent payload wrapper
     */
    @Override
    public boolean mouseClicked(MouseButtonEvent event, boolean doubleClick) {
        // Only run click processing logic if the left mouse key goes down
        if (this.cachedVariants.isEmpty() || !event.isLeft()) {
            return super.mouseClicked(event, doubleClick); // 2 arguments parameter signature matches ContainerEventHandler
        }

        // Grab mouse cursor snapshot positions safely out of the active engine window metrics
        double mouseX = this.minecraft.mouseHandler.xpos() * (double) this.minecraft.getWindow().getGuiScaledWidth() / (double) this.minecraft.getWindow().getWidth();
        double mouseY = this.minecraft.mouseHandler.ypos() * (double) this.minecraft.getWindow().getGuiScaledHeight() / (double) this.minecraft.getWindow().getHeight();

        int startX = this.minecraft.getWindow().getGuiScaledWidth() / 2 - 150;

        for (int i = 0; i < this.cachedVariants.size(); i++) {
            int col = i % COLUMNS;
            int row = i / COLUMNS;
            int x = startX + (col * SLOT_SIZE);
            int y = START_Y + (row * SLOT_SIZE);

            if (isMouseOverSlot((int) mouseX, (int) mouseY, x, y)) {
                Holder.Reference<PaintingVariant> selectedVariant = this.cachedVariants.get(i);
                onVariantSelected(selectedVariant);
                return true;
            }
        }

        return super.mouseClicked(event, doubleClick);
    }

    private boolean isMouseOverSlot(int mouseX, int mouseY, int slotX, int slotY) {
        return mouseX >= slotX && mouseX <= slotX + SLOT_SIZE - 2 &&
                mouseY >= slotY && mouseY <= slotY + SLOT_SIZE - 2;
    }

    private void onVariantSelected(Holder.Reference<PaintingVariant> variantHolder) {
        System.out.println("Selected painting variant path: " + variantHolder.key().identifier());
        this.onClose();
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

}