package net.earthspawn.mod;

import net.earthspawn.mod.utils.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EarthspawnMod.MOD_ID)
public class EarthspawnMod
{
    public static final String MOD_ID = "earthspawn";
    private static final Logger LOGGER = LogManager.getLogger();

    public EarthspawnMod() {
        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}