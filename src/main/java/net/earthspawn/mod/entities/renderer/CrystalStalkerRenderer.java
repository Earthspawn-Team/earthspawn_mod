package net.earthspawn.mod.entities.renderer;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.entities.CrystalStalkerEntity;
import net.earthspawn.mod.entities.models.CrystalStalkerModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CrystalStalkerRenderer extends MobRenderer<CrystalStalkerEntity, CrystalStalkerModel<CrystalStalkerEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(EarthspawnMod.MOD_ID, "textures/entity/crystalstalker.png");

    public CrystalStalkerRenderer(EntityRendererManager manager) {
        super(manager, new CrystalStalkerModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(CrystalStalkerEntity entity) {
        return TEXTURE;
    }
}
