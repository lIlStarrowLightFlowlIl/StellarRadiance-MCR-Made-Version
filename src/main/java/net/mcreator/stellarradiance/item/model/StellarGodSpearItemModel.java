package net.mcreator.stellarradiance.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.stellarradiance.item.StellarGodSpearItem;

public class StellarGodSpearItemModel extends GeoModel<StellarGodSpearItem> {
	@Override
	public ResourceLocation getAnimationResource(StellarGodSpearItem animatable) {
		return new ResourceLocation("stellar_radiance", "animations/stellar_god_spear_geo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StellarGodSpearItem animatable) {
		return new ResourceLocation("stellar_radiance", "geo/stellar_god_spear_geo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StellarGodSpearItem animatable) {
		return new ResourceLocation("stellar_radiance", "textures/item/stellar_god_spear_geo.png");
	}
}
