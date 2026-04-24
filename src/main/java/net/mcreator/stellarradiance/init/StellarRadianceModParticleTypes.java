
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.stellarradiance.StellarRadianceMod;

public class StellarRadianceModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, StellarRadianceMod.MODID);
	public static final RegistryObject<SimpleParticleType> STAR = REGISTRY.register("star", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> STELLAR_EXPLOSION = REGISTRY.register("stellar_explosion", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> STELLAR_EXPLOSION_2 = REGISTRY.register("stellar_explosion_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> LARGESTAR = REGISTRY.register("largestar", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BIOME_DUST = REGISTRY.register("biome_dust", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CONTRAIL = REGISTRY.register("contrail", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> LARGE_CONTRAIL = REGISTRY.register("large_contrail", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SMALL_CONTRAIL = REGISTRY.register("small_contrail", () -> new SimpleParticleType(false));
}
