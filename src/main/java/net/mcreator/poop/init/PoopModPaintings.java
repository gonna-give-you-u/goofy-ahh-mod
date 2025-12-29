
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.poop.PoopMod;

public class PoopModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, PoopMod.MODID);
	public static final RegistryObject<PaintingVariant> PUKEKO_PAINTING = REGISTRY.register("pukeko_painting", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> BPAINTING = REGISTRY.register("bpainting", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> AZTEC_CODE_NOT_RICKROLL = REGISTRY.register("aztec_code_not_rickroll", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> MY_CAT_PAINTING = REGISTRY.register("my_cat_painting", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> SAD_HAMSTER_PAINTING = REGISTRY.register("sad_hamster_painting", () -> new PaintingVariant(16, 16));
}
