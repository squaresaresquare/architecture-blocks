package com.squaresaresquare.github.gui;


import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.records.PaintingsRecord;
import com.squaresaresquare.github.gui.screens.PaintingLoreScreen;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.decoration.painting.Painting;
import net.minecraft.world.phys.EntityHitResult;
import org.apache.commons.lang3.arch.Processor;

import java.util.Map;
import java.util.Objects;

public class PaintingInteractionHandler {
    public static void register() {
        ArchitectureBlocks.LOGGER.info("start Painting Interaction Handler");
        Minecraft minecraft = Minecraft.getInstance();
        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ArchitectureBlocks.LOGGER.info("an event occurred %s %s %s %s %s".formatted(player.getName().getString(),
                    world.toString(),
                    hand.asEquipmentSlot().getName(),
                    entity.getName(),
                    hitResult.toString()));
            boolean isCustomPainting = entity instanceof  Painting painting;
            boolean isEntityHitResut = minecraft.hitResult instanceof EntityHitResult entityHitResult;
            ArchitectureBlocks.LOGGER.info("condition data \risClientSite: %s \r \rentity category: %s".formatted(world.isClientSide(), isCustomPainting));
            if (world.isClientSide() && minecraft.hitResult instanceof EntityHitResult entityHitResult) {
                ArchitectureBlocks.LOGGER.info("type of Enitity hit: %s".formatted(entityHitResult.getEntity().getType().getDescription().getString()));
                ArchitectureBlocks.LOGGER.info("");
                if (entityHitResult.getEntity() instanceof Painting painting) {

                    String variantKey = painting.getVariant().unwrapKey()
                            .map(key -> key.identifier().getPath())
                            .orElse("");
                    PaintingsRecord.initialize();
                    PaintingsRecord.Painting data = PaintingsRecord.PaintingMap.get(variantKey);
                    ArchitectureBlocks.LOGGER.info("now interacting with %s".formatted(variantKey));

                    ArchitectureBlocks.LOGGER.info("is data not null %s".formatted(data != null));
                    if ( data != null ) {
                        ArchitectureBlocks.LOGGER.info("data record key: %s, variantkey id: %s".formatted(
                                data.resourceKey().identifier().getPath(),
                                variantKey));
                    } else {
                        ArchitectureBlocks.LOGGER.info("%s not pulled, availble keys:".formatted(variantKey));
                        for (Map.Entry<String, PaintingsRecord.Painting> paintingrec : PaintingsRecord.PaintingMap.entrySet()) {
                            ArchitectureBlocks.LOGGER.info(paintingrec.getKey());
                        }
                    }

                    if (data != null) {
                        ArchitectureBlocks.LOGGER.info("instantiate PaintingLoreScreen");
                        // 26.2 VERSION UPDATE: Use setScreenAndShow instead of setScreen
                        Minecraft.getInstance().setScreenAndShow(new PaintingLoreScreen(data));
                        return InteractionResult.SUCCESS;
                    }

                }
            }
            return InteractionResult.PASS;
        });
    }
}
