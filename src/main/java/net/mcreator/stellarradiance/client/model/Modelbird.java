package net.mcreator.stellarradiance.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbird<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("stellar_radiance", "modelbird"), "main");
	public final ModelPart WingB;
	public final ModelPart WingA;
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart Tail;
	public final ModelPart LegA;
	public final ModelPart LegB;

	public Modelbird(ModelPart root) {
		this.WingB = root.getChild("WingB");
		this.WingA = root.getChild("WingA");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.Tail = root.getChild("Tail");
		this.LegA = root.getChild("LegA");
		this.LegB = root.getChild("LegB");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition WingB = partdefinition.addOrReplaceChild("WingB", CubeListBuilder.create(), PartPose.offset(-1.5F, 16.9F, -2.8F));
		PartDefinition WingB_r1 = WingB.addOrReplaceChild("WingB_r1", CubeListBuilder.create().texOffs(9, 6).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.25F, 0.25F, 1.0F, -0.4897F, 0.8214F, 1.2125F));
		PartDefinition WingA = partdefinition.addOrReplaceChild("WingA", CubeListBuilder.create(), PartPose.offset(1.5F, 16.9F, -2.8F));
		PartDefinition WingA_r1 = WingA.addOrReplaceChild("WingA_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.25F, 0.25F, 1.0F, -0.4849F, -0.8705F, -1.2336F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.5F, -3.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(15, 12).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 14).addBox(-1.0F, -2.25F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 6)
						.addBox(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 18).addBox(-0.5F, -1.0F, -3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(0.0F, -4.95F, -1.6F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 10).addBox(-0.75F, -1.75F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 6)
						.addBox(-0.25F, -1.75F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.7F, -2.8F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 0).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.1F, 1.2F, 0.8727F, 0.0F, 0.0F));
		PartDefinition LegA = partdefinition.addOrReplaceChild("LegA", CubeListBuilder.create().texOffs(17, 17).addBox(-1.0F, -0.75F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 23.0F, -0.5F, 0.2182F, 0.0F, 0.0F));
		PartDefinition LegB = partdefinition.addOrReplaceChild("LegB", CubeListBuilder.create().texOffs(5, 14).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 22.75F, -0.5F, 0.2618F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		WingB.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		WingA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LegA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LegB.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LegB.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Tail.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LegA.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.WingB.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.WingA.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
