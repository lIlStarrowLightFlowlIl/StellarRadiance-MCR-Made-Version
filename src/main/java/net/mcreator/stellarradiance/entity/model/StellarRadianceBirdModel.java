package net.mcreator.stellarradiance.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stellarradiance.entity.StellarRadianceBirdEntity;

public class StellarRadianceBirdModel extends GeoModel<StellarRadianceBirdEntity> {
	@Override
	public ResourceLocation getAnimationResource(StellarRadianceBirdEntity entity) {
		return new ResourceLocation("stellar_radiance", "animations/stellar_radience_bird.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StellarRadianceBirdEntity entity) {
		return new ResourceLocation("stellar_radiance", "geo/stellar_radience_bird.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StellarRadianceBirdEntity entity) {
		return new ResourceLocation("stellar_radiance", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(StellarRadianceBirdEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
