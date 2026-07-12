package com.squaresaresquare.github.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;

public class SlotWindowMiddleBlockEntity extends BlockEntity {
    public SlotWindowMiddleBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SLOT_WINDOW_MIDDLE_BLOCK_ENTITY, pos, state);
    }
}
        
