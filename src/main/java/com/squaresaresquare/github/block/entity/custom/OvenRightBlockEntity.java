package com.squaresaresquare.github.block.entity.custom;

import com.squaresaresquare.github.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class OvenRightBlockEntity extends BlockEntity {
    public OvenRightBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.OVEN_RIGHT_BLOCK_ENTITY, pos, state);
    }
}
        
