
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dragon_of_berk.client.renderer.PapaTudoRenderer;
import net.mcreator.dragon_of_berk.client.renderer.GronkelRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonOfBerkModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DragonOfBerkModEntities.GRONKEL.get(), GronkelRenderer::new);
		event.registerEntityRenderer(DragonOfBerkModEntities.PAPA_TUDO.get(), PapaTudoRenderer::new);
	}
}
