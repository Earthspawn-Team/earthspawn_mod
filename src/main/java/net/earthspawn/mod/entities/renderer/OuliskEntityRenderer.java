package net.earthspawn.mod.entities.renderer;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.entities.OuliskEntity;
import net.earthspawn.mod.entities.models.OuliskEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class OuliskEntityRenderer extends MobRenderer<OuliskEntity, OuliskEntityModel<OuliskEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(EarthspawnMod.MOD_ID, "textures/entity/oulisk.png");

    public OuliskEntityRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new OuliskEntityModel<>(), 1.0F);
    }

    @Override
    public ResourceLocation getEntityTexture(OuliskEntity entity) {
        return TEXTURE;
    }
}
