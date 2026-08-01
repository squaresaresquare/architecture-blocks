package com.squaresaresquare.github.type;

import net.minecraft.util.StringRepresentable;

public enum StringProperty implements StringRepresentable {
    OPTION_ONE("one"),
    OPTION_TWO("two");

    private String name = "";

    StringProperty(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}
