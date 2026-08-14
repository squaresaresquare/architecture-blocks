package com.squaresaresquare.github.records;

import com.squaresaresquare.github.item.ModPaintings;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import java.util.HashMap;
import java.util.Map;

public class PaintingsRecord{
    public static record Painting(ResourceKey<PaintingVariant> resourceKey, Integer width, Integer height, String title, String author, String location, String note) { }
    public static final Map<String, Painting> PaintingMap = new HashMap<>();
    public static void initialize() {
        int forceClassLoad = ModPaintings.DATA_GEN_TRACKER.size();
        PaintingMap.put("accolade",
                new Painting(
                        ModPaintings.ACCOLADE_RK,
                        3, 5,
                        "Accolade",
                        "Edmund Blair Leighton",
                        "",
                        ""
                ));
        PaintingMap.put("archer_angel",
                new Painting(
                        ModPaintings.ARCHER_ANGEL_RK,
                        1, 3,
                        "Archer angel",
                        "August Spieß",
                        "",
                        ""
                ));
        PaintingMap.put("bedroom_love_potion",
                new Painting(
                        ModPaintings.BEDROOM_LOVE_POTION_RK,
                        5, 8,
                        "Tristan hands Isolde the love potion",
                        "August Spieß",
                        "",
                        ""
                ));
        PaintingMap.put("chapel",
                new Painting(
                        ModPaintings.CHAPEL_RK,
                        3, 5,
                        "Chapel",
                        "Franz Mayer Mayerischen Studios",
                        "",
                        ""
                ));
        PaintingMap.put("court_life_at_grail_castle",
                new Painting(
                        ModPaintings.COURT_LIFE_AT_GRAIL_CASTLE_RK,
                        3, 4,
                        "Court Life at the Castle of the Grail",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        PaintingMap.put("hermann_of_thuringia",
                new Painting(
                        ModPaintings.HERMANN_OF_THURINGIA_RK,
                        5, 6,
                        "Hermann of Thuringia helping to represent the poem of a minstrel",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        PaintingMap.put("immaculate_conception",
                new Painting(
                        ModPaintings.IMMACULATE_CONCEPTION_RK,
                        3, 5,
                        "The Immaculate Conception of Mary stained glass window",
                        "Franz Mayer Mayerischen Studios",
                        "",
                        ""
                ));
        PaintingMap.put("ludwig_general_1",
                new Painting(
                        ModPaintings.LUDWIG_GENERAL_1_RK,
                        2, 3,
                        "King Ludwig II of Bavaria in a blue generals uniform",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        PaintingMap.put("ludwig_general_2",
                new Painting(
                        ModPaintings.LUDWIG_GENERAL_2_RK,
                        2, 3,
                        "King Ludwig II of Bavaria in a blue generals uniform",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
        PaintingMap.put("malcolm_and_margaret",
                new Painting(
                        ModPaintings.MALCOLM_AND_MARGARET_RK,
                        3, 5,
                        "The Landing of St Margaret at Queensferry",
                        "William Brassey Hole",
                        "",
                        ""
                ));
        PaintingMap.put("miracle_of_the_grail",
                new Painting(
                        ModPaintings.MIRACLE_OF_THE_GRAIL_RK,
                        8, 5,
                        "The Miracle of the Grail",
                        "Wilhelm Hauschild",
                        "",
                        ""
                ));
        PaintingMap.put("oratory_stained_glass",
                new Painting(
                        ModPaintings.ORATORY_STAINED_GLASS_RK,
                        3, 5,
                        "Oratory stained glass",
                        "Franz Mayer Mayerischen Studios",
                        "",
                        ""
                ));
        PaintingMap.put("our_lady_rosary",
                new Painting(
                        ModPaintings.OUR_LADY_OF_THE_ROSARY_RK,
                        2, 3,
                        "Our lady of the rosary simone cantarini",
                        "Simone Cantarini",
                        "",
                        "Our Lady of the rosary"
                ));
        PaintingMap.put("parzifals_fight",
                new Painting(
                        ModPaintings.PARZIFALS_FIGHT_RK,
                        5, 7,
                        "Parzifals battle with the Red Knight",
                        "August Spiess",
                        "",
                        ""
                ));
        PaintingMap.put("parzifal",
                new Painting(
                        ModPaintings.PARZIFAL_RK,
                        4, 6,
                        "Parzifal",
                        "August Spiess",
                        "",
                        ""
                ));
        PaintingMap.put("saint_margaret",
                new Painting(
                        ModPaintings.SAINT_MARGARET_RK,
                        1, 3,
                        "Saint margaret",
                        "August Spieß",
                        "",
                        ""
                ));
        PaintingMap.put("sigurd_meets_grypin",
                new Painting(
                        ModPaintings.SIGURD_MEETS_GRYPIN_RK,
                        3, 4,
                        "King Sigurd meets the wise hermit Grypin",
                        "Wilhelm Hauschild",
                        "",
                        ""
                ));
        PaintingMap.put("curse_of_grail_messenger",
                new Painting(
                        ModPaintings.CURSE_OF_GRAIL_MESSENGER_RK,
                        2, 3,
                        "Curse of the Grail Messenger Kundry",
                        "Ferdinand Piloty",
                        "Singer's Hall",
                        ""
                ));
        PaintingMap.put("the_arrival_of_lohengrin",
                new Painting(
                        ModPaintings.THE_ARRIVAL_OF_LOHENGRIN_RK,
                        4, 2,
                        "The Arrival of Lohengrin in Antwerp",
                        "August Von Heckle",
                        "",
                        ""
                ));
        PaintingMap.put("tristan_isolde_separation",
                new Painting(
                        ModPaintings.TRISTAN_AND_ISOLDE_SEPERATION_RK,
                        5, 3,
                        "Tristan and isolde seperation",
                        "August Spieß",
                        "",
                        ""
                ));
        PaintingMap.put("tristan_isolde_potion",
                new Painting(
                        ModPaintings.TRISTAN_ISOLDE_POTION_RK,
                        4, 6,
                        "Tristan and Isolde with the potion",
                        "John William Waterhouse",
                        "",
                        ""
                ));
        PaintingMap.put("tristan_on_his_sickbed",
                new Painting(
                        ModPaintings.TRISTAN_ON_HIS_SICKBED_RK,
                        5, 3,
                        "Tristan on his sickbed",
                        "August Spieß",
                        "",
                        ""
                ));
        PaintingMap.put("under_the_lindon_2",
                new Painting(
                        ModPaintings.UNDER_THE_LINDON_2_RK,
                        5, 3,
                        "Under the lindon 2",
                        "August Spieß",
                        "",
                        ""
                ));
        PaintingMap.put("under_the_lindon",
                new Painting(
                        ModPaintings.UNDER_THE_LINDON_RK,
                        6, 4,
                        "Tristan and Isolde under the lindon",
                        "Ferdinand Piloty",
                        "",
                        ""
                ));
    }
}
