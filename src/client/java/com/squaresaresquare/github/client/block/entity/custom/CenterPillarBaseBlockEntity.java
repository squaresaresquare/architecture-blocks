package com.squaresaresquare.github.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;

public class CenterPillarBaseBlockEntity extends BlockEntity {
    public CenterPillarBaseBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CENTER_PILLAR_BASE_BLOCK_ENTITY, pos, state);
    }
}
        
