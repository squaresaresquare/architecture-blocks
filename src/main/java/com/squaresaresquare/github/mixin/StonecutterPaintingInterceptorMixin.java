package com.squaresaresquare.github.mixin;
import com.squaresaresquare.github.ArchitectureBlocks;
/*import net.minecraft.world.inventory.StonecutterMenu;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.item.crafting.SelectableRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mixin(StonecutterMenu.class)
public class StonecutterPaintingInterceptorMixin {

    @Shadow
    public SelectableRecipe.SingleInputSet<StonecutterRecipe> recipes;

    @Inject(method = "setupResultSlot", at = @At("TAIL"))
    private void checkForBlankPainting(int index, CallbackInfo ci) {
        StonecutterMenu menu = (StonecutterMenu) (Object) this;
        ItemStack inputStack = menu.getSlot(0).getItem();

        if (!inputStack.isEmpty() && inputStack.is(Items.PAINTING)) {
            StonecutterMenuAccessor accessor = (StonecutterMenuAccessor) menu;

            // FIX 2: Instantiate the correct collection type that SingleInputSet demands
            List<SelectableRecipe.SingleInputEntry<StonecutterRecipe>> entryList = new ArrayList<>();
            Level world = accessor.getAccess().evaluate((level, pos) -> level).orElse(null);

            if (world instanceof ServerLevel serverLevel) {
                Collection<RecipeHolder<StonecutterRecipe>> customPaintingRecipes = serverLevel.getServer().getRecipeManager()
                        .<net.minecraft.world.item.crafting.SingleRecipeInput, StonecutterRecipe>getAllOfType(ArchitectureBlocks.PAINTING_STATION_RECIPE_TYPE);

                for (RecipeHolder<StonecutterRecipe> holder : customPaintingRecipes) {
                    // 1. Fetch the raw RecipeDisplay instance
                    var recipeDisplay = holder.value().display();

                    // 2. Extract the visual output profile slot element (returns the SlotDisplay required)
                    // Most Stonecutter/SingleItem displays expose the item via .result()
                    net.minecraft.world.item.crafting.display.SlotDisplay optionDisplay = recipeDisplay.getFirst().result();

                    // 3. Wrap your active holder instance inside a Java Optional structure
                    java.util.Optional<RecipeHolder<StonecutterRecipe>> wrappedHolder = java.util.Optional.of(holder);

                    // 4. Instantiate SelectableRecipe matching its constructor signature perfectly
                    SelectableRecipe<StonecutterRecipe> selectable = new SelectableRecipe<>(optionDisplay, wrappedHolder);

                    // 5. Wrap the entry alongside its ingredient token requirements
                    Ingredient inputIngredient = Ingredient.of(Items.PAINTING);
                    entryList.add(new SelectableRecipe.SingleInputEntry<>(inputIngredient, selectable));
                }
            }

            // Successfully creates the immutable record set without compiler type errors
            this.recipes = new SelectableRecipe.SingleInputSet<>(entryList);

            // Sync menu selections back down to the UI rendering screens
            accessor.getSelectedRecipeIndex().set(-1);
            accessor.getResultContainer().clearContent();
            menu.broadcastChanges();
        }
    }
}*/
import com.squaresaresquare.github.util.StonecutterMenuAccessor;
import net.minecraft.world.inventory.StonecutterMenu;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.item.crafting.SelectableRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mixin(StonecutterMenu.class)
public abstract class StonecutterPaintingInterceptorMixin {

    /**
     * @author YourModName
     * @reason Intercept stonecutter UI display to show painting station items instead of vanilla stone variants.
     */
    @Overwrite
    public SelectableRecipe.SingleInputSet<StonecutterRecipe> getVisibleRecipes() {
        StonecutterMenu menu = (StonecutterMenu) (Object) this;
        ItemStack inputStack = menu.getSlot(0).getItem();

        // 1. Check if the active slot contains your target item context
        if (!inputStack.isEmpty() && inputStack.is(Items.PAINTING)) {
            StonecutterMenuAccessor accessor = (StonecutterMenuAccessor) menu;
            List<SelectableRecipe.SingleInputEntry<StonecutterRecipe>> entryList = new ArrayList<>();
            Level world = accessor.getAccess().evaluate((level, pos) -> level).orElse(null);

            if (world instanceof ServerLevel serverLevel) {
                // 2. Fetch data from your Datagen recipe type mappings
                Collection<RecipeHolder<StonecutterRecipe>> customPaintingRecipes = serverLevel.getServer().getRecipeManager()
                        .<net.minecraft.world.item.crafting.SingleRecipeInput, StonecutterRecipe>getAllOfType(ArchitectureBlocks.PAINTING_STATION_RECIPE_TYPE);

                for (RecipeHolder<StonecutterRecipe> holder : customPaintingRecipes) {
                    var recipeDisplay = holder.value().display();
                    net.minecraft.world.item.crafting.display.SlotDisplay optionDisplay = recipeDisplay.getFirst().result();

                    java.util.Optional<RecipeHolder<StonecutterRecipe>> wrappedHolder = java.util.Optional.of(holder);
                    SelectableRecipe<StonecutterRecipe> selectable = new SelectableRecipe<>(optionDisplay, wrappedHolder);

                    Ingredient inputIngredient = Ingredient.of(Items.PAINTING);
                    entryList.add(new SelectableRecipe.SingleInputEntry<>(inputIngredient, selectable));
                }
            }

            // 3. Return your custom built recipe array directly to the UI rendering loop!
            return new SelectableRecipe.SingleInputSet<>(entryList);
        }

        // 4. Fallback: If it's cobble/stone, call the normal vanilla behavior
        // Since we are overwriting, you can shadow or target vanilla's backing field/logic here
        return this.getVanillaBackupRecipes(menu);
    }

    // A small helper to return the default list if a painting isn't in the input slot
    private SelectableRecipe.SingleInputSet<StonecutterRecipe> getVanillaBackupRecipes(StonecutterMenu menu) {
        // In 26.2, if 'recipes' isn't a direct field, the vanilla method usually computes or grabs an internal reference.
        // If there's an internal private record field visible in your IDE fields list, return it here:
        // return menu.internalBackingField;

        // If you can see the field name you discovered while checking fields, replace "internalRecipesField" below:
        // return menu.internalRecipesField;

        return new SelectableRecipe.SingleInputSet<>(List.of()); // Safe empty fallback if you only want it working for paintings
    }
}
