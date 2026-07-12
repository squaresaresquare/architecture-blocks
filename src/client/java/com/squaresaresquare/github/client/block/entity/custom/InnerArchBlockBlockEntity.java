package com.squaresaresquare.github.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;

public class InnerArchBlockBlockEntity extends BlockEntity {
    public InnerArchBlockBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.INNER_ARCH_BLOCK_BLOCK_ENTITY, pos, state);
    }
}
        
