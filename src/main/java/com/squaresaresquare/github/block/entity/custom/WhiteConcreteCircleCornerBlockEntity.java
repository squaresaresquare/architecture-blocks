package com.squaresaresquare.github.block.entity.custom;

import com.squaresaresquare.github.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WhiteConcreteCircleCornerBlockEntity extends BlockEntity {
    public WhiteConcreteCircleCornerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CIRCLE_CORNER_BLOCK_ENTITY, pos, state);
    }
}
        
