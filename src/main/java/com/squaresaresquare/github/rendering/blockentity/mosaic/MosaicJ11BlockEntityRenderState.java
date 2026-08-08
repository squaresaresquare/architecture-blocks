package com.squaresaresquare.github.rendering.blockentity.mosaic;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Display.ItemDisplay.ItemRenderState;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class MosaicJ11BlockEntityRenderState extends BlockEntityRenderState {
    final ItemRenderState itemRenderState = new ItemRenderState(ItemStack.EMPTY, ItemDisplayContext.NONE);
    public BlockPos lightPosition;
    public float rotation;
}
