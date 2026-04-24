package net.mcreator.stellarradiance.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stellarradiance.entity.LongTailedTitEntity;

public class LongTailedTitModel extends GeoModel<LongTailedTitEntity> {
	@Override
	public ResourceLocation getAnimationResource(LongTailedTitEntity entity) {
		return new ResourceLocation("stellar_radiance", "animations/bcwsq.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LongTailedTitEntity entity) {
		return new ResourceLocation("stellar_radiance", "geo/bcwsq.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LongTailedTitEntity entity) {
		return new ResourceLocation("stellar_radiance", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(LongTailedTitEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
