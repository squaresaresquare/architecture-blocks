package com.squaresaresquare.github.item.glowingpainting;

import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.data.ModDataComponents;
import com.squaresaresquare.github.item.glowingpainting.custom.OratoryStanedGlassItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.sounds.SoundEvents;
import java.util.UUID;
import java.util.function.Function;

public class ModGlowingPaintings implements ModInitializer {
    public static final SoundType PAINTING_SOUNDS = new SoundType(
            1.0f, // volume
            1.0f, // pitch
            SoundEvents.PAINTING_BREAK,
            SoundEvents.WOOL_STEP,
            SoundEvents.PAINTING_PLACE,
            SoundEvents.WOOL_HIT,
            SoundEvents.WOOL_FALL
    );
    private static <T extends GlowPainting> T register(String name, Function<GlowPainting.Properties, T> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, name));

        // Create the item instance.
        T item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
    public static final GlowPainting ORATORY_STAINED_GLASS = register(
            "oratory_stained_glass",
             OratoryStanedGlassItem::new,
             GlowPainting.Properties
            .component(ModDataComponents.PAINTING_WIDTH, 3)
            .component(ModDataComponents.PAINTING_HEIGHT, 5)
            .component(ModDataComponents.PAINTING_RESOLUTION, 128)
            .component(ModDataComponents.PAINTING_TITLE, "Oratory Stained Glass Window")
            .component(ModDataComponents.PAINTING_AUTHOR, "Mayerischen")
            .component(ModDataComponents.PAINTING_AUTHORUUID, UUID.randomUUID()));
    @Override
    public void onInitialize() {

    }
}
