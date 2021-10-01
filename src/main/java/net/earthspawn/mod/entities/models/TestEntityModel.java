package net.earthspawn.mod.entities.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.earthspawn.mod.entities.TestEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TestEntityModel<T extends TestEntity> extends EntityModel<T> {

    private final ModelRenderer Head;
    private final ModelRenderer Body;

    public TestEntityModel() {
        textureWidth = 64;
        textureHeight = 64;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 24.0F, 0.0F);
        Head.setTextureOffset(0, 0).addBox(-8.0F, -13.0F, -8.0F, 16.0F, 13.0F, 16.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        Body.setTextureOffset(0, 29).addBox(-5.0F, -18.0F, -16.0F, 10.0F, 7.0F, 8.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Head.render(matrixStack, buffer, packedLight, packedOverlay);
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
