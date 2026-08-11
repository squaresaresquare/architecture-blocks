package com.squaresaresquare.github.rendering.blockentity.mosaic;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.squaresaresquare.github.block.entity.custom.mosaic.MosaicBORDER05BlockEntity;
import com.squaresaresquare.github.rendering.blockentity.mosaic.MosaicBORDER05BlockEntityRenderState;
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

public class MosaicBORDER05BlockEntityRenderer implements BlockEntityRenderer<@NotNull MosaicBORDER05BlockEntity, @NotNull MosaicBORDER05BlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public MosaicBORDER05BlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public MosaicBORDER05BlockEntityRenderState createRenderState() {
        return new MosaicBORDER05BlockEntityRenderState();
    }

    @Override
    public void extractRenderState(MosaicBORDER05BlockEntity blockEntity, MosaicBORDER05BlockEntityRenderState state, float tickProgress, @NotNull Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(MosaicBORDER05BlockEntityRenderState state, PoseStack matrices, @NotNull SubmitNodeCollector queue, @NotNull CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
