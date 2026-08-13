package com.squaresaresquare.github.mixin;


import com.squaresaresquare.github.util.StonecutterScreenAccessor;
import net.minecraft.client.gui.screens.inventory.StonecutterScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(StonecutterScreen.class)
public abstract class StonecutterScreenAccessorMixin implements StonecutterScreenAccessor {

    @Override
    @Accessor("leftPos")
    public abstract int getLeftPos();

    @Override
    @Accessor("topPos")
    public abstract int getTopPos();

    @Override
    @Accessor("startIndex")
    public abstract int getStartIndex();
}