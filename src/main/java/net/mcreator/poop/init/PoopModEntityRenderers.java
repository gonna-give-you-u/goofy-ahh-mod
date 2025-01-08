
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.poop.client.renderer.PooperRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PoopModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PoopModEntities.POOPER.get(), PooperRenderer::new);
		event.registerEntityRenderer(PoopModEntities.POOP_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PoopModEntities.HARD_POOP_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
