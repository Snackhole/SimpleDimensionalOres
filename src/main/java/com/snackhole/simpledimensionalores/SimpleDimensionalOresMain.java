package com.snackhole.simpledimensionalores;

import com.snackhole.simpledimensionalores.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SimpleDimensionalOresMain.MODID, version = SimpleDimensionalOresMain.VERSION)
public class SimpleDimensionalOresMain {
    public static final String MODID = "simpledimensionalores";
    public static final String VERSION = "1";
    @SidedProxy(clientSide = "com.snackhole.simpledimensionalores.proxy.ClientProxy", serverSide = "com.snackhole.simpledimensionalores.proxy.ServerProxy")
    public static IProxy proxy;
    @Mod.Instance
    public static SimpleDimensionalOresMain simpleDimensionalOresMainInstance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public SimpleDimensionalOresMain() {
        simpleDimensionalOresMainInstance = this;
    }
}
