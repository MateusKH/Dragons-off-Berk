package net.mcreator.dragon_of_berk.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dragon_of_berk.entity.GronkelEntity;

public class GronkelModel extends GeoModel<GronkelEntity> {
	@Override
	public ResourceLocation getAnimationResource(GronkelEntity entity) {
		return new ResourceLocation("dragon_of_berk", "animations/gronkel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GronkelEntity entity) {
		return new ResourceLocation("dragon_of_berk", "geo/gronkel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GronkelEntity entity) {
		return new ResourceLocation("dragon_of_berk", "textures/entities/" + entity.getTexture() + ".png");
	}

}
