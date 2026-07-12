package com.squaresaresquare.github.client.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.squaresaresquare.github.client.block.ModBlocks;
import com.squaresaresquare.github.client.block.entity.custom.WindowBlankEntity;

import javax.swing.text.html.BlockView;

public class WindowBlank extends BaseEntityBlock {
    public WindowBlank(Properties properties) {
        System.out.print("In WindowBlank class\n\n");

        super(properties);
    }

    public VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0, 0.125, 0, 1, 1, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 1, 0.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.125, 0.5, 0.5625, 1, 0.625), BooleanOp.OR);

        return shape;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {
        return this.makeShape();
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {
        return this.makeShape();
    }


    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() {
        return simpleCodec(WindowBlank::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        System.out.printf("create window blank entity\n");
        return new WindowBlankEntity(pos, state);
    }

    public void onInitialize() {
        System.out.print("initialize the WINDOW_BLANK\n");
        ModBlocks.initialize();
    }
}
        
