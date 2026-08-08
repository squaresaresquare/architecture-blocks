package com.squaresaresquare.github.block.custom.mosaic;

import com.mojang.serialization.MapCodec;
import com.squaresaresquare.github.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

public class MosaicComplete extends BaseEntityBlock {
    public MosaicComplete(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() {
        return null;
    }

    public void onInitialize() {
        ModBlocks.initialize();
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos worldPosition, @NotNull BlockState blockState) {
        return null;
    }
}

