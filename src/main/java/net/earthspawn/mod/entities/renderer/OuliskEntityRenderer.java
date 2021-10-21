package net.earthspawn.mod.entities.renderer;

import net.earthspawn.mod.entities.OuliskEntity;
import net.earthspawn.mod.entities.models.OuliskEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class OuliskEntityRenderer<T extends OuliskEntity> extends MobRenderer<T, OuliskEntityModel<T>> {
    private static final ResourceLocation OULISK_TEXTURES = new ResourceLocation("earthspawn:textures/entity/oulisk.png");

    public OuliskEntityRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new OuliskEntityModel<>(), 1.0F);
        this.addLayer(new OuliskLayerRenderer<>(this));
    }

    protected float getDeathMaxRotation(T entityLivingBaseIn) {
        return 90.0F;
    }

    public ResourceLocation getEntityTexture(T entity) {
        return OULISK_TEXTURES;
    }
}
