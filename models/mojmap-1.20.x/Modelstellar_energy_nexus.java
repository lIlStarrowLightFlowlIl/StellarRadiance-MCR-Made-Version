// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelstellar_energy_nexus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "stellar_energy_nexus"), "main");
	private final ModelPart Center;
	private final ModelPart Huan;

	public Modelstellar_energy_nexus(ModelPart root) {
		this.Center = root.getChild("Center");
		this.Huan = root.getChild("Huan");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Center = partdefinition.addOrReplaceChild("Center",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition Huan = partdefinition.addOrReplaceChild("Huan", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Kuai_r1 = Huan.addOrReplaceChild("Kuai_r1",
				CubeListBuilder.create().texOffs(0, 44).addBox(-13.0F, -2.0F, -13.0F, 26.0F, 4.0F, 26.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, 0.1309F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Center.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Huan.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Center.yRot = ageInTicks;
		this.Huan.yRot = ageInTicks / 20.f;
	}
}