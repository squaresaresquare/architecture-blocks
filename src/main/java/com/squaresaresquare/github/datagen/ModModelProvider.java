package com.squaresaresquare.github.datagen;
// For generating block and item models, see https://github.com/Tutorials-By-Kaupenjoe/Fabric-Tutorial-26.X/blob/28-paintings/src/main/java/net/kaupenjoe/tutorialmod/datagen/ModModelProvider.java
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import org.jetbrains.annotations.NotNull;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NotNull BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(@NotNull ItemModelGenerators itemModelGenerators) {

    }
}
