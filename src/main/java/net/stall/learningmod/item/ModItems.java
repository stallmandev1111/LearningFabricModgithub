package net.stall.learningmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.stall.learningmod.Learning;

public class ModItems {

    public static final Item SWEETBERRY_JAM_BOTTLE = registeritem("sweetberry_jam_bottle",
            new SweetberryJamBottle(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(1.2f).build())));



    private static Item registeritem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Learning.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Learning.LOGGER.debug("Registering mod items for " + Learning.MOD_ID);
    }
}
