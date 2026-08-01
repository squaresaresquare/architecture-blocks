package com.squaresaresquare.github.data;

import com.mojang.serialization.Codec;
import com.squaresaresquare.github.ArchitectureBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.UUIDUtil;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import org.apache.commons.lang3.arch.Processor;
import org.jetbrains.annotations.NotNull;
import java.util.UUID;

import java.util.function.UnaryOperator;

public class ModDataComponents {
    public static final DataComponentType<@NotNull BlockPos> COORDINATES = register("coordinates",
            builder -> builder.persistent(BlockPos.CODEC).networkSynchronized(BlockPos.STREAM_CODEC));

    private static <T> DataComponentType<@NotNull T> register(String name, UnaryOperator<DataComponentType.Builder<@NotNull T>> builderOperator) {
        return Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, name),
                builderOperator.apply(DataComponentType.builder()).build());
    }

    public static final DataComponentType<Integer> WIDTH = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "painting_width"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT)
                    .build()
    );
    public static final DataComponentType<Integer> PAINTING_WIDTH = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "painting_width"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT)
                    .build()
    );
    public static final DataComponentType<Integer> PAINTING_HEIGHT = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "painting_height"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT)
                    .build()
    );
    public static final DataComponentType<Integer> PAINTING_RESOLUTION = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "painting_resolution"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT)
                    .build()
    );
    public static final DataComponentType<String> PAINTING_TITLE = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "painting_title"),
            DataComponentType.<String>builder()
                    .persistent(Codec.STRING)
                    .build()
    );
    public static final DataComponentType<String> PAINTING_AUTHOR = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "painting_author"),
            DataComponentType.<String>builder()
                    .persistent(Codec.STRING)
                    .build()
    );
    public static final DataComponentType<UUID> PAINTING_AUTHORUUID = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "painting_authoruuid"),
            DataComponentType.<UUID>builder()
                    .persistent(UUIDUtil.CODEC)
                    .build()
    );

    public static void registerDataComponents() {
        ArchitectureBlocks.LOGGER.info("Registering Data Components for " + ArchitectureBlocks.MOD_ID);
    }
}
