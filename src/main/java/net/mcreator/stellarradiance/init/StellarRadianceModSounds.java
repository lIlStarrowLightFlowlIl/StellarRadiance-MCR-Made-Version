
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stellarradiance.StellarRadianceMod;

public class StellarRadianceModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StellarRadianceMod.MODID);
	public static final RegistryObject<SoundEvent> ECHO_IN_THE_VALLEY = REGISTRY.register("echo_in_the_valley", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stellar_radiance", "echo_in_the_valley")));
}
