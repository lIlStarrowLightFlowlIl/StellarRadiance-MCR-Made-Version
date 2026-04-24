
package net.mcreator.stellarradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.stellarradiance.entity.JiHuoDeHexinEntity;
import net.mcreator.stellarradiance.client.model.Modeljihuodehexin;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class JiHuoDeHexinRenderer extends MobRenderer<JiHuoDeHexinEntity, Modeljihuodehexin<JiHuoDeHexinEntity>> {
	public JiHuoDeHexinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljihuodehexin(context.bakeLayer(Modeljihuodehexin.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<JiHuoDeHexinEntity, Modeljihuodehexin<JiHuoDeHexinEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("stellar_radiance:textures/entities/jihuodehexin_light.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, JiHuoDeHexinEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(JiHuoDeHexinEntity entity) {
		return new ResourceLocation("stellar_radiance:textures/entities/jihuodehexin.png");
	}
}
