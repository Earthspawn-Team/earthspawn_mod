package net.earthspawn.mod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TopazOre extends Block {

    public TopazOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(1F)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(2)
        .sound(SoundType.STONE));
    }
}
