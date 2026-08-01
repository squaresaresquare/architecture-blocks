package com.squaresaresquare.github.item.glowingpainting.custom;

import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.data.ModDataComponents;
import com.squaresaresquare.github.item.glowingpainting.GlowPainting;
import com.squaresaresquare.github.item.glowingpainting.entity.GlowPaintingEntity;
import com.squaresaresquare.github.item.glowingpainting.entity.Entity;
import com.squaresaresquare.github.type.StringProperty;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.UUID;

public class OratoryStanedGlassItem extends GlowPainting {
    public OratoryStanedGlassItem(Properties properties) {
        super(properties);
        properties
                .component(ModDataComponents.PAINTING_WIDTH,3)
                .component(ModDataComponents.PAINTING_HEIGHT, 5)
                .component(ModDataComponents.PAINTING_RESOLUTION, 128)
                .component(ModDataComponents.PAINTING_TITLE, "oratory_stained_glass")
                .component(ModDataComponents.PAINTING_AUTHOR, "Mayerischen")
                .component(ModDataComponents.PAINTING_AUTHORUUID, UUID.randomUUID());
    }
    public static final ResourceKey<Item> KEY = ResourceKey.create(Registries.ITEM, ArchitectureBlocks.locate("oratory_stained_glass"));
    public OratoryStanedGlassItem() {
        super(new Properties().setId(KEY));
    }
    protected EntityType<? extends GlowPaintingEntity> getEntityType() {
        return Entity.GLOW_PAINTING;
    }
}
