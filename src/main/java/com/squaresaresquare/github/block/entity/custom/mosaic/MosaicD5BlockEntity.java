package com.squaresaresquare.github.block.entity.custom.mosaic;

import com.squaresaresquare.github.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MosaicD5BlockEntity extends BlockEntity {
    public MosaicD5BlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOSAIC_D5_BLOCK_ENTITY, pos, state);
    }
}

