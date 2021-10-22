package net.earthspawn.mod.blocks.states;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.PlantType;

import java.util.function.ToIntFunction;

public class Gladiolus extends FlowerBlock {

    public Gladiolus() {
        super(Effects.HASTE, 0, Properties.create(Material.PLANTS, MaterialColor.CYAN)
                .hardnessAndResistance(0.0F)
                .doesNotBlockMovement()
                .harvestLevel(0)
                .sound(SoundType.PLANT)
                .setEmmisiveRendering(new IPositionPredicate() {
                    @Override
                    public boolean test(BlockState p_test_1_, IBlockReader p_test_2_, BlockPos p_test_3_) {
                        return true;
                    }
                })
                .setLightLevel(new ToIntFunction<BlockState>() {
                    @Override
                    public int applyAsInt(BlockState value) {
                        return 10;
                    }
                }));
    }

    @Override
    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.PLAINS;
    }
}