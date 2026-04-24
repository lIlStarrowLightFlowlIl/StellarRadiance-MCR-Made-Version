
package net.mcreator.stellarradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.stellarradiance.entity.ABlockEntity;

public class ABlockRenderer extends HumanoidMobRenderer<ABlockEntity, HumanoidModel<ABlockEntity>> {
	public ABlockRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ABlockEntity entity) {
		return new ResourceLocation("stellar_radiance:textures/entities/empty.png");
	}

	@Override
	protected boolean isBodyVisible(ABlockEntity entity) {
		return false;
	}
}
