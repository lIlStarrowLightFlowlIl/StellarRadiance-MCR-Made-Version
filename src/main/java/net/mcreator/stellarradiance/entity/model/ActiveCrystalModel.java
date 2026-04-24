package net.mcreator.stellarradiance.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stellarradiance.entity.ActiveCrystalEntity;

public class ActiveCrystalModel extends GeoModel<ActiveCrystalEntity> {
	@Override
	public ResourceLocation getAnimationResource(ActiveCrystalEntity entity) {
		return new ResourceLocation("stellar_radiance", "animations/active_crystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ActiveCrystalEntity entity) {
		return new ResourceLocation("stellar_radiance", "geo/active_crystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ActiveCrystalEntity entity) {
		return new ResourceLocation("stellar_radiance", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ActiveCrystalEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
