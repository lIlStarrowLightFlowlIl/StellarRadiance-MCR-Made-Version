
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.stellarradiance.potion.ProtectingMobEffect;
import net.mcreator.stellarradiance.potion.ImprecationMobEffect;
import net.mcreator.stellarradiance.StellarRadianceMod;

public class StellarRadianceModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StellarRadianceMod.MODID);
	public static final RegistryObject<MobEffect> IMPRECATION = REGISTRY.register("imprecation", () -> new ImprecationMobEffect());
	public static final RegistryObject<MobEffect> PROTECTING = REGISTRY.register("protecting", () -> new ProtectingMobEffect());
}
