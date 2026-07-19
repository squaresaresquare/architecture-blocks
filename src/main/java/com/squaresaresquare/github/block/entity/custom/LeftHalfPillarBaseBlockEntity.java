package com.squaresaresquare.github.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.block.entity.ModBlockEntities;

public class LeftHalfPillarBaseBlockEntity extends BlockEntity {
    public LeftHalfPillarBaseBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LEFT_HALF_PILLAR_BASE_BLOCK_ENTITY, pos, state);
    }
}
        
