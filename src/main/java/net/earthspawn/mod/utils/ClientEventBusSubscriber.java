package net.earthspawn.mod.utils;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.entities.renderer.TestEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = EarthspawnMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.TEST_ENTITY.get(), TestEntityRenderer::new);
    }
}
