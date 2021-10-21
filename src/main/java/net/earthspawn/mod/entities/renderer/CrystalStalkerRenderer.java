package net.earthspawn.mod.entities.renderer;

import net.earthspawn.mod.entities.CrystalStalkerEntity;
import net.earthspawn.mod.entities.models.CrystalStalkerModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CrystalStalkerRenderer<T extends CrystalStalkerEntity> extends MobRenderer<T, CrystalStalkerModel<T>> {
    private static final ResourceLocation STALKER_TEXTURES = new ResourceLocation("earthspawn:textures/entity/crystalstalker.png");

    public CrystalStalkerRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CrystalStalkerModel<>(), 1.0F);
        this.addLayer(new CrystalStalkerLayerRenderer<>(this));
    }

    protected float getDeathMaxRotation(T entityLivingBaseIn) {
        return 90.0F;
    }

    public ResourceLocation getEntityTexture(T entity) {
        return STALKER_TEXTURES;
    }
}
