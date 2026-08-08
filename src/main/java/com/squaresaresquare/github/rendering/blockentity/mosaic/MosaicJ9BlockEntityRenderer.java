package com.squaresaresquare.github.rendering.blockentity.mosaic;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.squaresaresquare.github.block.entity.custom.mosaic.MosaicJ9BlockEntity;
import com.squaresaresquare.github.rendering.blockentity.mosaic.MosaicJ9BlockEntityRenderState;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MosaicJ9BlockEntityRenderer implements BlockEntityRenderer<@NotNull MosaicJ9BlockEntity, @NotNull MosaicJ9BlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public MosaicJ9BlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public MosaicJ9BlockEntityRenderState createRenderState() {
        return new MosaicJ9BlockEntityRenderState();
    }

    @Override
    public void extractRenderState(MosaicJ9BlockEntity blockEntity, MosaicJ9BlockEntityRenderState state, float tickProgress, @NotNull Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(MosaicJ9BlockEntityRenderState state, PoseStack matrices, @NotNull SubmitNodeCollector queue, @NotNull CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
