package com.squaresaresquare.github.client;

import com.squaresaresquare.github.client.ArchitectureBlocksClient;
import com.squaresaresquare.github.client.painting.ModPaintings;
import com.squaresaresquare.github.client.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import com.squaresaresquare.github.client.datagen.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class ArchitectureBlocksDataGenerator implements DataGeneratorEntrypoint {
    private static final Logger log = LogManager.getLogger(ArchitectureBlocksDataGenerator.class);

    @Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        ArchitectureBlocksClient.LOGGER.info("Add data generators to dynamically create datapack and resource pack files");
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        ArchitectureBlocksClient.LOGGER.info("--- ADD PROVIDERS TO PACK ---");
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModBlockLootTableProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModRegistryDataProvider::new);
        pack.addProvider(ModPaintingTagProvider::new);
    }
    @Override
    public void buildRegistry(@NotNull RegistrySetBuilder registryBuilder) {
        ArchitectureBlocksClient.LOGGER.info("Add PAINTING_VARIANT registry to registry builder");
        registryBuilder.add(Registries.PAINTING_VARIANT, ModPaintings::bootstrap);
    }
}
