
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.poop.fluid.LiquidGalliumFluid;
import net.mcreator.poop.fluid.AlphaWaterFluid;
import net.mcreator.poop.PoopMod;

public class PoopModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, PoopMod.MODID);
	public static final RegistryObject<FlowingFluid> LIQUID_GALLIUM = REGISTRY.register("liquid_gallium", () -> new LiquidGalliumFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_GALLIUM = REGISTRY.register("flowing_liquid_gallium", () -> new LiquidGalliumFluid.Flowing());
	public static final RegistryObject<FlowingFluid> ALPHA_WATER = REGISTRY.register("alpha_water", () -> new AlphaWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ALPHA_WATER = REGISTRY.register("flowing_alpha_water", () -> new AlphaWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_GALLIUM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_GALLIUM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ALPHA_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ALPHA_WATER.get(), RenderType.translucent());
		}
	}
}
