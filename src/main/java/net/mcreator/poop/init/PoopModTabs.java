
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.poop.PoopMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoopModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoopMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PoopModBlocks.POOP_BLOCK.get().asItem());
			tabData.accept(PoopModBlocks.HARD_POOP_BLOCK.get().asItem());
			tabData.accept(PoopModBlocks.GALLIUM_ORE.get().asItem());
			tabData.accept(PoopModBlocks.EXPLOSIVE_ORE.get().asItem());
			tabData.accept(PoopModBlocks.DEEPSLATE_EXPLOSIVE_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(PoopModItems.POOP.get());
			tabData.accept(PoopModItems.ANTICARBON.get());
			tabData.accept(PoopModItems.STABLER_ANTICARBON.get());
			tabData.accept(PoopModItems.ALPHA_WATER_BUCKET.get());
			tabData.accept(PoopModItems.PERSISTENT_ALPHA_WATER_BUCKET.get());
			tabData.accept(PoopModItems.NUTRITIOUS_POOP.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PoopModItems.POOPER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(PoopModBlocks.SKIBIDI_BLOCK.get().asItem());
			tabData.accept(PoopModBlocks.SOLID_GALLIUM.get().asItem());
			tabData.accept(PoopModBlocks.NONMELTING_GALLIUM.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(PoopModItems.POOP_LAUNCHER.get());
			tabData.accept(PoopModItems.POOP_LAUNCHER_PRO.get());
			tabData.accept(PoopModItems.ADACHI_REI.get());
			tabData.accept(PoopModItems.ADACHI_REI_BUT_DOESNT_EXPLODE.get());
			tabData.accept(PoopModItems.LIGHTNING_SPAWNER.get());
			tabData.accept(PoopModItems.RICKROLL.get());
			tabData.accept(PoopModBlocks.NUKE.get().asItem());
			tabData.accept(PoopModItems.TNT_LAUNCHER.get());
			tabData.accept(PoopModItems.NUKE_LAUNCHER.get());
			tabData.accept(PoopModItems.STEEL_ARMOR_HELMET.get());
			tabData.accept(PoopModItems.STEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(PoopModItems.STEEL_ARMOR_LEGGINGS.get());
			tabData.accept(PoopModItems.STEEL_ARMOR_BOOTS.get());
			tabData.accept(PoopModItems.BEDROCK_ARMOR_HELMET.get());
			tabData.accept(PoopModItems.BEDROCK_ARMOR_CHESTPLATE.get());
			tabData.accept(PoopModItems.BEDROCK_ARMOR_LEGGINGS.get());
			tabData.accept(PoopModItems.BEDROCK_ARMOR_BOOTS.get());
			tabData.accept(PoopModItems.BARRIER_ARMOR_HELMET.get());
			tabData.accept(PoopModItems.BARRIER_ARMOR_CHESTPLATE.get());
			tabData.accept(PoopModItems.BARRIER_ARMOR_LEGGINGS.get());
			tabData.accept(PoopModItems.BARRIER_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PoopModItems.SKIBIDI_DIMENSION.get());
			tabData.accept(PoopModItems.GIGAFAST_TRAVEL.get());
			tabData.accept(PoopModItems.TERAFAST_TRAVEL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(PoopModBlocks.SQUASHED_REDSTONE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(PoopModItems.POOP_FRAGMENT.get());
			tabData.accept(PoopModItems.STEEL.get());
			tabData.accept(PoopModItems.TOILET.get());
			tabData.accept(PoopModItems.CARBON.get());
			tabData.accept(PoopModItems.DIAMOND_NUGGET.get());
			tabData.accept(PoopModItems.HYDROGEN.get());
			tabData.accept(PoopModItems.DEUTERIUM.get());
			tabData.accept(PoopModItems.TRITIUM.get());
			tabData.accept(PoopModItems.DEBIAN_UNSTABLE.get());
			tabData.accept(PoopModItems.DEBIAN.get());
			tabData.accept(PoopModItems.UNO_REVERSE.get());
			tabData.accept(PoopModItems.ELECTRON.get());
			tabData.accept(PoopModItems.PROTON.get());
			tabData.accept(PoopModItems.NEUTRON.get());
			tabData.accept(PoopModItems.UP_QUARK.get());
			tabData.accept(PoopModItems.DOWN_QUARK.get());
			tabData.accept(PoopModItems.PIECE_OF_GALLIUM.get());
			tabData.accept(PoopModItems.THREE_COALS.get());
		}
	}
}
