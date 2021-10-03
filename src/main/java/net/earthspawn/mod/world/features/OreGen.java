package net.earthspawn.mod.world.features;

import net.earthspawn.mod.utils.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGen {

    public static void addOres(BiomeLoadingEvent event){
        addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandler.TOPAZ_ORE.get().getDefaultState(), 4, 0, 16, 3);
    }

    public static void addOre(BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minHeight, int maxHeight, int amount){
        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(rule, state, veinSize);
        TopSolidRangeConfig topSolidRangeConfig = new TopSolidRangeConfig(minHeight, 0, maxHeight);
        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(oreFeatureConfig).withPlacement(Placement.RANGE.configure(topSolidRangeConfig)).square().func_242731_b(amount));
    }
}
