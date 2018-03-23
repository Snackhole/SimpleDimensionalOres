package com.snackhole.simpledimensionalores.world;

import com.snackhole.simpledimensionalores.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGeneration implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int dimID = world.provider.getDimension();
        switch (dimID) {
            case -1:
                generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                break;
            case 1:
                generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                break;
        }
    }

    private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ModBlocks.netherOreCoal.getDefaultState(), Blocks.NETHERRACK, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 20, 20);
        generateOre(ModBlocks.netherOreDiamond.getDefaultState(), Blocks.NETHERRACK, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 11, 2);
        generateOre(ModBlocks.netherOreEmerald.getDefaultState(), Blocks.NETHERRACK, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 6, 2);
        generateOre(ModBlocks.netherOreGold.getDefaultState(), Blocks.NETHERRACK, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 12, 4);
        generateOre(ModBlocks.netherOreIron.getDefaultState(), Blocks.NETHERRACK, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 12, 20);
        generateOre(ModBlocks.netherOreLapis.getDefaultState(), Blocks.NETHERRACK, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 10, 2);
        generateOre(ModBlocks.netherOreRedstone.getDefaultState(), Blocks.NETHERRACK, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 11, 10);
    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ModBlocks.endOreCoal.getDefaultState(), Blocks.END_STONE, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 22, 20);
        generateOre(ModBlocks.endOreDiamond.getDefaultState(), Blocks.END_STONE, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 13, 4);
        generateOre(ModBlocks.endOreEmerald.getDefaultState(), Blocks.END_STONE, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 8, 4);
        generateOre(ModBlocks.endOreGold.getDefaultState(), Blocks.END_STONE, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 14, 6);
        generateOre(ModBlocks.endOreIron.getDefaultState(), Blocks.END_STONE, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 14, 20);
        generateOre(ModBlocks.endOreLapis.getDefaultState(), Blocks.END_STONE, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 12, 4);
        generateOre(ModBlocks.endOreRedstone.getDefaultState(), Blocks.END_STONE, world, random, chunkX * 16, chunkZ * 16, 0, world.getActualHeight(), 13, 12);
    }

    private void generateOre(IBlockState oreBlockToGenerate, Block blockToReplace, World world, Random random, int x, int z, int minY, int maxY, int veinSize, int chances) {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {
            BlockPos blockPos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(oreBlockToGenerate, veinSize, BlockMatcher.forBlock(blockToReplace));
            generator.generate(world, random, blockPos);
        }
    }
}
