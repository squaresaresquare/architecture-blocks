package com.squaresaresquare.github.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchitectureBlocksClient implements ClientModInitializer {
    public static final String MOD_ID = "architecture_blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
        com.squaresaresquare.github.client.block.ModBlocks.initialize();
        com.squaresaresquare.github.client.creativemodetab.ModCreativeModeTabs.registerModCreativeModeTabs();
        com.squaresaresquare.github.client.block.entity.ModBlockEntities.initialize();
        LOGGER.info("Hello Fabric world!");
	}
}
