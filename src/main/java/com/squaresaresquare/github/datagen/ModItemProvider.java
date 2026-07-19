package com.squaresaresquare.github.datagen;


import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import org.jetbrains.annotations.NotNull;

public class ModItemProvider extends FabricModelProvider {
    public ModItemProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NotNull BlockModelGenerators blockModelGenerators) {
        //needed but not used
    }

    @Override
    public void generateItemModels(@NotNull ItemModelGenerators itemModelGenerators) {

    }
}
