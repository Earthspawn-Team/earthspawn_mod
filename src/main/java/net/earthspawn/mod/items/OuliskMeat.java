package net.earthspawn.mod.items;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.itemgroup.EarthspawnModItemgroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import javax.swing.*;

public class OuliskMeat extends Item {

    public OuliskMeat() {
        super(new Item.Properties()
                .group(EarthspawnModItemgroup.EARTHSPAWN_MOD_ITEMGROUP)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(0.5f)
                        .effect(new EffectInstance(Effects.MINING_FATIGUE, 200, 1), 1)
                        .build())
        );
    }
}
