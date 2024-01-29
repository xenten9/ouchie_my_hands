package net.redstonerazor.simplefruits.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.redstonerazor.simplefruits.SimpleFruits;
import net.redstonerazor.simplefruits.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup FRUITS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SimpleFruits.MOD_ID, "fruits"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fruits"))
                    .icon(() -> new ItemStack(ModItems.BANANA)).entries((displayContext, entries) -> {
                        entries.add(Items.APPLE);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModItems.BANANA);
                        entries.add(ModItems.PEAR);
                        entries.add(ModItems.FIG);
                        entries.add(ModItems.PLUM);
                        entries.add(ModItems.CHERRY);
                        entries.add(ModItems.POISON_APPLE);
                        entries.add(Items.GOLDEN_APPLE);
                        entries.add(ModItems.GOLDEN_ORANGE);
                        entries.add(ModItems.GOLDEN_BANANA);
                        entries.add(ModItems.GOLDEN_PEAR);
                        entries.add(ModItems.GOLDEN_FIG);
                        entries.add(ModItems.GOLDEN_PLUM);
                        entries.add(ModItems.GOLDEN_CHERRY);
                        entries.add(ModBlocks.APPLE_CRATE);
                        entries.add(ModBlocks.ORANGE_CRATE);
                        entries.add(ModBlocks.BANANA_CRATE);
                        entries.add(ModBlocks.PEAR_CRATE);
                        entries.add(ModBlocks.FIG_CRATE);
                        entries.add(ModBlocks.PLUM_CRATE);
                        entries.add(ModBlocks.CHERRY_BAG);
                    }).build());
    public static void registerItemGroups() {
        SimpleFruits.LOGGER.info("Registering item groups for " + SimpleFruits.MOD_ID);
    }
}
