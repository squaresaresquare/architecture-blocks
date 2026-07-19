package com.squaresaresquare.github.client;

import com.squaresaresquare.github.client.block.ModBlocks;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;
import com.squaresaresquare.github.client.creativemodetab.ModCreativeModeTabs;
import com.squaresaresquare.github.client.data.ModDataComponents;
import com.squaresaresquare.github.client.item.ModItems;
import com.squaresaresquare.github.client.painting.ModPaintings;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchitectureBlocksClient implements ClientModInitializer {
    public static final String MOD_ID = "architecture-blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
        ModBlocks.initialize();
        ModItems.registerModItems();
        ModDataComponents.registerDataComponents();
        ModCreativeModeTabs.registerModCreativeModeTabs();
        ModBlockEntities.initialize();
        LOGGER.info("Hello Fabric world!");
	}
}
