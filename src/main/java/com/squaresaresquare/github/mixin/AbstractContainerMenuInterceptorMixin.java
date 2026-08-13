package com.squaresaresquare.github.mixin;

import com.squaresaresquare.github.screen.PaintingStationMenu;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.StonecutterMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractContainerMenu.class)
public class AbstractContainerMenuInterceptorMixin {

    @Inject(method = "slotsChanged", at = @At("TAIL"))
    private void onSlotUpdateIntercept(Container container, CallbackInfo ci) {
        AbstractContainerMenu menu = (AbstractContainerMenu) (Object) this;

        // 1. Guard Clause: Restrict interception exclusively to Crafting Tables and Stonecutters
        if (menu instanceof CraftingMenu || menu instanceof StonecutterMenu) {

            ItemStack paintingStack = ItemStack.EMPTY;
            Slot targetSlot = null;

            // 2. Identify the active input slot boundaries
            if (menu instanceof StonecutterMenu) {
                targetSlot = menu.getSlot(0); // Slot 0 is stonecutter input
                if (targetSlot.hasItem() && targetSlot.getItem().is(Items.PAINTING)) {
                    paintingStack = targetSlot.getItem();
                }
            } else {
                // Scan the 3x3 crafting grid input slots (1 through 9)
                for (int i = 1; i <= 9; i++) {
                    Slot slot = menu.getSlot(i);
                    if (slot.hasItem() && slot.getItem().is(Items.PAINTING)) {
                        targetSlot = slot;
                        paintingStack = slot.getItem();
                        break;
                    }
                }
            }

            // 3. Trigger screen transition if a generic blank painting matches
            if (targetSlot != null && !paintingStack.isEmpty()) {

                // 4. FIND THE ACTIVE SERVER PLAYER:
                // Scan the menu slots to safely locate the player's inventory reference
                ServerPlayer serverPlayer = null;
                for (Slot slot : menu.slots) {
                    if (slot.container instanceof Inventory playerInventory) {
                        if (playerInventory.player instanceof ServerPlayer sp) {
                            serverPlayer = sp;
                            break;
                        }
                    }
                }

                // If found and executing on the logical server thread, execute the window shift
                if (serverPlayer != null && !serverPlayer.level().isClientSide()) {

                    // Consume exactly 1 painting out of the input grid
                    ItemStack transferredPainting = paintingStack.split(1);

                    // Flush visual data changes to prevent ghost slot artifacts
                    menu.broadcastChanges();

                    // Load up our standalone screen data holder
                    SimpleContainer nextContainer = new SimpleContainer(1);
                    nextContainer.setItem(0, transferredPainting);

                    // Push the menu open call straight over the server pipeline
                    serverPlayer.openMenu(new SimpleMenuProvider(
                            (syncId, playerInv, p) -> new PaintingStationMenu(syncId, playerInv, nextContainer),
                            Component.literal("Painting Customizer Layout")
                    ));
                }
            }
        }
    }
}
