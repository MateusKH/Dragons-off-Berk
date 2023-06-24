package net.mcreator.dragon_of_berk.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dragon_of_berk.init.DragonOfBerkModItems;

public class QuandoEscAoPressionarUmaTeclaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DragonOfBerkModItems.BOO_KOF_DRAGONS.get()) {
			entity.getPersistentData().putBoolean("Fechando", true);
		}
	}
}
