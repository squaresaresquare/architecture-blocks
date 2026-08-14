package com.squaresaresquare.github.datagen;

import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.records.PaintingsRecord;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.block.ModBlocks;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.component.DataComponents;
import net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.StonecutterRecipe;

public class ModRecipeProvider extends FabricRecipeProvider{
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
        System.out.print("ModRecipeProvider constructor");
    }
    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider registries, @NotNull RecipeOutput exporter) {
        return new RecipeProvider(registries, exporter) {
            @Override
            public void buildRecipes() {


                //believe it or not this lets you give a painting to a stonecutter and choose the custom painting you want.
                PaintingsRecord.initialize();
                for (Map.Entry<String, PaintingsRecord.Painting> painting : PaintingsRecord.PaintingMap.entrySet()) {
                    this.paintingStonecutterRecipe(
                            exporter,
                            registries,
                            painting.getValue().resourceKey(),
                            painting.getKey()
                    );
                }

                //-----------
                  System.out.print("add the recipes");
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.INNER_ARCH_BLOCK, Blocks.QUARTZ_BRICKS, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_PILLAR_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_PILLAR_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_CORNER_PILLAR_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_CORNER_PILLAR_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_CORNER_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CORNER_WINDOW_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CORNER_WINDOW_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CORNER_WINDOW_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SLOT_WINDOW_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SLOT_WINDOW_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SLOT_WINDOW_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PILLARLESS_WINDOW_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PILLARLESS_WINDOW_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PILLARLESS_WINDOW_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_END_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_END_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_END_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_HALF_PILLAR_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_HALF_PILLAR_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_HALF_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_PILLAR_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_PILLAR_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_END_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_END_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_END_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_HALF_PILLAR_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_HALF_PILLAR_CAP, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_HALF_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_PILLAR_BASE, ModBlocks.WINDOW_BLANK, 1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_PILLAR_CAP, ModBlocks.WINDOW_BLANK,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL1, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL4, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL5, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL1, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL3, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL4, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL5, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL3, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL4, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL1, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL3, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL4, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL5, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL6, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL7, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL8, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL1, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL7, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL8, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL1, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL3, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL6, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL7, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL8, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL1, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL6, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL1, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL5, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL6, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL1, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL3, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL4, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL5, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL6, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL2, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL3, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL4, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL5, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SIMPLE_ARCHED_WINDOW_BETWEEN, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SIMPLE_ARCHED_WINDOW_LEFT, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SIMPLE_ARCHED_WINDOW_RIGHT, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_BETWEEN, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_CENTER, ModBlocks.WINDOW_BLANK,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_LEFT, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_RIGHT, Blocks.QUARTZ_BRICKS,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.HAY_BLOCK, ModBlocks.THATCH_BLOCK,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.HAY_BLOCK, ModBlocks.THATCH_PEAK_BLOCK,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CIRCLE_CORNER,Blocks.POLISHED_DIORITE,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_KEYHOLE_BLOCK,Blocks.POLISHED_DIORITE,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_KEYHOLE_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_CIRCLE_CORNER, Blocks.CONCRETE.white().asItem(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_CIRCLE_CORNER,Blocks.QUARTZ_BLOCK,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A2_BLOCK,Blocks.CONCRETE.white().asItem(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_A12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_B12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_C12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_D12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_E12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_F12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_G12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_H12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_I12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_J12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_K12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L1_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L2_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L3_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L4_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L5_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L6_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L7_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L8_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L9_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_L12_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER00_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER01_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER02_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER03_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER04_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER05_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER06_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER07_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER08_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER09_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER10_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER11_BLOCK,Blocks.CONCRETE.white(),1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSAIC_BORDER12_BLOCK,Blocks.CONCRETE.white(),1);
                //:::::::::::
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BLOCK, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', Blocks.QUARTZ_BLOCK)
                        .pattern("01")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_marble_block", this.has(ModBlocks.MARBLE_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR_BASE, 1)
                        .define('0', Blocks.SMOOTH_SANDSTONE)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .pattern("1")
                        .pattern("0")
                        .unlockedBy("has_smooth_sandstone", this.has(Blocks.SMOOTH_SANDSTONE))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PILLAR_CAP, 1)
                        .requires(Items.GLAZED_TERRACOTTA.lightBlue())
                        .unlockedBy("has_glazed_terracotta", this.has(Items.GLAZED_TERRACOTTA.lightBlue()))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THATCH_BLOCK, 3)
                        .define('0', Blocks.HAY_BLOCK)
                        .pattern("0  ")
                        .pattern("00 ")
                        .pattern("000")
                        .unlockedBy("has_hay_block", this.has(Blocks.HAY_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CROWN_MOLDING_LEFT, 3)
                        .define('0', Blocks.BAMBOO_TRAPDOOR)
                        .define('1', Blocks.MANGROVE_FENCE)
                        .pattern("001")
                        .pattern(" 01")
                        .pattern("  1")
                        .unlockedBy("has_hay_block", this.has(Blocks.BAMBOO_TRAPDOOR))
                        .unlockedBy("has_mangrove_fence", this.has(Blocks.MANGROVE_FENCE))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CROWN_MOLDING_RIGHT, 3)
                        .define('0', Blocks.BAMBOO_TRAPDOOR)
                        .define('1', Blocks.MANGROVE_FENCE)
                        .pattern("100")
                        .pattern("10 ")
                        .pattern("1  ")
                        .unlockedBy("has_hay_block", this.has(Blocks.BAMBOO_TRAPDOOR))
                        .unlockedBy("has_mangrove_fence", this.has(Blocks.MANGROVE_FENCE))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THATCH_PEAK_BLOCK, 4)
                        .define('0', Blocks.HAY_BLOCK)
                        .pattern(" 0 ")
                        .pattern("000")
                        .unlockedBy("has_hay_block", this.has(Blocks.HAY_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAY_BLOCK, 1)
                        .define('0', Blocks.WHEAT)
                        .pattern("000")
                        .pattern("000")
                        .pattern("000")
                        .unlockedBy("has_wheat", this.has(Blocks.WHEAT))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICKS, 4)
                        .define('0', Blocks.QUARTZ_BLOCK)
                        .pattern("00")
                        .pattern("00")
                        .unlockedBy("has_quartz_blocks", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);

                this.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WINDOW_BLANK, 1)
                        .requires(Blocks.TINTED_GLASS)
                        .requires(ModBlocks.MARBLE_PILLAR)
                        .requires(Blocks.POLISHED_ANDESITE_SLAB)
                        .unlockedBy("has_glazed_terracotta", this.has(Items.GLAZED_TERRACOTTA.lightBlue()))
                        .save(this.output);
                //::new block here
            }

            private void paintingStonecutterRecipe(RecipeOutput recipeOutput, HolderLookup.Provider lookup, ResourceKey<PaintingVariant> variantKey, String pathName) {

                var dynamicRegistry = lookup.lookupOrThrow(Registries.PAINTING_VARIANT);

                Holder<PaintingVariant> paintingHolder = registries.lookupOrThrow(net.minecraft.core.registries.Registries.PAINTING_VARIANT)
                        .getOrThrow(variantKey);

                DataComponentPatch componentPatch = DataComponentPatch.builder()
                        .set(DataComponents.PAINTING_VARIANT, paintingHolder)
                        .build();

                Holder<Item> paintingItemHolder = Items.PAINTING.builtInRegistryHolder();

                ItemStackTemplate templateResult = new ItemStackTemplate(paintingItemHolder, 1, componentPatch);

                // Configure standard visibility properties
                Recipe.CommonInfo commonInfo = new Recipe.CommonInfo(true);

                // Assemble the Stonecutter recipe configuration
                StonecutterRecipe recipePayload = new StonecutterRecipe(
                        commonInfo,
                        Ingredient.of(Items.PAINTING),
                        templateResult
                );

                // Define the precise output file path location identifier
                Identifier recipeId = Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, pathName + "_painting_from_stonecutting");
                //ResourceKey<Recipe> recipeKey = ResourceKey.create(Registries.RECIPE, recipeId);
                ResourceKey<Recipe<?>> recipeKey = ResourceKey.create(Registries.RECIPE, recipeId);
                // Initialize a non-static instance of the unlock advancement builder
                RecipeUnlockAdvancementBuilder advancementBuilder = new RecipeUnlockAdvancementBuilder();
                advancementBuilder.unlockedBy("has_painting", this.has(Items.PAINTING));

                // Send the recipe object downstream
                recipeOutput.accept(
                        recipeKey,
                        recipePayload,
                        advancementBuilder.build(recipeOutput, recipeKey ,RecipeCategory.DECORATIONS)
                );
            }
            //
        };
    }
    @Override
    public @NotNull String getName() {
        return "ArchitectureBlocks Recipes";
    }

}
