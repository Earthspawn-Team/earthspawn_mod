package net.earthspawn.mod.blocks.states;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HallowDirt extends Block {

    public HallowDirt() {
        super(AbstractBlock.Properties.create(Material.EARTH)
        .hardnessAndResistance(0.5F)
        .harvestTool(ToolType.SHOVEL)
        .harvestLevel(0)
        .sound(SoundType.GROUND));
    }
}
