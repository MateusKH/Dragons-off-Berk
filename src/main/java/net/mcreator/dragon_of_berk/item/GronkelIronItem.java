
package net.mcreator.dragon_of_berk.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.dragon_of_berk.init.DragonOfBerkModTabs;

public class GronkelIronItem extends Item {
	public GronkelIronItem() {
		super(new Item.Properties().tab(DragonOfBerkModTabs.TAB_DRAGONOFBERKITENS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
