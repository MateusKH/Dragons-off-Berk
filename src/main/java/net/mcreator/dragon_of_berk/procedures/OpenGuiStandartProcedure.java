package net.mcreator.dragon_of_berk.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.dragon_of_berk.item.BookOfDragonsAItem;
import net.mcreator.dragon_of_berk.init.DragonOfBerkModItems;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class OpenGuiStandartProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() instanceof BookOfDragonsAItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "abrindo2");
		entity.getPersistentData().putBoolean("Seta1", false);
		entity.getPersistentData().putBoolean("Seta2", false);
		DragonOfBerkMod.queueServerWork(10, () -> {
			if (itemstack.getItem() instanceof BookOfDragonsAItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "empty");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(DragonOfBerkModItems.BOOK_OF_DRAGONS_A.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			entity.getPersistentData().putBoolean("Transition", true);
		});
	}
}
