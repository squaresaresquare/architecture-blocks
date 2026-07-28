package com.squaresaresquare.github.block.entity.custom;

import com.squaresaresquare.github.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SimpleArchedWindowLeftBlockEntity extends BlockEntity {
    public SimpleArchedWindowLeftBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SIMPLE_ARCHED_WINDOW_TOP_LEFT_BLOCK_ENTITY, pos, state);
    }
}
        
