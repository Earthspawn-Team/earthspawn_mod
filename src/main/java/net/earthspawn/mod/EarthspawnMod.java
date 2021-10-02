package net.earthspawn.mod;

import net.earthspawn.mod.entities.TestEntity;
import net.earthspawn.mod.utils.RegistryHandler;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EarthspawnMod.MOD_ID)
public class EarthspawnMod
{
    public static final String MOD_ID = "earthspawn";
    private static final Logger LOGGER = LogManager.getLogger();

    public EarthspawnMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}