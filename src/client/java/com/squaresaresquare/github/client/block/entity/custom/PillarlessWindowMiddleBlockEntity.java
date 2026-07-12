package com.squaresaresquare.github.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;

public class PillarlessWindowMiddleBlockEntity extends BlockEntity {
    public PillarlessWindowMiddleBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PILLARLESS_WINDOW_MIDDLE_BLOCK_ENTITY, pos, state);
    }
}
        
