package com.squaresaresquare.github.mixin;

import com.squaresaresquare.github.util.StonecutterMenuAccessor;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.StonecutterMenu;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import java.util.List;

@Mixin(StonecutterMenu.class)
public abstract class StonecutterMenuMixin implements StonecutterMenuAccessor {

    @Accessor("access")
    public abstract ContainerLevelAccess getAccess();

    @Accessor("selectedRecipeIndex")
    public abstract DataSlot getSelectedRecipeIndex();

    @Accessor("resultContainer")
    public abstract ResultContainer getResultContainer();
}
