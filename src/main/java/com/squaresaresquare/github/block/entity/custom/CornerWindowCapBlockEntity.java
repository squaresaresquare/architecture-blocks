package com.squaresaresquare.github.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.block.entity.ModBlockEntities;

public class CornerWindowCapBlockEntity extends BlockEntity {
    public CornerWindowCapBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CORNER_WINDOW_CAP_BLOCK_ENTITY, pos, state);
    }
}
        
