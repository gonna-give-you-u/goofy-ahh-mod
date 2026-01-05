
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.poop.potion.UrGlassMobEffect;
import net.mcreator.poop.PoopMod;

public class PoopModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PoopMod.MODID);
	public static final RegistryObject<MobEffect> UR_GLASS = REGISTRY.register("ur_glass", () -> new UrGlassMobEffect());
}
