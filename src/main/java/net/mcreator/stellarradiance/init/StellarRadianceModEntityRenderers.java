
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stellarradiance.client.renderer.YxhRenderer;
import net.mcreator.stellarradiance.client.renderer.StellarRadianceBirdRenderer;
import net.mcreator.stellarradiance.client.renderer.StellarParasiterRenderer;
import net.mcreator.stellarradiance.client.renderer.StellarEnergyNexusRenderer;
import net.mcreator.stellarradiance.client.renderer.StellarCrystalArrowRenderer;
import net.mcreator.stellarradiance.client.renderer.LongTailedTitRenderer;
import net.mcreator.stellarradiance.client.renderer.JiHuoDeHexinRenderer;
import net.mcreator.stellarradiance.client.renderer.ActiveCrystalRenderer;
import net.mcreator.stellarradiance.client.renderer.ABlockRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StellarRadianceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StellarRadianceModEntities.STELLAR_CRYSTAL_ARROW.get(), StellarCrystalArrowRenderer::new);
		event.registerEntityRenderer(StellarRadianceModEntities.JI_HUO_DE_HEXIN.get(), JiHuoDeHexinRenderer::new);
		event.registerEntityRenderer(StellarRadianceModEntities.A_BLOCK.get(), ABlockRenderer::new);
		event.registerEntityRenderer(StellarRadianceModEntities.YXH.get(), YxhRenderer::new);
		event.registerEntityRenderer(StellarRadianceModEntities.STELLAR_RADIANCE_BIRD.get(), StellarRadianceBirdRenderer::new);
		event.registerEntityRenderer(StellarRadianceModEntities.LONG_TAILED_TIT.get(), LongTailedTitRenderer::new);
		event.registerEntityRenderer(StellarRadianceModEntities.STELLAR_PARASITER.get(), StellarParasiterRenderer::new);
		event.registerEntityRenderer(StellarRadianceModEntities.ACTIVE_CRYSTAL.get(), ActiveCrystalRenderer::new);
		event.registerEntityRenderer(StellarRadianceModEntities.STELLAR_ENERGY_NEXUS.get(), StellarEnergyNexusRenderer::new);
	}
}
