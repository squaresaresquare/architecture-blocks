package com.squaresaresquare.github;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.squaresaresquare.github.block.ModBlocks;
import com.squaresaresquare.github.block.entity.ModBlockEntities;
import com.squaresaresquare.github.creativemodetab.ModCreativeModeTabs;
import com.squaresaresquare.github.data.ModDataComponents;
import com.squaresaresquare.github.item.ModItems;

public class ArchitectureBlocks implements ModInitializer {
	public static final String MOD_ID = "architecture-blocks";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Identifier NONE_LOCATION = locate("none");
	public static Identifier locate(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModBlocks.initialize();
		ModItems.registerModItems();
		ModDataComponents.registerDataComponents();
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModBlockEntities.initialize();
		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
