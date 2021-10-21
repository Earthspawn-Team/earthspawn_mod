package net.earthspawn.mod.entities.models;

// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.earthspawn.mod.entities.CrystalStalkerEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class CrystalStalkerModel<T extends CrystalStalkerEntity> extends EntityModel<T> {
    private final ModelRenderer Body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer RightLeg;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer LeftArm;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer RightArm;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer LowerMouth;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer LowerTail;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;

    public CrystalStalkerModel() {
        textureWidth = 128;
        textureHeight = 128;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 5.5F, -2.75F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 6.25F);
        Body.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 22).addBox(-4.0F, -4.5F, -7.0F, 8.0F, 8.0F, 14.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.5F, -6.25F);
        Body.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(0, 0).addBox(-5.5F, -4.0F, -7.0F, 11.0F, 8.0F, 14.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(4.0F, 4.0F, 8.0F);
        LeftLeg.setTextureOffset(0, 75).addBox(0.0F, 18.7726F, -6.172F, 2.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(2.0F, 19.2726F, -3.172F);
        LeftLeg.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
        cube_r3.setTextureOffset(64, 78).addBox(-3.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-0.9302F, 18.7726F, -2.3573F);
        LeftLeg.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.1745F, 0.4363F, 0.0F);
        cube_r4.setTextureOffset(21, 76).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(1.0F, 18.5226F, -3.672F);
        LeftLeg.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(71, 0).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(2.0F, 19.2726F, -3.172F);
        LeftLeg.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
        cube_r6.setTextureOffset(35, 79).addBox(0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(2.695F, 18.7726F, -2.2963F);
        LeftLeg.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.1745F, -0.4363F, 0.0F);
        cube_r7.setTextureOffset(76, 48).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.5F, 16.1168F, 1.1361F);
        LeftLeg.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(72, 19).addBox(-1.0F, -5.5F, -2.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(0.5F, 10.0054F, -4.3188F);
        LeftLeg.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.6109F, 0.0F, 0.0F);
        cube_r9.setTextureOffset(36, 64).addBox(-1.5F, -4.5F, 1.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.5F, 1.8486F, -0.5152F);
        LeftLeg.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.4363F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(0, 60).addBox(-1.5F, -4.5F, -3.0F, 4.0F, 9.0F, 6.0F, 0.0F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-4.0F, 4.0F, 8.0F);
        RightLeg.setTextureOffset(71, 58).addBox(-3.0F, 18.7726F, -6.172F, 2.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-0.305F, 18.7726F, -2.2963F);
        RightLeg.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.1745F, -0.4363F, 0.0F);
        cube_r11.setTextureOffset(76, 31).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-1.0F, 19.2726F, -3.172F);
        RightLeg.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, -0.4363F, 0.0F);
        cube_r12.setTextureOffset(28, 77).addBox(0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-2.5F, 16.1168F, 1.1361F);
        RightLeg.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.4363F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(68, 66).addBox(-1.0F, -5.5F, -2.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-1.0F, 19.2726F, -3.172F);
        RightLeg.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.4363F, 0.0F);
        cube_r14.setTextureOffset(57, 77).addBox(-3.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(9.0F, 18.5226F, -3.672F);
        RightLeg.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(39, 26).addBox(-12.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-3.9302F, 18.7726F, -2.3573F);
        RightLeg.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.1745F, 0.4363F, 0.0F);
        cube_r16.setTextureOffset(9, 76).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(-2.5F, 10.0054F, -4.3188F);
        RightLeg.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.6109F, 0.0F, 0.0F);
        cube_r17.setTextureOffset(20, 61).addBox(-1.5F, -4.5F, 1.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(-2.5F, 1.8486F, -0.5152F);
        RightLeg.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(56, 26).addBox(-1.5F, -4.5F, -3.0F, 4.0F, 9.0F, 6.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(-6.0F, 8.0F, -10.0F);


        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(12.5F, 7.9682F, -3.5867F);
        LeftArm.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.9026F, 0.3879F, 0.2902F);
        cube_r19.setTextureOffset(9, 0).addBox(-1.0F, -2.0F, 0.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r19.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -1.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(12.5F, 5.6327F, 1.4923F);
        LeftArm.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.9599F, 0.0F, 0.0F);
        cube_r20.setTextureOffset(52, 72).addBox(-1.0F, -3.5F, -2.5F, 2.0F, 7.0F, 3.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(19.5F, -2.0F, 1.0F);
        LeftArm.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.2618F, 0.0F, 0.0F);
        cube_r21.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -4.0F, 2.0F, 7.0F, 5.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(6.0F, 8.0F, -10.0F);


        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-12.5F, 7.9682F, -3.5867F);
        RightArm.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.9026F, -0.3879F, -0.2902F);
        cube_r22.setTextureOffset(9, 22).addBox(0.0F, -2.0F, 0.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r22.setTextureOffset(0, 22).addBox(0.0F, -2.0F, -1.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-12.5F, 5.6327F, 1.4923F);
        RightArm.addChild(cube_r23);
        setRotationAngle(cube_r23, -0.9599F, 0.0F, 0.0F);
        cube_r23.setTextureOffset(73, 38).addBox(-1.0F, -3.5F, -2.5F, 2.0F, 7.0F, 3.0F, 0.0F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-5.5F, -2.0F, 1.0F);
        RightArm.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        cube_r24.setTextureOffset(0, 22).addBox(-8.0F, -1.0F, -4.0F, 2.0F, 7.0F, 5.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.25F, 3.7813F, -15.5208F);


        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(-0.25F, -0.7298F, -5.6573F);
        Head.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        cube_r25.setTextureOffset(60, 49).addBox(-2.25F, -2.5F, -8.0F, 5.0F, 3.0F, 6.0F, 0.0F, false);
        cube_r25.setTextureOffset(0, 44).addBox(-2.75F, -3.0F, -2.0F, 6.0F, 7.0F, 9.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(-2.0F, -5.7702F, 0.9073F);
        Head.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.3978F, -0.2129F, -0.0479F);
        cube_r26.setTextureOffset(36, 0).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(2.0F, -5.7702F, 0.9073F);
        Head.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.3978F, 0.2129F, 0.0479F);
        cube_r27.setTextureOffset(58, 0).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, 0.0F, false);

        LowerMouth = new ModelRenderer(this);
        LowerMouth.setRotationPoint(-0.25F, 1.2187F, -7.4792F);
        Head.addChild(LowerMouth);


        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(2.25F, 1.151F, -4.9976F);
        LowerMouth.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.9463F, -0.6507F, 0.3916F);
        cube_r28.setTextureOffset(30, 22).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r28.setTextureOffset(0, 12).addBox(-1.25F, 0.65F, -0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r28.setTextureOffset(4, 12).addBox(-2.25F, 1.65F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r28.setTextureOffset(8, 12).addBox(-3.0F, 2.15F, -0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.25F, 1.0862F, -2.6268F);
        LowerMouth.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.3491F, 0.0F, 0.0F);
        cube_r29.setTextureOffset(60, 10).addBox(-2.5F, -1.25F, -2.75F, 5.0F, 3.0F, 6.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setRotationPoint(0.0F, 3.8612F, 10.8034F);


        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(-3.0F, 0.9987F, 3.2464F);
        Tail.addChild(cube_r30);
        setRotationAngle(cube_r30, -0.1594F, -0.6049F, 0.0911F);
        cube_r30.setTextureOffset(21, 44).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(3.0F, 1.7487F, 8.7464F);
        Tail.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.1594F, 0.6049F, -0.0911F);
        cube_r31.setTextureOffset(52, 64).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-3.0F, 1.7487F, 8.7464F);
        Tail.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.1594F, -0.6049F, 0.0911F);
        cube_r32.setTextureOffset(62, 58).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(3.0F, 0.9987F, 3.2464F);
        Tail.addChild(cube_r33);
        setRotationAngle(cube_r33, -0.1594F, 0.6049F, -0.0911F);
        cube_r33.setTextureOffset(49, 0).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.0F, 0.8666F, 6.8177F);
        Tail.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.1745F, 0.0F, 0.0F);
        cube_r34.setTextureOffset(32, 32).addBox(-3.0F, -2.0F, -7.0F, 6.0F, 5.0F, 12.0F, 0.0F, false);

        LowerTail = new ModelRenderer(this);
        LowerTail.setRotationPoint(0.0F, 1.8658F, 12.0254F);
        Tail.addChild(LowerTail);


        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(-3.0F, 0.3829F, 3.721F);
        LowerTail.addChild(cube_r35);
        setRotationAngle(cube_r35, -0.1064F, -0.6082F, 0.061F);
        cube_r35.setTextureOffset(30, 22).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-3.0F, 0.3829F, 7.721F);
        LowerTail.addChild(cube_r36);
        setRotationAngle(cube_r36, -0.1064F, -0.6082F, 0.061F);
        cube_r36.setTextureOffset(75, 73).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(3.0F, 0.3829F, 3.721F);
        LowerTail.addChild(cube_r37);
        setRotationAngle(cube_r37, -0.1064F, 0.6082F, -0.061F);
        cube_r37.setTextureOffset(30, 29).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(3.0F, 0.3829F, 7.721F);
        LowerTail.addChild(cube_r38);
        setRotationAngle(cube_r38, -0.1064F, 0.6082F, -0.061F);
        cube_r38.setTextureOffset(76, 6).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(-3.0F, 1.3728F, 16.1668F);
        LowerTail.addChild(cube_r39);
        setRotationAngle(cube_r39, -0.1007F, -0.5214F, 0.0503F);
        cube_r39.setTextureOffset(45, 52).addBox(-1.5F, -1.5F, -4.5F, 3.0F, 3.0F, 9.0F, 0.0F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(3.0F, 1.3728F, 16.1668F);
        LowerTail.addChild(cube_r40);
        setRotationAngle(cube_r40, -0.0983F, 0.478F, -0.0453F);
        cube_r40.setTextureOffset(30, 49).addBox(-1.5F, -1.5F, -4.5F, 3.0F, 3.0F, 9.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(0.0F, -0.2771F, 8.7825F);
        LowerTail.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.0873F, 0.0F, 0.0F);
        cube_r41.setTextureOffset(38, 10).addBox(-2.5F, -0.75F, -9.0F, 5.0F, 4.0F, 12.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.Head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.LowerMouth.rotateAngleX = MathHelper.cos(ageInTicks * 0.05F) * 0.05F;
        this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
        this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.0F * limbSwingAmount;
        this.Tail.rotateAngleX = MathHelper.cos(ageInTicks * 0.05F) * 0.07F;
        this.LowerTail.rotateAngleX = MathHelper.cos(ageInTicks * 0.05F) * 0.05F;
        this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.2F * limbSwingAmount;
        this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        Head.render(matrixStack, buffer, packedLight, packedOverlay);
        Tail.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}