
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stellarradiance.client.particle.StellarExplosionParticle;
import net.mcreator.stellarradiance.client.particle.StellarExplosion2Particle;
import net.mcreator.stellarradiance.client.particle.StarParticle;
import net.mcreator.stellarradiance.client.particle.SmallContrailParticle;
import net.mcreator.stellarradiance.client.particle.LargestarParticle;
import net.mcreator.stellarradiance.client.particle.LargeContrailParticle;
import net.mcreator.stellarradiance.client.particle.ContrailParticle;
import net.mcreator.stellarradiance.client.particle.BiomeDustParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StellarRadianceModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(StellarRadianceModParticleTypes.STAR.get(), StarParticle::provider);
		event.registerSpriteSet(StellarRadianceModParticleTypes.STELLAR_EXPLOSION.get(), StellarExplosionParticle::provider);
		event.registerSpriteSet(StellarRadianceModParticleTypes.STELLAR_EXPLOSION_2.get(), StellarExplosion2Particle::provider);
		event.registerSpriteSet(StellarRadianceModParticleTypes.LARGESTAR.get(), LargestarParticle::provider);
		event.registerSpriteSet(StellarRadianceModParticleTypes.BIOME_DUST.get(), BiomeDustParticle::provider);
		event.registerSpriteSet(StellarRadianceModParticleTypes.CONTRAIL.get(), ContrailParticle::provider);
		event.registerSpriteSet(StellarRadianceModParticleTypes.LARGE_CONTRAIL.get(), LargeContrailParticle::provider);
		event.registerSpriteSet(StellarRadianceModParticleTypes.SMALL_CONTRAIL.get(), SmallContrailParticle::provider);
	}
}
