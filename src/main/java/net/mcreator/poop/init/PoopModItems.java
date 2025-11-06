
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.poop.item.UpQuarkItem;
import net.mcreator.poop.item.UnoReverseItem;
import net.mcreator.poop.item.TritiumItem;
import net.mcreator.poop.item.ToiletItem;
import net.mcreator.poop.item.ThreeCoalsItem;
import net.mcreator.poop.item.TerafastTravelItem;
import net.mcreator.poop.item.TNTLauncherItem;
import net.mcreator.poop.item.SuperGoldPickaxeItem;
import net.mcreator.poop.item.SteelItem;
import net.mcreator.poop.item.SteelArmorItem;
import net.mcreator.poop.item.StablerAnticarbonItem;
import net.mcreator.poop.item.SkibidiDimensionItem;
import net.mcreator.poop.item.RickrollItem;
import net.mcreator.poop.item.ProtonItem;
import net.mcreator.poop.item.PoopLauncherProItem;
import net.mcreator.poop.item.PoopLauncherItem;
import net.mcreator.poop.item.PoopItem;
import net.mcreator.poop.item.PoopFragmentItem;
import net.mcreator.poop.item.PieceOfGalliumItem;
import net.mcreator.poop.item.PersistentAlphaWaterItem;
import net.mcreator.poop.item.NutritiousPoopItem;
import net.mcreator.poop.item.NukeLauncherItem;
import net.mcreator.poop.item.NeutronItem;
import net.mcreator.poop.item.Lithium6Item;
import net.mcreator.poop.item.LiquidGalliumItem;
import net.mcreator.poop.item.LightningSpawnerItem;
import net.mcreator.poop.item.KnockbackStickProItem;
import net.mcreator.poop.item.KnockbackStickItem;
import net.mcreator.poop.item.HydrogenItem;
import net.mcreator.poop.item.GigafastTravelItem;
import net.mcreator.poop.item.ElectronItem;
import net.mcreator.poop.item.DownQuarkItem;
import net.mcreator.poop.item.DiamondNuggetItem;
import net.mcreator.poop.item.DeuteriumItem;
import net.mcreator.poop.item.DebianUnstableItem;
import net.mcreator.poop.item.DebianItem;
import net.mcreator.poop.item.CrazyFuelItem;
import net.mcreator.poop.item.CopperNuggetItem;
import net.mcreator.poop.item.CoalNuggetItem;
import net.mcreator.poop.item.CarbonItem;
import net.mcreator.poop.item.BedrockArmorItem;
import net.mcreator.poop.item.BarrierArmorItem;
import net.mcreator.poop.item.AnvilDropperProMaxItem;
import net.mcreator.poop.item.AnvilDropperProItem;
import net.mcreator.poop.item.AnvilDropperItem;
import net.mcreator.poop.item.AnticarbonItem;
import net.mcreator.poop.item.AlphaWaterItem;
import net.mcreator.poop.item.AdachiReiItem;
import net.mcreator.poop.item.AdachiReiButDoesntExplodeItem;
import net.mcreator.poop.PoopMod;

