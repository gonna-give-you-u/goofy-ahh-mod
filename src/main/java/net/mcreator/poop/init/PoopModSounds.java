
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.poop.PoopMod;

public class PoopModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PoopMod.MODID);
	public static final RegistryObject<SoundEvent> POOP_SPORTS_MUSIC = REGISTRY.register("poop_sports_music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poop", "poop_sports_music")));
	public static final RegistryObject<SoundEvent> REVERB_FARD = REGISTRY.register("reverb_fard", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poop", "reverb_fard")));
	public static final RegistryObject<SoundEvent> FARD = REGISTRY.register("fard", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poop", "fard")));
	public static final RegistryObject<SoundEvent> SKIBIDI_MUSIC = REGISTRY.register("skibidi_music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poop", "skibidi_music")));
	public static final RegistryObject<SoundEvent> SANIC = REGISTRY.register("sanic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poop", "sanic")));
	public static final RegistryObject<SoundEvent> RICK_SCREAM = REGISTRY.register("rick_scream", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poop", "rick_scream")));
	public static final RegistryObject<SoundEvent> I_QUIT_MUSIC_IN_SCHOOL = REGISTRY.register("i_quit_music_in_school", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poop", "i_quit_music_in_school")));
}
