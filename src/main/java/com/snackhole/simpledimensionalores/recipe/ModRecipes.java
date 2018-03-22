package com.snackhole.simpledimensionalores.recipe;

import com.snackhole.simpledimensionalores.block.ModBlocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        ModBlocks.netherOreCoal.initOreDict();
        ModBlocks.netherOreIron.initOreDict();
        ModBlocks.netherOreLapis.initOreDict();
        ModBlocks.netherOreGold.initOreDict();
        ModBlocks.netherOreDiamond.initOreDict();
        ModBlocks.netherOreRedstone.initOreDict();
        ModBlocks.netherOreEmerald.initOreDict();
        ModBlocks.endOreCoal.initOreDict();
        ModBlocks.endOreIron.initOreDict();
        ModBlocks.endOreLapis.initOreDict();
        ModBlocks.endOreGold.initOreDict();
        ModBlocks.endOreDiamond.initOreDict();
        ModBlocks.endOreRedstone.initOreDict();
        ModBlocks.endOreEmerald.initOreDict();
        GameRegistry.addSmelting(ModBlocks.netherOreCoal, new ItemStack(Items.COAL), (float) 0.1);
        GameRegistry.addSmelting(ModBlocks.netherOreIron, new ItemStack(Items.IRON_INGOT), (float) 0.7);
        GameRegistry.addSmelting(ModBlocks.netherOreLapis, new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage()), (float) 0.2);
        GameRegistry.addSmelting(ModBlocks.netherOreGold, new ItemStack(Items.GOLD_INGOT), (float) 1);
        GameRegistry.addSmelting(ModBlocks.netherOreDiamond, new ItemStack(Items.DIAMOND), (float) 1);
        GameRegistry.addSmelting(ModBlocks.netherOreRedstone, new ItemStack(Items.REDSTONE), (float) 0.7);
        GameRegistry.addSmelting(ModBlocks.netherOreEmerald, new ItemStack(Items.EMERALD), (float) 1);
        GameRegistry.addSmelting(ModBlocks.endOreCoal, new ItemStack(Items.COAL), (float) 0.1);
        GameRegistry.addSmelting(ModBlocks.endOreIron, new ItemStack(Items.IRON_INGOT), (float) 0.7);
        GameRegistry.addSmelting(ModBlocks.endOreLapis, new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage()), (float) 0.2);
        GameRegistry.addSmelting(ModBlocks.endOreGold, new ItemStack(Items.GOLD_INGOT), (float) 1);
        GameRegistry.addSmelting(ModBlocks.endOreDiamond, new ItemStack(Items.DIAMOND), (float) 1);
        GameRegistry.addSmelting(ModBlocks.endOreRedstone, new ItemStack(Items.REDSTONE), (float) 0.7);
        GameRegistry.addSmelting(ModBlocks.endOreEmerald, new ItemStack(Items.EMERALD), (float) 1);
    }
}
