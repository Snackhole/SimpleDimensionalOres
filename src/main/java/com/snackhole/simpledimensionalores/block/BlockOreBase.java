package com.snackhole.simpledimensionalores.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOreBase extends BlockBase {
    private String oreName;

    public BlockOreBase(String name, String oreName) {
        super(Material.ROCK, name);
        this.oreName = oreName;
        setHardness((float) 3);
        setResistance((float) 5);
    }

    @Override
    public BlockOreBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }
}
