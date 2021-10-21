package net.earthspawn.mod.blocks;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.blocks.states.*;
import net.earthspawn.mod.itemgroup.EarthspawnModItemgroup;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = EarthspawnMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegister {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EarthspawnMod.MOD_ID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
    }

    @SubscribeEvent
    public static void createBlocksItems(final RegistryEvent.Register<Item> event)
    {
        BlockRegister.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->
                event.getRegistry().register(new BlockItem(block, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)).setRegistryName(block.getRegistryName())));
    }

    //blocks
    public static final RegistryObject<Block> HALLOW_GRASS = BLOCKS.register("hallow_grass", HallowGrass::new);
    public static final RegistryObject<Block> HALLOW_DIRT = BLOCKS.register("hallow_dirt", HallowDirt::new);
    public static final RegistryObject<Block> HALLOW_LOG = BLOCKS.register("hallow_log", HallowLog::new);
    public static final RegistryObject<Block> HALLOW_LOG_GLOWING = BLOCKS.register("hallow_log_glowing", HallowLogGlowing::new);
    public static final RegistryObject<Block> HALLOW_ROOTS = BLOCKS.register("hallow_roots", HallowRoots::new);
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", TopazOre::new);
}
