package com.squaresaresquare.github.datagen;

import com.squaresaresquare.github.ArchitectureBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier; //use instead of Resource location
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantProvider extends FabricDynamicRegistryProvider {
    public ModPaintingVariantProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries){
        Identifier paintingId = Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "oratory_stained_glass");
        ResourceKey<PaintingVariant> paintingKey = ResourceKey.create(Registries.PAINTING_VARIANT, paintingId);
        String author = "Mayerischen";
        String title = "Oratory Stained Glass";
        Optional component_title = java.util.Optional.of(Component.literal(title).withStyle(ChatFormatting.YELLOW));
        Optional component_author = java.util.Optional.of(Component.literal(author).withStyle(ChatFormatting.GRAY));

        PaintingVariant glowingPainting = new PaintingVariant(3, 5, paintingId, component_title, component_author);

        entries.add(paintingKey, glowingPainting);
    }

    @Override
    public String getName() {
        return "Custom Painting Variants Provider";
    }
}