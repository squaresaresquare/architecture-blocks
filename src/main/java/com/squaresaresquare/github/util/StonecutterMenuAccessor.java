package com.squaresaresquare.github.util;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.ResultContainer;

public interface StonecutterMenuAccessor {
    ContainerLevelAccess getAccess();
    DataSlot getSelectedRecipeIndex();
    ResultContainer getResultContainer();
}