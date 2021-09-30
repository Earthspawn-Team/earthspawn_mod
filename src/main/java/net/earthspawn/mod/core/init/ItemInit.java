package net.earthspawn.mod.core.init;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.core.itemgroup.EarthspawnModItemgroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EarthspawnMod.MOD_ID);

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()
            .group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)));
}
