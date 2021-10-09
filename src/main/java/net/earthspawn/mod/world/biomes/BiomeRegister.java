package net.earthspawn.mod.world.biomes;

import net.earthspawn.mod.EarthspawnMod;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BiomeRegister {

    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, EarthspawnMod.MOD_ID);

    static
    {
        createBiome("hallow_plains", BiomeMaker::makeVoidBiome);
    }

    public static RegistryObject<Biome> createBiome(String name, Supplier<Biome> biome)
    {
        return BIOMES.register(name, biome);
    }

    public static RegistryKey<Biome> registryKey(String name)
    {
        return RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation(EarthspawnMod.MOD_ID, name));
    }

    public static void registerBiomes()
    {
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(HALLOW_PLAINS, 20));
    }

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BIOMES.register(bus);
        registerBiomes();
    }

    public static RegistryKey<Biome> HALLOW_PLAINS = registryKey("hallow_plains");
}
