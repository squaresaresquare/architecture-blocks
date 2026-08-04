package com.squaresaresquare.github.datagen;

import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.block.ModBlocks;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider{
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
        System.out.print("ModRecipeProvider constructor");
    }
    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider registries, @NotNull RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
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
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Blocks.POLISHED_DIORITE, ModBlocks.CIRCLE_CORNER,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_KEYHOLE_BLOCK,1);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,Blocks.CONCRETE.white(), ModBlocks.WHITE_CONCRETE_KEYHOLE_BLOCK,1);
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
        };
    }
    @Override
    public @NotNull String getName() {
        return "ArchitectureBlocks Recipes";
    }

}
