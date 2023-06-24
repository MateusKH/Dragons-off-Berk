package net.mcreator.dragon_of_berk.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.dragon_of_berk.item.BooKofDragonsItem;
import net.mcreator.dragon_of_berk.init.DragonOfBerkModItems;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class BooKofDragonsTickDeQuandoSegurarProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("AbrindoBook") == true) {
			entity.getPersistentData().putBoolean("AbrindoBook", false);
			if (itemstack.getItem() instanceof BooKofDragonsItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "abrindo2");
		}
		if (entity.getPersistentData().getBoolean("Folhando") == true) {
			entity.getPersistentData().putBoolean("Folhando", false);
			if (itemstack.getItem() instanceof BooKofDragonsItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "folhando");
		}
		if (entity.getPersistentData().getBoolean("Fechando") == true) {
			entity.getPersistentData().putBoolean("Fechando", false);
			if (itemstack.getItem() instanceof BooKofDragonsItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "fechando");
			DragonOfBerkMod.queueServerWork(12, () -> {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DragonOfBerkModItems.BOO_KOF_DRAGONS.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(DragonOfBerkModItems.BOOK_OF_DRAGONS_A.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			});
		}
	}
}
