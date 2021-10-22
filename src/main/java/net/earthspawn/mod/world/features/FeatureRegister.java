package net.earthspawn.mod.world.features;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.world.features.states.HallowBiomeFeature;
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

    public static final RegistryObject<HallowBiomeFeature> GLADIOLUS_FEATURE = FEATURES.register("gladiolus_feature",
            () -> new HallowBiomeFeature(NoFeatureConfig.field_236558_a_));

    public static final RegistryObject<HallowBiomeFeature> AMARYLLIS = FEATURES.register("amaryllis_feature",
            () -> new HallowBiomeFeature(NoFeatureConfig.field_236558_a_));

    public static final RegistryObject<HallowBiomeFeature> HALLOW_ROOTS_FEATURE = FEATURES.register("hallow_roots_feature",
            () -> new HallowBiomeFeature(NoFeatureConfig.field_236558_a_));
}
