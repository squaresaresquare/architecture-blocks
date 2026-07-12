package com.squaresaresquare.github.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;

public class MarblePillarBlockEntity extends BlockEntity {
    public MarblePillarBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MARBLE_PILLAR_BLOCK_ENTITY, pos, state);
    }
}
        
