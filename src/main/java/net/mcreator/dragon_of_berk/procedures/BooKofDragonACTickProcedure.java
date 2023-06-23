package net.mcreator.dragon_of_berk.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dragon_of_berk.item.BooKofDragonACItem;

public class BooKofDragonACTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("Transition") == true) {
			entity.getPersistentData().putBoolean("Transition", false);
			if (itemstack.getItem() instanceof BooKofDragonACItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "aberto");
		}
	}
}
