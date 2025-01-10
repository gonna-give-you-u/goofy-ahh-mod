
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

import net.mcreator.poop.item.UnoReverseItem;
import net.mcreator.poop.item.TritiumItem;
import net.mcreator.poop.item.ToiletItem;
import net.mcreator.poop.item.TaiwanItem;
import net.mcreator.poop.item.SteelItem;
import net.mcreator.poop.item.StablerAnticarbonItem;
import net.mcreator.poop.item.SkibidiDimensionItem;
import net.mcreator.poop.item.ProtonItem;
import net.mcreator.poop.item.PoopLauncherProItem;
import net.mcreator.poop.item.PoopLauncherItem;
import net.mcreator.poop.item.PoopItem;
import net.mcreator.poop.item.PoopFragmentItem;
import net.mcreator.poop.item.OhnoItem;
import net.mcreator.poop.item.NeutronItem;
import net.mcreator.poop.item.LightningSpawnerItem;
import net.mcreator.poop.item.HydrogenItem;
import net.mcreator.poop.item.ElectronItem;
import net.mcreator.poop.item.DiamondNuggetItem;
import net.mcreator.poop.item.DeuteriumItem;
import net.mcreator.poop.item.DebianUnstableItem;
import net.mcreator.poop.item.DebianItem;
import net.mcreator.poop.item.ChinaItem;
import net.mcreator.poop.item.CarbonItem;
import net.mcreator.poop.item.AnticarbonItem;
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
	public static final RegistryObject<Item> CHINA = REGISTRY.register("china", () -> new ChinaItem());
	public static final RegistryObject<Item> TAIWAN = REGISTRY.register("taiwan", () -> new TaiwanItem());
	public static final RegistryObject<Item> OHNO = REGISTRY.register("ohno", () -> new OhnoItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
