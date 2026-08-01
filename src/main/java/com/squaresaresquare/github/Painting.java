package com.squaresaresquare.github;


import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.UUID;
import net.minecraft.core.UUIDUtil;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;

public record Painting(
        int version, int width, int height, int resolution, String name, String author, UUID authorUUID, String hash
) {
    public static final Codec<Painting> CODEC = RecordCodecBuilder.create(
            i -> i.group(
                            Codec.INT.fieldOf("version").forGetter(Painting::version),
                            Codec.INT.fieldOf("width").forGetter(Painting::width),
                            Codec.INT.fieldOf("height").forGetter(Painting::height),
                            Codec.INT.fieldOf("resolution").forGetter(Painting::resolution),
                            Codec.STRING.fieldOf("name").forGetter(Painting::name),
                            Codec.STRING.fieldOf("author").forGetter(Painting::author),
                            UUIDUtil.CODEC.fieldOf("authorUUID").forGetter(Painting::authorUUID),
                            Codec.STRING.fieldOf("hash").forGetter(Painting::hash)
                    )
                    .apply(i, Painting::new)
    );
    public static final StreamCodec<ByteBuf, Painting> STREAM_CODEC = ByteBufCodecs.fromCodec(CODEC);
    public static final Identifier DEFAULT_IDENTIFIER = ArchitectureBlocks.locate("textures/block/frame/canvas.png");

   public Painting(int width, int height, int resolution, String name, String author, UUID authorUUID, String hash) {
        this(1, width, height, resolution, name, author, authorUUID, hash);
    }

    // $VF: Unable to simplify switch-on-enum, as the enum class was not able to be found.
    // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
    public Identifier location() {
        return ArchitectureBlocks.locate(this.authorUUID.toString() + "/" + this.hash);
    }
    public Painting withHash(String newHash) {
        return new Painting(
                this.width(),
                this.height(),
                this.resolution(),
                this.name(),
                this.author(),
                this.authorUUID(),
                newHash
        );
    }
}
