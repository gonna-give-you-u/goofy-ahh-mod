
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.poop.network.LradKeyMessage;
import net.mcreator.poop.PoopMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PoopModKeyMappings {
	public static final KeyMapping LRAD_KEY = new KeyMapping("key.poop.lrad_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PoopMod.PACKET_HANDLER.sendToServer(new LradKeyMessage(0, 0));
				LradKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				LRAD_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - LRAD_KEY_LASTPRESS);
				PoopMod.PACKET_HANDLER.sendToServer(new LradKeyMessage(1, dt));
				LradKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long LRAD_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(LRAD_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				LRAD_KEY.consumeClick();
			}
		}
	}
}
