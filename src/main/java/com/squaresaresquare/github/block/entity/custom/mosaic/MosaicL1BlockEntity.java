package com.squaresaresquare.github.block.entity.custom.mosaic;

import com.squaresaresquare.github.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MosaicL1BlockEntity extends BlockEntity {
    public MosaicL1BlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOSAIC_L1_BLOCK_ENTITY, pos, state);
    }
}

