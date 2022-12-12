
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flowerguild.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.flowerguild.block.StemBlock;
import net.mcreator.flowerguild.block.RedPetalBlock;
import net.mcreator.flowerguild.block.MulchBlock;
import net.mcreator.flowerguild.block.LoamBlock;
import net.mcreator.flowerguild.block.FlowerDimensionPortalBlock;
import net.mcreator.flowerguild.FlowerGuildMod;

public class FlowerGuildModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FlowerGuildMod.MODID);
	public static final RegistryObject<Block> FLOWER_DIMENSION_PORTAL = REGISTRY.register("flower_dimension_portal",
			() -> new FlowerDimensionPortalBlock());
	public static final RegistryObject<Block> LOAM = REGISTRY.register("loam", () -> new LoamBlock());
	public static final RegistryObject<Block> MULCH = REGISTRY.register("mulch", () -> new MulchBlock());
	public static final RegistryObject<Block> STEM = REGISTRY.register("stem", () -> new StemBlock());
	public static final RegistryObject<Block> RED_PETAL = REGISTRY.register("red_petal", () -> new RedPetalBlock());
}
