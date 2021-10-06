package net.earthspawn.mod.entities.models;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BansheeAgeableModel<T extends Entity> extends AgeableModel<T> {
    protected ModelRenderer body;
    protected ModelRenderer cube_r1;
    protected ModelRenderer cube_r2;
    protected ModelRenderer cube_r3;
    protected ModelRenderer cube_r4;
    protected ModelRenderer cube_r5;
    protected ModelRenderer headModel;
    protected ModelRenderer cube_r6;
    protected ModelRenderer cube_r7;
    protected ModelRenderer cube_r8;
    protected ModelRenderer cube_r9;
    protected ModelRenderer cube_r10;
    protected ModelRenderer cube_r11;
    protected ModelRenderer legBackLeft;
    protected ModelRenderer cube_r12;
    protected ModelRenderer cube_r13;
    protected ModelRenderer cube_r14;
    protected ModelRenderer cube_r15;
    protected ModelRenderer cube_r16;
    protected ModelRenderer cube_r17;
    protected ModelRenderer legBackRight;
    protected ModelRenderer cube_r18;
    protected ModelRenderer cube_r19;
    protected ModelRenderer cube_r20;
    protected ModelRenderer cube_r21;
    protected ModelRenderer cube_r22;
    protected ModelRenderer cube_r23;
    protected ModelRenderer wingLeft;
    protected ModelRenderer cube_r24;
    protected ModelRenderer subwingLeft;
    protected ModelRenderer cube_r25;
    protected ModelRenderer cube_r26;
    protected ModelRenderer wingRight;
    protected ModelRenderer cube_r27;
    protected ModelRenderer subwingRight;
    protected ModelRenderer cube_r28;
    protected ModelRenderer cube_r29;

    public BansheeAgeableModel(int p_i225948_1_, float p_i225948_2_, boolean p_i225948_3_, float p_i225948_4_, float p_i225948_5_, float p_i225948_6_, float p_i225948_7_, int p_i225948_8_) {
        super(p_i225948_3_, p_i225948_4_, p_i225948_5_, p_i225948_6_, p_i225948_7_, (float) p_i225948_8_);
        {
            textureWidth = 64;
            textureHeight = 64;

            body = new ModelRenderer(this);
            body.setRotationPoint(0.3333F, 17.0287F, 0.4049F);
            body.setTextureOffset(25, 6).addBox(-3.3333F, -2.2787F, 0.5951F, 6.0F, 4.0F, 9.0F, 0.0F, false);

            cube_r1 = new ModelRenderer(this);
            cube_r1.setRotationPoint(-0.3333F, 2.0425F, -11.4891F);
            body.addChild(cube_r1);
            cube_r1.rotateAngleX = (-0.4363F);
            cube_r1.setRotationPoint(-0.3333F, 2.0425F, -11.4891F);
            cube_r1.setTextureOffset(38, 28).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this);
            cube_r2.setRotationPoint(-0.3333F, 0.7213F, -2.9049F);
            body.addChild(cube_r2);
            cube_r2.rotateAngleX = (0.0873F);
            cube_r2.setTextureOffset(0, 0).addBox(-4.0F, -3.25F, -4.5F, 8.0F, 6.0F, 9.0F, 0.0F, false);

            cube_r3 = new ModelRenderer(this);
            cube_r3.setRotationPoint(1.6667F, 0.3305F, 22.299F);
            body.addChild(cube_r3);
            cube_r3.rotateAngleY = (-0.8727F);
            cube_r3.setTextureOffset(16, 38).addBox(-5.5F, -0.5F, -1.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
            cube_r3.setTextureOffset(38, 40).addBox(-3.5F, -0.5F, 1.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r4 = new ModelRenderer(this);
            cube_r4.setRotationPoint(1.6667F, 0.3305F, 22.299F);
            body.addChild(cube_r4);
            cube_r4.rotateAngleY = (0.8727F);
            cube_r4.setTextureOffset(38, 19).addBox(1.0F, -0.5F, -4.25F, 2.0F, 1.0F, 8.0F, 0.0F, false);
            cube_r4.setTextureOffset(46, 0).addBox(-1.0F, -0.5F, -2.25F, 2.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r5 = new ModelRenderer(this);
            cube_r5.setRotationPoint(-0.3333F, 0.2215F, 19.8014F);
            body.addChild(cube_r5);
            cube_r5.rotateAngleX = (-0.0436F);
            cube_r5.setTextureOffset(46, 7).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
            cube_r5.setTextureOffset(23, 24).addBox(-1.0F, -1.5F, -10.5F, 2.0F, 3.0F, 11.0F, 0.0F, false);

            headModel = new ModelRenderer(this);
            headModel.setRotationPoint(0.0F, 15.3836F, -8.6504F);


            cube_r6 = new ModelRenderer(this);
            cube_r6.setRotationPoint(0.0F, -1.1626F, -4.3639F);
            headModel.addChild(cube_r6);
            cube_r6.rotateAngleX = (0.1745F);
            cube_r6.setTextureOffset(12, 41).addBox(-1.5F, -0.5F, 5.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r6.setTextureOffset(0, 41).addBox(-2.0F, -1.0F, 1.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r7 = new ModelRenderer(this);
            cube_r7.setRotationPoint(0.0F, -1.4126F, -2.3639F);
            headModel.addChild(cube_r7);
            cube_r7.rotateAngleX = (0.1745F);
            cube_r7.setTextureOffset(28, 38).addBox(-1.5F, -0.5F, -5.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            cube_r8 = new ModelRenderer(this);
            cube_r8.setRotationPoint(0.0F, 3.5685F, -6.5781F);
            headModel.addChild(cube_r8);
            cube_r8.rotateAngleX = (0.6981F);
            cube_r8.setTextureOffset(38, 24).addBox(-1.0F, -1.5F, 0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r9 = new ModelRenderer(this);
            cube_r9.setRotationPoint(0.0F, -2.3403F, -7.62F);
            headModel.addChild(cube_r9);
            cube_r9.rotateAngleX = (-0.4363F);
            cube_r9.setTextureOffset(46, 0).addBox(-1.0F, -0.5F, 0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r10 = new ModelRenderer(this);
            cube_r10.setRotationPoint(-1.5F, -3.2476F, -1.1775F);
            headModel.addChild(cube_r10);
            cube_r10.rotateAngleX = (0.8249F);
            cube_r10.rotateAngleY = (-0.274F);
            cube_r10.rotateAngleZ = (-0.3144F);
            cube_r10.setTextureOffset(25, 25).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            cube_r10.setTextureOffset(35, 19).addBox(-0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r11 = new ModelRenderer(this);
            cube_r11.setRotationPoint(1.5F, -3.2476F, -1.1775F);
            headModel.addChild(cube_r11);
            cube_r11.rotateAngleX = (0.8249F);
            cube_r11.rotateAngleY = (0.274F);
            cube_r11.rotateAngleZ = (0.2849F);
            cube_r11.setTextureOffset(0, 25).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            cube_r11.setTextureOffset(25, 19).addBox(-0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            legBackLeft = new ModelRenderer(this);
            legBackLeft.setRotationPoint(3.0F, 17.371F, 5.5299F);


            cube_r12 = new ModelRenderer(this);
            cube_r12.setRotationPoint(-1.0F, 6.1458F, -2.768F);
            legBackLeft.addChild(cube_r12);
            cube_r12.rotateAngleX = (-1.5708F);
            cube_r12.rotateAngleY = (0.5236F);
            cube_r12.setTextureOffset(5, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r13 = new ModelRenderer(this);
            cube_r13.setRotationPoint(1.0F, 6.1458F, -2.768F);
            legBackLeft.addChild(cube_r13);
            cube_r13.rotateAngleX = (-1.5708F);
            cube_r13.rotateAngleY = (-0.5236F);
            cube_r13.setTextureOffset(4, 15).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r14 = new ModelRenderer(this);
            cube_r14.setRotationPoint(-3.0F, 4.6458F, -1.518F);
            legBackLeft.addChild(cube_r14);
            cube_r14.rotateAngleX = (-1.5708F);
            cube_r14.setTextureOffset(25, 6).addBox(2.0F, -1.75F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r15 = new ModelRenderer(this);
            cube_r15.setRotationPoint(-3.0F, 4.1378F, -1.3979F);
            legBackLeft.addChild(cube_r15);
            cube_r15.rotateAngleX = (1.0472F);
            cube_r15.setTextureOffset(0, 0).addBox(2.5F, -1.85F, 0.5F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r16 = new ModelRenderer(this);
            cube_r16.setRotationPoint(-3.0F, 4.6458F, -1.518F);
            legBackLeft.addChild(cube_r16);
            cube_r16.rotateAngleX = (-0.5236F);
            cube_r16.setTextureOffset(0, 29).addBox(2.5F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r17 = new ModelRenderer(this);
            cube_r17.setRotationPoint(-3.0F, 0.379F, -0.0299F);
            legBackLeft.addChild(cube_r17);
            cube_r17.rotateAngleX = (-0.3491F);
            cube_r17.setTextureOffset(23, 47).addBox(2.0F, -2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            legBackRight = new ModelRenderer(this);
            legBackRight.setRotationPoint(-3.0F, 17.371F, 5.5299F);


            cube_r18 = new ModelRenderer(this);
            cube_r18.setRotationPoint(3.0F, 4.6458F, -1.518F);
            legBackRight.addChild(cube_r18);
            cube_r18.rotateAngleX = (-0.5236F);
            cube_r18.setTextureOffset(25, 29).addBox(-3.5F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r19 = new ModelRenderer(this);
            cube_r19.setRotationPoint(3.0F, 0.379F, -0.0299F);
            legBackRight.addChild(cube_r19);
            cube_r19.rotateAngleX = (-0.3491F);
            cube_r19.setTextureOffset(13, 47).addBox(-4.0F, -2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r20 = new ModelRenderer(this);
            cube_r20.setRotationPoint(3.0F, 4.1378F, -1.3979F);
            legBackRight.addChild(cube_r20);
            cube_r20.rotateAngleX = (1.0472F);
            cube_r20.setTextureOffset(0, 15).addBox(-3.5F, -1.85F, 0.5F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r21 = new ModelRenderer(this);
            cube_r21.setRotationPoint(3.0F, 4.6458F, -1.518F);
            legBackRight.addChild(cube_r21);
            cube_r21.rotateAngleX = (-1.5708F);
            cube_r21.setTextureOffset(31, 19).addBox(-4.0F, -1.75F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r22 = new ModelRenderer(this);
            cube_r22.setRotationPoint(1.0F, 6.1458F, -2.768F);
            legBackRight.addChild(cube_r22);
            cube_r22.rotateAngleZ = (-1.5708F);
            cube_r22.rotateAngleY = (-0.5236F);
            cube_r22.setTextureOffset(4, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r23 = new ModelRenderer(this);
            cube_r23.setRotationPoint(-1.0F, 6.1458F, -2.768F);
            legBackRight.addChild(cube_r23);
            cube_r23.rotateAngleX = (-1.5708F);
            cube_r23.rotateAngleY = (0.5236F);
            cube_r23.setTextureOffset(5, 5).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            wingLeft = new ModelRenderer(this);
            wingLeft.setRotationPoint(4.0F, 15.0F, -2.8698F);


            cube_r24 = new ModelRenderer(this);
            cube_r24.setRotationPoint(0.0F, 0.0F, 0.0698F);
            wingLeft.addChild(cube_r24);
            cube_r24.rotateAngleX = (0.082F);
            cube_r24.rotateAngleY = (-0.0298F);
            cube_r24.rotateAngleZ = (0.3478F);
            cube_r24.setTextureOffset(0, 25).addBox(0.0F, -0.4895F, -4.4397F, 8.0F, 1.0F, 9.0F, 0.0F, false);

            subwingLeft = new ModelRenderer(this);
            subwingLeft.setRotationPoint(7.5992F, 2.9503F, -0.6585F);
            wingLeft.addChild(subwingLeft);


            cube_r25 = new ModelRenderer(this);
            cube_r25.setRotationPoint(5.4583F, 4.9377F, -4.0431F);
            subwingLeft.addChild(cube_r25);
            cube_r25.rotateAngleX = (0.7214F);
            cube_r25.rotateAngleY = (-0.0561F);
            cube_r25.rotateAngleZ = (0.6963F);
            cube_r25.setTextureOffset(0, 21).addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r26 = new ModelRenderer(this);
            cube_r26.setRotationPoint(-0.3229F, 0.0295F, -0.3479F);
            subwingLeft.addChild(cube_r26);
            cube_r26.rotateAngleX = (0.0669F);
            cube_r26.rotateAngleY = (-0.0561F);
            cube_r26.rotateAngleZ = (0.6963F);
            cube_r26.setTextureOffset(25, 0).addBox(-0.1354F, -0.7172F, -2.1089F, 8.0F, 1.0F, 5.0F, 0.0F, false);

            wingRight = new ModelRenderer(this);
            wingRight.setRotationPoint(-4.0F, 15.0F, -2.8F);


            cube_r27 = new ModelRenderer(this);
            cube_r27.setRotationPoint(-4.2886F, 1.2858F, -0.5431F);
            wingRight.addChild(cube_r27);
            cube_r27.rotateAngleX = (0.0873F);
            cube_r27.rotateAngleY = (0.0311F);
            cube_r27.rotateAngleZ = (-0.3478F);
            cube_r27.setTextureOffset(0, 15).addBox(-3.5F, -0.25F, -3.8F, 8.0F, 1.0F, 9.0F, 0.0F, false);

            subwingRight = new ModelRenderer(this);
            subwingRight.setRotationPoint(-7.4655F, 2.9185F, -0.6896F);
            wingRight.addChild(subwingRight);


            cube_r28 = new ModelRenderer(this);
            cube_r28.setRotationPoint(-4.9455F, 4.3808F, -3.1163F);
            subwingRight.addChild(cube_r28);
            cube_r28.rotateAngleX = (0.5078F);
            cube_r28.rotateAngleY = (0.059F);
            cube_r28.rotateAngleZ = (-0.6962F);
            cube_r28.setTextureOffset(0, 6).addBox(-0.5F, -0.1F, -0.85F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r29 = new ModelRenderer(this);
            cube_r29.setRotationPoint(0.2152F, -0.3158F, 0.1026F);
            subwingRight.addChild(cube_r29);
            cube_r29.rotateAngleX = (0.0714F);
            cube_r29.rotateAngleY = (0.059F);
            cube_r29.rotateAngleZ = (-0.6962F);
            cube_r29.setTextureOffset(0, 35).addBox(-7.2697F, -0.4651F, -2.6363F, 7.0F, 1.0F, 5.0F, 0.0F, false);
        }
    }

    @Override
    protected Iterable<ModelRenderer> getHeadParts () {
        return ImmutableList.of(this.headModel);
    }

    @Override
    protected Iterable<ModelRenderer> getBodyParts () {
        return ImmutableList.of(this.body, this.legBackLeft, this.legBackRight, this.wingLeft, this.wingRight);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.headModel.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.headModel.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.legBackRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.legBackLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.wingRight.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.0F * limbSwingAmount;
        this.wingLeft.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.0F * limbSwingAmount;
    }
}