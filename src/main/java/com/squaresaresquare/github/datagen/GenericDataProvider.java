package com.squaresaresquare.github.datagen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.squaresaresquare.github.ArchitectureBlocks;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.CachedOutput;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;

import java.nio.file.*;
import java.util.concurrent.CompletableFuture;

public class GenericDataProvider<CustomDataObj> implements DataProvider {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static FabricPackOutput packOutput = null;

    public GenericDataProvider(FabricPackOutput packOutput) {
        this.packOutput = packOutput;
    }

    /**
     * Accessor method that accepts a HashMap, a PackOutput.Target, and a target Path,
     * then serializes the map into a JSON file via CachedOutput.
     * PackOutput.Target can be
     * PackOutput.Target.DATA_PACK // if you're adding to the datapack
     * PackOutput.Target.RESOURCE_PACK // if you're adding to the resourcepack
     * PackOutput.Target.REPORTS // if you're adding to reports
     * For example to write a stonecutting recipe
     *    jsonString a string of json to write
     *    PackOutput.Target.DATA_PACK
     *    Path.of(ArchitectureBlocks.MOD_ID, "recipe", "<blockname>_stonecutting.json");
     */
    public static CompletableFuture<?> writeCustomJson(CachedOutput cache, String jsonString, String target, String path) {
        Path modID = Path.of(ArchitectureBlocks.MOD_ID);
        ModContainer container = packOutput.getModContainer();
        Path outputFolder = packOutput.getOutputFolder(PackOutput.Target.valueOf(target));

        FabricPackOutput fabricPackOutput = new FabricPackOutput(container, outputFolder, false);
        PackOutput.Target packTarget = PackOutput.Target.valueOf(target);

        JsonElement jsonElement = JsonParser.parseString(jsonString);

        Path resolvedPath = outputFolder.resolve(outputFolder, modID, Path.of(path)).toAbsolutePath();
        ArchitectureBlocks.LOGGER.info("output folder is " + resolvedPath.toString());
        // Safely writes the JSON object to disk via Minecraft's data caching system
        CompletableFuture<?> save = DataProvider.saveStable(cache, jsonElement, resolvedPath);
        ArchitectureBlocks.LOGGER.info("completed future is " + save.toString());
        return save.completedFuture(null);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public String getName() {
        return "Custom HashMap JSON Provider";
    }
}