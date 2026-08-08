package com.squaresaresquare.github.block.entity.custom.mosaic;

import com.squaresaresquare.github.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MosaicI8BlockEntity extends BlockEntity {
    public MosaicI8BlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOSAIC_I8_BLOCK_ENTITY, pos, state);
    }
}

