package net.earthspawn.mod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class HallowGrass extends Block {

    public HallowGrass() {
        super(AbstractBlock.Properties.create(Material.ORGANIC, MaterialColor.CYAN)
        .hardnessAndResistance(0.5F)
        .harvestTool(ToolType.SHOVEL)
        .harvestLevel(0)
        .sound(SoundType.PLANT));
    }
}
