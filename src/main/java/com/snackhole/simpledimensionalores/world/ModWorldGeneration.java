package com.snackhole.simpledimensionalores.world;

import com.snackhole.simpledimensionalores.block.ModBlocks;
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
    private WorldGenMinable netherOreCoalGen = new WorldGenMinable(ModBlocks.netherOreCoal.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.NETHERRACK));
    private WorldGenMinable netherOreDiamondGen = new WorldGenMinable(ModBlocks.netherOreDiamond.getDefaultState(), 11, BlockMatcher.forBlock(Blocks.NETHERRACK));
    private WorldGenMinable netherOreEmeraldGen = new WorldGenMinable(ModBlocks.netherOreEmerald.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK));
    private WorldGenMinable netherOreGoldGen = new WorldGenMinable(ModBlocks.netherOreGold.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.NETHERRACK));
    private WorldGenMinable netherOreIronGen = new WorldGenMinable(ModBlocks.netherOreIron.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.NETHERRACK));
    private WorldGenMinable netherOreLapisGen = new WorldGenMinable(ModBlocks.netherOreLapis.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.NETHERRACK));
    private WorldGenMinable netherOreRedstoneGen = new WorldGenMinable(ModBlocks.netherOreRedstone.getDefaultState(), 11, BlockMatcher.forBlock(Blocks.NETHERRACK));
    private WorldGenMinable endOreCoalGen = new WorldGenMinable(ModBlocks.endOreCoal.getDefaultState(), 22, BlockMatcher.forBlock(Blocks.END_STONE));
    private WorldGenMinable endOreDiamondGen = new WorldGenMinable(ModBlocks.endOreDiamond.getDefaultState(), 13, BlockMatcher.forBlock(Blocks.END_STONE));
    private WorldGenMinable endOreEmeraldGen = new WorldGenMinable(ModBlocks.endOreEmerald.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.END_STONE));
    private WorldGenMinable endOreGoldGen = new WorldGenMinable(ModBlocks.endOreGold.getDefaultState(), 14, BlockMatcher.forBlock(Blocks.END_STONE));
    private WorldGenMinable endOreIronGen = new WorldGenMinable(ModBlocks.endOreIron.getDefaultState(), 14, BlockMatcher.forBlock(Blocks.END_STONE));
    private WorldGenMinable endOreLapisGen = new WorldGenMinable(ModBlocks.endOreLapis.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.END_STONE));
    private WorldGenMinable endOreRedstoneGen = new WorldGenMinable(ModBlocks.endOreRedstone.getDefaultState(), 13, BlockMatcher.forBlock(Blocks.END_STONE));

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
        int actualHeight = world.getActualHeight();
        generateOre(netherOreCoalGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 20);
        generateOre(netherOreDiamondGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 2);
        generateOre(netherOreEmeraldGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 2);
        generateOre(netherOreGoldGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 4);
        generateOre(netherOreIronGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 20);
        generateOre(netherOreLapisGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 2);
        generateOre(netherOreRedstoneGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 10);
    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int actualHeight = world.getActualHeight();
        generateOre(endOreCoalGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 20);
        generateOre(endOreDiamondGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 4);
        generateOre(endOreEmeraldGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 4);
        generateOre(endOreGoldGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 6);
        generateOre(endOreIronGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 20);
        generateOre(endOreLapisGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 4);
        generateOre(endOreRedstoneGen, world, random, chunkX * 16, chunkZ * 16, 0, actualHeight, 12);
    }

    private void generateOre(WorldGenMinable generator, World world, Random random, int x, int z, int minY, int maxY, int chances) {
        int deltaY = maxY - minY;
        for (int i = 0; i < chances; i++) {
            BlockPos blockPos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            generator.generate(world, random, blockPos);
        }
    }
}
