package net.earthspawn.mod.core.init;

import net.earthspawn.mod.EarthspawnMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EarthspawnMod.MOD_ID);

    public static final RegistryObject<Block> HALLOW_GRASS = BLOCKS.register("hallow_grass", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.CYAN)
            .hardnessAndResistance(0.5F,0.5F)
            .harvestTool(ToolType.SHOVEL)
            .harvestLevel(0)
            .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> HALLOW_DIRT = BLOCKS.register("hallow_dirt", () ->
            new Block(AbstractBlock.Properties.create(Material.EARTH, MaterialColor.GRAY)
            .hardnessAndResistance(0.5F, 0.5F)
            .harvestTool(ToolType.SHOVEL)
            .harvestLevel(0)
            .sound(SoundType.GROUND)));
}
