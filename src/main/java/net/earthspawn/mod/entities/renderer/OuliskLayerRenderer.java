package net.earthspawn.mod.entities.renderer;

import net.earthspawn.mod.entities.models.OuliskAgeableModel;
import net.earthspawn.mod.entities.models.OuliskEntityModel;
import net.earthspawn.mod.entities.renderer.layers.AbstractGlowLayer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class OuliskLayerRenderer<T extends Entity, M extends OuliskAgeableModel<T>> extends AbstractGlowLayer<T, M> {
    private static final RenderType RENDER_TYPE = RenderType.getEyes(new ResourceLocation("earthspawn:textures/entity/oulisklayer.png"));

    public OuliskLayerRenderer(IEntityRenderer<T, M> rendererIn) {
        super(rendererIn);
    }

    public RenderType getRenderType() { return RENDER_TYPE;}
}