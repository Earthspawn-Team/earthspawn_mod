package net.earthspawn.mod.blocks.states;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class TopazOre extends OreBlock {

    public TopazOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
        .hardnessAndResistance(1F)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(2)
        .sound(SoundType.STONE));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return super.getExpDrop(state, reader, pos, fortune, silktouch);
    }
}
