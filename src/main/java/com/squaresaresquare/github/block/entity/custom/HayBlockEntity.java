package com.squaresaresquare.github.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import com.squaresaresquare.github.block.entity.ModBlockEntities;

public class HayBlockEntity extends BlockEntity {
    public HayBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.HAY_BLOCK_ENTITY, pos, state);
    }
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new HayBlockEntity(pos, state);
    }
}
