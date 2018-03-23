package com.snackhole.simpledimensionalores.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static BlockOreBase netherOreCoal = new BlockOreGemBase("nether_ore_coal", "oreCoal", 0, Items.COAL, 1, 0, 2).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase netherOreDiamond = new BlockOreGemBase("nether_ore_diamond", "oreDiamond", 2, Items.DIAMOND, 1, 3, 7).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase netherOreEmerald = new BlockOreGemBase("nether_ore_emerald", "oreEmerald", 2, Items.EMERALD, 1, 3, 7).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase netherOreGold = new BlockOreBase("nether_ore_gold", "oreGold", 2).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase netherOreIron = new BlockOreBase("nether_ore_iron", "oreIron", 1).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase netherOreLapis = new BlockOreGemBase("nether_ore_lapis", "oreLapis", 1, Items.DYE, 4, 2, 5, 5, EnumDyeColor.BLUE.getDyeDamage()).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase netherOreRedstone = new BlockOreGemBase("nether_ore_redstone", "oreRedstone", 2, Items.REDSTONE, 4, 1, 5, 2).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase endOreCoal = new BlockOreGemBase("end_ore_coal", "oreCoal", 0, Items.COAL, 1, 0, 2).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase endOreDiamond = new BlockOreGemBase("end_ore_diamond", "oreDiamond", 2, Items.DIAMOND, 1, 3, 7).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase endOreEmerald = new BlockOreGemBase("end_ore_emerald", "oreEmerald", 2, Items.EMERALD, 1, 3, 7).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase endOreGold = new BlockOreBase("end_ore_gold", "oreGold", 2).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase endOreIron = new BlockOreBase("end_ore_iron", "oreIron", 1).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase endOreLapis = new BlockOreGemBase("end_ore_lapis", "oreLapis", 1, Items.DYE, 4, 2, 5, 5, EnumDyeColor.BLUE.getDyeDamage()).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static BlockOreBase endOreRedstone = new BlockOreGemBase("end_ore_redstone", "oreRedstone", 2, Items.REDSTONE, 4, 1, 5, 2).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(netherOreCoal, netherOreDiamond, netherOreEmerald, netherOreGold, netherOreIron, netherOreLapis, netherOreRedstone, endOreCoal, endOreDiamond, endOreEmerald, endOreGold, endOreIron, endOreLapis, endOreRedstone);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(netherOreCoal.createItemBlock(), netherOreDiamond.createItemBlock(), netherOreEmerald.createItemBlock(), netherOreGold.createItemBlock(), netherOreIron.createItemBlock(), netherOreLapis.createItemBlock(), netherOreRedstone.createItemBlock(), endOreCoal.createItemBlock(), endOreDiamond.createItemBlock(), endOreEmerald.createItemBlock(), endOreGold.createItemBlock(), endOreIron.createItemBlock(), endOreLapis.createItemBlock(), endOreRedstone.createItemBlock());
    }

    public static void registerModels() {
        netherOreCoal.registerItemModel(Item.getItemFromBlock(netherOreCoal));
        netherOreDiamond.registerItemModel(Item.getItemFromBlock(netherOreDiamond));
        netherOreEmerald.registerItemModel(Item.getItemFromBlock(netherOreEmerald));
        netherOreGold.registerItemModel(Item.getItemFromBlock(netherOreGold));
        netherOreIron.registerItemModel(Item.getItemFromBlock(netherOreIron));
        netherOreLapis.registerItemModel(Item.getItemFromBlock(netherOreLapis));
        netherOreRedstone.registerItemModel(Item.getItemFromBlock(netherOreRedstone));
        endOreCoal.registerItemModel(Item.getItemFromBlock(endOreCoal));
        endOreDiamond.registerItemModel(Item.getItemFromBlock(endOreDiamond));
        endOreEmerald.registerItemModel(Item.getItemFromBlock(endOreEmerald));
        endOreGold.registerItemModel(Item.getItemFromBlock(endOreGold));
        endOreIron.registerItemModel(Item.getItemFromBlock(endOreIron));
        endOreLapis.registerItemModel(Item.getItemFromBlock(endOreLapis));
        endOreRedstone.registerItemModel(Item.getItemFromBlock(endOreRedstone));
    }
}
