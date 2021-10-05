package net.earthspawn.mod.entities.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.entities.OuliskEntity;
import net.earthspawn.mod.entities.models.OuliskEntityModel;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

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
