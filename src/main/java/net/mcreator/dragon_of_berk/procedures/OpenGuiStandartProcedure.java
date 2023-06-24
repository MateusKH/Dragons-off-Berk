package net.mcreator.dragon_of_berk.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dragon_of_berk.item.BookOfDragonsAItem;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class OpenGuiStandartProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() instanceof BookOfDragonsAItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "abrindo2");
		entity.getPersistentData().putBoolean("Fechando", false);
		DragonOfBerkMod.queueServerWork(5, () -> {
			if (itemstack.getItem() instanceof BookOfDragonsAItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "empty");
			if (itemstack.getItem() instanceof BookOfDragonsAItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "aberto");
		});
	}
}
