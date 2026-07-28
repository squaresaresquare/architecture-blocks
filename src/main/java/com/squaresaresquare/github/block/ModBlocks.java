package com.squaresaresquare.github.block;

import com.squaresaresquare.github.block.entity.custom.CrownMoldingLeftBlockEntity;
import com.squaresaresquare.github.block.entity.custom.CrownMoldingRightBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HayBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.block.custom.*;

import java.util.function.Function;

public class ModBlocks {
    public static final Block TRIPLE_WIND0W_COMPLETE = register(
            "triple_arched_window_complete",
            TripleWindowComplete::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block FOUR_ARCHED_WINDOW_COMPLETE = register(
            "four_arched_window_complete",
            FourArchedWindowComplete::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block DOUBLE_ARCHED_WINDOW_COMPLETE = register(
            "double_arched_window_complete",
            DoubleArchedWindowComplete::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MARBLE_PLINTH_BLOCK = register(
            "marble_plinth_block",
            MarblePlinthBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MARBLE_BLOCK = register(
            "marble_block",
            MarbleBlockBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MARBLE_PILLAR = register(
            "marble_pillar",
            MarblePillarBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_END_BASE = register(
            "left_end_base",
            LeftEndBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_PILLAR_BASE = register(
            "left_pillar_base",
            LeftPillarBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_PILLAR_BASE = register(
            "right_pillar_base",
            RightPillarBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_END_BASE = register(
            "right_end_base",
            RightEndBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_END_MIDDLE = register(
            "left_end_middle",
            LeftEndMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_PILLAR_MIDDLE = register(
            "left_pillar_middle",
            LeftPillarMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_PILLAR_MIDDLE = register(
            "right_pillar_middle",
            RightPillarMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_END_MIDDLE = register(
            "right_end_middle",
            RightEndMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW1_COL1 = register(
            "triple_window_arch_row1_col1",
            TripleWindowArchRow1Col1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_END_CAP = register(
            "left_end_cap",
            LeftEndCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_PILLAR_CAP = register(
            "left_pillar_cap",
            LeftPillarCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_PILLAR_CAP = register(
            "right_pillar_cap",
            RightPillarCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_END_CAP = register(
            "right_end_cap",
            RightEndCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW1_COL6 = register(
            "triple_window_arch_row1_col6",
            TripleWindowArchRow1Col6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW2_COL1 = register(
            "triple_window_arch_row2_col1",
            TripleWindowArchRow2Col1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW2_COL2 = register(
            "triple_window_arch_row2_col2",
            TripleWindowArchRow2Col2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW2_COL5 = register(
            "triple_window_arch_row2_col5",
            TripleWindowArchRow2Col5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW2_COL6 = register(
            "triple_window_arch_row2_col6",
            TripleWindowArchRow2Col6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW4_COL1 = register(
            "triple_window_arch_row4_col1",
            TripleWindowArchRow4Col1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW4_COL2 = register(
            "triple_window_arch_row4_col2",
            TripleWindowArchRow4Col2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW4_COL3 = register(
            "triple_window_arch_row4_col3",
            TripleWindowArchRow4Col3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW4_COL4 = register(
            "triple_window_arch_row4_col4",
            TripleWindowArchRow4Col4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW4_COL5 = register(
            "triple_window_arch_row4_col5",
            TripleWindowArchRow4Col5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW4_COL6 = register(
            "triple_window_arch_row4_col6",
            TripleWindowArchRow4Col6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW5_COL2 = register(
            "triple_window_arch_row5_col2",
            TripleWindowArchRow5Col2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW5_COL3 = register(
            "triple_window_arch_row5_col3",
            TripleWindowArchRow5Col3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW5_COL4 = register(
            "triple_window_arch_row5_col4",
            TripleWindowArchRow5Col4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block TRIPLE_WINDOW_ARCH_ROW5_COL5 = register(
            "triple_window_arch_row5_col5",
            TripleWindowArchRow5Col5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MARBLE_PILLAR_BASE = register(
            "marble_pillar_base",
            MarblePillarBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block PILLAR_CAP = register(
            "pillar_cap",
            PillarCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_HALF_PILLAR_BASE = register(
            "right_half_pillar_base",
            RightHalfPillarBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_HALF_PILLAR_BASE = register(
            "left_half_pillar_base",
            LeftHalfPillarBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_HALF_PILLAR_MIDDLE = register(
            "left_half_pillar_middle",
            LeftHalfPillarMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_HALF_PILLAR_MIDDLE = register(
            "right_half_pillar_middle",
            RightHalfPillarMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block LEFT_HALF_PILLAR_CAP = register(
            "left_half_pillar_cap",
            LeftHalfPillarCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block RIGHT_HALF_PILLAR_CAP = register(
            "right_half_pillar_cap",
            RightHalfPillarCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CENTER_PILLAR_BASE = register(
            "center_pillar_base",
            CenterPillarBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CENTER_PILLAR_MIDDLE = register(
            "center_pillar_middle",
            CenterPillarMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CENTER_PILLAR_CAP = register(
            "center_pillar_cap",
            CenterPillarCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CENTER_CORNER_PILLAR_BASE = register(
            "center_corner_pillar_base",
            CenterCornerPillarBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CENTER_CORNER_PILLAR_MIDDLE = register(
            "center_corner_pillar_middle",
            CenterCornerPillarMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CENTER_CORNER_PILLAR_CAP = register(
            "center_corner_pillar_cap",
            CenterCornerPillarCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CORNER_WINDOW_CAP = register(
            "corner_window_cap",
            CornerWindowCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CORNER_WINDOW_MIDDLE = register(
            "corner_window_middle",
            CornerWindowMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block CORNER_WINDOW_BASE = register(
            "corner_window_base",
            CornerWindowBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block SLOT_WINDOW_CAP = register(
            "slot_window_cap",
            SlotWindowCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block SLOT_WINDOW_MIDDLE = register(
            "slot_window_middle",
            SlotWindowMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block SLOT_WINDOW_BASE = register(
            "slot_window_base",
            SlotWindowBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block PILLARLESS_WINDOW_CAP = register(
            "pillarless_window_cap",
            PillarlessWindowCapBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block PILLARLESS_WINDOW_MIDDLE = register(
            "pillarless_window_middle",
            PillarlessWindowMiddleBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block PILLARLESS_WINDOW_BASE = register(
            "pillarless_window_base",
            PillarlessWindowBaseBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block INVISIBLE = register(
            "invisible",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.GLASS),
            true
    );

    public static final Block HAY_BLOCK = register(
            "hay_block",
            HayBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );

    public static final Block QUADRUPLE_WINDOW_ARCH_ROW1_COL1 = register(
            "quadruple_window_arch_row1_col1",
            QuadrupleWindowArchRow1Col1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW1_COL8 = register(
            "quadruple_window_arch_row1_col8",
            QuadrupleWindowArchRow1Col8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW2_COL1 = register(
            "quadruple_window_arch_row2_col1",
            QuadrupleWindowArchRow2Col1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW2_COL8 = register(
            "quadruple_window_arch_row2_col8",
            QuadrupleWindowArchRow2Col8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block INNER_ARCH_BLOCK = register(
            "inner_arch_block",
            InnerArchBlockBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW2_COL2 = register(
            "quadruple_window_arch_row2_col2",
            QuadrupleWindowArchRow2Col2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW2_COL7 = register(
            "quadruple_window_arch_row2_col7",
            QuadrupleWindowArchRow2Col7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );

    public static final Block OAK_LOG = register(
            "oak_log",
            OakLogBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        // Create a registry key for the block

        ResourceKey<@NotNull Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.setId(blockKey));
        Block CUSTOM_BLOCK = Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            ResourceKey<@NotNull Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }
        return CUSTOM_BLOCK;
    }

    private static ResourceKey<@NotNull Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, name));
    }

    private static ResourceKey<@NotNull Item> keyOfItem(String name) {
        System.out.printf("create resourcekey for %s\n", name);
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, name));
    }

    public static ResourceKey<@NotNull Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static boolean neverAllowSpawn(BlockState state, BlockGetter level, BlockPos pos, EntityType<?> type) {
        return false;
    }


 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW3_COL1 = register(
        "quadruple_window_arch_row3_col1",
        QuadrupleWindowArchRow3Col1Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW3_COL2 = register(
        "quadruple_window_arch_row3_col2",
        QuadrupleWindowArchRow3Col2Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW3_COL3 = register(
        "quadruple_window_arch_row3_col3",
        QuadrupleWindowArchRow3Col3Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW3_COL6 = register(
        "quadruple_window_arch_row3_col6",
        QuadrupleWindowArchRow3Col6Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW3_COL7 = register(
        "quadruple_window_arch_row3_col7",
        QuadrupleWindowArchRow3Col7Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW3_COL8 = register(
        "quadruple_window_arch_row3_col8",
        QuadrupleWindowArchRow3Col8Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW1_COL2 = register(
        "quadruple_window_arch_row1_col2",
        QuadrupleWindowArchRow1Col2Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW1_COL3 = register(
        "quadruple_window_arch_row1_col3",
        QuadrupleWindowArchRow1Col3Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW1_COL4 = register(
        "quadruple_window_arch_row1_col4",
        QuadrupleWindowArchRow1Col4Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW1_COL5 = register(
        "quadruple_window_arch_row1_col5",
        QuadrupleWindowArchRow1Col5Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW1_COL6 = register(
        "quadruple_window_arch_row1_col6",
        QuadrupleWindowArchRow1Col6Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block QUADRUPLE_WINDOW_ARCH_ROW1_COL7 = register(
        "quadruple_window_arch_row1_col7",
        QuadrupleWindowArchRow1Col7Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW1_COL1 = register(
        "double_window_arch_row1_col1",
        DoubleWindowArchRow1Col1Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW1_COL4 = register(
        "double_window_arch_row1_col4",
        DoubleWindowArchRow1Col4Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW1_COL5 = register(
        "double_window_arch_row1_col5",
        DoubleWindowArchRow1Col5Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW1_COL2 = register(
        "double_window_arch_row1_col2",
        DoubleWindowArchRow1Col2Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW2_COL1 = register(
        "double_window_arch_row2_col1",
        DoubleWindowArchRow2Col1Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW2_COL2 = register(
        "double_window_arch_row2_col2",
        DoubleWindowArchRow2Col2Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW2_COL3 = register(
        "double_window_arch_row2_col3",
        DoubleWindowArchRow2Col3Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW2_COL4 = register(
        "double_window_arch_row2_col4",
        DoubleWindowArchRow2Col4Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW2_COL5 = register(
        "double_window_arch_row2_col5",
        DoubleWindowArchRow2Col5Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

 
    public static final Block DOUBLE_WINDOW_ARCH_ROW3_COL2 = register(
        "double_window_arch_row3_col2",
        DoubleWindowArchRow3Col2Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
        true
    );

    public static final Block DOUBLE_WINDOW_ARCH_ROW3_COL3 = register(
            "double_window_arch_row3_col3",
            DoubleWindowArchRow3Col3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block DOUBLE_WINDOW_ARCH_ROW3_COL4 = register(
            "double_window_arch_row3_col4",
            DoubleWindowArchRow3Col4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block QUARTZ_BRICKS = register(
            "quartz_bricks",
            QuartzBricksBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block WINDOW_BLANK = register(
            "window_blank",
            WindowBlank::new,
            BlockBehaviour.Properties.of().sound(SoundType.GLASS)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block THATCH_BLOCK = register(
            "thatch",
            ThatchBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.HANGING_ROOTS)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block THATCH_PEAK_BLOCK = register(
            "thatch_peak",
            ThatchPeakBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.HANGING_ROOTS)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block SIMPLE_ARCHED_WINDOW_TOP_LEFT = register(
            "simple_arched_window_top_left",
            SimpleArchedWindowTopLeft::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block SIMPLE_ARCHED_WINDOW_TOP_RIGHT = register(
            "simple_arched_window_top_right",
            SimpleArchedWindowTopRight::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block SIMPLE_ARCHED_WINDOW_LEFT = register(
            "simple_arched_window_left",
            SimpleArchedWindowLeft::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block SIMPLE_ARCHED_WINDOW_RIGHT = register(
            "simple_arched_window_right",
            SimpleArchedWindowLeft::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block SIMPLE_ARCHED_WINDOW_BETWEEN = register(
            "simple_arched_window_between",
            SimpleArchedWindowBetween::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block SIMPLE_ARCHED_WINDOW_TOP_CENTER = register(
            "simple_arched_window_top_center",
            SimpleArchedWindowTopCenter::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block SIMPLE_ARCHED_WINDOW_TOP_BETWEEN = register(
            "simple_arched_window_top_between",
            SimpleArchedWindowTopBetween::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block CROWN_MOLDING_LEFT = register(
            "crown_molding_left",
            CrownMoldingLeft::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;})
                    .isSuffocating((state, level, pos) -> false)
                    .isViewBlocking((state, level, pos) -> false),
            true
    );
    public static final Block CROWN_MOLDING_RIGHT = register(
            "crown_molding_right",
            CrownMoldingRight::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;})
                    .isSuffocating((state, level, pos) -> false)
                    .isViewBlocking((state, level, pos) -> false),
            true
    );
    public static void initialize() {

    }
}
