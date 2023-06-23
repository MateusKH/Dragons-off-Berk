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

public class BookOfDragonsATickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("Seta1")) {
			entity.getPersistentData().putBoolean("Seta1", false);
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof BookOfDragonsAItem)
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("geckoAnim", "empty");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(DragonOfBerkModItems.BOO_KOF_DRAGON_AC.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			DragonOfBerkMod.queueServerWork(20, () -> {
				if (itemstack.getItem() instanceof BookOfDragonsAItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "folhando");
			});
			DragonOfBerkMod.queueServerWork(30, () -> {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(DragonOfBerkModItems.BOOK_OF_DRAGONS_A.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (itemstack.getItem() instanceof BookOfDragonsAItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "empty");
				if (itemstack.getItem() instanceof BookOfDragonsAItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "aberto");
			});
		}
		if (entity.getPersistentData().getBoolean("Seta2")) {
			entity.getPersistentData().putBoolean("Seta2", false);
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof BookOfDragonsAItem)
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("geckoAnim", "empty");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(DragonOfBerkModItems.BOO_KOF_DRAGON_AC.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			DragonOfBerkMod.queueServerWork(20, () -> {
				if (itemstack.getItem() instanceof BookOfDragonsAItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "folhando");
			});
			DragonOfBerkMod.queueServerWork(30, () -> {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(DragonOfBerkModItems.BOOK_OF_DRAGONS_A.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (itemstack.getItem() instanceof BookOfDragonsAItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "empty");
				if (itemstack.getItem() instanceof BookOfDragonsAItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "aberto");
			});
		}
	}
}
