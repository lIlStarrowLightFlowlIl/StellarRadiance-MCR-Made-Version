
package net.mcreator.stellarradiance.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.stellarradiance.entity.model.StellarEnergyNexusModel;
import net.mcreator.stellarradiance.entity.layer.StellarEnergyNexusLayer;
import net.mcreator.stellarradiance.entity.StellarEnergyNexusEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StellarEnergyNexusRenderer extends GeoEntityRenderer<StellarEnergyNexusEntity> {
	public StellarEnergyNexusRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new StellarEnergyNexusModel());
		this.shadowRadius = 0f;
		this.addRenderLayer(new StellarEnergyNexusLayer(this));
	}

	@Override
	public RenderType getRenderType(StellarEnergyNexusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, StellarEnergyNexusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 4f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
