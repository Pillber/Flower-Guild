
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flowerguild.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.flowerguild.world.biome.MulchFieldsBiome;
import net.mcreator.flowerguild.world.biome.ExtremeFlowerForestBiome;
import net.mcreator.flowerguild.FlowerGuildMod;

public class FlowerGuildModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, FlowerGuildMod.MODID);
	public static final RegistryObject<Biome> MULCH_FIELDS = REGISTRY.register("mulch_fields", MulchFieldsBiome::createBiome);
	public static final RegistryObject<Biome> EXTREME_FLOWER_FOREST = REGISTRY.register("extreme_flower_forest",
			ExtremeFlowerForestBiome::createBiome);
}
