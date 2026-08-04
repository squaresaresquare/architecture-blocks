package com.squaresaresquare.github.block.entity.custom;
import com.squaresaresquare.github.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WhiteConcreteKeyholeBlockEntity extends BlockEntity {
    public WhiteConcreteKeyholeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WHITE_CONCRETE_KEYHOLE_BLOCK_ENTITY, pos, state);
    }
}
