package net.earthspawn.mod.entities.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.earthspawn.mod.entities.OuliskEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class OuliskEntityModel<T extends OuliskEntity> extends EntityModel<T> {

    private final ModelRenderer Head;
    private final ModelRenderer bb_main_r1;
    private final ModelRenderer MouthUp;
    private final ModelRenderer bb_main_r2;
    private final ModelRenderer MouthLow;
    private final ModelRenderer bb_main_r3;
    private final ModelRenderer RightFrontLeg;
    private final ModelRenderer bb_main_r4;
    private final ModelRenderer LeftFrontLeg;
    private final ModelRenderer bb_main_r5;
    private final ModelRenderer LeftMiddleLeg;
    private final ModelRenderer bb_main_r6;
    private final ModelRenderer RightMiddleLeg;
    private final ModelRenderer bb_main_r7;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r4_r1;
    private final ModelRenderer cube_r2_r1;
    private final ModelRenderer cube_r1_r1;
    private final ModelRenderer Body;
    private final ModelRenderer LeftBackLeg;
    private final ModelRenderer cube_r6_r1;
    private final ModelRenderer RightBackLeg;
    private final ModelRenderer cube_r5_r1;

    public OuliskEntityModel() {
        textureWidth = 128;
        textureHeight = 128;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 3.85F, -12.5F);
        Head.setTextureOffset(44, 39).addBox(-4.0F, -5.85F, -5.5F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        Head.setTextureOffset(45, 67).addBox(1.0F, -6.85F, -1.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        Head.setTextureOffset(68, 10).addBox(-4.0F, -6.85F, -1.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        Head.setTextureOffset(62, 31).addBox(-2.0F, -3.85F, 2.5F, 4.0F, 6.0F, 2.0F, 0.0F, false);

        bb_main_r1 = new ModelRenderer(this);
        bb_main_r1.setRotationPoint(0.0F, -9.85F, 0.5F);
        Head.addChild(bb_main_r1);
        setRotationAngle(bb_main_r1, -0.5236F, 0.0F, 0.0F);
        bb_main_r1.setTextureOffset(68, 39).addBox(1.5F, 1.0F, 1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        bb_main_r1.setTextureOffset(40, 47).addBox(-3.0F, -3.0F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        bb_main_r1.setTextureOffset(0, 66).addBox(-3.5F, 1.0F, 1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        bb_main_r1.setTextureOffset(71, 55).addBox(2.0F, -3.0F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        MouthUp = new ModelRenderer(this);
        MouthUp.setRotationPoint(0.0F, -1.35F, -5.5F);
        Head.addChild(MouthUp);


        bb_main_r2 = new ModelRenderer(this);
        bb_main_r2.setRotationPoint(0.0F, 1.0F, -1.5F);
        MouthUp.addChild(bb_main_r2);
        setRotationAngle(bb_main_r2, 0.2182F, 0.0F, 0.0F);
        bb_main_r2.setTextureOffset(0, 47).addBox(-3.0F, -2.5F, -1.5F, 6.0F, 3.0F, 4.0F, 0.0F, false);

        MouthLow = new ModelRenderer(this);
        MouthLow.setRotationPoint(0.0F, 0.65F, -5.0F);
        Head.addChild(MouthLow);


        bb_main_r3 = new ModelRenderer(this);
        bb_main_r3.setRotationPoint(0.0F, -1.0F, -2.0F);
        MouthLow.addChild(bb_main_r3);
        setRotationAngle(bb_main_r3, 0.2182F, 0.0F, 0.0F);
        bb_main_r3.setTextureOffset(20, 47).addBox(-3.0F, 0.5F, -1.5F, 6.0F, 2.0F, 4.0F, 0.0F, false);

        RightFrontLeg = new ModelRenderer(this);
        RightFrontLeg.setRotationPoint(-6.0F, 11.0F, -10.0F);
        RightFrontLeg.setTextureOffset(59, 55).addBox(-1.5F, 6.0F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        bb_main_r4 = new ModelRenderer(this);
        bb_main_r4.setRotationPoint(6.0F, 2.5F, -0.5F);
        RightFrontLeg.addChild(bb_main_r4);
        setRotationAngle(bb_main_r4, -0.1745F, 0.0F, 0.0F);
        bb_main_r4.setTextureOffset(31, 53).addBox(-8.0F, -4.5F, -1.5F, 4.0F, 9.0F, 3.0F, 0.0F, false);

        LeftFrontLeg = new ModelRenderer(this);
        LeftFrontLeg.setRotationPoint(6.0F, 11.0F, -10.0F);
        LeftFrontLeg.setTextureOffset(56, 11).addBox(-1.5F, 6.0F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        bb_main_r5 = new ModelRenderer(this);
        bb_main_r5.setRotationPoint(-6.0F, 2.5F, -0.5F);
        LeftFrontLeg.addChild(bb_main_r5);
        setRotationAngle(bb_main_r5, -0.1745F, 0.0F, 0.0F);
        bb_main_r5.setTextureOffset(45, 55).addBox(4.0F, -4.5F, -1.5F, 4.0F, 9.0F, 3.0F, 0.0F, false);

        LeftMiddleLeg = new ModelRenderer(this);
        LeftMiddleLeg.setRotationPoint(6.0F, 11.0F, -1.0F);
        LeftMiddleLeg.setTextureOffset(62, 21).addBox(-1.5F, 6.0F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        bb_main_r6 = new ModelRenderer(this);
        bb_main_r6.setRotationPoint(-6.0F, 2.5F, -0.5F);
        LeftMiddleLeg.addChild(bb_main_r6);
        setRotationAngle(bb_main_r6, -0.1745F, 0.0F, 0.0F);
        bb_main_r6.setTextureOffset(0, 54).addBox(4.0F, -4.5F, -1.5F, 4.0F, 9.0F, 3.0F, 0.0F, false);

        RightMiddleLeg = new ModelRenderer(this);
        RightMiddleLeg.setRotationPoint(-6.0F, 11.0F, -1.0F);
        RightMiddleLeg.setTextureOffset(64, 0).addBox(-1.5F, 6.0F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

        bb_main_r7 = new ModelRenderer(this);
        bb_main_r7.setRotationPoint(6.0F, 2.5F, -0.5F);
        RightMiddleLeg.addChild(bb_main_r7);
        setRotationAngle(bb_main_r7, -0.1745F, 0.0F, 0.0F);
        bb_main_r7.setTextureOffset(17, 53).addBox(-8.0F, -4.5F, -1.5F, 4.0F, 9.0F, 3.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setRotationPoint(0.0F, 5.5717F, 14.3417F);


        cube_r4_r1 = new ModelRenderer(this);
        cube_r4_r1.setRotationPoint(0.0F, 6.4999F, 5.8705F);
        Tail.addChild(cube_r4_r1);
        setRotationAngle(cube_r4_r1, -0.8727F, 0.0F, 0.0F);
        cube_r4_r1.setTextureOffset(42, 0).addBox(-1.0F, -0.9998F, -9.3751F, 2.0F, 2.0F, 9.0F, 0.0F, false);
        cube_r4_r1.setTextureOffset(68, 15).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r2_r1 = new ModelRenderer(this);
        cube_r2_r1.setRotationPoint(0.0F, 6.4999F, 5.8705F);
        Tail.addChild(cube_r2_r1);
        setRotationAngle(cube_r2_r1, -0.9113F, -0.2485F, 0.3073F);
        cube_r2_r1.setTextureOffset(68, 61).addBox(-0.802F, -0.4999F, -0.116F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r1_r1 = new ModelRenderer(this);
        cube_r1_r1.setRotationPoint(0.0F, 6.4999F, 5.8705F);
        Tail.addChild(cube_r1_r1);
        setRotationAngle(cube_r1_r1, -0.9113F, 0.2485F, -0.3073F);
        cube_r1_r1.setTextureOffset(69, 66).addBox(-0.198F, -0.4999F, -0.116F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 8.1667F, 0.0F);
        Body.setTextureOffset(0, 25).addBox(-6.0F, -4.1667F, 1.0F, 12.0F, 8.0F, 14.0F, 0.0F, false);
        Body.setTextureOffset(0, 0).addBox(-7.0F, -5.1667F, -13.0F, 14.0F, 11.0F, 14.0F, 0.0F, false);
        Body.setTextureOffset(38, 25).addBox(-5.0F, -5.1667F, -15.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);

        LeftBackLeg = new ModelRenderer(this);
        LeftBackLeg.setRotationPoint(4.875F, 12.0714F, 11.0551F);
        LeftBackLeg.setTextureOffset(11, 65).addBox(-1.375F, 5.9286F, 0.6949F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        cube_r6_r1 = new ModelRenderer(this);
        cube_r6_r1.setRotationPoint(-4.875F, 15.116F, -8.2657F);
        LeftBackLeg.addChild(cube_r6_r1);
        setRotationAngle(cube_r6_r1, 0.2618F, 0.0F, 0.0F);
        cube_r6_r1.setTextureOffset(35, 65).addBox(3.0F, -15.2588F, 10.0341F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        cube_r6_r1.setTextureOffset(0, 0).addBox(3.0F, -15.2588F, 11.0341F, 4.0F, 10.0F, 3.0F, 0.0F, false);
        cube_r6_r1.setTextureOffset(0, 47).addBox(6.0F, -14.2588F, 9.0341F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r6_r1.setTextureOffset(42, 0).addBox(3.0F, -14.2588F, 9.0341F, 3.0F, 6.0F, 1.0F, 0.0F, false);

        RightBackLeg = new ModelRenderer(this);
        RightBackLeg.setRotationPoint(-5.0F, 12.0714F, 10.8051F);
        RightBackLeg.setTextureOffset(23, 65).addBox(-1.5F, 5.9286F, 0.9449F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        cube_r5_r1 = new ModelRenderer(this);
        cube_r5_r1.setRotationPoint(5.0F, 15.116F, -8.0157F);
        RightBackLeg.addChild(cube_r5_r1);
        setRotationAngle(cube_r5_r1, 0.2618F, 0.0F, 0.0F);
        cube_r5_r1.setTextureOffset(0, 25).addBox(-7.0F, -15.2588F, 11.0341F, 4.0F, 10.0F, 3.0F, 0.0F, false);
        cube_r5_r1.setTextureOffset(16, 47).addBox(-7.0F, -14.2588F, 9.0341F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r5_r1.setTextureOffset(55, 0).addBox(-6.0F, -14.2588F, 9.0341F, 3.0F, 6.0F, 1.0F, 0.0F, false);
        cube_r5_r1.setTextureOffset(59, 65).addBox(-7.0F, -15.2588F, 10.0341F, 4.0F, 8.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Head.render(matrixStack, buffer, packedLight, packedOverlay);
        RightFrontLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftFrontLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftMiddleLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        RightMiddleLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        Tail.render(matrixStack, buffer, packedLight, packedOverlay);
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftBackLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        RightBackLeg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.Head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.RightBackLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LeftBackLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.RightMiddleLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LeftMiddleLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.RightFrontLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LeftFrontLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
