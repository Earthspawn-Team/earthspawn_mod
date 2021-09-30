package net.earthspawn.mod;

import net.earthspawn.mod.core.init.BlockInit;
import net.earthspawn.mod.core.init.FeatureInit;
import net.earthspawn.mod.core.init.ItemInit;
import net.earthspawn.mod.core.itemgroup.EarthspawnModItemgroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(EarthspawnMod.MOD_ID)
@Mod.EventBusSubscriber(modid = EarthspawnMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthspawnMod
{
    public static final String MOD_ID = "earthspawn";
    private static final Logger LOGGER = LogManager.getLogger();

    public EarthspawnMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event){
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
        event.getRegistry().register(new BlockItem(block, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)).setRegistryName(block.getRegistryName()));
        });
    }
}