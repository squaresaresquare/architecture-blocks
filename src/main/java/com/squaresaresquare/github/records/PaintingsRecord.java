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
                        "Depicting the knighting of Polish Duke Henry VI the Good of Wroclaw"
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
        PaintingMap.put("love_potion",
                new Painting(
                        ModPaintings.LOVE_POTION_RK,
                        5, 8,
                        "Tristan hands Isolde the love potion",
                        "August Spieß",
                        "",
                        "Tristan, son of King Meliadus, is seriously injured in a duel while on a quest in Ireland and is healed by Isolde with magic herbs, although the two belong to hostile tribes. Tristan wants to marry Isolde, but first he continues his journey to the court of King Marke in Cornwall, who is a  brother-in-law of his father. The king sends him back to Isolde to win her hand on his behalf, and he is  successful. As they travel back by sea on a hot, windless day, Tristan and Isolde  drink a goblet of wine together, not knowing that it is actually a love potion which was intended for the elderly King Marke. Now passionately in love, the two meet secretly in the garden of the castle although the wedding of Isolde and King Marke has already taken place. The king hears of their relationship and condemns Tristan to death. Tristan succeeds in escaping. As a token of love and faithfulness Isolde gives him a ring. When King Marke learns that a magic potion was the cause, he forgives the two their involuntary unfaithfulness"

                ));
        PaintingMap.put("tristan_isolde_potion_2",
                new Painting(
                        ModPaintings.TRISTAN_ISOLDE_POTION_2_RK,
                        4, 3,
                        "Tristan hands Isolde the love potion",
                        "August Spieß",
                        "Bedroom",
                        "Tristan, son of King Meliadus, is seriously injured in a duel while on a quest in Ireland and is healed by Isolde with magic herbs, although the two belong to hostile tribes. Tristan wants to marry Isolde, but first he continues his journey to the court of King Marke in Cornwall, who is a  brother-in-law of his father. The king sends him back to Isolde to win her hand on his behalf, and he is  successful. As they travel back by sea on a hot, windless day, Tristan and Isolde  drink a goblet of wine together, not knowing that it is actually a love potion which was intended for the elderly King Marke. Now passionately in love, the two meet secretly in the garden of the castle although the wedding of Isolde and King Marke has already taken place. The king hears of their relationship and condemns Tristan to death. Tristan succeeds in escaping. As a token of love and faithfulness Isolde gives him a ring. When King Marke learns that a magic potion was the cause, he forgives the two their involuntary unfaithfulness"
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
                        "the Lohengrin Saga"
                ));
        PaintingMap.put("hermann_of_thuringia",
                new Painting(
                        ModPaintings.HERMANN_OF_THURINGIA_RK,
                        5, 6,
                        "Hermann of Thuringia helping to represent the poem of a minstrel",
                        "Ferdinand Piloty",
                        "",
                        "The tannhauser sage"
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
        PaintingMap.put("lady_reading_poem",
                new Painting(
                        ModPaintings.LADY_READING_POEM_RK,
                        3, 2,
                        "Medieval lady reading the poem Tristan und Isolde",
                        "August Spiess",
                        "bedroom",
                        "The mural of a medieval lady reading the poem Tristan und Isolde displaying the opening two lines."
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
                        "The Lohengrin saga"
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
                        ModPaintings.OUR_LADY_ROSARY_RK,
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
                        "The Lohengrin saga"
                ));
        PaintingMap.put("tristan_isolde_separation",
                new Painting(
                        ModPaintings.TRISTAN_ISOLDE_SEPARATION_RK,
                        5, 3,
                        "Tristan and isolde seperation",
                        "August Spieß",
                        "bedroom",
                        ""
                ));
        PaintingMap.put("tristan_isolde_potion",
                new Painting(
                        ModPaintings.TRISTAN_ISOLDE_POTION_RK,
                        4, 6,
                        "Tristan and Isolde with the potion",
                        "John William Waterhouse",
                        "bedroom",
                        "Tristan and Isolde decide to take  poison and die together, but some soundrel has swapped the poison with a love potion...again"


                ));
        PaintingMap.put("tristan_on_his_sickbed",
                new Painting(
                        ModPaintings.TRISTAN_ON_HIS_SICKBED_RK,
                        5, 3,
                        "Tristan on his sickbed",
                        "August Spieß",
                        "bedroom",
                        ""
                ));
        PaintingMap.put("under_the_lindon_2",
                new Painting(
                        ModPaintings.UNDER_THE_LINDON_2_RK,
                        5, 3,
                        "Under the lindon 2",
                        "August Spieß",
                        "bedroom",
                        ""
                ));
        PaintingMap.put("under_the_lindon",
                new Painting(
                        ModPaintings.UNDER_THE_LINDON_RK,
                        5, 3,
                        "Tristan and Isolde under the lindon",
                        "Ferdinand Piloty",
                        "bedroom",
                        ""
                ));
        PaintingMap.put("klingsor_offering_tresure",
                new Painting(
                        ModPaintings.KLINGSOR_OFFERING_TREASURE_RK,
                        3, 4,
                        "Magician Klingsor offers treasure to Landgrav Hermann I of Thuringia and his wife Sophia",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        "Magician Klingsor arrives in Castle Wartburg to arbitrate for Tannhäuser/Heinrich von Ofterdingen offering treasure to Landgrav Hermann I of Thuringia and his wife Sophia saying \"Bought it, it's a strange monster, no one can look at it...\""
                ));
        PaintingMap.put("back_wall",
                new Painting(
                        ModPaintings.BACK_WALL_RK,
                        8, 6,
                        "Singers' Contest at the Wartburg",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        "Tannhäuser/Heinrich von Ofterdingen presenting his work to Landgrave Hermann I of Thuringia and and the pious Landgravine Sophia in a contest with his life at stake where he ultimately loses and faces execution. He is granted a year to fetch the magician Klingsor from Hungary to defend his honor."
                ));
        PaintingMap.put("klingsor_flies_tannhauser",
                new Painting(
                        ModPaintings.KLINGSOR_FLIES_TANNHAUSER_RK,
                        3, 4,
                        "Klingsor flies Tannhäuser/Heinrich von Ofterdingen back to Wartburg",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        "The painting depicts the legendary wizard and Minnesinger, Klingsor von Ungerlant, flying through the night sky to carry the legendary poet Tannhäuser/Heinrich von Ofterdingen back to Wartburg Castle in Thuringia. After losing the contest and finding his life in danger, Heinrich was granted a year to fetch the powerful magician Klingsor from Hungary to serve as an ultimate arbiter and defend his honor."
                ));
        PaintingMap.put("portrait_wolfram_von_eschenbach_1",
                new Painting(
                        ModPaintings.PORTRAIT_WOLFRAM_VON_ESCHENBACH_1_RK,
                        2, 2,
                        "First portrait of Wolfram Von Eschenbach",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        "A portrait of Wolfram Von Eschenbach, author of Parzival and Willehalm"
                ));
        PaintingMap.put("portrait_wolfram_von_eschenbach_2",
                new Painting(
                        ModPaintings.PORTRAIT_WOLFRAM_VON_ESCHENBACH_2_RK,
                        2, 2,
                        "Second portrait of Wolfram Von Eschenbach",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        "A portrait of Wolfram Von Eschenbach, author of Parzival and Willehalm"
                ));
        PaintingMap.put("song_contest_prizes",
                new Painting(
                        ModPaintings.SONG_CONTEST_PRIZES_RK,
                        3, 4,
                        "Song contest prizes",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        "Landgrave Hermann I of Thuringia handing out prizes to the winners of the song contest"
                ));
        PaintingMap.put("schwanenrittersage1",
                new Painting(
                        ModPaintings.SCHWANENRITTERSAGE1_RK,
                        3, 4,
                        "Song Contest",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        ""
                ));
        PaintingMap.put("hermann_recovers_manuscript",
                new Painting(
                        ModPaintings.HERMANN_RECOVERS_MANUSCRIPT_RK,
                        3, 4,
                        "Hermann of Thuringia recovers manuscript",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        "Landgrave Hermann I of Thuringia recovered the manuscripts of the long lost poem Eneit (based on the Roman d'Eneas) and returns them to the poet Heinrich von Veldeke who he orders to complete the work."
                ));
        PaintingMap.put("wolfram_translates_the_poem",
                new Painting(
                        ModPaintings.WOLFRAM_TRANSLATES_THE_POEM_RK,
                        3, 4,
                        "Hermann of Thuringia asks Wolfram Von Eschenbach to translate Willehalm",
                        "Josef Aigner/Ferdinand Piloty",
                        "diningroom",
                        "Landgrave Hermann I of Thuringia asks Wolfram Von Eschenbach author of Parzival and Willehalm to translate Willehalm."
                ));
        PaintingMap.put("left_curtain",
                new Painting(
                        ModPaintings.LEFT_CURTAIN_RK,
                        1, 4,
                        "Left Curtain",
                        "NA",
                        "bedroom",
                        "Left Curtain"
                ));
        PaintingMap.put("right_curtain",
                new Painting(
                        ModPaintings.RIGHT_CURTAIN_RK,
                        1, 4,
                        "Right Curtain",
                        "NA",
                        "bedroom",
                        "Right Curtain"
                ));
    }
}
