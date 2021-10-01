package net.earthspawn.mod.entities.renderer;

import net.earthspawn.mod.EarthspawnMod;
import net.earthspawn.mod.entities.TestEntity;
import net.earthspawn.mod.entities.models.TestEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TestEntityRenderer extends MobRenderer<TestEntity, TestEntityModel<TestEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(EarthspawnMod.MOD_ID, "textures/entity/test_entity.png");

    public TestEntityRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TestEntityModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(TestEntity entity) {
        return TEXTURE;
    }
}
