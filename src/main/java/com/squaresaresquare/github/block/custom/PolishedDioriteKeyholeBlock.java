package com.squaresaresquare.github.block.custom;

import com.mojang.serialization.MapCodec;
import com.squaresaresquare.github.block.entity.custom.PolishedDioriteKeyholeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
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

public class PolishedDioriteKeyholeBlock extends BaseEntityBlock {
    public static final EnumProperty<@NotNull Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty ON_GRASS = BooleanProperty.create("on_grass");
    public PolishedDioriteKeyholeBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(ON_GRASS, true)
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
        shape = Shapes.join(shape, Shapes.box(0.0625, 0, 0, 0.9375, 0.0625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.0625, 0, 0.3125, 0.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6875, 0.0625, 0, 0.9375, 0.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.125, 0, 0.1875, 0.1875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0.125, 0, 0.9375, 0.1875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.1875, 0, 0.125, 0.3125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0.1875, 0, 0.9375, 0.3125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 0.0625, 1, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0, 0, 1, 1, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0.6875, 0, 0.9375, 0.8125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.9375, 0, 0.9375, 1, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.875, 0, 0.3125, 0.9375, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6875, 0.875, 0, 0.9375, 0.9375, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.8125, 0, 0.1875, 0.875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0.8125, 0, 0.9375, 0.875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.6875, 0, 0.125, 0.8125, 1), BooleanOp.OR);

        return shape;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<@NotNull Block, @NotNull BlockState> builder) {
        builder.add(ON_GRASS);
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos posBelow = context.getClickedPos().below();
        boolean isGrassBelow = context.getLevel().getBlockState(posBelow).is(Blocks.GRASS_BLOCK);
        Direction directionFacing = context.getHorizontalDirection().getOpposite();
        return this.defaultBlockState()
                .setValue(FACING, directionFacing)
                .setValue(ON_GRASS, isGrassBelow);
    }

    @Override
    @NotNull
    public MapCodec<? extends BaseEntityBlock> codec() {
        return simpleCodec(PolishedDioriteKeyholeBlock::new);
    }

    @Nullable
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new PolishedDioriteKeyholeBlockEntity(pos, state);
    }
}