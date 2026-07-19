package com.squaresaresquare.github.client.block.entity.custom;

import com.squaresaresquare.github.client.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SimpleArchedWindowBetweenBlockEntity extends BlockEntity {
    public SimpleArchedWindowBetweenBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SIMPLE_ARCHED_WINDOW_BETWEEN_BLOCK_ENTITY, pos, state);
    }
}
        
