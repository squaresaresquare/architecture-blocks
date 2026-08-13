package com.squaresaresquare.github.datagen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.squaresaresquare.github.ArchitectureBlocks;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.CachedOutput;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class GenericDataProvider<CustomDataObj> implements DataProvider {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final PackOutput packOutput;

    public GenericDataProvider(PackOutput packOutput) {
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
     *    map (your hashmap)
     *    PackOutput.Target.DATA_PACK
     *    Path.of(ArchitectureBlocks.MOD_ID, "recipe", "<blockname>_stonecutting.json");
     */
    public static CompletableFuture<?> writeCustomJson(CachedOutput cache, HashMap<String, Object> dataMap, String target, String path) {
        PackOutput.Target.valueOf(target);

        // takes a hashmap and makes json
        JsonElement jsonResult = GSON.toJsonTree(dataMap);

        // Resolves the file location relative to the data target folder

        Path resolvedPath = Path.of(Arrays.toString(path.split("/")));
        // Safely writes the JSON object to disk via Minecraft's data caching system
        return DataProvider.saveStable(cache, jsonResult, resolvedPath);
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