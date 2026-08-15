package com.squaresaresquare.github.block.custom;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import com.squaresaresquare.github.block.entity.custom.CrownMoldingBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CrownMolding extends BaseEntityBlock {
    public static final EnumProperty<@NotNull Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    // Cache the rotated shapes at startup so Minecraft doesn't calculate math 20 times a second
    private final Map<Direction, VoxelShape> SHAPES;

    public CrownMolding(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));

        // Generate the 4 horizontal shapes
        VoxelShape northBase = makeShape();
        this.SHAPES = Arrays.stream(Direction.values())
                .filter(dir -> dir.getAxis().isHorizontal())
                .collect(Collectors.toUnmodifiableMap(
                        dir -> dir,
                        // CHANGED: Changing 'Direction.NORTH' to 'Direction.SOUTH'
                        // introduces a permanent 180-degree clockwise offset!
                        dir -> rotateHorizontal(Direction.SOUTH, dir, northBase)
                ));
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
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.5625, 0, 0.9375, 1, 0.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.625, 0.0625, 0.96875, 0.6875, 0.09375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.6875, 0.0625, 1, 0.75, 0.09375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.6875, 0.03125, 0.96875, 0.75, 0.09375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.5625, 0, 1, 1, 0.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.9375, 0.0625, 0.96875, 1, 0.09375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.625, 0.0625, 0.03125, 0.6875, 0.09375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.6875, 0.0625, 0.0625, 0.75, 0.09375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.6875, 0.03125, 0.03125, 0.75, 0.09375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.5625, 0, 0.0625, 1, 0.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.9375, 0.0625, 0.03125, 1, 0.09375), BooleanOp.OR);

        return shape;
    }

// Helper math tool that translates bounding coordinates around the Y-axis
    private static VoxelShape rotateHorizontal(Direction from, Direction to, VoxelShape shape) {
        VoxelShape buffer = shape;
        int times = (to.get2DDataValue() - from.get2DDataValue() + 4) % 4;

        for (int i = 0; i < times; i++) {
            VoxelShape rotated = Shapes.empty();
            for (AABB box : buffer.toAabbs()) {
                rotated = Shapes.or(rotated, Shapes.box(
                        1.0 - box.maxZ,
                        box.minY,
                        box.minX,
                        1.0 - box.minZ,
                        box.maxY,
                        box.maxX
                ));
            }
            buffer = rotated;
        }
        return buffer;
    }

    // FIXED: Reads the direction from the block's state and pulls the matching pre-rotated shape
    @Override
    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.SHAPES.getOrDefault(state.getValue(FACING), Shapes.block());
    }

    @Override
    protected @NotNull VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() {
        return simpleCodec(CrownMolding::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new CrownMoldingBlockEntity(pos, state);
    }
}