public class PoopModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PoopMod.MODID);
	public static final RegistryObject<Item> POOP_BLOCK = block(PoopModBlocks.POOP_BLOCK);
	public static final RegistryObject<Item> POOP = REGISTRY.register("poop", () -> new PoopItem());
	public static final RegistryObject<Item> HARD_POOP_BLOCK = block(PoopModBlocks.HARD_POOP_BLOCK);
	public static final RegistryObject<Item> POOP_FRAGMENT = REGISTRY.register("poop_fragment", () -> new PoopFragmentItem());
	public static final RegistryObject<Item> POOPER_SPAWN_EGG = REGISTRY.register("pooper_spawn_egg", () -> new ForgeSpawnEggItem(PoopModEntities.POOPER, -8832251, -11521786, new Item.Properties()));
	public static final RegistryObject<Item> TOILET = REGISTRY.register("toilet", () -> new ToiletItem());
	public static final RegistryObject<Item> SKIBIDI_BLOCK = block(PoopModBlocks.SKIBIDI_BLOCK);
	public static final RegistryObject<Item> STEEL = REGISTRY.register("steel", () -> new SteelItem());
	public static final RegistryObject<Item> CARBON = REGISTRY.register("carbon", () -> new CarbonItem());
	public static final RegistryObject<Item> DIAMOND_NUGGET = REGISTRY.register("diamond_nugget", () -> new DiamondNuggetItem());
	public static final RegistryObject<Item> POOP_LAUNCHER = REGISTRY.register("poop_launcher", () -> new PoopLauncherItem());
	public static final RegistryObject<Item> POOP_LAUNCHER_PRO = REGISTRY.register("poop_launcher_pro", () -> new PoopLauncherProItem());
	public static final RegistryObject<Item> ELECTRON = REGISTRY.register("electron", () -> new ElectronItem());
	public static final RegistryObject<Item> PROTON = REGISTRY.register("proton", () -> new ProtonItem());
	public static final RegistryObject<Item> NEUTRON = REGISTRY.register("neutron", () -> new NeutronItem());
	public static final RegistryObject<Item> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenItem());
	public static final RegistryObject<Item> DEUTERIUM = REGISTRY.register("deuterium", () -> new DeuteriumItem());
	public static final RegistryObject<Item> TRITIUM = REGISTRY.register("tritium", () -> new TritiumItem());
	public static final RegistryObject<Item> ADACHI_REI = REGISTRY.register("adachi_rei", () -> new AdachiReiItem());
	public static final RegistryObject<Item> ADACHI_REI_BUT_DOESNT_EXPLODE = REGISTRY.register("adachi_rei_but_doesnt_explode", () -> new AdachiReiButDoesntExplodeItem());
	public static final RegistryObject<Item> DEBIAN = REGISTRY.register("debian", () -> new DebianItem());
	public static final RegistryObject<Item> LIGHTNING_SPAWNER = REGISTRY.register("lightning_spawner", () -> new LightningSpawnerItem());
	public static final RegistryObject<Item> DEBIAN_UNSTABLE = REGISTRY.register("debian_unstable", () -> new DebianUnstableItem());
	public static final RegistryObject<Item> UNO_REVERSE = REGISTRY.register("uno_reverse", () -> new UnoReverseItem());
	public static final RegistryObject<Item> ANTICARBON = REGISTRY.register("anticarbon", () -> new AnticarbonItem());
	public static final RegistryObject<Item> STABLER_ANTICARBON = REGISTRY.register("stabler_anticarbon", () -> new StablerAnticarbonItem());
	public static final RegistryObject<Item> SKIBIDI_DIMENSION = REGISTRY.register("skibidi_dimension", () -> new SkibidiDimensionItem());
	public static final RegistryObject<Item> RICKROLL = REGISTRY.register("rickroll", () -> new RickrollItem());
	public static final RegistryObject<Item> UP_QUARK = REGISTRY.register("up_quark", () -> new UpQuarkItem());
	public static final RegistryObject<Item> DOWN_QUARK = REGISTRY.register("down_quark", () -> new DownQuarkItem());
	public static final RegistryObject<Item> SQUASHED_REDSTONE = block(PoopModBlocks.SQUASHED_REDSTONE);
	public static final RegistryObject<Item> NUKE = block(PoopModBlocks.NUKE);
	public static final RegistryObject<Item> LIQUID_GALLIUM_BUCKET = REGISTRY.register("liquid_gallium_bucket", () -> new LiquidGalliumItem());
	public static final RegistryObject<Item> SOLID_GALLIUM = block(PoopModBlocks.SOLID_GALLIUM);
	public static final RegistryObject<Item> PIECE_OF_GALLIUM = REGISTRY.register("piece_of_gallium", () -> new PieceOfGalliumItem());
	public static final RegistryObject<Item> GALLIUM_ORE = block(PoopModBlocks.GALLIUM_ORE);
	public static final RegistryObject<Item> ALPHA_WATER_BUCKET = REGISTRY.register("alpha_water_bucket", () -> new AlphaWaterItem());
	public static final RegistryObject<Item> PERSISTENT_ALPHA_WATER_BUCKET = REGISTRY.register("persistent_alpha_water_bucket", () -> new PersistentAlphaWaterItem());
	public static final RegistryObject<Item> GIGAFAST_TRAVEL = REGISTRY.register("gigafast_travel", () -> new GigafastTravelItem());
	public static final RegistryObject<Item> NONMELTING_GALLIUM = block(PoopModBlocks.NONMELTING_GALLIUM);
	public static final RegistryObject<Item> TERAFAST_TRAVEL = REGISTRY.register("terafast_travel", () -> new TerafastTravelItem());
	public static final RegistryObject<Item> EXPLOSIVE_ORE = block(PoopModBlocks.EXPLOSIVE_ORE);
	public static final RegistryObject<Item> DEEPSLATE_EXPLOSIVE_ORE = block(PoopModBlocks.DEEPSLATE_EXPLOSIVE_ORE);
	public static final RegistryObject<Item> TNT_LAUNCHER = REGISTRY.register("tnt_launcher", () -> new TNTLauncherItem());
	public static final RegistryObject<Item> NUKE_LAUNCHER = REGISTRY.register("nuke_launcher", () -> new NukeLauncherItem());
	public static final RegistryObject<Item> THREE_COALS = REGISTRY.register("three_coals", () -> new ThreeCoalsItem());
	public static final RegistryObject<Item> NUTRITIOUS_POOP = REGISTRY.register("nutritious_poop", () -> new NutritiousPoopItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> BEDROCK_ARMOR_HELMET = REGISTRY.register("bedrock_armor_helmet", () -> new BedrockArmorItem.Helmet());
	public static final RegistryObject<Item> BEDROCK_ARMOR_CHESTPLATE = REGISTRY.register("bedrock_armor_chestplate", () -> new BedrockArmorItem.Chestplate());
	public static final RegistryObject<Item> BEDROCK_ARMOR_LEGGINGS = REGISTRY.register("bedrock_armor_leggings", () -> new BedrockArmorItem.Leggings());
	public static final RegistryObject<Item> BEDROCK_ARMOR_BOOTS = REGISTRY.register("bedrock_armor_boots", () -> new BedrockArmorItem.Boots());
	public static final RegistryObject<Item> BARRIER_ARMOR_HELMET = REGISTRY.register("barrier_armor_helmet", () -> new BarrierArmorItem.Helmet());
	public static final RegistryObject<Item> BARRIER_ARMOR_CHESTPLATE = REGISTRY.register("barrier_armor_chestplate", () -> new BarrierArmorItem.Chestplate());
	public static final RegistryObject<Item> BARRIER_ARMOR_LEGGINGS = REGISTRY.register("barrier_armor_leggings", () -> new BarrierArmorItem.Leggings());
	public static final RegistryObject<Item> BARRIER_ARMOR_BOOTS = REGISTRY.register("barrier_armor_boots", () -> new BarrierArmorItem.Boots());
	public static final RegistryObject<Item> CRAZY_FUEL = REGISTRY.register("crazy_fuel", () -> new CrazyFuelItem());
	public static final RegistryObject<Item> SUPER_GOLD_PICKAXE = REGISTRY.register("super_gold_pickaxe", () -> new SuperGoldPickaxeItem());
	public static final RegistryObject<Item> KNOCKBACK_STICK = REGISTRY.register("knockback_stick", () -> new KnockbackStickItem());
	public static final RegistryObject<Item> ANVIL_DROPPER = REGISTRY.register("anvil_dropper", () -> new AnvilDropperItem());
	public static final RegistryObject<Item> BLOCK_THAT_TURNS_STUFF_INTO_BARYONS = block(PoopModBlocks.BLOCK_THAT_TURNS_STUFF_INTO_BARYONS);
	public static final RegistryObject<Item> COAL_NUGGET = REGISTRY.register("coal_nugget", () -> new CoalNuggetItem());
	public static final RegistryObject<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", () -> new CopperNuggetItem());
	public static final RegistryObject<Item> LITHIUM_6 = REGISTRY.register("lithium_6", () -> new Lithium6Item());
	public static final RegistryObject<Item> ANVIL_DROPPER_PRO = REGISTRY.register("anvil_dropper_pro", () -> new AnvilDropperProItem());
	public static final RegistryObject<Item> ANVIL_DROPPER_PRO_MAX = REGISTRY.register("anvil_dropper_pro_max", () -> new AnvilDropperProMaxItem());
	public static final RegistryObject<Item> KNOCKBACK_STICK_PRO = REGISTRY.register("knockback_stick_pro", () -> new KnockbackStickProItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
