
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.dragon_of_berk.network.QuandoEscMessage;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DragonOfBerkModKeyMappings {
	public static final KeyMapping QUANDO_ESC = new KeyMapping("key.dragon_of_berk.quando_esc", GLFW.GLFW_KEY_ESCAPE, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new QuandoEscMessage(0, 0));
				QuandoEscMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(QUANDO_ESC);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				QUANDO_ESC.consumeClick();
			}
		}
	}
}
