package com.agapovka.ukrop.item;

import com.agapovka.ukrop.Agapovka3DUkropRTX2;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import java.util.function.Function;

public class ModItems {

    public static final Item ALPHA_WOODEN_AXE = registerItem("alpha_wooden_axe", properties ->
            new Item(properties.axe(ToolMaterial.WOOD, 1.4f,18.0f)));



    private static Item registerItem(String name, Function<Item.Properties, Item> function) { // хелпер для рега итемов
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Agapovka3DUkropRTX2.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Agapovka3DUkropRTX2.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Agapovka3DUkropRTX2.LOGGER.info("Registering Mod Items for" + Agapovka3DUkropRTX2.MOD_ID);


    }
}
