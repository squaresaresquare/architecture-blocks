package com.squaresaresquare.github.data;

import com.squaresaresquare.github.ArchitectureBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import com.mojang.serialization.Codec;

import java.util.function.UnaryOperator;

public class ModDataComponents {

    public static final DataComponentType<@NotNull BlockPos> COORDINATES = register("coordinates",
            builder -> builder.persistent(BlockPos.CODEC).networkSynchronized(BlockPos.STREAM_CODEC));

    // ADDED: Using your existing register helper method cleanly
    public static final DataComponentType<@NotNull Integer> MY_INT_COMPONENT = register("my_integer",
            builder -> builder.persistent(Codec.INT));

    private static <T> DataComponentType<@NotNull T> register(String name, UnaryOperator<DataComponentType.Builder<@NotNull T>> builderOperator) {
        return Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, name),
                builderOperator.apply(DataComponentType.builder()).build());
    }

    public static void registerDataComponents() {
        ArchitectureBlocks.LOGGER.info("Registering Data Components for " + ArchitectureBlocks.MOD_ID);
    }
}
