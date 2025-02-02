
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.poop.fluid.types.LiquidGalliumFluidType;
import net.mcreator.poop.PoopMod;

public class PoopModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PoopMod.MODID);
	public static final RegistryObject<FluidType> LIQUID_GALLIUM_TYPE = REGISTRY.register("liquid_gallium", () -> new LiquidGalliumFluidType());
}
