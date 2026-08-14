package com.squaresaresquare.github.datagen;
import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.records.PaintingsRecord;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModPaintingJson implements DataProvider {
    public ModPaintingJson(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super();
    }

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache) {
        PaintingsRecord.initialize();
        String pathString = "items/painting.json";
        String targetString = "RESOURCE_PACK";
        StringBuilder jsonSB = new StringBuilder("{\n");
        jsonSB.append("  \"model\": {\n");
        jsonSB.append("    \"type\": \"minecraft:select\",\n");
        jsonSB.append("    \"property\": \"minecraft:component\",\n");
        jsonSB.append("    \"component\": \"minecraft:painting/variant\",\n");
        jsonSB.append("    \"cases\": [\n");
        int max = PaintingsRecord.PaintingMap.size();
        int count = 1;
        for (Map.Entry<String, PaintingsRecord.Painting> painting : PaintingsRecord.PaintingMap.entrySet()) {
            jsonSB.append("      {\n");
            jsonSB.append("        \"when\": \"architecture-blocks:%s\",\n".formatted(painting.getKey()));
            jsonSB.append("        \"model\": {\n");
            jsonSB.append("          \"type\": \"minecraft:model\",\n");
            jsonSB.append("          \"model\": \"architecture-blocks:item/%s\"\n".formatted(painting.getKey()));
            jsonSB.append("        }\n");
            jsonSB.append("      }");
            if (count == max){
                jsonSB.append("\n");
            } else {
                jsonSB.append(",\n");
            }
            count++;
        }
        jsonSB.append("    ],\n");
        jsonSB.append("    \"fallback\": { \n");
        jsonSB.append("          \"type\": \"minecraft:model\",\n");
        jsonSB.append("          \"model\": \"architecture-blocks:item/painting\"\n");
        jsonSB.append("}}}\n");
        System.out.println(jsonSB.toString());
        String modIdString = ArchitectureBlocks.MOD_ID;
        CompletableFuture<?> completableFuture = GenericDataProvider.writeCustomJson(cache, jsonSB.toString(), targetString, pathString, "minecraft");

        pathString = "models/item/painting.json";
        jsonSB.setLength(0);
        jsonSB.append("{\n");
        jsonSB.append("       \"parent\": \"minecraft:item/generated\",\n");
        jsonSB.append("  \"textures\": {\n");
        jsonSB.append("    \"layer0\": \"architecture-blocks:item/painting\"\n");
        jsonSB.append("  }\n");
        jsonSB.append("}\n");
        CompletableFuture<?> completableFuture2 = GenericDataProvider.writeCustomJson(cache, jsonSB.toString(), targetString, pathString, modIdString);

        for (Map.Entry<String, PaintingsRecord.Painting> painting : PaintingsRecord.PaintingMap.entrySet()) {
            pathString = "models/item/%s.json".formatted(painting.getKey());
            //noinspection RedundantStringFormatCall
            System.out.println("create file %s".formatted(pathString));
            jsonSB.setLength(0);
            jsonSB.append("{\n");
            jsonSB.append("       \"parent\": \"minecraft:item/generated\",\n");
            jsonSB.append("  \"textures\": {\n");
            jsonSB.append("    \"layer0\": \"architecture-blocks:item/%s_icon\"\n".formatted(painting.getKey()));
            jsonSB.append("  }\n");
            jsonSB.append("}\n");
            GenericDataProvider.writeCustomJson(cache, jsonSB.toString(), targetString, pathString, modIdString);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
        return completableFuture2;
        
    }

    @Override
    public @NotNull String getName() {
        return null;
    }
}
