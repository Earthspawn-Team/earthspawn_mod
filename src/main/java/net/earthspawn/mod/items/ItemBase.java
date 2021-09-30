package net.earthspawn.mod.items;

import net.earthspawn.mod.itemgroup.EarthspawnModItemgroup;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP));
    }
}
