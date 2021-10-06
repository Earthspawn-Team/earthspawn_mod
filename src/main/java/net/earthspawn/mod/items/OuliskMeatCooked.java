package net.earthspawn.mod.items;

import net.earthspawn.mod.itemgroup.EarthspawnModItemgroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class OuliskMeatCooked extends Item {

    public OuliskMeatCooked() {
        super(new Item.Properties()
                .group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(2.0f)
                        .effect(new EffectInstance(Effects.HASTE, 200, 1), 1)
                        .build())
        );
    }
}
