
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flowerguild.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.flowerguild.item.FlowerDimensionItem;
import net.mcreator.flowerguild.FlowerGuildMod;

public class FlowerGuildModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FlowerGuildMod.MODID);
	public static final RegistryObject<Item> FLOWER_DIMENSION = REGISTRY.register("flower_dimension", () -> new FlowerDimensionItem());
	public static final RegistryObject<Item> LOAM = block(FlowerGuildModBlocks.LOAM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MULCH = block(FlowerGuildModBlocks.MULCH, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEM = block(FlowerGuildModBlocks.STEM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RED_PETAL = block(FlowerGuildModBlocks.RED_PETAL, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
