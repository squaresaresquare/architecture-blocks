package com.squaresaresquare.github;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.datagen.*;


public class ArchitectureBlocksDataGenerator implements DataGeneratorEntrypoint {
	private static final Logger log = LogManager.getLogger(ArchitectureBlocksDataGenerator.class);

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		ArchitectureBlocks.LOGGER.info("Add data generators to dynamically create datapack and resource pack files");
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		ArchitectureBlocks.LOGGER.info("--- ADD PROVIDERS TO PACK ---");
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModRegistryDataProvider::new);
		pack.addProvider(ModPaintingTagProvider::new);
	}
	@Override
	public void buildRegistry(@NotNull RegistrySetBuilder registryBuilder) {
		ArchitectureBlocks.LOGGER.info("Add PAINTING_VARIANT registry to registry builder");
		registryBuilder.add(Registries.PAINTING_VARIANT, ModPaintings::bootstrap);
	}
}
