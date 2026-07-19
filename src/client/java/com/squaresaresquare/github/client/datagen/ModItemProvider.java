package com.squaresaresquare.github.client.datagen;


import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelInstance;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.model.ModelTemplates;
import org.jetbrains.annotations.NotNull;
import com.squaresaresquare.github.client.item.ModItems;

public class ModItemProvider extends FabricModelProvider {
    public ModItemProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        //needed but not used
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }

    /*@Override
    public void generateItemModels(@NotNull ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.ACCOLADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BEDROOM_LOVE_POTION, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHAPEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHAPEL_SAINT_STAINED_GLASS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHAPEL_SUPPLICANTS_STAINED_GLASS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DINING_ROOM_SONG_CONTEST, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LUDWIG_II_BLUE_GENERAL_1, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LUDWIG_II_BLUE_GENERAL_2, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MALCOLM_AND_MARGARET_AT_QUEENSFERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MIRACLE_OF_THE_GRAIL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PARZIFAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PARZIFALS_FIGHT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SIGURD_MEETS_GRYPIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TRISTAN_AND_ISOLDE_WITH_THE_POTION, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.UNDER_THE_LINDON, ModelTemplates.FLAT_ITEM);
    }*/
}
