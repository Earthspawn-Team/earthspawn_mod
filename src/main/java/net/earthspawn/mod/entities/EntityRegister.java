package net.earthspawn.mod.entities;

import net.earthspawn.mod.EarthspawnMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegister {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, EarthspawnMod.MOD_ID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ENTITY_TYPES.register(bus);
    }

    //entities
    public static final RegistryObject<EntityType<OuliskEntity>> OULISK_ENTITY = ENTITY_TYPES.register("oulisk",
            () -> EntityType.Builder.create(OuliskEntity::new, EntityClassification.CREATURE)
                    .size(1.0F, 1.25F)
                    .build(new ResourceLocation(EarthspawnMod.MOD_ID, "oulisk").toString()));

    public static final RegistryObject<EntityType<BansheeEntity>> BANSHEE_ENTITY = ENTITY_TYPES.register("banshee",
            () -> EntityType.Builder.create(BansheeEntity::new, EntityClassification.CREATURE)
                    .size(1.0F, 1.0F)
                    .build(new ResourceLocation(EarthspawnMod.MOD_ID, "banshee").toString()));

    public static final RegistryObject<EntityType<CrystalStalkerEntity>> CRYSTAL_STALKER_ENTITY = ENTITY_TYPES.register("crystal_stalker",
            () -> EntityType.Builder.create(CrystalStalkerEntity::new, EntityClassification.CREATURE)
                    .size(1.0F, 1.25F)
                    .build(new ResourceLocation(EarthspawnMod.MOD_ID, "crystal_stalker").toString()));
}
