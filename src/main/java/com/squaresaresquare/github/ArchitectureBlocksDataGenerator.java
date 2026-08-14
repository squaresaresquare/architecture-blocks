package com.squaresaresquare.github;

import com.squaresaresquare.github.item.ModPaintings; // Replace with your actual ModPaintings package path
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.HolderLookup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.datagen.*;
import com.squaresaresquare.github.records.PaintingsRecord;
import java.util.concurrent.CompletableFuture;

public class ArchitectureBlocksDataGenerator implements DataGeneratorEntrypoint {
	private static final Logger log = LogManager.getLogger(ArchitectureBlocksDataGenerator.class);
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		PaintingsRecord.initialize();
		pack.addProvider((output, registries) -> new ModPaintingVariantProvider(output, registries));
		pack.addProvider((output, registries) -> new ModPaintingTagProvider(output, registries));
		pack.addProvider((output, registries) -> new ModRecipeProvider(output, registries));

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);

		pack.addProvider((output, registries) -> new ModRegistryDataProvider(output, registries));
		pack.addProvider((FabricDataGenerator.Pack.Factory<@NotNull GenericDataProvider<Object>>) GenericDataProvider::new);
		pack.addProvider((output, registries) -> new ModPaintingJson(output, registries));
	}
	@Override
	public void buildRegistry(net.minecraft.core.RegistrySetBuilder registryBuilder) {
		// load data
		PaintingsRecord.initialize();
		// Hooks your automated loop into the core compilation graph before JSON tasks fire
		registryBuilder.add(net.minecraft.core.registries.Registries.PAINTING_VARIANT, ModPaintings::bootstrap);
	}
}
