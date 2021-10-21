package net.earthspawn.mod.utils;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.entities.BansheeEntity;
import net.earthspawn.mod.entities.CrystalStalkerEntity;
import net.earthspawn.mod.entities.EntityRegister;
import net.earthspawn.mod.entities.OuliskEntity;
import net.earthspawn.mod.entities.renderer.BansheeEntityRenderer;
import net.earthspawn.mod.entities.renderer.CrystalStalkerRenderer;
import net.earthspawn.mod.entities.renderer.OuliskEntityRenderer;
import net.earthspawn.mod.items.spawneggs.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = EarthspawnMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.OULISK_ENTITY.get(), OuliskEntityRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.BANSHEE_ENTITY.get(), BansheeEntityRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRegister.CRYSTAL_STALKER_ENTITY.get(), CrystalStalkerRenderer::new);
    }

    @SubscribeEvent
    public static void entityAttributesSetup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(EntityRegister.OULISK_ENTITY.get(), OuliskEntity.setCustomAttributes().create());
        });

        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(EntityRegister.BANSHEE_ENTITY.get(), BansheeEntity.setCustomAttributes().create());
        });

        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(EntityRegister.CRYSTAL_STALKER_ENTITY.get(), CrystalStalkerEntity.setCustomAttributes().create());
        });
        }

    //SpawnEgg

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
