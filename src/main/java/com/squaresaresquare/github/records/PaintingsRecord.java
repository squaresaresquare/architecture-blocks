package com.squaresaresquare.github.records;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import java.io.Serializable;
import java.util.Objects;

public record PaintingsRecord(ResourceKey<PaintingVariant> resourceKey, Integer width, Integer height, String title, String author, String location, String note) implements Serializable {
    public PaintingsRecord(ResourceKey<PaintingVariant> resourceKey, Integer width, Integer height, String title, String author, String location, String note) {
        if (width > 16 || height > 16){
            throw new java.lang.IllegalArgumentException(
                    String.format("Paintings cannot be larger than 16x16: %dx%d is too big", width, height));
        }
        this.resourceKey = resourceKey();
        this.width = width();
        this.height = height();
        this.title = title();
        this.author = author();
        this.location = location();
        this.note = note();
    }
    // methods needed for serialization
    @Override public boolean equals(Object other) {
        if (other instanceof PaintingsRecord that
                && this.resourceKey.hashCode() == that.resourceKey.hashCode()
                && this.width == that.width
                && this.height == that.height
                && this.title == that.title
                && this.author == that.author
                && this.location == that.location
                && this.note == that.note){
            return true;
        }
        return false;
    }
    @Override public int hashCode() {
        return Objects.hash(
                resourceKey,
                width,
                height,
                title,
                author,
                location,
                note);
    }
    @Override public String toString() {
        return String.format("%s[resourceKey=%s, width=%d, height=%d, title=%s, author=%s, location=%s, note=%s]",
                getClass().getName(),
                "ResourceKey data [" +
                        "\n namespace:          " + resourceKey.identifier().getNamespace() +
                       ",\n path:               " + resourceKey.identifier().getPath() +
                       ",\n Registry Namespace: " + resourceKey.registry().getNamespace() +
                       ",\n Registry path:      " + resourceKey.registry().getPath(),
                width, height, title, author, location, note);
    }
}
