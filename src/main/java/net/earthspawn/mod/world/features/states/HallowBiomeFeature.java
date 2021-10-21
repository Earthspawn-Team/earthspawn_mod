package net.earthspawn.mod.world.features.states;

import com.mojang.serialization.Codec;
import net.earthspawn.mod.blocks.BlockRegister;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;

public class HallowBiomeFeature extends Feature<NoFeatureConfig> {

    private static final BlockState HALLOW_ROOT = BlockRegister.HALLOW_ROOTS.get().getDefaultState();

    public HallowBiomeFeature(Codec<NoFeatureConfig> codec) {
        super(codec);
    }

    public boolean isAirOrLeaves(IWorldGenerationBaseReader reader, BlockPos pos) {
        if(!(reader instanceof IWorldReader)) {
            return reader.hasBlockState(pos, state -> state.isAir() || state.isIn(BlockTags.LEAVES));
        } else {
            return reader.hasBlockState(pos, state -> state.canBeReplacedByLeaves((IWorldReader) reader, pos));
        }
    }

    @Override
    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {

        while(pos.getY() > 1 && isAirOrLeaves(reader, pos)) {
            pos = pos.down();
        }
        pos = pos.up();

        setBlockState(reader, pos, HALLOW_ROOT);
        return false;
    }
}
