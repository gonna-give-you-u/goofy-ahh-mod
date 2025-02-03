
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.poop.fluid.types.PersistentAlphaWaterFluidType;
import net.mcreator.poop.fluid.types.LiquidGalliumFluidType;
import net.mcreator.poop.fluid.types.AlphaWaterFluidType;
import net.mcreator.poop.PoopMod;

public class PoopModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PoopMod.MODID);
	public static final RegistryObject<FluidType> LIQUID_GALLIUM_TYPE = REGISTRY.register("liquid_gallium", () -> new LiquidGalliumFluidType());
	public static final RegistryObject<FluidType> ALPHA_WATER_TYPE = REGISTRY.register("alpha_water", () -> new AlphaWaterFluidType());
	public static final RegistryObject<FluidType> PERSISTENT_ALPHA_WATER_TYPE = REGISTRY.register("persistent_alpha_water", () -> new PersistentAlphaWaterFluidType());
}
