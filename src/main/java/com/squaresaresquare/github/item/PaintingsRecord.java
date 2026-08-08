package com.squaresaresquare.github.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import java.util.ArrayList;
import java.util.List;

public record PaintingsRecord(ResourceKey<PaintingVariant> rk, Integer w, Integer h, String title, String author, String note) {
    public PaintingsRecord(ResourceKey<PaintingVariant> rk, Integer w, Integer h, String title, String author, String note) {
        if (w > 16 || h > 16){
            throw new java.lang.IllegalArgumentException(
                    String.format("Paintings cannot be larger than 16x16: %dx%d is too big", w, h));
        }
        this.rk = rk;
        this.w = w;
        this.h = h;
        this.title = title;
        this.author = author;
        this.note = note;
    }
    public static List<PaintingsRecord> PaintingRecords = new ArrayList<>();
}
