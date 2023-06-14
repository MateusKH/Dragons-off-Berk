
package net.mcreator.dragon_of_berk.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.dragon_of_berk.init.DragonOfBerkModTabs;
import net.mcreator.dragon_of_berk.init.DragonOfBerkModItems;

public class BattleaxeItem extends AxeItem {
	public BattleaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 9000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DragonOfBerkModItems.GRONKEL_IRON.get()));
			}
		}, 1, -3f, new Item.Properties().tab(DragonOfBerkModTabs.TAB_DRAGONSOFBERKTOOLS));
	}
}
