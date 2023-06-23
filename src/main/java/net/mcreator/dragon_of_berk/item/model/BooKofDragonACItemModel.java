package net.mcreator.dragon_of_berk.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dragon_of_berk.item.BooKofDragonACItem;

public class BooKofDragonACItemModel extends GeoModel<BooKofDragonACItem> {
	@Override
	public ResourceLocation getAnimationResource(BooKofDragonACItem animatable) {
		return new ResourceLocation("dragon_of_berk", "animations/livrodragao.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BooKofDragonACItem animatable) {
		return new ResourceLocation("dragon_of_berk", "geo/livrodragao.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BooKofDragonACItem animatable) {
		return new ResourceLocation("dragon_of_berk", "textures/item/livrodragaotexture..png");
	}
}
