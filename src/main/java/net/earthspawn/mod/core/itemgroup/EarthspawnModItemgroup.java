package net.earthspawn.mod.core.itemgroup;

import net.earthspawn.mod.core.init.BlockInit;
import net.earthspawn.mod.core.init.ItemInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EarthspawnModItemgroup extends ItemGroup {

    public static final EarthspawnModItemgroup EARTHSPAWN_MOD_ITEMGROUP = new EarthspawnModItemgroup(ItemGroup.GROUPS.length, "earthspawn");

    public EarthspawnModItemgroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(BlockInit.HALLOW_GRASS.get());
    }
}
