package net.earthspawn.mod.world.features;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.world.features.states.HallowRootsFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureRegister {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, EarthspawnMod.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();;
        FEATURES.register(bus);
    }

    public static final RegistryObject<HallowRootsFeature> HALLOW_ROOTS_FEATURE = FEATURES.register("hallow_roots_feature",
            () -> new HallowRootsFeature(NoFeatureConfig.field_236558_a_));
}
