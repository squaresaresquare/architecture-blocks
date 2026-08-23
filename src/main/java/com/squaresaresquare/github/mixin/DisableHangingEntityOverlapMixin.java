package com.squaresaresquare.github.mixin;

import net.minecraft.world.entity.decoration.HangingEntity;
import net.minecraft.world.entity.decoration.painting.Painting;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// 1. Target the abstract class handling the physical placement restrictions
@Mixin(HangingEntity.class)
public class DisableHangingEntityOverlapMixin {

    // 2. Inject into the correct position confirmation logic
    @Inject(method = "survives", at = @At("HEAD"), cancellable = true)
    private void allowPlacementOverlap(CallbackInfoReturnable<Boolean> cir) {
        // Only run this rule logic if the current entity is actually a Painting
        if ((Object) this instanceof Painting) {
            cir.setReturnValue(true);
        }
    }
}
