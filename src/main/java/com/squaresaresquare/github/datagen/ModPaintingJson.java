package com.squaresaresquare.github.datagen;
import com.squaresaresquare.github.records.PaintingsRecord;

import java.util.Map;

public class ModPaintingJson {
    public ModPaintingJson() {
        PaintingsRecord.initialize();
        String pathString = "items/painting.json";
        String targetString = "RESOURCE_PACK";
        StringBuilder jsonSB = new StringBuilder("{\n");
        jsonSB.append("  \"model\": {\n");
        jsonSB.append("    \"property\": \"minecraft:painting\",\n");
        jsonSB.append("    \"cases\": [\n");
        int max = PaintingsRecord.PaintingMap.size();
        int count = 1;
        for (Map.Entry<String, PaintingsRecord.Painting> painting : PaintingsRecord.PaintingMap.entrySet()) {
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("\n");
            jsonSB.append("      {\n");
            jsonSB.append("        \"when\": \"minecraft:%s\",\n".formatted(painting.getKey()));
            jsonSB.append("        \"model\": {\n");
            jsonSB.append("          \"type\": \"minecraft:model\",\n");
            jsonSB.append("          \"model\": \"minecraft:item/%s\"\n".formatted(painting.getKey()));
            jsonSB.append("          \"textures\": {\n");
            jsonSB.append("              \"layer0\": \"minecraft:item/%s\"\n".formatted(painting.getKey()));
            jsonSB.append("          }\n");
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
        jsonSB.append("          \"model\": \"minecraft:item/painting\"\n");
        jsonSB.append("\t  \"textures\": {\n");
        jsonSB.append("              \"layer0\": \"minecraft:item/painting\"\n");
        jsonSB.append("}}}}}\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");
        jsonSB.append("\n");

    }
}
