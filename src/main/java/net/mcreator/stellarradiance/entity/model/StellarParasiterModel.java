package net.mcreator.stellarradiance.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.stellarradiance.entity.StellarParasiterEntity;

public class StellarParasiterModel extends GeoModel<StellarParasiterEntity> {
	@Override
	public ResourceLocation getAnimationResource(StellarParasiterEntity entity) {
		return new ResourceLocation("stellar_radiance", "animations/stellar_parasiter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StellarParasiterEntity entity) {
		return new ResourceLocation("stellar_radiance", "geo/stellar_parasiter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StellarParasiterEntity entity) {
		return new ResourceLocation("stellar_radiance", "textures/entities/" + entity.getTexture() + ".png");
	}

}
