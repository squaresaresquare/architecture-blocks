package com.squaresaresquare.github.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;

public class LeftEndCapBlockEntity extends BlockEntity {
    public LeftEndCapBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LEFT_END_CAP_BLOCK_ENTITY, pos, state);
    }
}
        
