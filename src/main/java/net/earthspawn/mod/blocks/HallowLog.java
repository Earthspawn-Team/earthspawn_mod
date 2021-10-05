package net.earthspawn.mod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class HallowLog extends Block {

    public HallowLog() {
        super(AbstractBlock.Properties.create(Material.NETHER_WOOD, MaterialColor.CYAN_TERRACOTTA)
                .hardnessAndResistance(2F)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0)
                .sound(SoundType.HYPHAE));
    }
}
