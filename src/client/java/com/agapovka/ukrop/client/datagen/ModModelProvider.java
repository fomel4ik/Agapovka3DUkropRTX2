package com.agapovka.ukrop.client.datagen;



import com.agapovka.ukrop.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(net.minecraft.client.data.models.BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(net.minecraft.client.data.models.ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.ALPHA_WOODEN_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
