package net.earthspawn.mod.entities.renderer;

import net.earthspawn.mod.entities.BansheeEntity;
import net.earthspawn.mod.entities.OuliskEntity;
import net.earthspawn.mod.entities.models.BansheeEntityModel;
import net.earthspawn.mod.entities.models.OuliskEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BansheeEntityRenderer<T extends BansheeEntity> extends MobRenderer<T, BansheeEntityModel<T>> {
    private static final ResourceLocation BANSHEE_TEXTURES = new ResourceLocation("earthspawn:textures/entity/banshee.png");

    public BansheeEntityRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BansheeEntityModel<>(), 1.0F);
        this.addLayer(new BansheeLayerRenderer<>(this));
    }

    protected float getDeathMaxRotation(T entityLivingBaseIn) {
        return 90.0F;
    }

    public ResourceLocation getEntityTexture(T entity) {
        return BANSHEE_TEXTURES;
    }
}
