package com.squaresaresquare.github.block.entity.custom.mosaic;

import com.squaresaresquare.github.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MosaicL10BlockEntity extends BlockEntity {
    public MosaicL10BlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOSAIC_L10_BLOCK_ENTITY, pos, state);
    }
}

