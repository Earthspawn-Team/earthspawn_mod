package net.earthspawn.mod;

import net.earthspawn.mod.utils.RegistryHandler;
import net.earthspawn.mod.world.features.OreGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EarthspawnMod.MOD_ID)
public class EarthspawnMod
{
    public static final String MOD_ID = "earthspawn";
    private static final Logger LOGGER = LogManager.getLogger();

    public EarthspawnMod() {
        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGen::addOres);
        MinecraftForge.EVENT_BUS.register(this);
    }
}