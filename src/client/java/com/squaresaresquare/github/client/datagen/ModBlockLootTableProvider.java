package com.squaresaresquare.github.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import com.squaresaresquare.github.client.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.CENTER_PILLAR_BASE);
        dropSelf(ModBlocks.CENTER_PILLAR_CAP);
        dropSelf(ModBlocks.CENTER_PILLAR_MIDDLE);
        dropSelf(ModBlocks.CORNER_WINDOW_BASE);
        dropSelf(ModBlocks.CORNER_WINDOW_CAP);
        dropSelf(ModBlocks.CORNER_WINDOW_MIDDLE);
        dropSelf(ModBlocks.SLOT_WINDOW_BASE);
        dropSelf(ModBlocks.SLOT_WINDOW_CAP);
        dropSelf(ModBlocks.SLOT_WINDOW_MIDDLE);
        dropSelf(ModBlocks.PILLARLESS_WINDOW_BASE);
        dropSelf(ModBlocks.PILLARLESS_WINDOW_CAP);
        dropSelf(ModBlocks.PILLARLESS_WINDOW_MIDDLE);
        dropSelf(ModBlocks.CENTER_CORNER_PILLAR_BASE);
        dropSelf(ModBlocks.CENTER_CORNER_PILLAR_CAP);
        dropSelf(ModBlocks.CENTER_CORNER_PILLAR_MIDDLE);
        dropSelf(ModBlocks.DOUBLE_ARCHED_WINDOW_COMPLETE);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL1);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL2);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL4);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL5);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL1);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL2);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL3);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL4);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL5);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL2);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL3);
        dropSelf(ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL4);
        dropSelf(ModBlocks.FOUR_ARCHED_WINDOW_COMPLETE);
        dropSelf(ModBlocks.HAY_BLOCK);
        dropSelf(ModBlocks.INNER_ARCH_BLOCK);
        dropSelf(ModBlocks.INVISIBLE);
        dropSelf(ModBlocks.LEFT_END_BASE);
        dropSelf(ModBlocks.LEFT_END_CAP);
        dropSelf(ModBlocks.LEFT_END_MIDDLE);
        dropSelf(ModBlocks.LEFT_HALF_PILLAR_BASE);
        dropSelf(ModBlocks.LEFT_HALF_PILLAR_CAP);
        dropSelf(ModBlocks.LEFT_HALF_PILLAR_MIDDLE);
        dropSelf(ModBlocks.LEFT_PILLAR_BASE);
        dropSelf(ModBlocks.LEFT_PILLAR_CAP);
        dropSelf(ModBlocks.LEFT_PILLAR_MIDDLE);
        dropSelf(ModBlocks.MARBLE_BLOCK);
        dropSelf(ModBlocks.MARBLE_PILLAR);
        dropSelf(ModBlocks.MARBLE_PILLAR_BASE);
        dropSelf(ModBlocks.MARBLE_PLINTH_BLOCK);
        dropSelf(ModBlocks.PILLAR_CAP);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL1);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL2);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL3);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL4);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL5);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL6);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL7);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL8);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL1);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL2);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL7);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL8);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL1);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL2);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL3);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL6);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL7);
        dropSelf(ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL8);
        dropSelf(ModBlocks.RIGHT_END_BASE);
        dropSelf(ModBlocks.RIGHT_END_CAP);
        dropSelf(ModBlocks.RIGHT_END_MIDDLE);
        dropSelf(ModBlocks.RIGHT_HALF_PILLAR_BASE);
        dropSelf(ModBlocks.RIGHT_HALF_PILLAR_CAP);
        dropSelf(ModBlocks.RIGHT_HALF_PILLAR_MIDDLE);
        dropSelf(ModBlocks.RIGHT_PILLAR_BASE);
        dropSelf(ModBlocks.RIGHT_PILLAR_CAP);
        dropSelf(ModBlocks.RIGHT_PILLAR_MIDDLE);
        dropSelf(ModBlocks.TRIPLE_WIND0W_COMPLETE);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL1);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL6);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL1);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL2);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL5);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL6);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL1);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL2);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL3);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL4);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL5);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL6);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL2);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL3);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL4);
        dropSelf(ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL5);
        dropSelf(ModBlocks.WINDOW_BLANK);
        dropSelf(ModBlocks.THATCH_BLOCK);
        dropSelf(ModBlocks.THATCH_PEAK_BLOCK);
        dropSelf(ModBlocks.SIMPLE_ARCHED_WINDOW_BETWEEN);
        dropSelf(ModBlocks.SIMPLE_ARCHED_WINDOW_LEFT);
        dropSelf(ModBlocks.SIMPLE_ARCHED_WINDOW_RIGHT);
        dropSelf(ModBlocks.SIMPLE_ARCHED_WINDOW_BETWEEN);
        dropSelf(ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_BETWEEN);
        dropSelf(ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_CENTER);
        dropSelf(ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_LEFT);
        dropSelf(ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_LEFT);
        //::new block here
    }
}
