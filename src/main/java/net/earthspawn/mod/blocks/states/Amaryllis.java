package net.earthspawn.mod.blocks.states;

import net.minecraft.block.FlowerBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.PlantType;

public class Amaryllis extends FlowerBlock {

    public Amaryllis() {
        super(Effects.HASTE, 0, Properties.create(Material.PLANTS, MaterialColor.CYAN)
                .hardnessAndResistance(0.0F)
                .doesNotBlockMovement()
                .harvestLevel(0)
                .sound(SoundType.PLANT));
    }

    @Override
    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.PLAINS;
    }
}