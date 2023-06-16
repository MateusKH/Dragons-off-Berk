
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.dragon_of_berk.client.gui.Pag2Screen;
import net.mcreator.dragon_of_berk.client.gui.Pag1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonOfBerkModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DragonOfBerkModMenus.PAG_2.get(), Pag2Screen::new);
			MenuScreens.register(DragonOfBerkModMenus.PAG_1.get(), Pag1Screen::new);
		});
	}
}
