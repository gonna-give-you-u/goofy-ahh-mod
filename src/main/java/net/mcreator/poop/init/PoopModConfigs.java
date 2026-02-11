package net.mcreator.poop.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;
import net.mcreator.poop.PoopMod;

@Mod.EventBusSubscriber(modid = PoopMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoopModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, GoofyAhhModServerConfigConfiguration.SPEC, "poop-server.toml");
		});
	}
}
