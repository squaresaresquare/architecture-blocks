package com.squaresaresquare.github.item.glowingpainting.entity;

import com.squaresaresquare.github.ArchitectureBlocks;
/*import com.squaresaresquare.github.ClientPaintingManager;
import com.squaresaresquare.github.Painting;
import com.squaresaresquare.github.ServerPaintingManager;
import com.squaresaresquare.github.client.gui.GuiWrapper;
import com.squaresaresquare.github.compat.XercaPaintCompat;
import com.squaresaresquare.github.registry.Config;*/
import net.minecraft.core.BlockPos;
import com.squaresaresquare.github.config.Config;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.decoration.HangingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DiodeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.function.Predicate;

public class GlowPaintingEntity extends HangingEntity {
   protected static final Predicate<Entity> PREDICATE = entity -> entity instanceof GlowPaintingEntity;
   private static final EntityDataAccessor<Identifier> MOTIVE = SynchedEntityData.defineId(
      GlowPaintingEntity.class, com.squaresaresquare.github.item.glowingpainting.entity.Entity.TRACKED_IDENTIFIER
   );
   private static final EntityDataAccessor<Identifier> FRAME = SynchedEntityData.defineId(
      GlowPaintingEntity.class, com.squaresaresquare.github.item.glowingpainting.entity.Entity.TRACKED_IDENTIFIER
   );
   private static final EntityDataAccessor<Identifier> MATERIAL = SynchedEntityData.defineId(
      GlowPaintingEntity.class, com.squaresaresquare.github.item.glowingpainting.entity.Entity.TRACKED_IDENTIFIER
   );
   private static final EntityDataAccessor<Integer> WIDTH = SynchedEntityData.defineId(GlowPaintingEntity.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> HEIGHT = SynchedEntityData.defineId(GlowPaintingEntity.class, EntityDataSerializers.INT);
   private int rotation;

   public GlowPaintingEntity(EntityType<? extends HangingEntity> entityType, Level level) {
      super(entityType, level);
   }

   protected void setDirection(Direction direction) {
      this.setDirection(direction, this.rotation);
   }

   public void setDirection(Direction direction, int rotation) {
      if (direction != null) {
         this.setDirectionRaw(direction);
         this.rotation = rotation;
         if (direction.getAxis().isHorizontal()) {
            this.absSnapRotationTo(direction.get2DDataValue() * 90, 0.0F);
         } else {
            this.absSnapRotationTo(rotation, direction == Direction.UP ? 90.0F : -90.0F);
         }
         this.recalculateBoundingBox();
      }
   }

   public void setPos(BlockPos pos) {
      this.pos = pos;
   }

   protected AABB calculateBoundingBox(BlockPos pos, Direction side) {
      Vec3 front = Vec3.atLowerCornerOf(side.getUnitVec3i());
      Vec3 up = side.getAxis().isVertical() ? new Vec3(0.0, 0.0, 1.0) : new Vec3(0.0, 1.0, 0.0);
      Vec3 cross = up.cross(front);
      if (this.rotation != 0) {
         float radians = (float)(this.rotation * Math.PI / 180.0);
         up = up.yRot(radians);
         cross = cross.yRot(radians);
      }

      double dx = this.offsetForPaintingSize(this.getPaintingWidth());
      double dy = this.offsetForPaintingSize(this.getPaintingHeight());
      Direction facing;
      Direction counter;
      if (side.getAxis().isVertical()) {
         facing = Direction.fromYRot(this.rotation);
         if (side.equals(Direction.UP)) {
            facing = facing.getOpposite();
            counter = facing.getClockWise();
         } else {
            counter = facing.getCounterClockWise();
         }
      } else {
         facing = Direction.UP;
         counter = side.getCounterClockWise();
      }

      Vec3 vec3d = Vec3.atCenterOf(pos).relative(side, -0.46875).relative(counter, dx).relative(facing, dy);
      Vec3 shift = up.scale(this.getPaintingHeight()).add(cross.scale(this.getPaintingWidth())).add(front.scale(0.0625));
      return AABB.ofSize(vec3d, shift.x(), shift.y(), shift.z());
   }

   private double offsetForPaintingSize(int size) {
      return size % 2 == 0 ? 0.5 : 0.0;
   }

   public boolean survives() {
      if (Config.COMMON.testIfSpaceEmpty && !this.level().noCollision(this)) {
         return false;
      }

      BlockPos blockPos = this.pos.relative(this.getDirection().getOpposite());
      BlockState blockState = this.level().getBlockState(blockPos);
      return !blockState.isSolid() && !DiodeBlock.isDiode(blockState)
         ? false
         : this.level().getEntities(this, this.getBoundingBox(), PREDICATE).stream().noneMatch(v -> v.getDirection() == this.getDirection());
   }

   public boolean canBeCollidedWith(@Nullable Entity entity) {
      return Config.COMMON.paintingsHaveCollision;
   }

   public InteractionResult interact(Player player, InteractionHand hand, Vec3 location) {
      boolean clientSide = this.level().isClientSide();
      if (player.isCrouching()) {
         if (!clientSide && XercaPaintCompat.interactWithPainting(this, player, hand)) {
            return InteractionResult.CONSUME;
         }
      } else if (clientSide) {
         return InteractionResult.SUCCESS;
      }

      return InteractionResult.PASS;
   }

   public ItemStack getPickResult() {
      return new ItemStack(this.getItem());
   }

   public void dropItem(ServerLevel serverLevel, @Nullable Entity entity) {
      if ((Boolean)serverLevel.getGameRules().get(GameRules.ENTITY_DROPS)) {
         this.playSound(SoundEvents.PAINTING_BREAK, 1.0F, 1.0F);
         if (entity instanceof Player playerEntity && playerEntity.hasInfiniteMaterials()) {
            return;
         }

         this.spawnAtLocation(serverLevel, this.getItem());
      }
   }

   public Vec3 trackingPosition() {
      return Vec3.atLowerCornerOf(this.pos);
   }

   public void playPlacementSound() {
      this.playSound(SoundEvents.PAINTING_PLACE, 1.0F, 1.0F);
   }

   public void defineSynchedData(Builder builder) {
      super.defineSynchedData(builder);
      builder.define(MOTIVE, ArchitectureBlocks.NONE_LOCATION);
      builder.define(FRAME, ArchitectureBlocks.NONE_LOCATION);
      builder.define(MATERIAL, ArchitectureBlocks.NONE_LOCATION);
      builder.define(WIDTH, 1);
      builder.define(HEIGHT, 1);
   }

   public void onSyncedDataUpdated(EntityDataAccessor<?> data) {
      if (MOTIVE.equals(data)) {
         Optional<Painting> painting;
         if (this.level().isClientSide()) {
            painting = ClientPaintingManager.getPainting(this.getMotive());
         } else {
            painting = ServerPaintingManager.getPainting(this.level().getServer(), this.getMotive());
         }

         painting.ifPresent(p -> {
            this.getEntityData().set(WIDTH, Math.max(p.width(), 1));
            this.getEntityData().set(HEIGHT, Math.max(p.height(), 1));
            this.recalculateBoundingBox();
         });
      }

      super.onSyncedDataUpdated(data);
   }

   public Packet<ClientGamePacketListener> getAddEntityPacket(ServerEntity entityTrackerEntry) {
      return new ClientboundAddEntityPacket(this, this.rotation << 4 | (byte)this.getDirection().get3DDataValue(), this.getPos());
   }

   public void recreateFromPacket(ClientboundAddEntityPacket packet) {
      super.recreateFromPacket(packet);
      int data = packet.getData();
      this.setDirection(Direction.from3DDataValue(data & 15), data >> 4);
   }

   public void addAdditionalSaveData(ValueOutput tag) {
      SynchedEntityData tracker = this.getEntityData();
      tag.putString("Motive", ((Identifier)tracker.get(MOTIVE)).toString());
      tag.putString("Frame", ((Identifier)tracker.get(FRAME)).toString());
      tag.putString("Material", ((Identifier)tracker.get(MATERIAL)).toString());
      tag.putInt("Facing", this.getDirection().get3DDataValue());
      tag.putInt("VRotation", this.rotation);
      super.addAdditionalSaveData(tag);
   }

   public void readAdditionalSaveData(ValueInput input) {
      super.readAdditionalSaveData(input);
      this.setFrame(Identifier.parse(input.getStringOr("Frame", ArchitectureBlocks.NONE_LOCATION.toString())));
      this.setMaterial(Identifier.parse(input.getStringOr("Material", ArchitectureBlocks.NONE_LOCATION.toString())));
      Direction direction = Direction.from3DDataValue(input.getIntOr("Facing", Direction.SOUTH.get3DDataValue()));
      this.setDirection(direction, input.getIntOr("VRotation", 0));
      this.setMotive(Identifier.parse(input.getStringOr("Motive", ArchitectureBlocks.NONE_LOCATION.toString())));
   }

   public Item getItem() {
      return com.squaresaresquare.github.registry.Item.PAINTING;
   }

   public boolean isGraffiti() {
      return false;
   }

   public boolean isGlowing() {
      return false;
   }

   public int getPaintingWidth() {
      return (Integer)this.getEntityData().get(WIDTH);
   }

   public int getPaintingHeight() {
      return (Integer)this.getEntityData().get(HEIGHT);
   }

   public Identifier getMotive() {
      return (Identifier)this.getEntityData().get(MOTIVE);
   }

   public Identifier getFrame() {
      return (Identifier)this.getEntityData().get(FRAME);
   }

   public Identifier getMaterial() {
      return (Identifier)this.getEntityData().get(MATERIAL);
   }

   public void setMotive(Identifier motive) {
      this.getEntityData().set(MOTIVE, motive);
   }

   public void setFrame(Identifier frame) {
      this.getEntityData().set(FRAME, frame);
   }

   public void setMaterial(Identifier material) {
      this.getEntityData().set(MATERIAL, material);
   }
}
