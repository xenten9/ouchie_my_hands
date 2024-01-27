package net.redstonerazor.simplefruits.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.redstonerazor.simplefruits.SimpleFruits;

public class ModItems {
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item PEAR = registerItem("pear", new Item(new FabricItemSettings().food(ModFoodComponents.PEAR)));
    public static final Item FIG = registerItem("fig", new Item(new FabricItemSettings().food(ModFoodComponents.FIG)));
    public static final Item PLUM = registerItem("plum", new Item(new FabricItemSettings().food(ModFoodComponents.PLUM)));
    public static final Item GOLDEN_BANANA = registerItem("golden_banana", new Item(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.GOLDEN_BANANA)));
    public static final Item GOLDEN_ORANGE = registerItem("golden_orange", new Item(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.GOLDEN_ORANGE)));
    public static final Item GOLDEN_PEAR = registerItem("golden_pear", new Item(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.GOLDEN_PEAR)));
    public static final Item GOLDEN_FIG = registerItem("golden_fig", new Item(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.GOLDEN_FIG)));
    public static final Item GOLDEN_PLUM = registerItem("golden_plum", new Item(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.GOLDEN_PLUM)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleFruits.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SimpleFruits.LOGGER.info("Registering mod items for " + SimpleFruits.MOD_ID);
    }
}
