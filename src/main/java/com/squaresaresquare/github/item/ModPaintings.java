package com.squaresaresquare.github.item;

import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.records.PaintingsRecord;
import net.minecraft.ChatFormatting;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
public class ModPaintings {
    private static final HolderLookup.Provider provider = new HolderLookup.Provider() {
        @Override
        public Stream<ResourceKey<? extends Registry<?>>> listRegistryKeys() {
            return null;
        }

        @Override
        public <T> @NotNull Optional<? extends HolderLookup.RegistryLookup<T>> lookup(@NotNull ResourceKey<? extends Registry<? extends T>> key) {
            return Optional.empty();
        }
    };
    public static final List<ResourceKey<PaintingVariant>> DATA_GEN_TRACKER = new ArrayList<>();
    public static final ResourceKey<@NotNull PaintingVariant> ACCOLADE_RK = create("accolade");
    public static final ResourceKey<@NotNull PaintingVariant> ARCHER_ANGEL_RK = create("archer_angel");
    public static final ResourceKey<@NotNull PaintingVariant> LOVE_POTION_RK = create("love_potion");
    public static final ResourceKey<@NotNull PaintingVariant> CHAPEL_RK = create("chapel");
    public static final ResourceKey<@NotNull PaintingVariant> COURT_LIFE_AT_GRAIL_CASTLE_RK = create("court_life_at_grail_castle");
    public static final ResourceKey<@NotNull PaintingVariant> HERMANN_OF_THURINGIA_RK = create("hermann_of_thuringia");
    public static final ResourceKey<@NotNull PaintingVariant> IMMACULATE_CONCEPTION_RK = create("immaculate_conception");
    public static final ResourceKey<@NotNull PaintingVariant> LADY_READING_POEM_RK = create("lady_reading_poem");
    public static final ResourceKey<@NotNull PaintingVariant> LUDWIG_GENERAL_1_RK = create("ludwig_general_1");
    public static final ResourceKey<@NotNull PaintingVariant> LUDWIG_GENERAL_2_RK = create("ludwig_general_2");
    public static final ResourceKey<@NotNull PaintingVariant> MALCOLM_AND_MARGARET_RK = create("malcolm_and_margaret");
    public static final ResourceKey<@NotNull PaintingVariant> MIRACLE_OF_THE_GRAIL_RK = create("miracle_of_the_grail");
    public static final ResourceKey<@NotNull PaintingVariant> ORATORY_STAINED_GLASS_RK = create("oratory_stained_glass");
    public static final ResourceKey<@NotNull PaintingVariant> OUR_LADY_ROSARY_RK = create("our_lady_rosary");
    public static final ResourceKey<@NotNull PaintingVariant> PARZIFALS_FIGHT_RK = create("parzifals_fight");
    public static final ResourceKey<@NotNull PaintingVariant> PARZIFAL_RK = create("parzifal");
    public static final ResourceKey<@NotNull PaintingVariant> SAINT_MARGARET_RK = create("saint_margaret");
    public static final ResourceKey<@NotNull PaintingVariant> SIGURD_MEETS_GRYPIN_RK = create("sigurd_meets_grypin");
    public static final ResourceKey<@NotNull PaintingVariant> CURSE_OF_GRAIL_MESSENGER_RK = create("curse_of_grail_messenger");
    public static final ResourceKey<@NotNull PaintingVariant> THE_ARRIVAL_OF_LOHENGRIN_RK = create("the_arrival_of_lohengrin");
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_ISOLDE_SEPARATION_RK = create("tristan_isolde_separation");
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_ISOLDE_POTION_RK = create("tristan_isolde_potion");
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_ISOLDE_POTION_2_RK = create("tristan_isolde_potion_2");
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_ON_HIS_SICKBED_RK = create("tristan_on_his_sickbed");
    public static final ResourceKey<@NotNull PaintingVariant> UNDER_THE_LINDON_2_RK = create("under_the_lindon_2");
    public static final ResourceKey<@NotNull PaintingVariant> UNDER_THE_LINDON_RK = create("under_the_lindon");
    public static final ResourceKey<@NotNull PaintingVariant> KLINGSOR_OFFERING_TREASURE_RK = create("klingsor_offering_tresure");
    public static final ResourceKey<@NotNull PaintingVariant> BACK_WALL_RK = create("back_wall");
    public static final ResourceKey<@NotNull PaintingVariant> KLINGSOR_FLIES_TANNHAUSER_RK = create("klingsor_flies_tannhauser");
    public static final ResourceKey<@NotNull PaintingVariant> PORTRAIT_WOLFRAM_VON_ESCHENBACH_1_RK = create("portrait_wolfram_von_eschenbach_1");
    public static final ResourceKey<@NotNull PaintingVariant> PORTRAIT_WOLFRAM_VON_ESCHENBACH_2_RK = create("portrait_wolfram_von_eschenbach_2");
    public static final ResourceKey<@NotNull PaintingVariant> SONG_CONTEST_PRIZES_RK = create("song_contest_prizes");
    public static final ResourceKey<@NotNull PaintingVariant> SCHWANENRITTERSAGE1_RK = create("schwanenrittersage1");
    public static final ResourceKey<@NotNull PaintingVariant> HERMANN_RECOVERS_MANUSCRIPT_RK = create("hermann_recovers_manuscript");
    public static final ResourceKey<@NotNull PaintingVariant> WOLFRAM_TRANSLATES_THE_POEM_RK = create("wolfram_translates_the_poem");
    public static final ResourceKey<@NotNull PaintingVariant> LEFT_CURTAIN_RK = create("left_curtain");
    public static final ResourceKey<@NotNull PaintingVariant> RIGHT_CURTAIN_RK = create("right_curtain");
    private static ResourceKey<@NotNull PaintingVariant> create(final String id) {
        ResourceKey<PaintingVariant> key = ResourceKey.create(
                Registries.PAINTING_VARIANT,
                Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, id)
        );
        DATA_GEN_TRACKER.add(key); // Track it statically
        return key;
    }

    private static void register(final BootstrapContext<@NotNull PaintingVariant> context, final ResourceKey<@NotNull PaintingVariant>
            key, final int width, final int height, final String title, final String author) {
        context.register(key, new PaintingVariant(
                        width,
                        height,
                        key.identifier(),
                        java.util.Optional.of(Component.literal(title).withStyle(ChatFormatting.YELLOW)),
                        java.util.Optional.of(Component.literal(author).withStyle(ChatFormatting.GRAY))
                )
        );
    }
    public static void bootstrap(net.minecraft.data.worldgen.BootstrapContext<@NotNull PaintingVariant> context) {
        PaintingsRecord.initialize();
        for (java.util.Map.Entry<String, com.squaresaresquare.github.records.PaintingsRecord.Painting> painting : com.squaresaresquare.github.records.PaintingsRecord.PaintingMap.entrySet()) {
            var key = painting.getValue().resourceKey();
            var width = painting.getValue().width();
            var height = painting.getValue().height();
            var title = painting.getValue().title();
            var author = painting.getValue().author();

            // Invoke your existing private register helper function natively
            register(context, key, width, height, title, author);
        }
    }

    public static void initialize() {

    }
}
