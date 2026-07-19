package com.squaresaresquare.github.tags;

import com.squaresaresquare.github.ArchitectureBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ModTags {
    public static class Blocks {
        private static TagKey<@NotNull Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<@NotNull Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, name));
        }
    }
}
