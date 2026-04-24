package net.mcreator.stellarradiance.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.stellarradiance.entity.StellarEnergyNexusEntity;

public class StellarEnergyNexusModel extends GeoModel<StellarEnergyNexusEntity> {
	@Override
	public ResourceLocation getAnimationResource(StellarEnergyNexusEntity entity) {
		return new ResourceLocation("stellar_radiance", "animations/stellar_energy_nexus_new.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StellarEnergyNexusEntity entity) {
		return new ResourceLocation("stellar_radiance", "geo/stellar_energy_nexus_new.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StellarEnergyNexusEntity entity) {
		return new ResourceLocation("stellar_radiance", "textures/entities/" + entity.getTexture() + ".png");
	}

}
