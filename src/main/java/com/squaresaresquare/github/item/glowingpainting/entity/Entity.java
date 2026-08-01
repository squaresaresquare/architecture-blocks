package com.squaresaresquare.github.item.glowingpainting.entity;

import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.item.glowingpainting.entity.GlowPaintingEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraft.world.entity.EntityType.EntityFactory;
import net.minecraft.world.entity.MobCategory;

import java.util.function.BiConsumer;

public class Entity {
   private static final Identifier GLOW_PAINTING_LOCATION = ArchitectureBlocks.locate("glow_painting");
   public static final EntityType<GlowPaintingEntity> GLOW_PAINTING = createEntityType(GlowPaintingEntity::new, GLOW_PAINTING_LOCATION);
   public static final EntityDataSerializer<Identifier> TRACKED_IDENTIFIER = EntityDataSerializer.forValueType(Identifier.STREAM_CODEC);

   private static <T extends net.minecraft.world.entity.Entity> EntityType<T> createEntityType(EntityFactory<T> factory, Identifier location) {
      return Builder.of(factory, MobCategory.MISC)
         .sized(0.5F, 0.5F)
         .clientTrackingRange(10)
         .updateInterval(Integer.MAX_VALUE)
         .fireImmune()
         .build(ResourceKey.create(Registries.ENTITY_TYPE, location));
   }

   public static void register(BiConsumer<Identifier, EntityType<? extends GlowPaintingEntity>> consumer) {
      consumer.accept(GLOW_PAINTING_LOCATION, GLOW_PAINTING);
   }

   public static void registerSerializers(BiConsumer<Identifier, EntityDataSerializer<?>> consumer) {
      consumer.accept(ArchitectureBlocks.locate("resource_location"), TRACKED_IDENTIFIER);
   }
}
