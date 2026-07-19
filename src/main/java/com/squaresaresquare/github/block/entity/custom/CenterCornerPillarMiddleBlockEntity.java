package com.squaresaresquare.github.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.block.entity.ModBlockEntities;

public class CenterCornerPillarMiddleBlockEntity extends BlockEntity {
    public CenterCornerPillarMiddleBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CENTER_CORNER_PILLAR_MIDDLE_BLOCK_ENTITY, pos, state);
    }
}
        
