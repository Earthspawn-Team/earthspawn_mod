package net.earthspawn.mod.blocks.states;

import net.earthspawn.mod.EarthspawnMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.ToIntFunction;

public class HallowRoots extends FlowerBlock {

    public HallowRoots() {
        super(Effects.HASTE, 0, Properties.create(Material.NETHER_PLANTS, MaterialColor.CYAN)
                .hardnessAndResistance(0.1F)
                .doesNotBlockMovement()
                .harvestLevel(0)
                .sound(SoundType.ROOT)
                .setLightLevel(new ToIntFunction<BlockState>() {
                    @Override
                    public int applyAsInt(BlockState value) {
                        return 4;
                    }
                }));
    }

    @Override
    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.PLAINS;
    }
}