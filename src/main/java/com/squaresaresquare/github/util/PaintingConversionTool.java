package com.squaresaresquare.github.util;

import com.squaresaresquare.github.ArchitectureBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class PaintingConversionTool {
    public PaintingConversionTool(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super();
    }
    // In your ModRegistryKeys or main initialization class
    public static final ResourceKey<Registry<Object>> MY_DYNAMIC_REGISTRY =
            ResourceKey.createRegistryKey(Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "custom_Painting_Item_Registry"));

    public static ItemStackTemplate getItemStackTemplate(ResourceKey<PaintingVariant> variantKey, String pathName) {
        // 1. Fetch your custom painting variant holder reference
        RegistryAccess access = Objects.requireNonNull(Minecraft.getInstance().getConnection()).registryAccess();
        HolderLookup.Provider lookup = new HolderLookup.Provider() {

            @Override
            public @NotNull Stream<ResourceKey<? extends Registry<?>>> listRegistryKeys() {
                return Stream.empty();
            }

            @Override
            public <T> @NotNull Optional<? extends HolderLookup.RegistryLookup<T>> lookup(ResourceKey<? extends Registry<? extends T>> key) {
                return Optional.empty();
            }
        };
        var dynamicRegistry = lookup.lookupOrThrow(Registries.PAINTING_VARIANT);
        var paintingHolder = dynamicRegistry.getOrThrow(variantKey);

        // 2. Build the DataComponentPatch containing the metadata
        DataComponentPatch componentPatch = DataComponentPatch.builder()
                .set(DataComponents.PAINTING_VARIANT, paintingHolder)
                .build();

        // 3. FIX: Fetch the required Holder<Item> reference for the base painting
        Holder<Item> paintingItemHolder = Items.PAINTING.builtInRegistryHolder();

        // 4. FIX: Instantiating ItemStackTemplate using the item holder

        return new ItemStackTemplate(paintingItemHolder, 1, componentPatch);
    }

    public static ItemStack getItemStack(HolderLookup.Provider lookup, ResourceKey<PaintingVariant> variantKey, String pathName){
        ItemStack itemStack = getItemStackTemplate(variantKey, pathName).create();
        itemStack.limitSize(1);
        return itemStack;
    }

    public static Item getItem(HolderLookup.Provider lookup, ResourceKey<PaintingVariant> variantKey, String pathName){
        ItemStack itemStack = getItemStack(lookup, variantKey, pathName);
        return itemStack.getItem();
    }
    //

}
