package com.squaresaresquare.github.datagen;

import com.squaresaresquare.github.item.ModPaintings;
import com.squaresaresquare.github.records.PaintingsRecord;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModPaintingTagProvider extends FabricTagsProvider<PaintingVariant> {
    public ModPaintingTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("painting_variant")), registryLookupFuture);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider registries) {
        var builder = getOrCreateRawBuilder(PaintingVariantTags.PLACEABLE).setReplace(true);
        for (Map.Entry<String, PaintingsRecord.Painting> painting : PaintingsRecord.PaintingMap.entrySet()) {
            builder.addOptionalElement(painting.getValue().resourceKey().identifier());
        }
    }
}
