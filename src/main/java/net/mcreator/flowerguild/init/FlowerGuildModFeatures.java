
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flowerguild.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.flowerguild.world.features.ores.MulchFeature;
import net.mcreator.flowerguild.world.features.ores.LoamFeature;
import net.mcreator.flowerguild.FlowerGuildMod;

@Mod.EventBusSubscriber
public class FlowerGuildModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FlowerGuildMod.MODID);
	public static final RegistryObject<Feature<?>> LOAM = REGISTRY.register("loam", LoamFeature::feature);
	public static final RegistryObject<Feature<?>> MULCH = REGISTRY.register("mulch", MulchFeature::feature);
}
