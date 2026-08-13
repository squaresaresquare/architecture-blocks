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

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import net.minecraft.client.multiplayer.ClientPacketListener;

public class PaintingConversionTool {
    // Keep the lookup reference private to protect the data state
    private static HolderLookup.RegistryLookup<PaintingVariant> paintingRegistry = null;

    public PaintingConversionTool(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super();
    }
    /**
     * Initializes the tool with the active registry lookup from the server connection.
     */
    public static void initialize(HolderLookup.RegistryLookup<PaintingVariant> lookup) {
        paintingRegistry = lookup;
        System.out.println("[PaintingConversionTool] Initialized and ready with " + getVariantCount() + " paintings.");
    }

    /**
     * Resets the tool when the player disconnects to prevent memory leaks or stale data.
     */
    public static void reset() {
        paintingRegistry = null;
    }

    /**
     * Dependent classes call this to ensure they don't execute before data packs sync.
     */
    public static boolean isReady() {
        return paintingRegistry != null;
    }

    public static int getVariantCount() {
        return isReady() ? (int) paintingRegistry.listElements().count() : 0;
    }

    // In your ModRegistryKeys or main initialization class
    public static RegistryAccess getRegistryAccess() {
        Minecraft minecraft = Minecraft.getInstance();
        if (minecraft == null) return null;

        // Get the client-side connection listener
        ClientPacketListener connection = minecraft.getConnection();

        // Ensure the player is actually in a world/connected to a server
        if (connection != null) {
            // Access the dynamic registry access provider
            return connection.registryAccess();
            // Example usage: Accessing a specific registry wrapper
            // var biomeRegistry = registryAccess.lookupOrThrow(net.minecraft.core.registries.Registries.BIOME);
        }
        return null;
    }
    public static final ResourceKey<Registry<Object>> MY_DYNAMIC_REGISTRY =
            ResourceKey.createRegistryKey(Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, "custom_painting_item_registry"));

    public static ItemStackTemplate getItemStackTemplate(ResourceKey<PaintingVariant> variantKey, String pathName) {
        // 1. Fetch your custom painting variant holder reference
        RegistryAccess access = getRegistryAccess();
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

    /**
     * Example utility method dependent classes can use once initialized.
     */
    public static Optional<PaintingVariant> getVariantData(net.minecraft.resources.ResourceKey<PaintingVariant> key) {
        if (!isReady()) return Optional.empty();
        return paintingRegistry.get(key).map(net.minecraft.core.Holder::value);
    }

}
