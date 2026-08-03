package com.squaresaresquare.github.datagen;

import com.squaresaresquare.github.item.ModPaintings;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

public class ModPaintingTagProvider extends FabricTagsProvider<@NotNull PaintingVariant> {
    public ModPaintingTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.PAINTING_VARIANT, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider registries) {
        getOrCreateRawBuilder(PaintingVariantTags.PLACEABLE)
                .setReplace(false)
                .add(TagEntry.element(ModPaintings.ACCOLADE_RK.identifier()))
                .add(TagEntry.element(ModPaintings.ARCHER_ANGEL_RK.identifier()))
                .add(TagEntry.element(ModPaintings.BEDROOM_LOVE_POTION_RK.identifier()))
                .add(TagEntry.element(ModPaintings.CHAPEL_RK.identifier()))
                .add(TagEntry.element(ModPaintings.ORATORY_STAINED_GLASS_RK.identifier()))
                .add(TagEntry.element(ModPaintings.IMMACULATE_CONCEPTION_OF_MARY_RK.identifier()))
                .add(TagEntry.element(ModPaintings.COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL_RK.identifier()))
                .add(TagEntry.element(ModPaintings.HERMANN_OF_THURINGIA_RK.identifier()))
                .add(TagEntry.element(ModPaintings.LUDWIG_II_BLUE_GENERAL_1_RK.identifier()))
                .add(TagEntry.element(ModPaintings.LUDWIG_II_BLUE_GENERAL_2_RK.identifier()))
                .add(TagEntry.element(ModPaintings.MALCOLM_AND_MARGARET_AT_QUEENSFERRY_RK.identifier()))
                .add(TagEntry.element(ModPaintings.MIRACLE_OF_THE_GRAIL_RK.identifier()))
                .add(TagEntry.element(ModPaintings.ORATORY_STAINED_GLASS_RK.identifier()))
                .add(TagEntry.element(ModPaintings.OUR_LADY_OF_THE_ROSARY_SIMONE_CANTARINI_RK.identifier()))
                .add(TagEntry.element(ModPaintings.PARZIFALS_FIGHT_RK.identifier()))
                .add(TagEntry.element(ModPaintings.PARZIFAL_RK.identifier()))
                .add(TagEntry.element(ModPaintings.SAINT_MARGARET_RK.identifier()))
                .add(TagEntry.element(ModPaintings.SIGURD_MEETS_GRYPIN_RK.identifier()))
                .add(TagEntry.element(ModPaintings.SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL_RK.identifier()))
                .add(TagEntry.element(ModPaintings.THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP_RK.identifier()))
                .add(TagEntry.element(ModPaintings.TRISTAN_AND_ISOLDE_SEPERATION_RK.identifier()))
                .add(TagEntry.element(ModPaintings.TRISTAN_AND_ISOLDE_WITH_THE_POTION_RK.identifier()))
                .add(TagEntry.element(ModPaintings.TRISTAN_ON_HIS_SICKBED_RK.identifier()))
                .add(TagEntry.element(ModPaintings.UNDER_THE_LINDON_2_RK.identifier()))
                .add(TagEntry.element(ModPaintings.UNDER_THE_LINDON_RK.identifier()));
    }
}
