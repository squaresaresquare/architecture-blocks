package com.squaresaresquare.github.creativemodetab;

import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.block.ModBlocks;

import java.util.HashMap;
import java.util.Map;

public class ModCreativeModeTabs {
    public static final DataComponentType<@NotNull Integer> MY_INT_COMPONENT = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "my_integer"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT) // Makes sure the integer saves to the item NBT on disk
                    .build()
    );

    public static final ResourceKey<@NotNull CreativeModeTab> SIMPLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "simple_arched_window_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> ARCHITECTURE_BLOCK_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "architecture_block_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> DOUBLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "double_arched_window_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> TRIPLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "triple_arched_window_tab")
    );

    public static final ResourceKey<@NotNull CreativeModeTab> FOUR_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "four_arched_window_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> MOSAIC_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "mosaic_tab")
    );
    public static final CreativeModeTab MOSAIC_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            MOSAIC_TAB_KEY,
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MOSAIC_COMPLETE))
                    .title(Component.translatable("itemGroup." + ArchitectureBlocks.MOD_ID + ".mosaic_tab"))
                    .displayItems((displayContext, output) -> {
                        output.accept(ModBlocks.MOSAIC_A1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_A12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_B12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_C12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_D12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_E12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_F12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_G12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_H12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_I12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_J12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_K12_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L1_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L2_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L3_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L4_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L5_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L6_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L7_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L8_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L9_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L10_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L11_BLOCK);
                        output.accept(ModBlocks.MOSAIC_L12_BLOCK);
                        //:::::::::::
                    }).build());
    public static final CreativeModeTab ARCHITECTURE_BLOCK_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ARCHITECTURE_BLOCK_TAB_KEY,
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARBLE_PLINTH_BLOCK))
                    .title(Component.translatable("itemGroup." + ArchitectureBlocks.MOD_ID + ".architecture_block_tab"))
                    .displayItems((displayContext, output) -> {
                        output.accept(ModBlocks.MARBLE_BLOCK);
                        output.accept(ModBlocks.PILLAR_CAP);
                        output.accept(ModBlocks.MARBLE_PILLAR);
                        output.accept(ModBlocks.MARBLE_PILLAR_BASE);
                        output.accept(ModBlocks.MARBLE_PLINTH_BLOCK);
                        output.accept(ModBlocks.WINDOW_BLANK);
                        output.accept(ModBlocks.HAY_BLOCK);
                        output.accept(ModBlocks.THATCH_BLOCK);
                        output.accept(ModBlocks.THATCH_PEAK_BLOCK);
                        output.accept(ModBlocks.INVISIBLE);
                        output.accept(ModBlocks.CENTER_CORNER_PILLAR_BASE);
                        output.accept(ModBlocks.CENTER_CORNER_PILLAR_MIDDLE);
                        output.accept(ModBlocks.CENTER_CORNER_PILLAR_CAP);
                        output.accept(ModBlocks.CORNER_WINDOW_BASE);
                        output.accept(ModBlocks.CORNER_WINDOW_MIDDLE);
                        output.accept(ModBlocks.CORNER_WINDOW_CAP);
                        output.accept(ModBlocks.SLOT_WINDOW_BASE);
                        output.accept(ModBlocks.SLOT_WINDOW_MIDDLE);
                        output.accept(ModBlocks.SLOT_WINDOW_CAP);
                        output.accept(ModBlocks.PILLARLESS_WINDOW_BASE);
                        output.accept(ModBlocks.PILLARLESS_WINDOW_MIDDLE);
                        output.accept(ModBlocks.PILLARLESS_WINDOW_CAP);
                        output.accept(ModBlocks.CROWN_MOLDING_LEFT);
                        output.accept(ModBlocks.CROWN_MOLDING_RIGHT);
                        output.accept(ModBlocks.CIRCLE_CORNER);
                        output.accept(ModBlocks.QUARTZ_CIRCLE_CORNER);
                        output.accept(ModBlocks.WHITE_CONCRETE_CIRCLE_CORNER);
                        output.accept(ModBlocks.POLISHED_DIORITE_KEYHOLE_BLOCK);
                        output.accept(ModBlocks.WHITE_CONCRETE_KEYHOLE_BLOCK);
                        //::new architecture_block here
                    }).build());
    public static final CreativeModeTab SIMPLE_ARCHED_WINDOW_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            SIMPLE_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemGroup." + ArchitectureBlocks.MOD_ID + ".simple_arched_window_blocks_tab"))
                    .icon(() -> new ItemStack(ModBlocks.SIMPLE_ARCHED_WINDOW_COMPLETE))
                    .displayItems((displayContext, entries) -> {
                        // create a grid of where I want to put items
                        Map<Integer, Block> TabLayout = new HashMap<>();
                        // create a grid of where I want to put items
                        //TabLayout.put(1, ModBlocks.simple_window_arch_row1_col1);
                        //row1
                        TabLayout.put(0, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_LEFT);
                        TabLayout.put(1, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_CENTER);
                        TabLayout.put(2, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_BETWEEN);
                        TabLayout.put(3, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_CENTER);
                        TabLayout.put(4, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_RIGHT);
                        TabLayout.put(6, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_LEFT);
                        TabLayout.put(7, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_CENTER);
                        TabLayout.put(8, ModBlocks.SIMPLE_ARCHED_WINDOW_TOP_RIGHT);
                        TabLayout.put(9, ModBlocks.SIMPLE_ARCHED_WINDOW_LEFT);
                        TabLayout.put(10, ModBlocks.PILLARLESS_WINDOW_MIDDLE);
                        TabLayout.put(11, ModBlocks.SIMPLE_ARCHED_WINDOW_BETWEEN);
                        TabLayout.put(12, ModBlocks.PILLARLESS_WINDOW_MIDDLE);
                        TabLayout.put(13, ModBlocks.SIMPLE_ARCHED_WINDOW_RIGHT);
                        TabLayout.put(15, ModBlocks.SIMPLE_ARCHED_WINDOW_LEFT);
                        TabLayout.put(16, ModBlocks.PILLARLESS_WINDOW_MIDDLE);
                        TabLayout.put(17, ModBlocks.SIMPLE_ARCHED_WINDOW_RIGHT);
                        TabLayout.put(18, ModBlocks.SIMPLE_ARCHED_WINDOW_LEFT);
                        TabLayout.put(19, ModBlocks.PILLARLESS_WINDOW_MIDDLE);
                        TabLayout.put(20, ModBlocks.SIMPLE_ARCHED_WINDOW_BETWEEN);
                        TabLayout.put(21, ModBlocks.PILLARLESS_WINDOW_MIDDLE);
                        TabLayout.put(22, ModBlocks.SIMPLE_ARCHED_WINDOW_RIGHT);
                        TabLayout.put(24, ModBlocks.SIMPLE_ARCHED_WINDOW_LEFT);
                        TabLayout.put(25, ModBlocks.PILLARLESS_WINDOW_MIDDLE);
                        TabLayout.put(26, ModBlocks.SIMPLE_ARCHED_WINDOW_RIGHT);

                        int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                        for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                            ItemStack stack = TabLayout.containsKey(slotIndex)
                                    ? new ItemStack(TabLayout.get(slotIndex))
                                    : new ItemStack(ModBlocks.INVISIBLE);

                            stack.set(MY_INT_COMPONENT, slotIndex);
                            entries.accept(stack);
                        }
                    }).build());

    public static final CreativeModeTab DOUBLE_ARCHED_WINDOW_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            DOUBLE_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup." + ArchitectureBlocks.MOD_ID + ".double_arched_window_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.DOUBLE_ARCHED_WINDOW_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                // create a grid of where I want to put items
                //TabLayout.put(1, ModBlocks.double_window_arch_row1_col1);
                //row1
                TabLayout.put(2, Blocks.QUARTZ_BRICKS);
                TabLayout.put(3, ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL2);
                TabLayout.put(4, ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL3);
                TabLayout.put(5, ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL4);
                TabLayout.put(6, Blocks.QUARTZ_BRICKS);
                //row2
                TabLayout.put(11, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL1);
                TabLayout.put(12, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL2);
                TabLayout.put(13, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL3);
                TabLayout.put(14, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL4);
                TabLayout.put(15, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL5);
                //row3
                TabLayout.put(20, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL1);
                TabLayout.put(21, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL2);
                TabLayout.put(22, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(23, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL4);
                TabLayout.put(24, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL5);
                //row4
                TabLayout.put(29, Blocks.QUARTZ_BRICKS);
                TabLayout.put(30, ModBlocks.LEFT_END_CAP);
                TabLayout.put(31, ModBlocks.CENTER_PILLAR_CAP);
                TabLayout.put(32, ModBlocks.RIGHT_END_CAP);
                TabLayout.put(33, Blocks.QUARTZ_BRICKS);
                //row5
                TabLayout.put(38, Blocks.QUARTZ_BRICKS);
                TabLayout.put(39, ModBlocks.LEFT_END_MIDDLE);
                TabLayout.put(40, ModBlocks.CENTER_PILLAR_MIDDLE);
                TabLayout.put(41, ModBlocks.RIGHT_END_MIDDLE);
                TabLayout.put(42, Blocks.QUARTZ_BRICKS);
                //row6
                TabLayout.put(47, Blocks.QUARTZ_BRICKS);
                TabLayout.put(48, ModBlocks.LEFT_END_BASE);
                TabLayout.put(49, ModBlocks.CENTER_PILLAR_BASE);
                TabLayout.put(50, ModBlocks.RIGHT_END_BASE);
                TabLayout.put(51, Blocks.QUARTZ_BRICKS);


                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());

    public static final CreativeModeTab TRIPLE_WINDOWS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            TRIPLE_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup." + ArchitectureBlocks.MOD_ID + ".triple_arched_window_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.TRIPLE_WIND0W_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                //row 1 (0-8)
                TabLayout.put(2, Blocks.QUARTZ_BRICKS);     // Row 1, Slot 3
                TabLayout.put(3, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL2);     // Row 1, Slot 4
                TabLayout.put(4, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL3);     // Row 1, Slot 5
                TabLayout.put(5, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL4);     // Row 1, Slot 6
                TabLayout.put(6, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL5);     // Row 1, Slot 7
                TabLayout.put(7, Blocks.QUARTZ_BRICKS);      // Row 1, Slot 8
                //row 2 (9-17)
                TabLayout.put(11, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL1);     // Row 1, Slot 3
                TabLayout.put(12, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL2);     // Row 1, Slot 4
                TabLayout.put(13, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL3);     // Row 1, Slot 5
                TabLayout.put(14, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL4);     // Row 1, Slot 6
                TabLayout.put(15, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL5);     // Row 1, Slot 7
                TabLayout.put(16, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL6);      // Row 1, Slot 8
                //row 2 (18-26)
                TabLayout.put(20, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL1);
                TabLayout.put(21, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL2);
                TabLayout.put(22, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(23, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(24, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL5);
                TabLayout.put(25, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL6);
                //row 3 (27-35)
                TabLayout.put(29, ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL1);
                TabLayout.put(30, ModBlocks.LEFT_END_CAP);
                TabLayout.put(31, ModBlocks.LEFT_PILLAR_CAP);
                TabLayout.put(32, ModBlocks.RIGHT_PILLAR_CAP);
                TabLayout.put(33, ModBlocks.RIGHT_END_CAP);
                TabLayout.put(34, ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL6);
                //row 4 (36-44)
                TabLayout.put(38, Blocks.QUARTZ_BRICKS);
                TabLayout.put(39, ModBlocks.LEFT_END_MIDDLE);
                TabLayout.put(40, ModBlocks.LEFT_PILLAR_MIDDLE);
                TabLayout.put(41, ModBlocks.RIGHT_PILLAR_MIDDLE);
                TabLayout.put(42, ModBlocks.RIGHT_END_MIDDLE);
                TabLayout.put(43, Blocks.QUARTZ_BRICKS);
                //row 5 (45-53)
                TabLayout.put(47, Blocks.QUARTZ_BRICKS);
                TabLayout.put(48, ModBlocks.LEFT_END_BASE);
                TabLayout.put(49, ModBlocks.LEFT_PILLAR_BASE);
                TabLayout.put(50, ModBlocks.RIGHT_PILLAR_BASE);
                TabLayout.put(51, ModBlocks.RIGHT_END_BASE);
                TabLayout.put(52, Blocks.QUARTZ_BRICKS);

                // 2. Find the highest slot index used to determine where to stop the loop
                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());

    public static final CreativeModeTab FOUR_ARCHED_WINDOW_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            FOUR_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup." + ArchitectureBlocks.MOD_ID + ".four_arched_window_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.FOUR_ARCHED_WINDOW_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                // create a grid of where I want to put items
                //row1
                TabLayout.put(1, Blocks.QUARTZ_BRICKS);
                TabLayout.put(2, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL2);
                TabLayout.put(3, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL3);
                TabLayout.put(4, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL4);
                TabLayout.put(5, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL5);
                TabLayout.put(6, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL6);
                TabLayout.put(7, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL7);
                TabLayout.put(8, Blocks.QUARTZ_BRICKS);
                //row 2
                TabLayout.put(10, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL1);
                TabLayout.put(11, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL2);
                TabLayout.put(12, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL3);
                TabLayout.put(13, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(14, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(15, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL6);
                TabLayout.put(16, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL7);
                TabLayout.put(17, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL8);
                //row3
                TabLayout.put(19, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL1);
                TabLayout.put(20, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL2);
                TabLayout.put(21, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(22, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(23, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(24, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(25, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL7);
                TabLayout.put(26, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL8);
                //row4
                TabLayout.put(28, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL1);
                TabLayout.put(29, ModBlocks.LEFT_END_CAP);
                TabLayout.put(30, ModBlocks.RIGHT_PILLAR_CAP);
                TabLayout.put(31, ModBlocks.RIGHT_HALF_PILLAR_CAP);
                TabLayout.put(32, ModBlocks.LEFT_HALF_PILLAR_CAP);
                TabLayout.put(33, ModBlocks.LEFT_PILLAR_CAP);
                TabLayout.put(34, ModBlocks.RIGHT_END_CAP);
                TabLayout.put(35, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL8);
                //row5
                TabLayout.put(37, Blocks.QUARTZ_BRICKS);
                TabLayout.put(38, ModBlocks.LEFT_END_MIDDLE);
                TabLayout.put(39, ModBlocks.RIGHT_PILLAR_MIDDLE);
                TabLayout.put(40, ModBlocks.RIGHT_HALF_PILLAR_MIDDLE);
                TabLayout.put(41, ModBlocks.LEFT_HALF_PILLAR_MIDDLE);
                TabLayout.put(42, ModBlocks.LEFT_PILLAR_MIDDLE);
                TabLayout.put(43, ModBlocks.RIGHT_END_MIDDLE);
                TabLayout.put(44, Blocks.QUARTZ_BRICKS);
                //row6
                TabLayout.put(46, Blocks.QUARTZ_BRICKS);
                TabLayout.put(47, ModBlocks.LEFT_END_BASE);
                TabLayout.put(48, ModBlocks.RIGHT_PILLAR_BASE);
                TabLayout.put(49, ModBlocks.RIGHT_HALF_PILLAR_BASE);
                TabLayout.put(50, ModBlocks.LEFT_HALF_PILLAR_BASE);
                TabLayout.put(51, ModBlocks.LEFT_PILLAR_BASE);
                TabLayout.put(52, ModBlocks.RIGHT_END_BASE);
                TabLayout.put(53, Blocks.QUARTZ_BRICKS);

                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());


    public static void registerModCreativeModeTabs() {
        System.out.print("Registering Creative Mode Tabs");
        ArchitectureBlocks.LOGGER.info("Registering Creative Mode Tabs for " + ArchitectureBlocks.MOD_ID);
    }
}
