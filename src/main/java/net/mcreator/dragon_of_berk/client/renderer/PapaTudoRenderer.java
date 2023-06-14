
package net.mcreator.dragon_of_berk.client.renderer;

public class PapaTudoRenderer extends GeoEntityRenderer<PapaTudoEntity> {
	public PapaTudoRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PapaTudoModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(PapaTudoEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PapaTudoEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}