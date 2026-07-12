package com.squaresaresquare.github.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;

public class CenterCornerPillarCapBlockEntity extends BlockEntity {
    public CenterCornerPillarCapBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CENTER_CORNER_PILLAR_CAP_BLOCK_ENTITY, pos, state);
    }
}
        
