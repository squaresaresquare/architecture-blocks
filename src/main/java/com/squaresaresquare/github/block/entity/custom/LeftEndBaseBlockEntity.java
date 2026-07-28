package com.squaresaresquare.github.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.block.entity.ModBlockEntities;

public class LeftEndBaseBlockEntity extends BlockEntity {
    public LeftEndBaseBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LEFT_END_BASE_BLOCK_ENTITY, pos, state);
    }
}
        
