package net.mcreator.dragon_of_berk.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dragon_of_berk.world.inventory.WhisperingDeathPagMenu;
import net.mcreator.dragon_of_berk.world.inventory.TerribleTerrorPagMenu;
import net.mcreator.dragon_of_berk.world.inventory.StokerClassMenu;
import net.mcreator.dragon_of_berk.world.inventory.Pag2Menu;
import net.mcreator.dragon_of_berk.world.inventory.Pag1Menu;
import net.mcreator.dragon_of_berk.world.inventory.MonstruousNightmarePagMenu;
import net.mcreator.dragon_of_berk.world.inventory.GroncklePagMenu;
import net.mcreator.dragon_of_berk.world.inventory.BoulderClassMenu;

import io.netty.buffer.Unpooled;

public class Seta1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof GroncklePagMenu) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("StokerClass");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new StokerClassMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			entity.getPersistentData().putBoolean("Folhando", true);
		}
		if (entity instanceof Player _plr3 && _plr3.containerMenu instanceof WhisperingDeathPagMenu) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("StokerClass");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new StokerClassMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			entity.getPersistentData().putBoolean("Folhando", true);
		}
		if (entity instanceof Player _plr6 && _plr6.containerMenu instanceof TerribleTerrorPagMenu) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("BoulderClass");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new BoulderClassMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			entity.getPersistentData().putBoolean("Folhando", true);
		}
		if (entity instanceof Player _plr9 && _plr9.containerMenu instanceof MonstruousNightmarePagMenu) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("BoulderClass");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new BoulderClassMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			entity.getPersistentData().putBoolean("Folhando", true);
		}
		if (entity instanceof Player _plr12 && _plr12.containerMenu instanceof Pag2Menu) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Pag1");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new Pag1Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			entity.getPersistentData().putBoolean("Folhando", true);
		}
		if (entity instanceof Player _plr15 && _plr15.containerMenu instanceof StokerClassMenu || entity instanceof Player _plr16 && _plr16.containerMenu instanceof BoulderClassMenu) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Pag1");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new Pag1Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			entity.getPersistentData().putBoolean("Folhando", true);
		}
	}
}
