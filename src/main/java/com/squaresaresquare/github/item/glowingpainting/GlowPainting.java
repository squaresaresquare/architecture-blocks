package com.squaresaresquare.github.item.glowingpainting;

import com.squaresaresquare.github.item.glowingpainting.entity.Entity;
import com.squaresaresquare.github.item.glowingpainting.entity.GlowPaintingEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import com.squaresaresquare.github.ArchitectureBlocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

public class GlowPainting extends Item {
    public static Properties Properties;
    public GlowPainting(Properties properties){
        super(properties);
        this.Properties = properties;
    }
    public GlowPainting() {
        this(new Properties().setId(KEY));
    }

    public static final ResourceKey<Item> KEY = ResourceKey.create(Registries.ITEM, ArchitectureBlocks.locate("painting"));

    protected boolean mayUseItemAt(Player player, Direction side, ItemStack stack, BlockPos pos) {
        return player.mayUseItemAt(pos, side, stack);
    }


    protected EntityType<? extends GlowPaintingEntity> getEntityType() {
        return Entity.GLOW_PAINTING;
    }


    public InteractionResult useOn(UseOnContext context) {
        BlockPos blockPos = context.getClickedPos();
        Direction direction = context.getClickedFace();
        BlockPos attachmentPosition = blockPos.relative(direction);
        Player player = context.getPlayer();
        ItemStack itemStack = context.getItemInHand();
        if (player != null && this.mayUseItemAt(player, direction, itemStack, attachmentPosition)) {
            Level level = context.getLevel();
            int rotation = 0;
            if (direction.getAxis().isVertical()) {
                rotation = Math.floorMod((int)Math.floor(player.getYRot() / 90.0F + 2.5) * 90, 360);
            }

            GlowPaintingEntity entity = (GlowPaintingEntity)this.getEntityType().create(level, EntitySpawnReason.SPAWN_ITEM_USE);
            if (entity == null) {
                return InteractionResult.FAIL;
            }

            entity.setPos(attachmentPosition);
            entity.setDirection(direction, rotation);
            if (entity.survives()) {
                if (!level.isClientSide()) {
                    entity.playPlacementSound();
                    level.gameEvent(player, GameEvent.ENTITY_PLACE, entity.position());
                    level.addFreshEntity(entity);
                }

                itemStack.shrink(1);
                return InteractionResult.SUCCESS;
            } else {
                return InteractionResult.CONSUME;
            }
        } else {
            return InteractionResult.FAIL;
        }
    }
}
