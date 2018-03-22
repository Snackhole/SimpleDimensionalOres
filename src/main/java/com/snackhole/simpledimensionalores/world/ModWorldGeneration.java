package com.snackhole.simpledimensionalores.world;

import com.snackhole.simpledimensionalores.block.ModBlocks;
import net.minecraft.block.state.IBlockState;
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
        generateOre(ModBlocks.netherOreCoal.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 127, 17, 17);
    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

    }

    private void generateOre(IBlockState oreBlockToGenerate, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {
            BlockPos blockPos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(oreBlockToGenerate, size);
            generator.generate(world, random, blockPos);
        }
    }
}
