package net.earthspawn.mod.entities.models;

import net.earthspawn.mod.entities.OuliskEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public class OuliskEntityModel<T extends OuliskEntity> extends OuliskAgeableModel<T> {
    public OuliskEntityModel() {
        this(0.0F);
    }

    //p_i225948_1_
    //p_i225948_2_ = ?
    //p_i225948_3_ = ?
    //p_i225948_4_ = head y offset
    //p_i225948_5_ = head z offset
    //p_i225948_6_ = ?
    //p_i225948_7_ = body scale
    //p_i225948_8_ = body y offset


    public OuliskEntityModel(float scale) {
        super(6, scale, false, 9.0F, 4.0F, 4.0F, 1.655F, 16);
        this.head.setTextureOffset(16, 16);
    }
}