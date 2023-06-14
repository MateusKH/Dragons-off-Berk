package net.mcreator.dragon_of_berk.entity.model;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.dragon_of_berk.entity.PapaTudoEntity;

public class PapaTudoModel extends AnimatedGeoModel<PapaTudoEntity> {
	@Override
	public ResourceLocation getAnimationResource(PapaTudoEntity entity) {
		return new ResourceLocation("dragon_of_berk", "animations/papatudomodel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PapaTudoEntity entity) {
		return new ResourceLocation("dragon_of_berk", "geo/papatudomodel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PapaTudoEntity entity) {
		return new ResourceLocation("dragon_of_berk", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(PapaTudoEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("rotationcabeca");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
