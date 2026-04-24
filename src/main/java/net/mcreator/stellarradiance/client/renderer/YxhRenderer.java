
package net.mcreator.stellarradiance.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.stellarradiance.entity.model.YxhModel;
import net.mcreator.stellarradiance.entity.layer.YxhLayer;
import net.mcreator.stellarradiance.entity.YxhEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class YxhRenderer extends GeoEntityRenderer<YxhEntity> {
	public YxhRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new YxhModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new YxhLayer(this));
	}

	@Override
	public RenderType getRenderType(YxhEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, YxhEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(YxhEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
