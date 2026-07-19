package com.squaresaresquare.github.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.block.ModBlocks;
import com.squaresaresquare.github.block.entity.custom.*;

public class ModBlockEntities {
    private static <T extends BlockEntity> BlockEntityType<@NotNull T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, name);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }
    public static void initialize() {
        System.out.print("initialize ModBlockEntities\n");
    }
    public static final BlockEntityType<@NotNull OakLogBlockEntity> OAK_LOG_BLOCK_ENTITY = register("oak_log", OakLogBlockEntity::new, ModBlocks.OAK_LOG);
    public static final BlockEntityType<@NotNull MarbleBlockBlockEntity> MARBLE_BLOCK_BLOCK_ENTITY = register("marble_block", MarbleBlockBlockEntity::new, ModBlocks.MARBLE_BLOCK);
    public static final BlockEntityType<@NotNull MarblePillarBaseBlockEntity> MARBLE_PILLAR_BASE_BLOCK_ENTITY = register("marble_pillar_base", MarblePillarBaseBlockEntity::new, ModBlocks.MARBLE_PILLAR_BASE);
    public static final BlockEntityType<@NotNull MarblePillarBlockEntity> MARBLE_PILLAR_BLOCK_ENTITY = register("marble_pillar", MarblePillarBlockEntity::new, ModBlocks.MARBLE_PILLAR);
    public static final BlockEntityType<@NotNull MarblePlinthBlockEntity> MARBLE_PLINTH_BLOCK_ENTITY = register("quartz_pillar", MarblePlinthBlockEntity::new, ModBlocks.MARBLE_PLINTH_BLOCK);
    public static final BlockEntityType<@NotNull PillarCapBlockEntity> PILLAR_CAP_BLOCK_ENTITY = register("pillar_cap", PillarCapBlockEntity::new, ModBlocks.PILLAR_CAP);
    public static final BlockEntityType<@NotNull LeftEndBaseBlockEntity> LEFT_END_BASE_BLOCK_ENTITY = register("left_end_base", LeftEndBaseBlockEntity::new, ModBlocks.LEFT_END_BASE);
    public static final BlockEntityType<@NotNull LeftPillarBaseBlockEntity> LEFT_PILLAR_BASE_BLOCK_ENTITY = register("left_pillar_base", LeftPillarBaseBlockEntity::new, ModBlocks.LEFT_PILLAR_BASE);
    public static final BlockEntityType<@NotNull RightPillarBaseBlockEntity> RIGHT_PILLAR_BASE_BLOCK_ENTITY = register("right_pillar_base", RightPillarBaseBlockEntity::new, ModBlocks.RIGHT_PILLAR_BASE);
    public static final BlockEntityType<@NotNull RightEndBaseBlockEntity> RIGHT_END_BASE_BLOCK_ENTITY = register("right_end_base", RightEndBaseBlockEntity::new, ModBlocks.RIGHT_END_BASE);
    public static final BlockEntityType<@NotNull LeftEndMiddleBlockEntity> LEFT_END_MIDDLE_BLOCK_ENTITY = register("left_end_middle", LeftEndMiddleBlockEntity::new, ModBlocks.LEFT_END_MIDDLE);
    public static final BlockEntityType<@NotNull LeftPillarMiddleBlockEntity> LEFT_PILLAR_MIDDLE_BLOCK_ENTITY = register("left_pillar_middle", LeftPillarMiddleBlockEntity::new, ModBlocks.LEFT_PILLAR_MIDDLE);
    public static final BlockEntityType<@NotNull RightPillarMiddleBlockEntity> RIGHT_PILLAR_MIDDLE_BLOCK_ENTITY = register("right_pillar_middle", RightPillarMiddleBlockEntity::new, ModBlocks.RIGHT_PILLAR_MIDDLE);
    public static final BlockEntityType<@NotNull RightEndMiddleBlockEntity> RIGHT_END_MIDDLE_BLOCK_ENTITY = register("right_end_middle", RightEndMiddleBlockEntity::new, ModBlocks.RIGHT_END_MIDDLE);
    public static final BlockEntityType<@NotNull TripleWindowArchRow1Col1BlockEntity> TRIPLE_WINDOW_ARCH_ROW1_COL1_BLOCK_ENTITY = register("triple_window_arch_row1_col1", TripleWindowArchRow1Col1BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL1);
    public static final BlockEntityType<@NotNull LeftEndCapBlockEntity> LEFT_END_CAP_BLOCK_ENTITY = register("left_end_cap", LeftEndCapBlockEntity::new, ModBlocks.LEFT_END_CAP);
    public static final BlockEntityType<@NotNull LeftPillarCapBlockEntity> LEFT_PILLAR_CAP_BLOCK_ENTITY = register("left_pillar_cap", LeftPillarCapBlockEntity::new, ModBlocks.LEFT_PILLAR_CAP);
    public static final BlockEntityType<@NotNull RightPillarCapBlockEntity> RIGHT_PILLAR_CAP_BLOCK_ENTITY = register("right_pillar_cap", RightPillarCapBlockEntity::new, ModBlocks.RIGHT_PILLAR_CAP);
    public static final BlockEntityType<@NotNull RightEndCapBlockEntity> RIGHT_END_CAP_BLOCK_ENTITY = register("right_end_cap", RightEndCapBlockEntity::new, ModBlocks.RIGHT_END_CAP);
    public static final BlockEntityType<@NotNull TripleWindowArchRow1Col6BlockEntity> TRIPLE_WINDOW_ARCH_ROW1_COL6_BLOCK_ENTITY = register("triple_window_arch_row1_col6", TripleWindowArchRow1Col6BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL6);
    public static final BlockEntityType<@NotNull TripleWindowArchRow2Col1BlockEntity> TRIPLE_WINDOW_ARCH_ROW2_COL1_BLOCK_ENTITY = register("triple_window_arch_row2_col1", TripleWindowArchRow2Col1BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL1);
    public static final BlockEntityType<@NotNull TripleWindowArchRow2Col2BlockEntity> TRIPLE_WINDOW_ARCH_ROW2_COL2_BLOCK_ENTITY = register("triple_window_arch_row2_col2", TripleWindowArchRow2Col2BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL2);
    public static final BlockEntityType<@NotNull TripleWindowArchRow2Col5BlockEntity> TRIPLE_WINDOW_ARCH_ROW2_COL5_BLOCK_ENTITY = register("triple_window_arch_row2_col5", TripleWindowArchRow2Col5BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL5);
    public static final BlockEntityType<@NotNull TripleWindowArchRow2Col6BlockEntity> TRIPLE_WINDOW_ARCH_ROW2_COL6_BLOCK_ENTITY = register("triple_window_arch_row2_col6", TripleWindowArchRow2Col6BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL6);
    public static final BlockEntityType<@NotNull TripleWindowArchRow4Col1BlockEntity> TRIPLE_WINDOW_ARCH_ROW4_COL1_BLOCK_ENTITY = register("triple_window_arch_row4_col1", TripleWindowArchRow4Col1BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL1);
    public static final BlockEntityType<@NotNull TripleWindowArchRow4Col2BlockEntity> TRIPLE_WINDOW_ARCH_ROW4_COL2_BLOCK_ENTITY = register("triple_window_arch_row4_col2", TripleWindowArchRow4Col2BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL2);
    public static final BlockEntityType<@NotNull TripleWindowArchRow4Col3BlockEntity> TRIPLE_WINDOW_ARCH_ROW4_COL3_BLOCK_ENTITY = register("triple_window_arch_row4_col3", TripleWindowArchRow4Col3BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL3);
    public static final BlockEntityType<@NotNull TripleWindowArchRow4Col4BlockEntity> TRIPLE_WINDOW_ARCH_ROW4_COL4_BLOCK_ENTITY = register("triple_window_arch_row4_col4", TripleWindowArchRow4Col4BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL4);
    public static final BlockEntityType<@NotNull TripleWindowArchRow4Col5BlockEntity> TRIPLE_WINDOW_ARCH_ROW4_COL5_BLOCK_ENTITY = register("triple_window_arch_row4_col5", TripleWindowArchRow4Col5BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL5);
    public static final BlockEntityType<@NotNull TripleWindowArchRow4Col6BlockEntity> TRIPLE_WINDOW_ARCH_ROW4_COL6_BLOCK_ENTITY = register("triple_window_arch_row4_col6", TripleWindowArchRow4Col6BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL6);
    public static final BlockEntityType<@NotNull TripleWindowArchRow5Col2BlockEntity> TRIPLE_WINDOW_ARCH_ROW5_COL2_BLOCK_ENTITY = register("triple_window_arch_row5_col2", TripleWindowArchRow5Col2BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL2);
    public static final BlockEntityType<@NotNull TripleWindowArchRow5Col3BlockEntity> TRIPLE_WINDOW_ARCH_ROW5_COL3_BLOCK_ENTITY = register("triple_window_arch_row5_col3", TripleWindowArchRow5Col3BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL3);
    public static final BlockEntityType<@NotNull TripleWindowArchRow5Col4BlockEntity> TRIPLE_WINDOW_ARCH_ROW5_COL4_BLOCK_ENTITY = register("triple_window_arch_row5_col4", TripleWindowArchRow5Col4BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL4);
    public static final BlockEntityType<@NotNull TripleWindowArchRow5Col5BlockEntity> TRIPLE_WINDOW_ARCH_ROW5_COL5_BLOCK_ENTITY = register("triple_window_arch_row5_col5", TripleWindowArchRow5Col5BlockEntity::new, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL5);
    public static final BlockEntityType<@NotNull RightHalfPillarBaseBlockEntity> RIGHT_HALF_PILLAR_BASE_BLOCK_ENTITY = register("right_half_pillar_base", RightHalfPillarBaseBlockEntity::new, ModBlocks.RIGHT_HALF_PILLAR_BASE);
    public static final BlockEntityType<@NotNull RightHalfPillarCapBlockEntity> RIGHT_HALF_PILLAR_CAP_BLOCK_ENTITY = register("right_half_pillar_cap", RightHalfPillarCapBlockEntity::new, ModBlocks.RIGHT_HALF_PILLAR_CAP);
    public static final BlockEntityType<@NotNull RightHalfPillarMiddleBlockEntity> RIGHT_HALF_PILLAR_MIDDLE_BLOCK_ENTITY = register("right_half_pillar_middle", RightHalfPillarMiddleBlockEntity::new, ModBlocks.RIGHT_HALF_PILLAR_MIDDLE);
    public static final BlockEntityType<@NotNull LeftHalfPillarBaseBlockEntity> LEFT_HALF_PILLAR_BASE_BLOCK_ENTITY = register("left_half_pillar_base", LeftHalfPillarBaseBlockEntity::new, ModBlocks.LEFT_HALF_PILLAR_BASE);
    public static final BlockEntityType<@NotNull LeftHalfPillarCapBlockEntity> LEFT_HALF_PILLAR_CAP_BLOCK_ENTITY = register("left_half_pillar_cap", LeftHalfPillarCapBlockEntity::new, ModBlocks.LEFT_HALF_PILLAR_CAP);
    public static final BlockEntityType<@NotNull LeftHalfPillarMiddleBlockEntity> LEFT_HALF_PILLAR_MIDDLE_BLOCK_ENTITY = register("left_half_pillar_middle", LeftHalfPillarMiddleBlockEntity::new, ModBlocks.LEFT_HALF_PILLAR_MIDDLE);
    public static final BlockEntityType<@NotNull CenterPillarBaseBlockEntity> CENTER_PILLAR_BASE_BLOCK_ENTITY = register("center_pillar_base", CenterPillarBaseBlockEntity::new, ModBlocks.CENTER_PILLAR_BASE);
    public static final BlockEntityType<@NotNull CenterPillarMiddleBlockEntity> CENTER_PILLAR_MIDDLE_BLOCK_ENTITY = register("center_pillar_middle", CenterPillarMiddleBlockEntity::new, ModBlocks.CENTER_PILLAR_MIDDLE);
    public static final BlockEntityType<@NotNull CenterPillarCapBlockEntity> CENTER_PILLAR_CAP_BLOCK_ENTITY = register("center_pillar_cap", CenterPillarCapBlockEntity::new, ModBlocks.CENTER_PILLAR_CAP);
    public static final BlockEntityType<@NotNull CenterCornerPillarBaseBlockEntity> CENTER_CORNER_PILLAR_BASE_BLOCK_ENTITY = register("center_corner_pillar_base", CenterCornerPillarBaseBlockEntity::new, ModBlocks.CENTER_CORNER_PILLAR_BASE);
    public static final BlockEntityType<@NotNull CenterCornerPillarMiddleBlockEntity> CENTER_CORNER_PILLAR_MIDDLE_BLOCK_ENTITY = register("center_corner_pillar_middle", CenterCornerPillarMiddleBlockEntity::new, ModBlocks.CENTER_CORNER_PILLAR_MIDDLE);
    public static final BlockEntityType<@NotNull CenterCornerPillarCapBlockEntity> CENTER_CORNER_PILLAR_CAP_BLOCK_ENTITY = register("center_corner_pillar_cap", CenterCornerPillarCapBlockEntity::new, ModBlocks.CENTER_CORNER_PILLAR_CAP);
    public static final BlockEntityType<@NotNull CornerWindowBaseBlockEntity> CORNER_WINDOW_BASE_BLOCK_ENTITY = register("corner_window_base", CornerWindowBaseBlockEntity::new, ModBlocks.CORNER_WINDOW_BASE);
    public static final BlockEntityType<@NotNull CornerWindowMiddleBlockEntity> CORNER_WINDOW_MIDDLE_BLOCK_ENTITY = register("corner_window_middle", CornerWindowMiddleBlockEntity::new, ModBlocks.CORNER_WINDOW_MIDDLE);
    public static final BlockEntityType<@NotNull CornerWindowCapBlockEntity> CORNER_WINDOW_CAP_BLOCK_ENTITY = register("corner_window_cap", CornerWindowCapBlockEntity::new, ModBlocks.CORNER_WINDOW_CAP);
    public static final BlockEntityType<@NotNull SlotWindowBaseBlockEntity> SLOT_WINDOW_BASE_BLOCK_ENTITY = register("slot_window_base", SlotWindowBaseBlockEntity::new, ModBlocks.SLOT_WINDOW_BASE);
    public static final BlockEntityType<@NotNull SlotWindowMiddleBlockEntity> SLOT_WINDOW_MIDDLE_BLOCK_ENTITY = register("slot_window_middle", SlotWindowMiddleBlockEntity::new, ModBlocks.SLOT_WINDOW_MIDDLE);
    public static final BlockEntityType<@NotNull SlotWindowCapBlockEntity> SLOT_WINDOW_CAP_BLOCK_ENTITY = register("slot_window_cap", SlotWindowCapBlockEntity::new, ModBlocks.SLOT_WINDOW_CAP);
    public static final BlockEntityType<@NotNull PillarlessWindowBaseBlockEntity> PILLARLESS_WINDOW_BASE_BLOCK_ENTITY = register("pillarless_window_base", PillarlessWindowBaseBlockEntity::new, ModBlocks.PILLARLESS_WINDOW_BASE);
    public static final BlockEntityType<@NotNull PillarlessWindowMiddleBlockEntity> PILLARLESS_WINDOW_MIDDLE_BLOCK_ENTITY = register("pillarless_window_middle", PillarlessWindowMiddleBlockEntity::new, ModBlocks.PILLARLESS_WINDOW_MIDDLE);
    public static final BlockEntityType<@NotNull PillarlessWindowCapBlockEntity> PILLARLESS_WINDOW_CAP_BLOCK_ENTITY = register("pillarless_window_cap", PillarlessWindowCapBlockEntity::new, ModBlocks.PILLARLESS_WINDOW_CAP);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow1Col1BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW1_COL1_BLOCK_ENTITY = register("quadruple_window_arch_row1_col1", QuadrupleWindowArchRow1Col1BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL1);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow1Col8BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW1_COL8_BLOCK_ENTITY = register("quadruple_window_arch_row1_col8", QuadrupleWindowArchRow1Col8BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL8);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow2Col1BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW2_COL1_BLOCK_ENTITY = register("quadruple_window_arch_row2_col1", QuadrupleWindowArchRow2Col1BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL1);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow2Col8BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW2_COL8_BLOCK_ENTITY = register("quadruple_window_arch_row2_col8", QuadrupleWindowArchRow2Col8BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL8);
    public static final BlockEntityType<@NotNull InnerArchBlockBlockEntity> INNER_ARCH_BLOCK_BLOCK_ENTITY = register("inner_arch_block", InnerArchBlockBlockEntity::new, ModBlocks.INNER_ARCH_BLOCK);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow2Col2BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW2_COL2_BLOCK_ENTITY = register("quadruple_window_arch_row2_col2", QuadrupleWindowArchRow2Col2BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL2);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow2Col7BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW2_COL7_BLOCK_ENTITY = register("quadruple_window_arch_row2_col7", QuadrupleWindowArchRow2Col7BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL7);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow3Col1BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW3_COL1_BLOCK_ENTITY = register("quadruple_window_arch_row3_col1", QuadrupleWindowArchRow3Col1BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL1);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow3Col2BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW3_COL2_BLOCK_ENTITY = register("quadruple_window_arch_row3_col2", QuadrupleWindowArchRow3Col2BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL2);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow3Col3BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW3_COL3_BLOCK_ENTITY = register("quadruple_window_arch_row3_col3", QuadrupleWindowArchRow3Col3BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL3);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow3Col6BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW3_COL6_BLOCK_ENTITY = register("quadruple_window_arch_row3_col6", QuadrupleWindowArchRow3Col6BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL6);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow3Col7BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW3_COL7_BLOCK_ENTITY = register("quadruple_window_arch_row3_col7", QuadrupleWindowArchRow3Col7BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL7);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow3Col8BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW3_COL8_BLOCK_ENTITY = register("quadruple_window_arch_row3_col8", QuadrupleWindowArchRow3Col8BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL8);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow1Col2BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW1_COL2_BLOCK_ENTITY = register("quadruple_window_arch_row1_col2", QuadrupleWindowArchRow1Col2BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL2);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow1Col3BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW1_COL3_BLOCK_ENTITY = register("quadruple_window_arch_row1_col3", QuadrupleWindowArchRow1Col3BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL3);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow1Col4BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW1_COL4_BLOCK_ENTITY = register("quadruple_window_arch_row1_col4", QuadrupleWindowArchRow1Col4BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL4);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow1Col5BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW1_COL5_BLOCK_ENTITY = register("quadruple_window_arch_row1_col5", QuadrupleWindowArchRow1Col5BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL5);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow1Col6BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW1_COL6_BLOCK_ENTITY = register("quadruple_window_arch_row1_col6", QuadrupleWindowArchRow1Col6BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL6);
    public static final BlockEntityType<@NotNull QuadrupleWindowArchRow1Col7BlockEntity> QUADRUPLE_WINDOW_ARCH_ROW1_COL7_BLOCK_ENTITY = register("quadruple_window_arch_row1_col7", QuadrupleWindowArchRow1Col7BlockEntity::new, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL7);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow1Col1BlockEntity> DOUBLE_WINDOW_ARCH_ROW1_COL1_BLOCK_ENTITY = register("double_window_arch_row1_col1", DoubleWindowArchRow1Col1BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL1);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow1Col4BlockEntity> DOUBLE_WINDOW_ARCH_ROW1_COL4_BLOCK_ENTITY = register("double_window_arch_row1_col4", DoubleWindowArchRow1Col4BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL4);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow1Col5BlockEntity> DOUBLE_WINDOW_ARCH_ROW1_COL5_BLOCK_ENTITY = register("double_window_arch_row1_col5", DoubleWindowArchRow1Col5BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL5);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow1Col2BlockEntity> DOUBLE_WINDOW_ARCH_ROW1_COL2_BLOCK_ENTITY = register("double_window_arch_row1_col2", DoubleWindowArchRow1Col2BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL2);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow2Col1BlockEntity> DOUBLE_WINDOW_ARCH_ROW2_COL1_BLOCK_ENTITY = register("double_window_arch_row2_col1", DoubleWindowArchRow2Col1BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL1);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow2Col2BlockEntity> DOUBLE_WINDOW_ARCH_ROW2_COL2_BLOCK_ENTITY = register("double_window_arch_row2_col2", DoubleWindowArchRow2Col2BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL2);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow2Col3BlockEntity> DOUBLE_WINDOW_ARCH_ROW2_COL3_BLOCK_ENTITY = register("double_window_arch_row2_col3", DoubleWindowArchRow2Col3BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL3);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow2Col4BlockEntity> DOUBLE_WINDOW_ARCH_ROW2_COL4_BLOCK_ENTITY = register("double_window_arch_row2_col4", DoubleWindowArchRow2Col4BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL4);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow2Col5BlockEntity> DOUBLE_WINDOW_ARCH_ROW2_COL5_BLOCK_ENTITY = register("double_window_arch_row2_col5", DoubleWindowArchRow2Col5BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL5);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow3Col2BlockEntity> DOUBLE_WINDOW_ARCH_ROW3_COL2_BLOCK_ENTITY = register("double_window_arch_row3_col2", DoubleWindowArchRow3Col2BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL2);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow3Col3BlockEntity> DOUBLE_WINDOW_ARCH_ROW3_COL3_BLOCK_ENTITY = register("double_window_arch_row3_col3", DoubleWindowArchRow3Col3BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL3);
    public static final BlockEntityType<@NotNull DoubleWindowArchRow3Col4BlockEntity> DOUBLE_WINDOW_ARCH_ROW3_COL4_BLOCK_ENTITY = register("double_window_arch_row3_col4", DoubleWindowArchRow3Col4BlockEntity::new, ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL4);
    public static final BlockEntityType<@NotNull WindowBlankEntity> WINDOW_BLANK_ENTITY = register("window_blank", WindowBlankEntity::new, ModBlocks.WINDOW_BLANK);
    public static final BlockEntityType<@NotNull HayBlockEntity> HAY_BLOCK_ENTITY = register("hay_block", HayBlockEntity::new, ModBlocks.HAY_BLOCK);
    public static final BlockEntityType<@NotNull ThatchBlockEntity> THATCH_BLOCK_ENTITY = register("thatch", ThatchBlockEntity::new, ModBlocks.THATCH_BLOCK);
    public static final BlockEntityType<@NotNull ThatchPeakBlockEntity> THATCH_PEAK_BLOCK_ENTITY = register("thatch_peak", ThatchPeakBlockEntity::new, ModBlocks.THATCH_PEAK_BLOCK);
    public static final BlockEntityType<@NotNull SimpleArchedWindowTopLeftBlockEntity> SIMPLE_ARCHED_WINDOW_TOP_LEFT_BLOCK_ENTITY = register("simple_arched_window_top_left", SimpleArchedWindowTopLeftBlockEntity::new, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_LEFT);
    public static final BlockEntityType<@NotNull SimpleArchedWindowTopRightBlockEntity> SIMPLE_ARCHED_WINDOW_TOP_RIGHT_BLOCK_ENTITY = register("simple_arched_window_top_right", SimpleArchedWindowTopRightBlockEntity::new, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_RIGHT);
    public static final BlockEntityType<@NotNull SimpleArchedWindowTopCenterBlockEntity> SIMPLE_ARCHED_WINDOW_TOP_CENTER_BLOCK_ENTITY = register("simple_arched_window_top_center", SimpleArchedWindowTopCenterBlockEntity::new, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_CENTER);
    public static final BlockEntityType<@NotNull SimpleArchedWindowTopBetweenBlockEntity> SIMPLE_ARCHED_WINDOW_TOP_BETWEEN_BLOCK_ENTITY = register("simple_arched_window_top_between", SimpleArchedWindowTopBetweenBlockEntity::new, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_BETWEEN);
    public static final BlockEntityType<@NotNull SimpleArchedWindowLeftBlockEntity> SIMPLE_ARCHED_WINDOW_LEFT_BLOCK_ENTITY = register("simple_arched_window_left", SimpleArchedWindowLeftBlockEntity::new, ModBlocks.SIMPLE_ARCHED_WINDOW_LEFT);
    public static final BlockEntityType<@NotNull SimpleArchedWindowRightBlockEntity> SIMPLE_ARCHED_WINDOW_RIGHT_BLOCK_ENTITY = register("simple_arched_window_right", SimpleArchedWindowRightBlockEntity::new, ModBlocks.SIMPLE_ARCHED_WINDOW_RIGHT);
    public static final BlockEntityType<@NotNull SimpleArchedWindowBetweenBlockEntity> SIMPLE_ARCHED_WINDOW_BETWEEN_BLOCK_ENTITY = register("simple_arched_window_between", SimpleArchedWindowBetweenBlockEntity::new, ModBlocks.SIMPLE_ARCHED_WINDOW_BETWEEN);
}
