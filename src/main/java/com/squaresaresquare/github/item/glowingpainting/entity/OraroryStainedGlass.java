package com.squaresaresquare.github.item.glowingpainting.entity;

import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.item.glowingpainting.GlowPainting;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

public class OraroryStainedGlass extends GlowPainting {
    public static final ResourceKey<Item> ORATORY_STAINED_GLASS_KEY = ResourceKey.create(Registries.ITEM, ArchitectureBlocks.locate("glow_painting"));

    public OraroryStainedGlass() {
        super(new Properties().setId(ORATORY_STAINED_GLASS_KEY));
    }

    protected EntityType getEntityType() {
        return Entity.GLOW_PAINTING;
    }
}
