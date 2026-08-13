package com.squaresaresquare.github.screen;

import com.squaresaresquare.github.records.PaintingsRecord;
import com.squaresaresquare.github.util.StonecutterScreenAccessor;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.StonecutterScreen;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.StonecutterMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.SelectableRecipe;
import net.minecraft.world.item.crafting.StonecutterRecipe;

public class PaintingStationScreen extends StonecutterScreen implements StonecutterScreenAccessor {

    public PaintingStationScreen(StonecutterMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
    }

    private static final Identifier BG_LOCATION = Identifier.fromNamespaceAndPath("minecraft", "textures/gui/container/stonecutter.png");

    public int startIndex;
    public int leftPos;
    public int topPos;
    private float scrollOffs;
    private boolean scrolling;

    @Override
    public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTick) {
        int i = this.leftPos;
        int j = this.topPos;

        float bgU0 = 0.0F / 256.0F;
        float bgU1 = 176.0F / 256.0F;
        float bgV0 = 0.0F / 256.0F;
        float bgV1 = 166.0F / 256.0F;
        guiGraphics.blit(BG_LOCATION, i, j, i + 176, j + 166, bgU0, bgU1, bgV0, bgV1);

        int k = (int)(41.0F * this.scrollOffs);

        float scrollU0 = 176.0F / 256.0F;
        float scrollU1 = (176.0F + 12.0F) / 256.0F;

        if (!this.isScrollBarActive()) {
            scrollU0 = (176.0F + 12.0F) / 256.0F;
            scrollU1 = (176.0F + 24.0F) / 256.0F;
        }

        float scrollV0 = 0.0F / 256.0F;
        float scrollV1 = 15.0F / 256.0F;

        guiGraphics.blit(BG_LOCATION, i + 119, j + 14 + k, i + 119 + 12, j + 14 + k + 15, scrollU0, scrollU1, scrollV0, scrollV1);
    }

    private boolean isScrollBarActive() {
        // FIXED: Access visible recipes from the inherited menu object
        return this.menu.getVisibleRecipes().size() > 12;
    }

    @Override
    protected void extractLabels(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY) {
        super.extractLabels(guiGraphics, mouseX, mouseY);

        // FIXED: Pull item directly from the container input slot instead of the mouse hover target
        ItemStack inputItem = this.menu.getSlot(0).getItem();

        if (!inputItem.isEmpty() && inputItem.is(Items.PAINTING)) {
            int gridStartX = 52;
            int gridStartY = 14;
            int maxVisibleRecipes = Math.min(this.startIndex + 12, this.menu.getVisibleRecipes().size());

            for (int i = this.startIndex; i < maxVisibleRecipes; i++) {
                int buttonIndex = i - this.startIndex;
                int column = buttonIndex % 4;
                int row = buttonIndex / 4;
                int buttonX = gridStartX + column * 16;
                int buttonY = gridStartY + row * 18;

                // FIXED: Using this.menu instead of unresolved variable S
                SelectableRecipe.SingleInputEntry<StonecutterRecipe> entry = this.menu.getVisibleRecipes().entries().get(i);
                var recipeKeyOptional = entry.recipe().recipe();

                if (recipeKeyOptional.isPresent()) {
                    var recipeKey = recipeKeyOptional.get();
                    String pathName = recipeKey.id().identifier().getPath();

                    if (pathName.endsWith("_painting_from_stonecutting")) {
                        pathName = pathName.replace("_painting_from_stonecutting", "");
                    }

                    if (PaintingsRecord.PaintingMap.containsKey(pathName)) {
                        ItemStack dynamicDisplayStack = new ItemStack(Items.PAINTING);

                        var variantKey = ResourceKey.create(
                                Registries.PAINTING_VARIANT,
                                Identifier.fromNamespaceAndPath("architecture-blocks", pathName)
                        );

                        dynamicDisplayStack.set(DataComponents.PAINTING_VARIANT, net.minecraft.core.Holder.Reference.createStandAlone(null, variantKey));

                        guiGraphics.item(dynamicDisplayStack, buttonX + 2, buttonY + 2);
                    }
                }
            }
        }
    }

    @Override public int getLeftPos() { return this.leftPos; }
    @Override public int getTopPos() { return this.topPos; }
    @Override public int getStartIndex() { return this.startIndex; }
}
