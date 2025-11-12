
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.poop.PoopMod;

public class PoopModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, PoopMod.MODID);
	public static final RegistryObject<Potion> GLASS_POTION = REGISTRY.register("glass_potion", () -> new Potion(new MobEffectInstance(PoopModMobEffects.UR_GLASS.get(), -1, 0, false, true)));
}
