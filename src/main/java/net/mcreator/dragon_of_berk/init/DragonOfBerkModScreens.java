
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.dragon_of_berk.client.gui.WhisperingDeathPagScreen;
import net.mcreator.dragon_of_berk.client.gui.TerribleTerrorPagScreen;
import net.mcreator.dragon_of_berk.client.gui.StokerClassScreen;
import net.mcreator.dragon_of_berk.client.gui.Pag2Screen;
import net.mcreator.dragon_of_berk.client.gui.Pag1Screen;
import net.mcreator.dragon_of_berk.client.gui.MonstruousNightmarePagScreen;
import net.mcreator.dragon_of_berk.client.gui.GroncklePagScreen;
import net.mcreator.dragon_of_berk.client.gui.BoulderClassScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonOfBerkModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DragonOfBerkModMenus.PAG_1.get(), Pag1Screen::new);
			MenuScreens.register(DragonOfBerkModMenus.PAG_2.get(), Pag2Screen::new);
			MenuScreens.register(DragonOfBerkModMenus.STOKER_CLASS.get(), StokerClassScreen::new);
			MenuScreens.register(DragonOfBerkModMenus.BOULDER_CLASS.get(), BoulderClassScreen::new);
			MenuScreens.register(DragonOfBerkModMenus.MONSTRUOUS_NIGHTMARE_PAG.get(), MonstruousNightmarePagScreen::new);
			MenuScreens.register(DragonOfBerkModMenus.TERRIBLE_TERROR_PAG.get(), TerribleTerrorPagScreen::new);
			MenuScreens.register(DragonOfBerkModMenus.GRONCKLE_PAG.get(), GroncklePagScreen::new);
			MenuScreens.register(DragonOfBerkModMenus.WHISPERING_DEATH_PAG.get(), WhisperingDeathPagScreen::new);
		});
	}
}
