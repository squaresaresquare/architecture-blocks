package com.squaresaresquare.github.item;

import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.records.PaintingsRecord;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

import static com.squaresaresquare.github.records.PaintingsRecord.*;

public class ModPaintings {

    public static final ResourceKey<@NotNull PaintingVariant> ACCOLADE_RK = create("accolade");
    public static final ResourceKey<@NotNull PaintingVariant> ARCHER_ANGEL_RK = create("archer_angel");
    public static final ResourceKey<@NotNull PaintingVariant> BEDROOM_LOVE_POTION_RK = create("bedroom_love_potion");
    public static final ResourceKey<@NotNull PaintingVariant> CHAPEL_RK = create("chapel");
    public static final ResourceKey<@NotNull PaintingVariant> COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL_RK = create("court_life_at_the_castle_of_the_grail");
    public static final ResourceKey<@NotNull PaintingVariant> HERMANN_OF_THURINGIA_RK = create("hermann_of_thuringia");
    public static final ResourceKey<@NotNull PaintingVariant> IMMACULATE_CONCEPTION_OF_MARY_RK = create("immaculate_conception_of_mary");
    public static final ResourceKey<@NotNull PaintingVariant> LUDWIG_II_BLUE_GENERAL_1_RK = create("ludwig_ii_blue_general_1");
    public static final ResourceKey<@NotNull PaintingVariant> LUDWIG_II_BLUE_GENERAL_2_RK = create("ludwig_ii_blue_general_2");
    public static final ResourceKey<@NotNull PaintingVariant> MALCOLM_AND_MARGARET_AT_QUEENSFERRY_RK = create("malcolm_and_margaret_at_queensferry");
    public static final ResourceKey<@NotNull PaintingVariant> MIRACLE_OF_THE_GRAIL_RK = create("miracle_of_the_grail");
    public static final ResourceKey<@NotNull PaintingVariant> ORATORY_STAINED_GLASS_RK = create("oratory_stained_glass");
    public static final ResourceKey<@NotNull PaintingVariant> OUR_LADY_OF_THE_ROSARY_SIMONE_CANTARINI_RK = create("our_lady_of_the_rosary_simone_cantarini");
    public static final ResourceKey<@NotNull PaintingVariant> PARZIFALS_FIGHT_RK = create("parzifals_fight");
    public static final ResourceKey<@NotNull PaintingVariant> PARZIFAL_RK = create("parzifal");
    public static final ResourceKey<@NotNull PaintingVariant> SAINT_MARGARET_RK = create("saint_margaret");
    public static final ResourceKey<@NotNull PaintingVariant> SIGURD_MEETS_GRYPIN_RK = create("sigurd_meets_grypin");
    public static final ResourceKey<@NotNull PaintingVariant> SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL_RK = create("singers_hall_curse_of_grail_messenger_kundry_upon_parzival");
    public static final ResourceKey<@NotNull PaintingVariant> THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP_RK = create("the_arrival_of_lohengrin_in_antwerp");
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_AND_ISOLDE_SEPERATION_RK = create("tristan_and_isolde_seperation");
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_AND_ISOLDE_WITH_THE_POTION_RK = create("tristan_and_isolde_with_the_potion");
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_ON_HIS_SICKBED_RK = create("tristan_on_his_sickbed");
    public static final ResourceKey<@NotNull PaintingVariant> UNDER_THE_LINDON_2_RK = create("under_the_lindon_2");
    public static final ResourceKey<@NotNull PaintingVariant> UNDER_THE_LINDON_RK = create("under_the_lindon");

