
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.poop.block.TerafastTravelPortalBlock;
import net.mcreator.poop.block.SquashedRedstoneBlock;
import net.mcreator.poop.block.SolidGalliumBlock;
import net.mcreator.poop.block.SkibidiDimensionPortalBlock;
import net.mcreator.poop.block.SkibidiBlockBlock;
import net.mcreator.poop.block.ReallyHardGlassBlock;
import net.mcreator.poop.block.PoopBlockBlock;
import net.mcreator.poop.block.PersistentAlphaWaterBlock;
import net.mcreator.poop.block.NukeBlock;
import net.mcreator.poop.block.NonmeltingGalliumBlock;
import net.mcreator.poop.block.LiquidGalliumBlock;
import net.mcreator.poop.block.HardPoopBlockBlock;
import net.mcreator.poop.block.GigafastTravelPortalBlock;
import net.mcreator.poop.block.GalliumOreBlock;
import net.mcreator.poop.block.ExplosiveOreBlock;
import net.mcreator.poop.block.DeepslateExplosiveOreBlock;
import net.mcreator.poop.block.BlockThatTurnsStuffIntoBaryonsBlock;
import net.mcreator.poop.block.AlphaWaterBlock;
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
	public static final RegistryObject<Block> ALPHA_WATER = REGISTRY.register("alpha_water", () -> new AlphaWaterBlock());
	public static final RegistryObject<Block> PERSISTENT_ALPHA_WATER = REGISTRY.register("persistent_alpha_water", () -> new PersistentAlphaWaterBlock());
	public static final RegistryObject<Block> GIGAFAST_TRAVEL_PORTAL = REGISTRY.register("gigafast_travel_portal", () -> new GigafastTravelPortalBlock());
	public static final RegistryObject<Block> NONMELTING_GALLIUM = REGISTRY.register("nonmelting_gallium", () -> new NonmeltingGalliumBlock());
	public static final RegistryObject<Block> TERAFAST_TRAVEL_PORTAL = REGISTRY.register("terafast_travel_portal", () -> new TerafastTravelPortalBlock());
	public static final RegistryObject<Block> EXPLOSIVE_ORE = REGISTRY.register("explosive_ore", () -> new ExplosiveOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_EXPLOSIVE_ORE = REGISTRY.register("deepslate_explosive_ore", () -> new DeepslateExplosiveOreBlock());
	public static final RegistryObject<Block> BLOCK_THAT_TURNS_STUFF_INTO_BARYONS = REGISTRY.register("block_that_turns_stuff_into_baryons", () -> new BlockThatTurnsStuffIntoBaryonsBlock());
	public static final RegistryObject<Block> REALLY_HARD_GLASS = REGISTRY.register("really_hard_glass", () -> new ReallyHardGlassBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
