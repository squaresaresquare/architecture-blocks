package com.squaresaresquare.github.client.creativemodetab;

import com.mojang.serialization.Codec;
import com.squaresaresquare.github.client.painting.ModPaintings;
import com.squaresaresquare.github.client.item.ModItems;
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
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.client.ArchitectureBlocksClient;
import com.squaresaresquare.github.client.block.ModBlocks;
import com.squaresaresquare.github.client.painting.ModPaintings;
import net.minecraft.*;
import java.util.HashMap;
import java.util.Map;

public class ModCreativeModeTabs {
    public static final DataComponentType<@NotNull Integer> MY_INT_COMPONENT = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "my_integer"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT) // Makes sure the integer saves to the item NBT on disk
                    .build()
    );
    // 1. Create a registration key using your Mod ID
    public static final ResourceKey<@NotNull CreativeModeTab> PAINTINGS_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "paintings_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> ARCHITECTURE_BLOCK_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "architecture_block_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> DOUBLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "double_arched_window_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> TRIPLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "triple_arched_window_tab")
    );

    public static final ResourceKey<@NotNull CreativeModeTab> FOUR_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "four_arched_window_tab")
    );
    /*public static final CreativeModeTab PAINTINGS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            PAINTINGS_TAB_KEY,
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(BuiltInRegistries.ITEM.getValue(ModPaintings.ACCOLADE_RK.registry())))
                    .title(Component.translatable("itemGroup." + ArchitectureBlocksClient.MOD_ID + ".paintings_tab"))
                    .displayItems((displayContext, output) -> {
                        output.accept(BuiltInRegistries.ITEM.getValue(ModPaintings.ACCOLADE_RK.registry()));
                        output.accept(ModItems.BEDROOM_LOVE_POTION);
                        output.accept(ModItems.CHAPEL);
                        output.accept(ModItems.CHAPEL_SAINT_STAINED_GLASS);
                        output.accept(ModItems.CHAPEL_SUPPLICANTS_STAINED_GLASS);
                        output.accept(ModItems.COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL);
                        output.accept(ModItems.DINING_ROOM_SONG_CONTEST);
                        output.accept(ModItems.LUDWIG_II_BLUE_GENERAL_1);
                        output.accept(ModItems.LUDWIG_II_BLUE_GENERAL_2);
                        output.accept(ModItems.MALCOLM_AND_MARGARET_AT_QUEENSFERRY);
                        output.accept(ModItems.MIRACLE_OF_THE_GRAIL);
                        output.accept(ModItems.PARZIFAL);
                        output.accept(ModItems.PARZIFALS_FIGHT);
                        output.accept(ModItems.SIGURD_MEETS_GRYPIN);
                        output.accept(ModItems.SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL);
                        output.accept(ModItems.THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP);
                        output.accept(ModItems.TRISTAN_AND_ISOLDE_WITH_THE_POTION);
                        output.accept(ModItems.UNDER_THE_LINDON);
                    }).build());*/
    public static final CreativeModeTab ARCHITECTURE_BLOCK_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ARCHITECTURE_BLOCK_TAB_KEY,
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARBLE_PLINTH_BLOCK))
                    .title(Component.translatable("itemGroup." + ArchitectureBlocksClient.MOD_ID + ".architecture_block_tab"))
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
                        //::new architecture_block here
                    }).build());

    public static final CreativeModeTab DOUBLE_ARCHED_WINDOW_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            DOUBLE_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.architecture_blocks.double_arched_window_blocks_tab"))
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
            .title(Component.translatable("itemGroup.architecture_blocks.triple_arched_window_blocks_tab"))
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
            .title(Component.translatable("itemGroup.architecture_blocks.four_arched_window_blocks_tab"))
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
                TabLayout.put(37, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL1);
                TabLayout.put(38, ModBlocks.LEFT_END_MIDDLE);
                TabLayout.put(39, ModBlocks.RIGHT_PILLAR_MIDDLE);
                TabLayout.put(40, ModBlocks.RIGHT_HALF_PILLAR_MIDDLE);
                TabLayout.put(41, ModBlocks.LEFT_HALF_PILLAR_MIDDLE);
                TabLayout.put(42, ModBlocks.LEFT_PILLAR_MIDDLE);
                TabLayout.put(43, ModBlocks.RIGHT_END_MIDDLE);
                TabLayout.put(44, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL8);
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
        ArchitectureBlocksClient.LOGGER.info("Registering Creative Mode Tabs for " + ArchitectureBlocksClient.MOD_ID);
    }
}