    private static ResourceKey<@NotNull PaintingVariant> create(final String id) {
        return ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocks.MOD_ID, id));
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

    public static final HashMap<String, Record> paintingsHash = new HashMap<>();

    public static void loadRecord() {
        paintingsHash.put("accolade",
                new PaintingsRecord(
                        ModPaintings.ACCOLADE_RK,
                        3, 5,
                        "Accolade",
                        "Edmund Blair Leighton",
                        "",
                        ""
                ));
        paintingsHash.put("archer_angel",
                new PaintingsRecord(
                        ModPaintings.ARCHER_ANGEL_RK,
                        1, 3,
                        "Archer angel",
                        "August Spieß",
                        "",
                        ""
                ));
        paintingsHash.put("bedroom_love_potion",
                new PaintingsRecord(
                        ModPaintings.BEDROOM_LOVE_POTION_RK,
                        5, 8,
                        "Tristan hands Isolde the love potion",
                        "August Spieß",
                        "",
                        ""
                ));
        paintingsHash.put("Chapel",
                new PaintingsRecord(
                        ModPaintings.CHAPEL_RK,
                        3, 5,
                        "Chapel",
                        "Franz Mayer Mayerischen Studios",
                        "",
                        ""
                ));
        paintingsHash.put("court_life_at_the_castle_of_the_grail",
                new PaintingsRecord(
                        ModPaintings.COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL_RK,
                        3, 4,
                        "Court Life at the Castle of the Grail",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        paintingsHash.put("harmann_of_thuringia",
                new PaintingsRecord(
                        ModPaintings.HERMANN_OF_THURINGIA_RK,
                        5, 6,
                        "Hermann of Thuringia helping to represent the poem of a minstrel",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        paintingsHash.put("immaculate_conception_of_mary",
                new PaintingsRecord(
                        ModPaintings.IMMACULATE_CONCEPTION_OF_MARY_RK,
                        3, 5,
                        "The Immaculate Conception of Mary stained glass window",
                        "Franz Mayer Mayerischen Studios",
                        "",
                        ""
                ));
        paintingsHash.put("ludwin_ii_blue_general_1",
                new PaintingsRecord(
                        ModPaintings.LUDWIG_II_BLUE_GENERAL_1_RK,
                        2, 3,
                        "King Ludwig II of Bavaria in a blue generals uniform",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        paintingsHash.put("ludwig_ii_blue_general_2",
                new PaintingsRecord(
                        ModPaintings.LUDWIG_II_BLUE_GENERAL_2_RK,
                        2, 3,
                        "King Ludwig II of Bavaria in a blue generals uniform",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        paintingsHash.put("malcom_and_margaret_at_queensferry",
                new PaintingsRecord(
                        ModPaintings.MALCOLM_AND_MARGARET_AT_QUEENSFERRY_RK,
                        3, 5,
                        "The Landing of St Margaret at Queensferry",
                        "William Brassey Hole",
                        "",
                        ""
                ));
        paintingsHash.put("miracle_of_the_grail",
                new PaintingsRecord(
                        ModPaintings.MIRACLE_OF_THE_GRAIL_RK,
                        8, 5,
                        "The Miracle of the Grail",
                        "Wilhelm Hauschild",
                        "",
                        ""
                ));
        paintingsHash.put("oratory_stained_glass",
                new PaintingsRecord(
                        ModPaintings.ORATORY_STAINED_GLASS_RK,
                        3, 5,
                        "Oratory stained glass",
                        "Franz Mayer Mayerischen Studios",
                        "",
                        ""
                ));
        paintingsHash.put("our_lady_of_the_rosary_simone_cantarini",
                new PaintingsRecord(
                        ModPaintings.OUR_LADY_OF_THE_ROSARY_SIMONE_CANTARINI_RK,
                        2, 3,
                        "Our lady of the rosary simone cantarini",
                        "Simone Cantarini",
                        "",
                        ""
                ));
        paintingsHash.put("parzifals_fight",
                new PaintingsRecord(
                        ModPaintings.PARZIFALS_FIGHT_RK,
                        5, 7,
                        "Parzifals battle with the Red Knight",
                        "August Spiess",
                        "",
                        ""
                ));
        paintingsHash.put("parzifal",
                new PaintingsRecord(
                        ModPaintings.PARZIFAL_RK,
                        4, 6,
                        "Parzifal",
                        "August Spiess",
                        "",
                        ""
                ));
        paintingsHash.put("saint_margaret",
                new PaintingsRecord(
                        ModPaintings.SAINT_MARGARET_RK,
                        1, 3,
                        "Saint margaret",
                        "August Spieß",
                        "",
                        ""
                ));
        paintingsHash.put("sigurn_meets_grypin",
                new PaintingsRecord(
                        ModPaintings.SIGURD_MEETS_GRYPIN_RK,
                        3, 4,
                        "King Sigurd meets the wise hermit Grypin",
                        "Wilhelm Hauschild",
                        "",
                        ""
                ));
        paintingsHash.put("singers_hall_curse_of_the_grail_messenger_kundry_upon_parzival",
                new PaintingsRecord(
                        ModPaintings.SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL_RK,
                        2, 3,
                        "Curse of the Grail Messenger Kundry",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        paintingsHash.put("the_arrival_of_lohengrin_in_antwerp",
                new PaintingsRecord(
                        ModPaintings.THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP_RK,
                        4, 2,
                        "The Arrival of Lohengrin in Antwerp",
                        "August Von Heckle",
                        "",
                        ""
                ));
        paintingsHash.put("tristan_and_isolde_separation",
                new PaintingsRecord(
                        ModPaintings.TRISTAN_AND_ISOLDE_SEPERATION_RK,
                        5, 3,
                        "Tristan and isolde seperation",
                        "August Spieß",
                        "",
                        ""
                ));
        paintingsHash.put("tristan_and_isolde_with_the_potion",
                new PaintingsRecord(
                        ModPaintings.TRISTAN_AND_ISOLDE_WITH_THE_POTION_RK,
                        4, 6,
                        "Tristan and Isolde with the potion",
                        "John William Waterhouse",
                        "",
                        ""
                ));
        paintingsHash.put("tristan_on_his_sickbed",
                new PaintingsRecord(
                        ModPaintings.TRISTAN_ON_HIS_SICKBED_RK,
                        5, 3,
                        "Tristan on his sickbed",
                        "August Spieß",
                        "",
                        ""
                ));
        paintingsHash.put("under_the_lindon_2",
                new PaintingsRecord(
                        ModPaintings.UNDER_THE_LINDON_2_RK,
                        5, 3,
                        "Under the lindon 2",
                        "August Spieß",
                        "",
                        ""
                ));
        paintingsHash.put("under_the_lindon",
                new PaintingsRecord(
                        ModPaintings.UNDER_THE_LINDON_RK,
                        6, 4,
                        "Tristan and Isolde under the lindon",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
    }
    public static void initialize() {
        loadRecord();
    }
}
