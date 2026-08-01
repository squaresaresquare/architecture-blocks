package com.squaresaresquare.github.rendering.glowingpainting;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.resources.Identifier;
public class GlowingPaintingRenderState extends EntityRenderState {
    public int light;
    public float xRot;
    public float yRot;
    public boolean isGlowing;
    public int widthPixels;
    public int heightPixels;
}
