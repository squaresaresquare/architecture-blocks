package com.squaresaresquare.github;
import com.squaresaresquare.github.block.ModBlocks;
import com.squaresaresquare.github.block.entity.ModBlockEntities;
import com.squaresaresquare.github.creativemodetab.ModCreativeModeTabs;
import com.squaresaresquare.github.data.ModDataComponents;
import com.squaresaresquare.github.item.ModItems;
import com.squaresaresquare.github.item.ModPaintings;
import com.squaresaresquare.github.item.PaintingsRecord;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.resources.Identifier;


public class ArchitectureBlocks implements ModInitializer {
	public static final String MOD_ID = "architecture-blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.initialize();
		ModItems.registerModItems();
		System.out.println("------after registering ModItems-------");
        if (BuiltInRegistries.ITEM.containsKey(Identifier.fromNamespaceAndPath(MOD_ID,"accolade"))){
			System.out.println("painting accolade isn't registered yet.");
		}else{
			System.out.println("painting accolade is in the registry.");
		}
		System.out.println("---------------------------------------");
		ModDataComponents.registerDataComponents();
		System.out.println("----After registering datacomponents---");
		if (BuiltInRegistries.ITEM.containsKey(Identifier.fromNamespaceAndPath(MOD_ID,"accolade"))){
			System.out.println("painting accolade isn't registered yet.");
		}else{
			System.out.println("painting accolade is in the registry.");
		}
		System.out.println("---------------------------------------");
		ModBlockEntities.initialize();
		System.out.println("----After init of ModBlockEntities-----");
		if (BuiltInRegistries.ITEM.containsKey(Identifier.fromNamespaceAndPath(MOD_ID,"accolade"))){
			System.out.println("painting accolade isn't registered yet.");
		}else{
			System.out.println("painting accolade is in the registry.");
		}
		System.out.println("---------------------------------------");
		ModPaintings.initialize();
		System.out.println("-----after init ModPaintings-----------");
		if (BuiltInRegistries.ITEM.containsKey(Identifier.fromNamespaceAndPath(MOD_ID,"accolade"))){
			System.out.println("painting accolade isn't registered yet.");
		}else{
			System.out.println("painting accolade is in the registry.");
		}
		System.out.println("---------------------------------------");

		ModCreativeModeTabs.registerModCreativeModeTabs();
		System.out.println("------after register ModCreativeModeTabs-----");
		if (BuiltInRegistries.ITEM.containsKey(Identifier.fromNamespaceAndPath(MOD_ID,"accolade"))){
			System.out.println("painting accolade isn't registered yet.");
		}else{
			System.out.println("painting accolade is in the registry.");
		}
		System.out.println("---------------------------------------");
		LOGGER.info("Hello Fabric world!");

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
	}
	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
