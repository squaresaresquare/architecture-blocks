package com.squaresaresquare.github.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.block.entity.ModBlockEntities;

public class RightEndBaseBlockEntity extends BlockEntity {
    public RightEndBaseBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.RIGHT_END_BASE_BLOCK_ENTITY, pos, state);
    }
}
        
