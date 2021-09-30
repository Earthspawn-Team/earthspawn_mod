package net.earthspawn.mod.core.init;

import net.earthspawn.mod.EarthspawnMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {

    public static final DeferredRegister<EntityType<?>> ENTiTY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, EarthspawnMod.MOD_ID);
}
