package net.mcreator.stellarradiance.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelStellar_armor_test<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("stellar_radiance", "model_stellar_armor_test"), "main");
	public final ModelPart armorHead;

	public ModelStellar_armor_test(ModelPart root) {
		this.armorHead = root.getChild("armorHead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -10.0F, -4.0F, 4.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-6.0F, -7.0F, -3.0F, 12.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-5.0F, -9.0F, -5.25F, 10.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.75F, -8.75F, -1.75F, 9.5F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armorHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
