
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.stellarradiance.StellarRadianceMod;

public class StellarRadianceModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, StellarRadianceMod.MODID);
	public static final RegistryObject<PaintingVariant> XHLG = REGISTRY.register("xhlg", () -> new PaintingVariant(32, 32));
}
