
package net.mcreator.dragon_of_berk.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.dragon_of_berk.entity.model.PapaTudoModel;
import net.mcreator.dragon_of_berk.entity.PapaTudoEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PapaTudoRenderer extends GeoEntityRenderer<PapaTudoEntity> {
	public PapaTudoRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PapaTudoModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(PapaTudoEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
