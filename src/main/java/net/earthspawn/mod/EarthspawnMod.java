package net.earthspawn.mod;

import net.earthspawn.mod.blocks.BlockRegister;
import net.earthspawn.mod.entities.EntityRegister;
import net.earthspawn.mod.items.ItemRegister;
import net.earthspawn.mod.world.biomes.BiomeRegister;
import net.earthspawn.mod.world.features.FeatureRegister;
import net.earthspawn.mod.world.features.OreGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;

@Mod(EarthspawnMod.MOD_ID)
public class EarthspawnMod
{
    public static final String MOD_ID = "earthspawn";

    public EarthspawnMod() {
        BlockRegister.init();
        ItemRegister.init();
        EntityRegister.init();
        BiomeRegister.init();
        FeatureRegister.init();

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGen::addOres);
        MinecraftForge.EVENT_BUS.register(this);
    }
}