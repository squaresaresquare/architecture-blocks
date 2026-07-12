package com.squaresaresquare.github.client.item;
import com.squaresaresquare.github.client.ArchitectureBlocksClient;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.world.item.*;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class ModItems {
    public static final ResourceKey<@NotNull PaintingVariant> SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "singers_hall_curse_of_grail_messenger_kundry_upon_parzival"));
    public static final ResourceKey<@NotNull PaintingVariant> LUDWIG_II_BLUE_GENERAL_1 = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "ludwig_ii_blue_general_1"));
    public static final ResourceKey<@NotNull PaintingVariant> LUDWIG_II_BLUE_GENERAL_2 = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "ludwig_ii_blue_general_2"));
    public static final ResourceKey<@NotNull PaintingVariant> MALCOLM_AND_MARGARET_AT_QUEENSFERRY = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "malcolm_and_margaret_at_queensferry"));
    public static final ResourceKey<@NotNull PaintingVariant> THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "the_arrival_of_lohengrin_in_antwerp"));
    public static final ResourceKey<@NotNull PaintingVariant> UNDER_THE_LINDON = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "under_the_lindon"));
    public static final ResourceKey<@NotNull PaintingVariant> BEDROOM_LOVE_POTION = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "bedroom_love_potion"));
    public static final ResourceKey<@NotNull PaintingVariant> CHAPEL = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "chapel"));
    public static final ResourceKey<@NotNull PaintingVariant> COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "court_life_at_the_castle_of_the_grail"));
    public static final ResourceKey<@NotNull PaintingVariant> MIRACLE_OF_THE_GRAIL = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "miracle_of_the_grail"));
    public static final ResourceKey<@NotNull PaintingVariant> DINING_ROOM_SONG_CONTEST = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "dining_room_song_contest"));
    public static final ResourceKey<@NotNull PaintingVariant> PARZIFAL = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "parzifal"));
    public static final ResourceKey<@NotNull PaintingVariant> PARZIFALS_FIGHT = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "parzifals_fight"));
    public static final ResourceKey<@NotNull PaintingVariant> SIGURD_MEETS_GRYPIN = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "sigurd_meets_grypin"));
    public static final ResourceKey<@NotNull PaintingVariant> CHAPEL_SAINT_STAINED_GLASS = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "chapel_saint_stained_glass"));
    public static final ResourceKey<@NotNull PaintingVariant> CHAPEL_SUPPLICANTS_STAINED_GLASS = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "chapel_supplicants_stained_glass"));
    public static final ResourceKey<@NotNull PaintingVariant> ACCOLADE = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "accolade"));
    public static final ResourceKey<@NotNull PaintingVariant> TRISTAN_AND_ISOLDE_WITH_THE_POTION = ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ArchitectureBlocksClient.MOD_ID, "tristan_and_isolde_with_the_potion"));

    public static ResourceKey<@NotNull Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).orElse(null);
    }

    public static void bootstrap(BootstrapContext<@NotNull PaintingVariant> context) {
        register(context, SINGERS_HALL_CURSE_OF_GRAIL_MESSENGER_KUNDRY_UPON_PARZIVAL, 2, 3, "Curse of the Grail Messenger Kundry", "Ferdinand Piloty");
        register(context, LUDWIG_II_BLUE_GENERAL_1, 2, 3, "King Ludwig II of Bavaria in a blue generals uniform", "Ferdinand Piloty");
        register(context, LUDWIG_II_BLUE_GENERAL_2, 2, 3, "King Ludwig II of Bavaria in a blue generals uniform", "Ferdinand Piloty");
        register(context, MALCOLM_AND_MARGARET_AT_QUEENSFERRY, 3, 5, "The Landing of St Margaret at Queensferry", "Ferdinand Piloty");
        register(context, THE_ARRIVAL_OF_LOHENGRIN_IN_ANTWERP, 4, 2, "The Arrival of Lohengrin in Antwerp", "Ferdinand Piloty");
        register(context, UNDER_THE_LINDON, 6, 4, "Tristan and Isolde under the lindon", "Ferdinand Piloty");
        register(context, BEDROOM_LOVE_POTION, 5, 8, "The love potion", "Ferdinand Piloty");
        register(context, CHAPEL, 3, 5, "Chapel", "");
        register(context, COURT_LIFE_AT_THE_CASTLE_OF_THE_GRAIL, 3, 4, "Court Life at the Castle of the Grail", "Ferdinand Piloty");
        register(context, MIRACLE_OF_THE_GRAIL, 8, 5, "The Miracle of the Grail", "Wilhelm Hauschild");
        register(context, DINING_ROOM_SONG_CONTEST, 5, 6, "Hermann of Thuringia helping to represent the poem of a minstrel", "Ferdinand Piloty");
        register(context, PARZIFAL, 4, 6, "Parzifal", "Ferdinand Piloty");
        register(context, PARZIFALS_FIGHT, 5, 7, "Parzifals battle with the Red Knight", "Ferdinand Piloty");
        register(context, SIGURD_MEETS_GRYPIN, 3, 4, "King Sigurd meets the wise hermit Grypin", "Wilhelm Hauschild");
        register(context, CHAPEL_SAINT_STAINED_GLASS, 1, 3, "Saint", "Mayerischen");
        register(context, CHAPEL_SUPPLICANTS_STAINED_GLASS, 1, 3, "Supplicants", "Mayerischen");
        register(context, ACCOLADE, 3, 5, "Accolade", "Edmund Blair Leighton");
        register(context, TRISTAN_AND_ISOLDE_WITH_THE_POTION, 0, 0, "Tristan and Isolde with the potion", "John William Waterhouse");
    }

    private static void register(final BootstrapContext<@NotNull PaintingVariant> context, final ResourceKey<@NotNull PaintingVariant> key, final int width,
                                 final int height, final String title, final String author) {
        context.register(key, new PaintingVariant(width, height, key.identifier(),
                Optional.of(Component.translatable(key.identifier().toLanguageKey("painting", "title")).withStyle(ChatFormatting.YELLOW)),
                Optional.of(Component.translatable(key.identifier().toLanguageKey("painting", "author")).withStyle(ChatFormatting.GRAY))));
   }
}
