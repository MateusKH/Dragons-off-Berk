package net.mcreator.dragon_of_berk.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dragon_of_berk.item.BooKofDragonsItem;

public class BooKofDragonsItemModel extends GeoModel<BooKofDragonsItem> {
	@Override
	public ResourceLocation getAnimationResource(BooKofDragonsItem animatable) {
		return new ResourceLocation("dragon_of_berk", "animations/livrodragao1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BooKofDragonsItem animatable) {
		return new ResourceLocation("dragon_of_berk", "geo/livrodragao1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BooKofDragonsItem animatable) {
		return new ResourceLocation("dragon_of_berk", "textures/item/livrodragaotexture..png");
	}
}
