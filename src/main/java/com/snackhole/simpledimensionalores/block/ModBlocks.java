package com.snackhole.simpledimensionalores.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    //nether coal
    public static BlockOreBase netherOreIron = new BlockOreBase("nether_ore_iron", "oreIron").setCreativeTab(CreativeTabs.MATERIALS);
    //nether lapis
    public static BlockOreBase netherOreGold = new BlockOreBase("nether_ore_gold", "oreGold").setCreativeTab(CreativeTabs.MATERIALS);
    //nether diamond
    //nether redstone
    //nether emerald
    //end coal
    public static BlockOreBase endOreIron = new BlockOreBase("end_ore_iron", "oreIron").setCreativeTab(CreativeTabs.MATERIALS);
    //end lapis
    public static BlockOreBase endOreGold = new BlockOreBase("end_ore_gold", "oreGold").setCreativeTab(CreativeTabs.MATERIALS);
    //end diamond
    //end redstone
    //end emerald

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(netherOreIron, netherOreGold, endOreIron, endOreGold);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(netherOreIron.createItemBlock(), netherOreGold.createItemBlock(), endOreIron.createItemBlock(), endOreGold.createItemBlock());
    }

    public static void registerModels() {
        netherOreIron.registerItemModel(Item.getItemFromBlock(netherOreIron));
        netherOreGold.registerItemModel(Item.getItemFromBlock(netherOreGold));
        endOreIron.registerItemModel(Item.getItemFromBlock(endOreIron));
        endOreGold.registerItemModel(Item.getItemFromBlock(endOreGold));
    }
}
