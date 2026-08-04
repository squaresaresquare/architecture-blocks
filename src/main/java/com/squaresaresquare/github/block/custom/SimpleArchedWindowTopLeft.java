package com.squaresaresquare.github.block.custom;

import com.mojang.serialization.MapCodec;
import com.squaresaresquare.github.block.ModBlocks;
import com.squaresaresquare.github.block.entity.custom.SimpleArchedWindowTopLeftBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.BlockView;

public class SimpleArchedWindowTopLeft extends BaseEntityBlock {
    public static final EnumProperty<@NotNull Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public SimpleArchedWindowTopLeft(Properties properties) {
        super(properties);
        // stateDefinition.any() returns a random BlockState from an internal set,
        // we don't care because we're setting all values ourselves anyway
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<@NotNull Block, @NotNull BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0, 1, 0.1875, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 0.75, 0.1875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.1875, 0, 0.8125, 0.375, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.375, 0, 0.875, 0.5625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.5625, 0, 0.9375, 0.625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.625, 0, 1, 1, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0.1875, 0, 1, 0.375, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0.375, 0, 1, 0.5625, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.5625, 0, 1, 0.625, 0.75), BooleanOp.OR);

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
        return simpleCodec(SimpleArchedWindowTopLeft::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new SimpleArchedWindowTopLeftBlockEntity(pos, state);
    }

    public void onInitialize() {
        ModBlocks.initialize();
    }
}
        
