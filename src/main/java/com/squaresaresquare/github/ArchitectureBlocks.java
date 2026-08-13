package com.squaresaresquare.github;
import com.squaresaresquare.github.block.ModBlocks;
import com.squaresaresquare.github.block.entity.ModBlockEntities;
import com.squaresaresquare.github.creativemodetab.ModCreativeModeTabs;
import com.squaresaresquare.github.data.ModDataComponents;
import com.squaresaresquare.github.item.ModItems;
import com.squaresaresquare.github.item.ModPaintings;
import com.squaresaresquare.github.screen.PaintingStationMenu;
import com.squaresaresquare.github.screen.PaintingStationScreen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.resources.Identifier;

import java.util.Optional;


public class ArchitectureBlocks implements ModInitializer {
	public static final String MOD_ID = "architecture-blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static MenuType<PaintingStationMenu> PAINTING_STATION_MENU_TYPE;
    public static final RegistrySetBuilder registrySetBuilder = new RegistrySetBuilder();

	public static final RecipeType<StonecutterRecipe> PAINTING_STATION_RECIPE_TYPE = Registry.register(
			BuiltInRegistries.RECIPE_TYPE,
			Identifier.fromNamespaceAndPath(MOD_ID, "painting_station"),
			new RecipeType<StonecutterRecipe>() {
				@Override
				public String toString() {
					return MOD_ID + ":painting_station";
				}
			}
	);
	@Override
	public void onInitialize() {
		ModDataComponents.registerDataComponents();
		ModBlocks.initialize();
		ModItems.registerModItems();
		ModBlockEntities.initialize();
		ModItems.initialize();
    	ModPaintings.initialize();

		/*enuScreens.register(
				ArchitectureBlocks.PAINTING_STATION_MENU_TYPE,
				(menu, playerInventory, title) -> {
                    return new PaintingStationScreen(menu, playerInventory, title);
                }
		);*/

		PAINTING_STATION_MENU_TYPE = Registry.register(
				BuiltInRegistries.MENU,
				Identifier.fromNamespaceAndPath(MOD_ID, "painting_station"),
				new MenuType<>(PaintingStationMenu::new, net.minecraft.world.flag.FeatureFlags.DEFAULT_FLAGS)
		);
		AttackBlockCallback.EVENT.register((player, level, hand, pos, direction) -> {
			if (player.isSpectator()) {
				return InteractionResult.PASS;
			}

			// Perform the non-solid targeting raycast
			double reach = player.blockInteractionRange();
			HitResult hit = player.pick(reach, 0.0F, true); // true catches empty/non-solid shapes

			if (hit.getType() == HitResult.Type.BLOCK) {
				BlockHitResult blockHit = (BlockHitResult) hit;
				BlockPos raycastPos = blockHit.getBlockPos();
				BlockState lookedAtState = level.getBlockState(raycastPos);

				// Evaluate if the player's crosshair is aiming directly at your molding block
				if (lookedAtState.is(ModBlocks.CROWN_MOLDING_LEFT) || lookedAtState.is(ModBlocks.CROWN_MOLDING_RIGHT)) {

					// If this loop is running on the internal server thread, delete the block permanently
					if (!level.isClientSide()) {
						level.destroyBlock(raycastPos, true, player);
					}

					// SUCCESS stops the client from showing mining cracks on the wall behind it
					return InteractionResult.SUCCESS;
				}
			}

			return InteractionResult.PASS;
		});
		ModCreativeModeTabs.registerModCreativeModeTabs();
	}

	public ArchitectureBlocks() {
		super();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
