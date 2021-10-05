package net.earthspawn.mod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.function.ToIntFunction;

public class HallowLogGlowing extends Block {

    public HallowLogGlowing() {
        super(AbstractBlock.Properties.create(Material.NETHER_WOOD, MaterialColor.CYAN_TERRACOTTA)
                .hardnessAndResistance(2F)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0)
                .sound(SoundType.HYPHAE)
                .setEmmisiveRendering(new IPositionPredicate() {
                    @Override
                    public boolean test(BlockState p_test_1_, IBlockReader p_test_2_, BlockPos p_test_3_) {
                        return true;
                    }
                })
                .setLightLevel(new ToIntFunction<BlockState>() {
                    @Override
                    public int applyAsInt(BlockState value) {
                        return 2;
                    }
                }));
    }
}
