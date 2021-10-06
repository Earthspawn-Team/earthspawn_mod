package net.earthspawn.mod.utils;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.entities.BansheeEntity;
import net.earthspawn.mod.entities.OuliskEntity;
import net.earthspawn.mod.entities.renderer.BansheeEntityRenderer;
import net.earthspawn.mod.entities.renderer.OuliskEntityRenderer;
import net.earthspawn.mod.entities.renderer.OuliskLayerRenderer;
import net.earthspawn.mod.items.spawneggs.ModSpawnEggItem;
import net.minecraft.entity.Entity;
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
    public static void clientSetup(FMLClientSetupEvent event){
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.OULISK_ENTITY.get(), OuliskEntityRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.BANSHEE_ENTITY.get(), BansheeEntityRenderer::new);
    }

    @SubscribeEvent
    public static void entityAttributesSetup(final FMLCommonSetupEvent event){
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(RegistryHandler.OULISK_ENTITY.get(), OuliskEntity.setCustomAttributes().create());
        });
            DeferredWorkQueue.runLater(() -> {
                GlobalEntityTypeAttributes.put(RegistryHandler.BANSHEE_ENTITY.get(), OuliskEntity.setCustomAttributes().create());
            });
        }

    //SpawnEgg

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
