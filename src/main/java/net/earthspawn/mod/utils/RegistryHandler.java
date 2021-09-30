package net.earthspawn.mod.utils;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.blocks.HallowDirt;
import net.earthspawn.mod.blocks.HallowGrass;
import net.earthspawn.mod.blocks.TopazOre;
import net.earthspawn.mod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EarthspawnMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EarthspawnMod.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    //blocks
    public static final RegistryObject<Block> HALLOW_GRASS = BLOCKS.register("hallow_grass", HallowGrass::new);
    public static final RegistryObject<Block> HALLOW_DIRT = BLOCKS.register("hallow_dirt", HallowDirt::new);
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", TopazOre::new);

    //items
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", ItemBase::new);
    public static final RegistryObject<Item> UNICORN_HORN = ITEMS.register("unicorn_horn", ItemBase::new);
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", ItemBase::new);
    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> CHARGED_CRYSTAL = ITEMS.register("charged_crystal", ItemBase::new);
    public static final RegistryObject<Item> ASTRAL_DUST = ITEMS.register("astral_dust", ItemBase::new);
}
