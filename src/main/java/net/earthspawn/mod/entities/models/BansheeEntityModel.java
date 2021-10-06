package net.earthspawn.mod.entities.models;

import net.earthspawn.mod.entities.BansheeEntity;
import net.earthspawn.mod.entities.OuliskEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BansheeEntityModel<T extends BansheeEntity> extends BansheeAgeableModel<T> {
    public BansheeEntityModel() {
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


    public BansheeEntityModel(float scale) {
        super(6, scale, false, 4.0F, 4.0F, 4.0F, 1.655F, 16);
        this.headModel.setTextureOffset(16, 16);
    }
}
