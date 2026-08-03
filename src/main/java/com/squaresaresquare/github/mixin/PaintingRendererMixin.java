package com.squaresaresquare.github.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.PaintingRenderer;
import net.minecraft.client.renderer.entity.state.PaintingRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite; // Make sure this is imported
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.Arrays;
import java.util.Set;

@Mixin(PaintingRenderer.class)
public class PaintingRendererMixin {

    @Unique
    private static final Set<String> EMISSIVE_VARIANTS = Set.of(
            "oratory_stained_glass",
            "immaculate_conception_of_mary"
    );

    @Unique
    private final ThreadLocal<Boolean> shouldGlow = ThreadLocal.withInitial(() -> false);

    /**
     * Intercepts the render state 'submit' method to capture the true active painting variant name.
     */
    @Inject(
            method = "submit",
            at = @At("HEAD")
    )
    private void checkPaintingIdentity(PaintingRenderState state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState cameraState, CallbackInfo ci) {
        if (state != null && state.variant != null) {
            String variantPath = state.variant.assetId().getPath();
            shouldGlow.set(EMISSIVE_VARIANTS.stream().anyMatch(variantPath::contains));
        }
    }

    /**
     * Modifies the 'renderType' argument passed into submitCustomGeometry.
     * FIXED: Targeted CustomGeometryRenderer instead of CustomGeometryConsumer
     */
    @ModifyArg(
            method = "renderPainting",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/renderer/SubmitNodeCollector;submitCustomGeometry(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;Lnet/minecraft/client/renderer/SubmitNodeCollector$CustomGeometryRenderer;)V"
            ),
            index = 1
    )
    private RenderType modifyPaintingRenderType(RenderType originalType) {
        if (shouldGlow.get()) {
            return RenderTypes.eyes(Identifier.fromNamespaceAndPath("minecraft", "textures/atlas/paintings.png"));
        }
        return originalType;
    }

    /**
     * Overrides the incoming lightCoordsMap array elements at the method entrance.
     * FIXED: Replaced Object with TextureAtlasSprite to precisely align with the expected bytecode descriptor
     */
    @Inject(
            method = "renderPainting",
            at = @At("HEAD")
    )
    private void overrideLightCoords(
            PoseStack poseStack,
            SubmitNodeCollector submitNodeCollector,
            RenderType renderType,
            int[] lightCoordsMap,
            int width,
            int height,
            TextureAtlasSprite front,
            TextureAtlasSprite back,
            CallbackInfo ci
    ) {
        if (shouldGlow.get() && lightCoordsMap != null) {
            Arrays.fill(lightCoordsMap, 15728880);
        }
    }

    /**
     * Cleans up the ThreadLocal tracker state after rendering completes.
     */
    @Inject(
            method = "submit",
            at = @At("TAIL")
    )
    private void resetIdentityTracker(PaintingRenderState state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState cameraState, CallbackInfo ci) {
        shouldGlow.remove();
    }
}

