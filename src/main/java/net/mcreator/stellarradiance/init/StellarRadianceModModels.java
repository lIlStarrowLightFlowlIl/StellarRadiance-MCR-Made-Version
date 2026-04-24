
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stellarradiance.client.model.Modelstellar_energy_nexus;
import net.mcreator.stellarradiance.client.model.Modelstellar_crystal_arrow;
import net.mcreator.stellarradiance.client.model.Modeljihuodehexin;
import net.mcreator.stellarradiance.client.model.Modelbird;
import net.mcreator.stellarradiance.client.model.ModelStellar_armor_test;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StellarRadianceModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbird.LAYER_LOCATION, Modelbird::createBodyLayer);
		event.registerLayerDefinition(Modelstellar_crystal_arrow.LAYER_LOCATION, Modelstellar_crystal_arrow::createBodyLayer);
		event.registerLayerDefinition(Modeljihuodehexin.LAYER_LOCATION, Modeljihuodehexin::createBodyLayer);
		event.registerLayerDefinition(Modelstellar_energy_nexus.LAYER_LOCATION, Modelstellar_energy_nexus::createBodyLayer);
		event.registerLayerDefinition(ModelStellar_armor_test.LAYER_LOCATION, ModelStellar_armor_test::createBodyLayer);
	}
}
