package com.snackhole.simpledimensionalores.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreGemBase extends BlockOreBase {
    private Item itemDropped;
    private int quantityDroppedBase;
    private int quantityDroppedBaseRandomCeil;

    public BlockOreGemBase(String name, String oreName, Item itemDropped, int quantityDroppedBase) {
        super(name, oreName);
        this.itemDropped = itemDropped;
        this.quantityDroppedBase = quantityDroppedBase;
        this.quantityDroppedBaseRandomCeil = 0;
    }

    public BlockOreGemBase(String name, String oreName, Item itemDropped, int quantityDroppedBase, int quantityDroppedBaseRandomCeil) {
        this(name, oreName, itemDropped, quantityDroppedBase);
        this.quantityDroppedBaseRandomCeil = quantityDroppedBaseRandomCeil;
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
}
