
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DragonOfBerkModTabs {
	public static CreativeModeTab TAB_DRAGONSOFBERKDRAGONS;
	public static CreativeModeTab TAB_DRAGONSOFBERKTOOLS;
	public static CreativeModeTab TAB_DRAGONOFBERKITENS;
	public static CreativeModeTab TAB_DRAGONSOFBERKBLOCKS;

	public static void load() {
		TAB_DRAGONSOFBERKDRAGONS = new CreativeModeTab("tabdragonsofberkdragons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DragonOfBerkModItems.HOBGOBBLERS_SPAWN_EGG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DRAGONSOFBERKTOOLS = new CreativeModeTab("tabdragonsofberktools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DragonOfBerkModItems.MACE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DRAGONOFBERKITENS = new CreativeModeTab("tabdragonofberkitens") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DragonOfBerkModItems.GRONKELIRONMIX.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DRAGONSOFBERKBLOCKS = new CreativeModeTab("tabdragonsofberkblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DragonOfBerkModBlocks.LIQUIDGRONKELIRON.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
