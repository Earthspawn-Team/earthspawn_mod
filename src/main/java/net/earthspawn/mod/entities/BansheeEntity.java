package net.earthspawn.mod.entities;

import net.earthspawn.mod.utils.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class BansheeEntity extends AnimalEntity{


    public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(Items.WHEAT);

    public BansheeEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
        AxisAlignedBB aabb = this.getBoundingBox();
        this.setBoundingBox(new AxisAlignedBB(aabb.minX - 0.5d, aabb.minY, aabb.minZ - 0.5d, aabb.maxX - 0.5d, aabb.maxY - 0.5d, aabb.maxZ - 0.5d));
    }


    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new PanicGoal(this, 1.2D));
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new BreedGoal(this, 0.7D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 0.8D, TEMPTATION_ITEMS, false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new RandomWalkingGoal(this, 0.4D));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));

    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 15.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3D);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_PHANTOM_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_BLAZE_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_PHANTOM_HURT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_COW_STEP, 0.15F, 1.0F);
    }

    @Override
    public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {

        BansheeEntity entity = new BansheeEntity(RegistryHandler.BANSHEE_ENTITY.get(), this.world);

        entity.onInitialSpawn((IServerWorld) this.world, this.world.getDifficultyForLocation(new BlockPos(this.getPosX(), this.getPosY(), this.getPosZ())),
                SpawnReason.BREEDING, null, (CompoundNBT) null);
        return entity;
    }
}
