package com.snackhole.simpledimensionalores.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockOreGemBase extends BlockOreBase {
    private Item itemDropped;
    private int quantityDroppedBase;
    private int quantityDroppedBaseRandomCeil;
    private int expMin;
    private int expMax;
    private int damageDroppedValue;

    public BlockOreGemBase(String name, String oreName, int harvestLevel, Item itemDropped, int quantityDroppedBase, int expMin, int expMax) {
        super(name, oreName, harvestLevel);
        this.itemDropped = itemDropped;
        this.quantityDroppedBase = quantityDroppedBase;
        this.expMin = expMin;
        this.expMax = expMax;
        this.quantityDroppedBaseRandomCeil = 0;
    }

    public BlockOreGemBase(String name, String oreName, int harvestLevel, Item itemDropped, int quantityDroppedBase, int expMin, int expMax, int quantityDroppedBaseRandomCeil) {
        this(name, oreName, harvestLevel, itemDropped, quantityDroppedBase, expMin, expMax);
        this.quantityDroppedBaseRandomCeil = quantityDroppedBaseRandomCeil;
    }

    public BlockOreGemBase(String name, String oreName, int harvestLevel, Item itemDropped, int quantityDroppedBase, int expMin, int expMax, int quantityDroppedBaseRandomCeil, int damageDroppedValue) {
        this(name, oreName, harvestLevel, itemDropped, quantityDroppedBase, expMin, expMax, quantityDroppedBaseRandomCeil);
        this.damageDroppedValue = damageDroppedValue;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return itemDropped;
    }

    @Override
    public int quantityDropped(Random random) {
        return quantityDroppedBase + (quantityDroppedBaseRandomCeil > 0 ? random.nextInt(quantityDroppedBaseRandomCeil) : 0);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0) {
            int j = random.nextInt(fortune + 2) - 1;
            if (j < 0) {
                j = 0;
            }
            return quantityDropped(random) * (j + 1);
        } else {
            return quantityDropped(random);
        }
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        Random rand = world instanceof World ? ((World) world).rand : new Random();
        return MathHelper.getInt(rand, expMin, expMax);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return damageDroppedValue;
    }
}
