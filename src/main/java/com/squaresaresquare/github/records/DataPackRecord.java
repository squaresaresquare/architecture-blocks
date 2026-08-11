package com.squaresaresquare.github.records;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record DataPackRecord(String message, int value) {
    public static final Codec<DataPackRecord> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.STRING.fieldOf("message").forGetter(DataPackRecord::message),
                    Codec.INT.fieldOf("value").forGetter(DataPackRecord::value)
            ).apply(instance, DataPackRecord::new)
    );
}
