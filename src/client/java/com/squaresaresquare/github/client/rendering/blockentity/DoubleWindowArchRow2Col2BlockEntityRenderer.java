
package com.squaresaresquare.github.client.rendering.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.client.block.entity.custom.DoubleWindowArchRow2Col2BlockEntity;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class DoubleWindowArchRow2Col2BlockEntityRenderer implements BlockEntityRenderer<DoubleWindowArchRow2Col2BlockEntity, DoubleWindowArchRow2Col2BlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public DoubleWindowArchRow2Col2BlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public DoubleWindowArchRow2Col2BlockEntityRenderState createRenderState() {
        return new DoubleWindowArchRow2Col2BlockEntityRenderState();
    }

    @Override
    public void extractRenderState(DoubleWindowArchRow2Col2BlockEntity blockEntity, DoubleWindowArchRow2Col2BlockEntityRenderState state, float tickProgress, @NotNull Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(DoubleWindowArchRow2Col2BlockEntityRenderState state, PoseStack matrices, @NotNull SubmitNodeCollector queue, @NotNull CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
        
