package net.earthspawn.mod.items;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.armors.ArmorMaterial;
import net.earthspawn.mod.entities.EntityRegister;
import net.earthspawn.mod.itemgroup.EarthspawnModItemgroup;
import net.earthspawn.mod.items.foods.OuliskMeat;
import net.earthspawn.mod.items.foods.OuliskMeatCooked;
import net.earthspawn.mod.items.spawneggs.ModSpawnEggItem;
import net.earthspawn.mod.tools.ItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EarthspawnMod.MOD_ID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    //items
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", ItemBase::new);
    public static final RegistryObject<Item> UNICORN_HORN = ITEMS.register("unicorn_horn", ItemBase::new);
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", ItemBase::new);
    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> CHARGED_CRYSTAL = ITEMS.register("charged_crystal", ItemBase::new);
    public static final RegistryObject<Item> ASTRAL_DUST = ITEMS.register("astral_dust", ItemBase::new);



    //spawnEggs
    public static final RegistryObject<ModSpawnEggItem> OULISK_SPAWN_EGG = ITEMS.register("oulisk_spawn_egg",
            () -> new ModSpawnEggItem(EntityRegister.OULISK_ENTITY, 0x900EBD, 0x00FFFB, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));

    public static final RegistryObject<ModSpawnEggItem> BANSHEE_SPAWN_EGG = ITEMS.register("banshee_spawn_egg",
            () -> new ModSpawnEggItem(EntityRegister.BANSHEE_ENTITY, 0x0C1A8E, 0x00FFFB, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));

    public static final RegistryObject<ModSpawnEggItem> CRYSTAL_STALKER_SPAWN_EGG = ITEMS.register("crystal_stalker_spawn_egg",
            () -> new ModSpawnEggItem(EntityRegister.CRYSTAL_STALKER_ENTITY, 0x526465, 0x00FFFB, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));

    //foods
    public static final RegistryObject<OuliskMeat> OULISK_MEAT = ITEMS.register("oulisk_meat", OuliskMeat::new);
    public static final RegistryObject<OuliskMeatCooked> OULISK_MEAT_COOKED = ITEMS.register("oulisk_meat_cooked", OuliskMeatCooked::new);


    //tools
    public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new SwordItem(ItemTier.TOPAZ_TIER, 6, -2.4F, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));
    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ItemTier.TOPAZ_TIER, 1, -2.8F, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));

    //armors
    public static final RegistryObject<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet",
            () -> new ArmorItem(ArmorMaterial.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));
    public static final RegistryObject<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate",
            () -> new ArmorItem(ArmorMaterial.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));
    public static final RegistryObject<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings",
            () -> new ArmorItem(ArmorMaterial.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));
    public static final RegistryObject<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots",
            () -> new ArmorItem(ArmorMaterial.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));
}
