package com.squaresaresquare.github.block;

import com.squaresaresquare.github.block.custom.doublewindowarch.*;
import com.squaresaresquare.github.block.custom.quadruplewindowarch.*;
import com.squaresaresquare.github.block.custom.simplearchedwindow.*;
import com.squaresaresquare.github.block.custom.triplewindowarch.*;
import com.squaresaresquare.github.block.custom.mosaic.*;
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
            SimpleArchedWindowRight::new,
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
    public static final Block SIMPLE_ARCHED_WINDOW_COMPLETE = register(
            "simple_arched_window_complete",
            SimpleArchedWindowComplete::new,
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

    public static final Block CIRCLE_CORNER = register(
            "circle_corner",
            CircleCornerBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block QUARTZ_CIRCLE_CORNER = register(
            "quartz_circle_corner",
            QuartzCircleCornerBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block WHITE_CONCRETE_CIRCLE_CORNER = register(
            "white_concrete_circle_corner",
            WhiteConcreteCircleCornerBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block POLISHED_DIORITE_KEYHOLE_BLOCK = register(
            "polished_diorite_keyhole",
            PolishedDioriteKeyholeBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );
    public static final Block WHITE_CONCRETE_KEYHOLE_BLOCK = register(
            "white_concrete_keyhole",
            WhiteConcreteKeyholeBlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1,1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {return false;}),
            true
    );

    public static final Block MOSAIC_COMPLETE = register(
            "mosaic_complete",
            MosaicComplete::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A1_BLOCK = register(
            "a1",
            MosaicA1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A2_BLOCK = register(
            "a2",
            MosaicA2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A3_BLOCK = register(
            "a3",
            MosaicA3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A4_BLOCK = register(
            "a4",
            MosaicA4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A5_BLOCK = register(
            "a5",
            MosaicA5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A6_BLOCK = register(
            "a6",
            MosaicA6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A7_BLOCK = register(
            "a7",
            MosaicA7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A8_BLOCK = register(
            "a8",
            MosaicA8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A9_BLOCK = register(
            "a9",
            MosaicA9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A10_BLOCK = register(
            "a10",
            MosaicA10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A11_BLOCK = register(
            "a11",
            MosaicA11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_A12_BLOCK = register(
            "a12",
            MosaicA12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B1_BLOCK = register(
            "b1",
            MosaicB1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B2_BLOCK = register(
            "b2",
            MosaicB2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B3_BLOCK = register(
            "b3",
            MosaicB3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B4_BLOCK = register(
            "b4",
            MosaicB4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B5_BLOCK = register(
            "b5",
            MosaicB5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B6_BLOCK = register(
            "b6",
            MosaicB6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B7_BLOCK = register(
            "b7",
            MosaicB7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B8_BLOCK = register(
            "b8",
            MosaicB8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B9_BLOCK = register(
            "b9",
            MosaicB9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B10_BLOCK = register(
            "b10",
            MosaicB10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B11_BLOCK = register(
            "b11",
            MosaicB11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_B12_BLOCK = register(
            "b12",
            MosaicB12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C1_BLOCK = register(
            "c1",
            MosaicC1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C2_BLOCK = register(
            "c2",
            MosaicC2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C3_BLOCK = register(
            "c3",
            MosaicC3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C4_BLOCK = register(
            "c4",
            MosaicC4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C5_BLOCK = register(
            "c5",
            MosaicC5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C6_BLOCK = register(
            "c6",
            MosaicC6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C7_BLOCK = register(
            "c7",
            MosaicC7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C8_BLOCK = register(
            "c8",
            MosaicC8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C9_BLOCK = register(
            "c9",
            MosaicC9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C10_BLOCK = register(
            "c10",
            MosaicC10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C11_BLOCK = register(
            "c11",
            MosaicC11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_C12_BLOCK = register(
            "c12",
            MosaicC12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D1_BLOCK = register(
            "d1",
            MosaicD1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D2_BLOCK = register(
            "d2",
            MosaicD2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D3_BLOCK = register(
            "d3",
            MosaicD3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D4_BLOCK = register(
            "d4",
            MosaicD4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D5_BLOCK = register(
            "d5",
            MosaicD5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D6_BLOCK = register(
            "d6",
            MosaicD6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D7_BLOCK = register(
            "d7",
            MosaicD7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D8_BLOCK = register(
            "d8",
            MosaicD8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D9_BLOCK = register(
            "d9",
            MosaicD9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D10_BLOCK = register(
            "d10",
            MosaicD10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D11_BLOCK = register(
            "d11",
            MosaicD11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_D12_BLOCK = register(
            "d12",
            MosaicD12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E1_BLOCK = register(
            "e1",
            MosaicE1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E2_BLOCK = register(
            "e2",
            MosaicE2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E3_BLOCK = register(
            "e3",
            MosaicE3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E4_BLOCK = register(
            "e4",
            MosaicE4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E5_BLOCK = register(
            "e5",
            MosaicE5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E6_BLOCK = register(
            "e6",
            MosaicE6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E7_BLOCK = register(
            "e7",
            MosaicE7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E8_BLOCK = register(
            "e8",
            MosaicE8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E9_BLOCK = register(
            "e9",
            MosaicE9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E10_BLOCK = register(
            "e10",
            MosaicE10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E11_BLOCK = register(
            "e11",
            MosaicE11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_E12_BLOCK = register(
            "e12",
            MosaicE12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F1_BLOCK = register(
            "f1",
            MosaicF1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F2_BLOCK = register(
            "f2",
            MosaicF2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F3_BLOCK = register(
            "f3",
            MosaicF3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F4_BLOCK = register(
            "f4",
            MosaicF4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F5_BLOCK = register(
            "f5",
            MosaicF5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F6_BLOCK = register(
            "f6",
            MosaicF6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F7_BLOCK = register(
            "f7",
            MosaicF7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F8_BLOCK = register(
            "f8",
            MosaicF8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F9_BLOCK = register(
            "f9",
            MosaicF9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F10_BLOCK = register(
            "f10",
            MosaicF10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F11_BLOCK = register(
            "f11",
            MosaicF11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_F12_BLOCK = register(
            "f12",
            MosaicF12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G1_BLOCK = register(
            "g1",
            MosaicG1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G2_BLOCK = register(
            "g2",
            MosaicG2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G3_BLOCK = register(
            "g3",
            MosaicG3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G4_BLOCK = register(
            "g4",
            MosaicG4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G5_BLOCK = register(
            "g5",
            MosaicG5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G6_BLOCK = register(
            "g6",
            MosaicG6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G7_BLOCK = register(
            "g7",
            MosaicG7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G8_BLOCK = register(
            "g8",
            MosaicG8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G9_BLOCK = register(
            "g9",
            MosaicG9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G10_BLOCK = register(
            "g10",
            MosaicG10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G11_BLOCK = register(
            "g11",
            MosaicG11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_G12_BLOCK = register(
            "g12",
            MosaicG12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H1_BLOCK = register(
            "h1",
            MosaicH1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H2_BLOCK = register(
            "h2",
            MosaicH2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H3_BLOCK = register(
            "h3",
            MosaicH3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H4_BLOCK = register(
            "h4",
            MosaicH4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H5_BLOCK = register(
            "h5",
            MosaicH5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H6_BLOCK = register(
            "h6",
            MosaicH6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H7_BLOCK = register(
            "h7",
            MosaicH7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H8_BLOCK = register(
            "h8",
            MosaicH8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H9_BLOCK = register(
            "h9",
            MosaicH9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H10_BLOCK = register(
            "h10",
            MosaicH10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H11_BLOCK = register(
            "h11",
            MosaicH11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_H12_BLOCK = register(
            "h12",
            MosaicH12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I1_BLOCK = register(
            "i1",
            MosaicI1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I2_BLOCK = register(
            "i2",
            MosaicI2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I3_BLOCK = register(
            "i3",
            MosaicI3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I4_BLOCK = register(
            "i4",
            MosaicI4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I5_BLOCK = register(
            "i5",
            MosaicI5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I6_BLOCK = register(
            "i6",
            MosaicI6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I7_BLOCK = register(
            "i7",
            MosaicI7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I8_BLOCK = register(
            "i8",
            MosaicI8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I9_BLOCK = register(
            "i9",
            MosaicI9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I10_BLOCK = register(
            "i10",
            MosaicI10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I11_BLOCK = register(
            "i11",
            MosaicI11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_I12_BLOCK = register(
            "i12",
            MosaicI12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J1_BLOCK = register(
            "j1",
            MosaicJ1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J2_BLOCK = register(
            "j2",
            MosaicJ2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J3_BLOCK = register(
            "j3",
            MosaicJ3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J4_BLOCK = register(
            "j4",
            MosaicJ4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J5_BLOCK = register(
            "j5",
            MosaicJ5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J6_BLOCK = register(
            "j6",
            MosaicJ6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J7_BLOCK = register(
            "j7",
            MosaicJ7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J8_BLOCK = register(
            "j8",
            MosaicJ8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J9_BLOCK = register(
            "j9",
            MosaicJ9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J10_BLOCK = register(
            "j10",
            MosaicJ10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J11_BLOCK = register(
            "j11",
            MosaicJ11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_J12_BLOCK = register(
            "j12",
            MosaicJ12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K1_BLOCK = register(
            "k1",
            MosaicK1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K2_BLOCK = register(
            "k2",
            MosaicK2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K3_BLOCK = register(
            "k3",
            MosaicK3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K4_BLOCK = register(
            "k4",
            MosaicK4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K5_BLOCK = register(
            "k5",
            MosaicK5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K6_BLOCK = register(
            "k6",
            MosaicK6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K7_BLOCK = register(
            "k7",
            MosaicK7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K8_BLOCK = register(
            "k8",
            MosaicK8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K9_BLOCK = register(
            "k9",
            MosaicK9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K10_BLOCK = register(
            "k10",
            MosaicK10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K11_BLOCK = register(
            "k11",
            MosaicK11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_K12_BLOCK = register(
            "k12",
            MosaicK12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L1_BLOCK = register(
            "l1",
            MosaicL1Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L2_BLOCK = register(
            "l2",
            MosaicL2Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L3_BLOCK = register(
            "l3",
            MosaicL3Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L4_BLOCK = register(
            "l4",
            MosaicL4Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L5_BLOCK = register(
            "l5",
            MosaicL5Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L6_BLOCK = register(
            "l6",
            MosaicL6Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L7_BLOCK = register(
            "l7",
            MosaicL7Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L8_BLOCK = register(
            "l8",
            MosaicL8Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L9_BLOCK = register(
            "l9",
            MosaicL9Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L10_BLOCK = register(
            "l10",
            MosaicL10Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L11_BLOCK = register(
            "l11",
            MosaicL11Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    public static final Block MOSAIC_L12_BLOCK = register(
            "l12",
            MosaicL12Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
                    .noOcclusion()
                    .strength(1, 1)
                    .isValidSpawn((state, blockGetter, pos, entityType) -> {
                        return false;
                    }),
            true
    );
    //:::::::::::
    public static void initialize() { }
}
