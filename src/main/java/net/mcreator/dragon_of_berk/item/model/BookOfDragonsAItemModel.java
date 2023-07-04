package net.mcreator.dragon_of_berk.item.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dragon_of_berk.item.BookOfDragonsAItem;

public class BookOfDragonsAItemModel extends GeoModel<BookOfDragonsAItem> {
	@Override
	public ResourceLocation getAnimationResource(BookOfDragonsAItem animatable) {
		return new ResourceLocation("dragon_of_berk", "animations/livrodragao.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BookOfDragonsAItem animatable) {
		return new ResourceLocation("dragon_of_berk", "geo/livrodragao.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BookOfDragonsAItem animatable) {
		return new ResourceLocation("dragon_of_berk", "textures/item/livrodragaotexture..png");
	}
}
