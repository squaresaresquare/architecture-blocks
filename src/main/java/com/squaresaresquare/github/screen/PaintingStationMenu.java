package com.squaresaresquare.github.screen;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer; // Verified path for 26.2 Mojang Mappings
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class PaintingStationMenu extends AbstractContainerMenu {

    private final Container container;

    public PaintingStationMenu(int syncId, Inventory playerInventory) {
        this(syncId, playerInventory, new SimpleContainer(1));
    }

    public PaintingStationMenu(int syncId, Inventory playerInventory, Container container) {
        super(null, syncId); // Pass your registered MenuType variable here
        this.container = container;

        // Custom slot for the source painting
        this.addSlot(new Slot(container, 0, 80, 36) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.is(Items.PAINTING);
            }
        });

        // Player Inventory layout grid
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }

        // Hotbar inventory mapping
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142 + col * 18));
        }
    }
    @Override
    public void removed(Player player) {
        // 1. Call super first to let vanilla flush packet listeners
        super.removed(player);

        // 2. Only run inventory item changes on the logical server to prevent ghost desyncs
        if (!player.level().isClientSide()) {
            // Drop everything remaining inside our custom 1-slot painting container layout
            this.clearContainer(player, this.container);
        }
    }
    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack stackInSlot = slot.getItem();
            itemStack = stackInSlot.copy();

            if (index == 0) {
                if (!this.moveItemStackTo(stackInSlot, 1, 37, true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                if (!this.slots.get(0).mayPlace(stackInSlot) || !this.moveItemStackTo(stackInSlot, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (stackInSlot.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return itemStack;
    }
}
