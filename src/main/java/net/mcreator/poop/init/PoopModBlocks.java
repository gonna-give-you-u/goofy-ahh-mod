
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.poop.block.SquashedRedstoneBlock;
import net.mcreator.poop.block.SolidGalliumBlock;
import net.mcreator.poop.block.SkibidiDimensionPortalBlock;
import net.mcreator.poop.block.SkibidiBlockBlock;
import net.mcreator.poop.block.PoopBlockBlock;
import net.mcreator.poop.block.NukeBlock;
import net.mcreator.poop.block.LiquidGalliumBlock;
import net.mcreator.poop.block.HardPoopBlockBlock;
import net.mcreator.poop.block.GalliumOreBlock;
import net.mcreator.poop.PoopMod;

public class PoopModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PoopMod.MODID);
	public static final RegistryObject<Block> POOP_BLOCK = REGISTRY.register("poop_block", () -> new PoopBlockBlock());
	public static final RegistryObject<Block> HARD_POOP_BLOCK = REGISTRY.register("hard_poop_block", () -> new HardPoopBlockBlock());
	public static final RegistryObject<Block> SKIBIDI_BLOCK = REGISTRY.register("skibidi_block", () -> new SkibidiBlockBlock());
	public static final RegistryObject<Block> SKIBIDI_DIMENSION_PORTAL = REGISTRY.register("skibidi_dimension_portal", () -> new SkibidiDimensionPortalBlock());
	public static final RegistryObject<Block> SQUASHED_REDSTONE = REGISTRY.register("squashed_redstone", () -> new SquashedRedstoneBlock());
	public static final RegistryObject<Block> NUKE = REGISTRY.register("nuke", () -> new NukeBlock());
	public static final RegistryObject<Block> LIQUID_GALLIUM = REGISTRY.register("liquid_gallium", () -> new LiquidGalliumBlock());
	public static final RegistryObject<Block> SOLID_GALLIUM = REGISTRY.register("solid_gallium", () -> new SolidGalliumBlock());
	public static final RegistryObject<Block> GALLIUM_ORE = REGISTRY.register("gallium_ore", () -> new GalliumOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
