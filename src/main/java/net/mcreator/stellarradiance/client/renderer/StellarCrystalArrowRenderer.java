package net.mcreator.stellarradiance.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.stellarradiance.entity.StellarCrystalArrowEntity;
import net.mcreator.stellarradiance.client.model.Modelstellar_crystal_arrow;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StellarCrystalArrowRenderer extends EntityRenderer<StellarCrystalArrowEntity> {
	private static final ResourceLocation texture = new ResourceLocation("stellar_radiance:textures/entities/stellar_crystal_arrow.png");
	private final Modelstellar_crystal_arrow model;

	public StellarCrystalArrowRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelstellar_crystal_arrow(context.bakeLayer(Modelstellar_crystal_arrow.LAYER_LOCATION));
	}

	@Override
	public void render(StellarCrystalArrowEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(StellarCrystalArrowEntity entity) {
		return texture;
	}
}
