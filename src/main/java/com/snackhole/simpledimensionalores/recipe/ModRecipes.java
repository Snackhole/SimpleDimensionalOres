package com.snackhole.simpledimensionalores.recipe;

import com.snackhole.simpledimensionalores.block.ModBlocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        ModBlocks.netherOreIron.initOreDict();
        ModBlocks.netherOreGold.initOreDict();
        ModBlocks.endOreGold.initOreDict();
        ModBlocks.endOreIron.initOreDict();
        GameRegistry.addSmelting(ModBlocks.netherOreIron, new ItemStack(Items.IRON_INGOT), (float) 0.7);
        GameRegistry.addSmelting(ModBlocks.netherOreGold, new ItemStack(Items.GOLD_INGOT), (float) 1);
        GameRegistry.addSmelting(ModBlocks.endOreIron, new ItemStack(Items.IRON_INGOT), (float) 0.7);
        GameRegistry.addSmelting(ModBlocks.endOreGold, new ItemStack(Items.GOLD_INGOT), (float) 1);
    }
}
