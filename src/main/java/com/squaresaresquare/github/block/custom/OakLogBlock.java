package com.squaresaresquare.github.block.custom;

import com.mojang.serialization.MapCodec;
import com.squaresaresquare.github.block.entity.custom.OakLogBlockEntity;
import com.squaresaresquare.github.block.entity.custom.PillarCapBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class OakLogBlock extends BaseEntityBlock {
    public static final EnumProperty<@NotNull Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty ON_GRASS = BooleanProperty.create("on_grass");
    public OakLogBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(ON_GRASS, true) // Default state
                .setValue(FACING, Direction.NORTH)
        );
    }
    @Override
    protected @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.MODEL;
    }

    protected VoxelShape getOcclusionShape(BlockState state, BlockGetter level, BlockPos pos) {
        return Shapes.empty();
    }

    @Override
    public boolean skipRendering(@NotNull BlockState state, @NotNull BlockState adjacentBlockState, @NotNull Direction side) {
        return false;
    }

    @Override
    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.makeShape();
    }

    @Override
    protected @NotNull VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.makeShape();
    }

    public VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.3125, 1, 1, 0.6875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 0, 0, 0.6875, 1, 0.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.125, 0.875, 1, 0.1875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.1875, 0, 0.0625, 0.8125, 1, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0, 0.1875, 0.9375, 1, 0.3125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 0, 0.9375, 0.6875, 1, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.8125, 0.875, 1, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.1875, 0, 0.875, 0.8125, 1, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0, 0.6875, 0.9375, 1, 0.8125), BooleanOp.OR);
        return shape;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<@NotNull Block, @NotNull BlockState> builder) {
        builder.add(ON_GRASS);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos posBelow = context.getClickedPos().below();
        boolean isGrassBelow = context.getLevel().getBlockState(posBelow).is(Blocks.GRASS_BLOCK);

        return this.defaultBlockState()
                .setValue(ON_GRASS, isGrassBelow);
    }

    @Override
    @NotNull
    public MapCodec<? extends BaseEntityBlock> codec() {
        return simpleCodec(OakLogBlock::new);
    }

    @Nullable
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new OakLogBlockEntity(pos, state);
    }

}
