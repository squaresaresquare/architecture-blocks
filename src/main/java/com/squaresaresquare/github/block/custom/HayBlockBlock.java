package com.squaresaresquare.github.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class HayBlockBlock extends Block {
    public HayBlockBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        // Return MODEL for standard rendering or ENTITYBLOCK_ANIMATED for block entities
        return RenderShape.MODEL;
    }
}
