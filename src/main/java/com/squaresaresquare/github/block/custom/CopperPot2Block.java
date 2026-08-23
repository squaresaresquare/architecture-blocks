package com.squaresaresquare.github.block.custom;

import com.mojang.serialization.MapCodec;
import com.squaresaresquare.github.block.ModBlocks;
import com.squaresaresquare.github.block.entity.custom.CopperPot2BlockEntity;
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
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.BlockView;

public class CopperPot2Block extends BaseEntityBlock {
    public static final EnumProperty<@NotNull Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public CopperPot2Block(Properties properties) {
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
        shape = Shapes.join(shape, Shapes.box(0.4056776972381408, -0.006737307340132807, 0.24847385930170876, 0.5943223027618594, 0.09432230276185921, 0.7515261406982914), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.34279616206356806, -0.006737307340132807, 0.2799146268889951, 0.4056776972381408, 0.09432230276185921, 0.7200853731110048), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.31135539447628163, -0.006737307340132807, 0.31135539447628147, 0.34279616206356806, 0.09432230276185921, 0.6886446055237185), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.2799146268889952, -0.006737307340132807, 0.342796162063568, 0.31135539447628163, 0.09432230276185921, 0.657203837936432), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.24847385930170873, -0.006737307340132807, 0.40567769723814073, 0.2799146268889952, 0.09432230276185921, 0.5943223027618592), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6886446055237183, -0.006737307340132807, 0.342796162063568, 0.7200853731110048, 0.09432230276185921, 0.657203837936432), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.657203837936432, -0.006737307340132807, 0.31135539447628147, 0.6886446055237183, 0.09432230276185921, 0.6886446055237185), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5943223027618594, -0.006737307340132807, 0.2799146268889951, 0.657203837936432, 0.09432230276185921, 0.7200853731110048), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.7200853731110048, -0.006737307340132807, 0.40567769723814073, 0.7515261406982913, 0.09432230276185921, 0.5943223027618592), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6886446055237183, 0.09432230276185921, 0.342796162063568, 0.7200853731110048, 0.12576307034914563, 0.657203837936432), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4056776972381408, 0.09432230276185921, 0.24847385930170876, 0.5943223027618594, 0.12576307034914563, 0.7515261406982914), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.34279616206356806, 0.09432230276185921, 0.2799146268889951, 0.4056776972381408, 0.12576307034914563, 0.7200853731110048), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.31135539447628163, 0.09432230276185921, 0.31135539447628147, 0.34279616206356806, 0.12576307034914563, 0.6886446055237185), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.2799146268889952, 0.09432230276185921, 0.342796162063568, 0.31135539447628163, 0.12576307034914563, 0.657203837936432), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.24847385930170873, 0.09432230276185921, 0.40567769723814073, 0.2799146268889952, 0.12576307034914563, 0.5943223027618592), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.7200853731110048, 0.09432230276185921, 0.40567769723814073, 0.7515261406982913, 0.12576307034914563, 0.5943223027618592), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5943223027618594, 0.09432230276185921, 0.2799146268889951, 0.657203837936432, 0.12576307034914563, 0.7200853731110048), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.657203837936432, 0.09432230276185921, 0.31135539447628147, 0.6886446055237183, 0.12576307034914563, 0.6886446055237185), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4685592324127136, 0.12576307034914563, 0.4685592324127136, 0.5314407675872866, 0.18864460552371842, 0.5314407675872863), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.46875, 0.0375, 0.75, 0.53125, 0.1, 1), BooleanOp.OR);

        return shape;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {
        return this.makeShape();
    }


    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.makeShape();
    }

    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() {
        return simpleCodec(CopperPot2Block::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new CopperPot2BlockEntity(pos, state);
    }

    public void onInitialize() {
        ModBlocks.initialize();
    }
}
        
