package com.squaresaresquare.github.util;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.spongepowered.asm.mixin.gen.Accessor;
public interface StonecutterScreenAccessor {
    void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTick);

    int getLeftPos();
    int getTopPos();
    int getStartIndex();
}

