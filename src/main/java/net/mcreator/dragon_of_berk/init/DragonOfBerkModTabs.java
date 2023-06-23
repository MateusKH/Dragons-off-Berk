
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonOfBerkModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DragonOfBerkModItems.HOBGOBBLERS_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("dragon_of_berk", "dragonsofberkblocks"),
				builder -> builder.title(Component.translatable("item_group.dragon_of_berk.dragonsofberkblocks")).icon(() -> new ItemStack(DragonOfBerkModBlocks.LIQUIDGRONKELIRON.get())).displayItems((parameters, tabData) -> {
					tabData.accept(DragonOfBerkModBlocks.GRONKEL_IRON_BLOCK.get().asItem());
					tabData.accept(DragonOfBerkModBlocks.FISHBLOCK.get().asItem());
					tabData.accept(DragonOfBerkModBlocks.HOBGOBBLERSEGGS.get().asItem());
					tabData.accept(DragonOfBerkModBlocks.CRACKED_HOBGOBBLERSEGGS.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("dragon_of_berk", "dragonsofberktools"),
				builder -> builder.title(Component.translatable("item_group.dragon_of_berk.dragonsofberktools")).icon(() -> new ItemStack(DragonOfBerkModItems.MACE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(DragonOfBerkModItems.BATTLEAXE.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("dragon_of_berk", "dragonofberkitens"),
				builder -> builder.title(Component.translatable("item_group.dragon_of_berk.dragonofberkitens")).icon(() -> new ItemStack(DragonOfBerkModItems.GRONKELIRONMIX.get())).displayItems((parameters, tabData) -> {
					tabData.accept(DragonOfBerkModItems.GRONKEL_IRON.get());
					tabData.accept(DragonOfBerkModItems.GRONKELIRONNUGGET.get());
					tabData.accept(DragonOfBerkModItems.NIGHT_FURY_SCALE_ARMOR_HELMET.get());
					tabData.accept(DragonOfBerkModItems.NIGHT_FURY_SCALE_ARMOR_CHESTPLATE.get());
					tabData.accept(DragonOfBerkModItems.NIGHT_FURY_SCALE_ARMOR_LEGGINGS.get());
					tabData.accept(DragonOfBerkModItems.NIGHT_FURY_SCALE_ARMOR_BOOTS.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("dragon_of_berk", "dev_build"),
				builder -> builder.title(Component.translatable("item_group.dragon_of_berk.dev_build")).icon(() -> new ItemStack(DragonOfBerkModItems.DEV.get())).displayItems((parameters, tabData) -> {
					tabData.accept(DragonOfBerkModBlocks.GRONKELMAGMA.get().asItem());
					tabData.accept(DragonOfBerkModItems.GRONKELIRONMIX.get());
					tabData.accept(DragonOfBerkModItems.GRONKELMAGMASHOVEL.get());
					tabData.accept(DragonOfBerkModBlocks.LIQUIDGRONKELIRON.get().asItem());
					tabData.accept(DragonOfBerkModItems.GRONKEL_SPAWN_EGG.get());
					tabData.accept(DragonOfBerkModItems.MACE.get());
					tabData.accept(DragonOfBerkModItems.DEV.get());
					tabData.accept(DragonOfBerkModBlocks.BLOCK_M_DEV.get().asItem());
					tabData.accept(DragonOfBerkModItems.BOOK_OF_DRAGONS_A.get());
					tabData.accept(DragonOfBerkModItems.BOO_KOF_DRAGON_AC.get());
				})

		);
	}
}
