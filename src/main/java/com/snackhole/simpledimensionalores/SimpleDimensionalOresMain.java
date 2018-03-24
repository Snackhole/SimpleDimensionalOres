package com.snackhole.simpledimensionalores;

import com.snackhole.simpledimensionalores.block.ModBlocks;
import com.snackhole.simpledimensionalores.proxy.IProxy;
import com.snackhole.simpledimensionalores.recipe.ModRecipes;
import com.snackhole.simpledimensionalores.world.ModWorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SimpleDimensionalOresMain.MODID, version = SimpleDimensionalOresMain.VERSION)
public class SimpleDimensionalOresMain {
    public static final String MODID = "simpledimensionalores";
    public static final String VERSION = "2";
    @SidedProxy(clientSide = "com.snackhole.simpledimensionalores.proxy.ClientProxy", serverSide = "com.snackhole.simpledimensionalores.proxy.ServerProxy")
    public static IProxy proxy;
    @Mod.Instance
    public static SimpleDimensionalOresMain simpleDimensionalOresMainInstance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 0);
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public SimpleDimensionalOresMain() {
        simpleDimensionalOresMainInstance = this;
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ModBlocks.registerModels();
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }
    }
}
