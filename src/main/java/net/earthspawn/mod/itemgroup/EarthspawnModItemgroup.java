package net.earthspawn.mod.itemgroup;

import net.earthspawn.mod.blocks.BlockRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EarthspawnModItemgroup extends ItemGroup {

    public static final EarthspawnModItemgroup EARTHSPAWN_MOD_ITEMGROUP = new EarthspawnModItemgroup(ItemGroup.GROUPS.length, "earthspawn");

    public EarthspawnModItemgroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(BlockRegister.HALLOW_GRASS.get());
    }
}
