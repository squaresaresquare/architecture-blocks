package com.squaresaresquare.github.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.block.entity.ModBlockEntities;

public class CenterPillarCapBlockEntity extends BlockEntity {
    public CenterPillarCapBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CENTER_PILLAR_CAP_BLOCK_ENTITY, pos, state);
    }
}
        
