
package com.squaresaresquare.github.rendering.blockentity.quadruplewindowarch;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.block.entity.custom.quadruplewindowarch.QuadrupleWindowArchRow1Col6BlockEntity;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class QuadrupleWindowArchRow1Col6BlockEntityRenderer implements BlockEntityRenderer<@NotNull QuadrupleWindowArchRow1Col6BlockEntity, @NotNull QuadrupleWindowArchRow1Col6BlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public QuadrupleWindowArchRow1Col6BlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public QuadrupleWindowArchRow1Col6BlockEntityRenderState createRenderState() {
        return new QuadrupleWindowArchRow1Col6BlockEntityRenderState();
    }

    @Override
    public void extractRenderState(QuadrupleWindowArchRow1Col6BlockEntity blockEntity, QuadrupleWindowArchRow1Col6BlockEntityRenderState state, float tickProgress, @NotNull Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(QuadrupleWindowArchRow1Col6BlockEntityRenderState state, PoseStack matrices, @NotNull SubmitNodeCollector queue, @NotNull CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
        
