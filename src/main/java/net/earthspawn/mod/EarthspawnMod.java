package net.earthspawn.mod;

import net.earthspawn.mod.itemgroup.EarthspawnModItemgroup;
import net.earthspawn.mod.utils.RegistryHandler;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EarthspawnMod.MOD_ID)
@Mod.EventBusSubscriber(modid = EarthspawnMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthspawnMod
{
    public static final String MOD_ID = "earthspawn";
    private static final Logger LOGGER = LogManager.getLogger();

    public EarthspawnMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void createBlocksItems(final RegistryEvent.Register<Item> event){
        RegistryHandler.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
        event.getRegistry().register(new BlockItem(block, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)).setRegistryName(block.getRegistryName()));
        });
    }
}