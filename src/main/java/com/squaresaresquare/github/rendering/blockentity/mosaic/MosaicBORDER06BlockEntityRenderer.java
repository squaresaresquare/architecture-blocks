package com.squaresaresquare.github.rendering.blockentity.mosaic;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.squaresaresquare.github.block.entity.custom.mosaic.MosaicBORDER06BlockEntity;
import com.squaresaresquare.github.rendering.blockentity.mosaic.MosaicBORDER06BlockEntityRenderState;
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

public class MosaicBORDER06BlockEntityRenderer implements BlockEntityRenderer<@NotNull MosaicBORDER06BlockEntity, @NotNull MosaicBORDER06BlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public MosaicBORDER06BlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public MosaicBORDER06BlockEntityRenderState createRenderState() {
        return new MosaicBORDER06BlockEntityRenderState();
    }

    @Override
    public void extractRenderState(MosaicBORDER06BlockEntity blockEntity, MosaicBORDER06BlockEntityRenderState state, float tickProgress, @NotNull Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(MosaicBORDER06BlockEntityRenderState state, PoseStack matrices, @NotNull SubmitNodeCollector queue, @NotNull CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
