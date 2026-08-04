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
        entries.add(
                ResourceKey.create(
                        Registries.PAINTING_VARIANT,
                        Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "oratory_stained_glass")),
                new PaintingVariant(
                        3,
                        5,
                        Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "oratory_stained_glass"),
                        java.util.Optional.of(Component.literal("Oratory Stained Glass").withStyle(ChatFormatting.YELLOW)),
                        java.util.Optional.of(Component.literal("Franz Mayer Mayerischen Studios").withStyle(ChatFormatting.GRAY)))
        );
        entries.add(
                ResourceKey.create(
                        Registries.PAINTING_VARIANT,
                        Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "immaculate_conception_of_mary")),
                new PaintingVariant(
                        3,
                        5,
                        Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "immaculate_conception_of_mary"),
                        java.util.Optional.of(Component.literal("Immaculate Conception of Mary").withStyle(ChatFormatting.YELLOW)),
                        java.util.Optional.of(Component.literal("Franz Mayer Mayerischen Studios").withStyle(ChatFormatting.GRAY)))
        );
        entries.add(
                ResourceKey.create(
                        Registries.PAINTING_VARIANT,
                        Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "chapel")),
                new PaintingVariant(
                        3,
                        5,
                        Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "chapel"),
                        java.util.Optional.of(Component.literal("Chapel").withStyle(ChatFormatting.YELLOW)),
                        java.util.Optional.of(Component.literal("Franz Mayer Mayerischen Studios").withStyle(ChatFormatting.GRAY)))
        );
    }

    @Override
    public String getName() {
        return "Custom Painting Variants Provider";
    }
}