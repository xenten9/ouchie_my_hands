package net.redstonerazor.simplefruits.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redstonerazor.simplefruits.SimpleFruits;

public class ModItems {
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings()));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings()));

    private static void addItemsToConsumablesItemGroup(FabricItemGroupEntries entries) {
        entries.add(BANANA);
        entries.add(ORANGE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleFruits.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SimpleFruits.LOGGER.info("Registering mod items for " + SimpleFruits.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToConsumablesItemGroup);
    }
}
