package com.squaresaresquare.github.datagen;
import com.squaresaresquare.github.ArchitectureBlocks;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import org.jetbrains.annotations.NotNull;

public class ModPaintings {

    public static final ResourceKey<@NotNull PaintingVariant> SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL_RK = create("singers_hall_curse_of_grail_messenger_kundry_upon_parzival");
    public static final ResourceKey<@NotNull PaintingVariant> LUDWIG_II_BLUE_GENERAL_1_RK = create("ludwig_ii_blue_general_1");
    public static final ResourceKey<@NotNull PaintingVariant> LUDWIG_II_BLUE_GENERAL_2_RK = create("ludwig_ii_blue_general_2");
    public static final ResourceKey<@NotNull PaintingVariant> MALCOLM_AND_MARGARET_AT_QUEENSFERRY_RK = create("malcolm_and_margaret_at_queensferry");
    public static final ResourceKey<@NotNull PaintingVariant> THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP_RK = create("the_arrival_of_lohengrin_in_antwerp");
    public static final ResourceKey<@NotNull PaintingVariant> UNDER_THE_LINDON_RK = create("under_the_lindon");
    public static final ResourceKey<@NotNull PaintingVariant> BEDROOM_LOVE_POTION_RK = create("bedroom_love_potion");
    public static final ResourceKey<@NotNull PaintingVariant> CHAPEL_RK = create("chapel");
    public static final ResourceKey<@NotNull PaintingVariant> COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL_RK = create("court_life_at_the_castle_of_the_grail");
    public static final ResourceKey<@NotNull PaintingVariant> MIRACLE_OF_THE_GRAIL_RK = create("miracle_of_the_grail");
    public static final ResourceKey<@NotNull PaintingVariant> HERMANN_OF_THURINGIA_RK = create("hermann_of_thuringia");
    public static final ResourceKey<@NotNull PaintingVariant> PARZIFAL_RK = create("parzifal");
    public static final ResourceKey<@NotNull PaintingVariant> PARZIFALS_FIGHT_RK = create("parzifals_fight");
    public static final ResourceKey<@NotNull PaintingVariant> SIGURD_MEETS_GRYPIN_RK = create("sigurd_meets_grypin");
    public static final ResourceKey<@NotNull PaintingVariant> CHAPEL_SAINT_STAINED_GLASS_RK = create("chapel_saint_stained_glass");
    public static final ResourceKey<@NotNull PaintingVariant> CHAPEL_SUPPLICANTS_STAINED_GLASS_RK = create("chapel_supplicants_stained_glass");
    public static final ResourceKey<@NotNull PaintingVariant> ACCOLADE_RK = create("accolade");
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_AND_ISOLDE_WITH_THE_POTION_RK = create("tristan_and_isolde_with_the_potion");

    public static void bootstrap(BootstrapContext<@NotNull PaintingVariant> context) {
        register(context, SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL_RK, 2, 3, "Curse of the Grail Messenger Kundry", "Ferdinand Piloty");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, LUDWIG_II_BLUE_GENERAL_1_RK, 2, 3, "King Ludwig II of Bavaria in a blue generals uniform", "Ferdinand Piloty");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, LUDWIG_II_BLUE_GENERAL_2_RK, 2, 3, "King Ludwig II of Bavaria in a blue generals uniform", "Ferdinand Piloty");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, MALCOLM_AND_MARGARET_AT_QUEENSFERRY_RK, 3, 5, "The Landing of St Margaret at Queensferry", "William Brassey Hole");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP_RK, 4, 2, "The Arrival of Lohengrin in Antwerp", "August Von Heckle");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, UNDER_THE_LINDON_RK, 6, 4, "Tristan and Isolde under the lindon", "Ferdinand Piloty");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, BEDROOM_LOVE_POTION_RK, 5, 8, "Tristan hands Isolde the love potion", "August Spieß");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, CHAPEL_RK, 3, 5, "Chapel", "Mayerischen");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL_RK, 3, 4, "Court Life at the Castle of the Grail", "Ferdinand Piloty");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, MIRACLE_OF_THE_GRAIL_RK, 8, 5, "The Miracle of the Grail", "Wilhelm Hauschild");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, HERMANN_OF_THURINGIA_RK, 5, 6, "Hermann of Thuringia helping to represent the poem of a minstrel", "Ferdinand Piloty");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, PARZIFAL_RK, 4, 6, "Parzifal", "August Spiess");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, PARZIFALS_FIGHT_RK, 5, 7, "Parzifals battle with the Red Knight", "August Spiess");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, SIGURD_MEETS_GRYPIN_RK, 3, 4, "King Sigurd meets the wise hermit Grypin", "Wilhelm Hauschild");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, CHAPEL_SAINT_STAINED_GLASS_RK, 1, 3, "Saint", "Mayerischen");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, CHAPEL_SUPPLICANTS_STAINED_GLASS_RK, 1, 3, "Supplicants", "Mayerischen");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, ACCOLADE_RK, 3, 5, "Accolade", "Edmund Blair Leighton");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
        register(context, TRISTAN_AND_ISOLDE_WITH_THE_POTION_RK, 4, 6, "Tristan and Isolde with the potion", "John William Waterhouse");
        ArchitectureBlocks.LOGGER.info("Display context {}\n", context);
    }

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
        ArchitectureBlocks.LOGGER.info("----------- get context info for {} -----------",title);
        ArchitectureBlocks.LOGGER.info(context.lookup(key.registryKey()).toString());
        ArchitectureBlocks.LOGGER.info("--------------------------------------------------------");

   }

}
