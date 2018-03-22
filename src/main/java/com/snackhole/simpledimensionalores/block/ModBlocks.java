package com.snackhole.simpledimensionalores.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static BlockOreBase netherOreCoal = new BlockOreGemBase("nether_ore_coal", "oreCoal", Items.COAL, 1, 0, 2).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase netherOreIron = new BlockOreBase("nether_ore_iron", "oreIron").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase netherOreLapis = new BlockOreGemBase("nether_ore_lapis", "oreLapis", Items.DYE, 4, 2, 5, 5, EnumDyeColor.BLUE.getDyeDamage()).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase netherOreGold = new BlockOreBase("nether_ore_gold", "oreGold").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase netherOreDiamond = new BlockOreGemBase("nether_ore_diamond", "oreDiamond", Items.DIAMOND, 1, 3, 7).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase netherOreRedstone = new BlockOreGemBase("nether_ore_redstone", "oreRedstone", Items.REDSTONE, 4, 1, 5, 2).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase netherOreEmerald = new BlockOreGemBase("nether_ore_emerald", "oreEmerald", Items.EMERALD, 1, 3, 7).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase endOreCoal = new BlockOreGemBase("end_ore_coal", "oreCoal", Items.COAL, 1, 0, 2).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase endOreIron = new BlockOreBase("end_ore_iron", "oreIron").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase endOreLapis = new BlockOreGemBase("end_ore_lapis", "oreLapis", Items.DYE, 4, 2, 5, 5, EnumDyeColor.BLUE.getDyeDamage()).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase endOreGold = new BlockOreBase("end_ore_gold", "oreGold").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase endOreDiamond = new BlockOreGemBase("end_ore_diamond", "oreDiamond", Items.DIAMOND, 1, 3, 7).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase endOreRedstone = new BlockOreGemBase("end_ore_redstone", "oreRedstone", Items.REDSTONE, 4, 1, 5, 2).setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOreBase endOreEmerald = new BlockOreGemBase("end_ore_emerald", "oreEmerald", Items.EMERALD, 1, 3, 7).setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(netherOreCoal, netherOreIron, netherOreLapis, netherOreGold, netherOreDiamond, netherOreRedstone, netherOreEmerald, endOreCoal, endOreIron, endOreLapis, endOreGold, endOreDiamond, endOreRedstone, endOreEmerald);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(netherOreCoal.createItemBlock(), netherOreIron.createItemBlock(), netherOreLapis.createItemBlock(), netherOreGold.createItemBlock(), netherOreDiamond.createItemBlock(), netherOreRedstone.createItemBlock(), netherOreEmerald.createItemBlock(), endOreCoal.createItemBlock(), endOreIron.createItemBlock(), endOreLapis.createItemBlock(), endOreGold.createItemBlock(), endOreDiamond.createItemBlock(), endOreRedstone.createItemBlock(), endOreEmerald.createItemBlock());
    }

    public static void registerModels() {
        netherOreCoal.registerItemModel(Item.getItemFromBlock(netherOreCoal));
        netherOreIron.registerItemModel(Item.getItemFromBlock(netherOreIron));
        netherOreLapis.registerItemModel(Item.getItemFromBlock(netherOreLapis));
        netherOreGold.registerItemModel(Item.getItemFromBlock(netherOreGold));
        netherOreDiamond.registerItemModel(Item.getItemFromBlock(netherOreDiamond));
        netherOreRedstone.registerItemModel(Item.getItemFromBlock(netherOreRedstone));
        netherOreEmerald.registerItemModel(Item.getItemFromBlock(netherOreEmerald));
        endOreCoal.registerItemModel(Item.getItemFromBlock(endOreCoal));
        endOreIron.registerItemModel(Item.getItemFromBlock(endOreIron));
        endOreLapis.registerItemModel(Item.getItemFromBlock(endOreLapis));
        endOreGold.registerItemModel(Item.getItemFromBlock(endOreGold));
        endOreDiamond.registerItemModel(Item.getItemFromBlock(endOreDiamond));
        endOreRedstone.registerItemModel(Item.getItemFromBlock(endOreRedstone));
        endOreEmerald.registerItemModel(Item.getItemFromBlock(endOreEmerald));
    }
}
