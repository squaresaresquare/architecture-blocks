package com.squaresaresquare.github.datagen;

import com.squaresaresquare.github.records.PaintingsRecord;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantProvider extends FabricDynamicRegistryProvider {
    public ModPaintingVariantProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(HolderLookup.@NotNull Provider registries, @NotNull Entries entries){
        var paintingRegistry = registries.lookupOrThrow(Registries.PAINTING_VARIANT);
        for (Map.Entry<String, PaintingsRecord.Painting> painting : PaintingsRecord.PaintingMap.entrySet()) {
            entries.add(
                    painting.getValue().resourceKey(),
                    new PaintingVariant(
                            painting.getValue().height(),
                            painting.getValue().width(),
                            painting.getValue().resourceKey().identifier(),
                            java.util.Optional.of(Component.literal(painting.getValue().title()).withStyle(ChatFormatting.YELLOW)),
                            java.util.Optional.of(Component.literal(painting.getValue().author()).withStyle(ChatFormatting.GRAY)))
            );
        };
    }
    @Override
    public @NotNull String getName() {
        return "Custom Painting Variants Provider";
    }
}