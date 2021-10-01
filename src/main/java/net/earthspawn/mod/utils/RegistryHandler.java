package net.earthspawn.mod.utils;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.blocks.HallowDirt;
import net.earthspawn.mod.blocks.HallowGrass;
import net.earthspawn.mod.blocks.TopazOre;
import net.earthspawn.mod.itemgroup.EarthspawnModItemgroup;
import net.earthspawn.mod.items.ItemBase;
import net.earthspawn.mod.tools.ItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = EarthspawnMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EarthspawnMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EarthspawnMod.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    @SubscribeEvent
    public static void createBlocksItems(final RegistryEvent.Register<Item> event){
        RegistryHandler.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->
                event.getRegistry().register(new BlockItem(block, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)).setRegistryName(Objects.requireNonNull(block.getRegistryName()))));
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

    //tools
    public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new SwordItem(ItemTier.TOPAZ_TIER, 6, -2.4F, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));
    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ItemTier.TOPAZ_TIER, 1, -2.8F, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));
}
