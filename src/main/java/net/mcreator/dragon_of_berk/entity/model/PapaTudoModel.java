package net.mcreator.dragon_of_berk.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.dragon_of_berk.entity.PapaTudoEntity;

public class PapaTudoModel extends GeoModel<PapaTudoEntity> {
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
	public void setCustomAnimations(PapaTudoEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
