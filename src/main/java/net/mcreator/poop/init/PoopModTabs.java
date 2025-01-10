
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
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(PoopModItems.POOP.get());
			tabData.accept(PoopModItems.ANTICARBON.get());
			tabData.accept(PoopModItems.STABLER_ANTICARBON.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PoopModItems.POOPER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(PoopModBlocks.SKIBIDI_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(PoopModItems.POOP_LAUNCHER.get());
			tabData.accept(PoopModItems.POOP_LAUNCHER_PRO.get());
			tabData.accept(PoopModItems.ADACHI_REI.get());
			tabData.accept(PoopModItems.ADACHI_REI_BUT_DOESNT_EXPLODE.get());
			tabData.accept(PoopModItems.LIGHTNING_SPAWNER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PoopModItems.SKIBIDI_DIMENSION.get());
			tabData.accept(PoopModItems.OHNO.get());
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
			tabData.accept(PoopModItems.CHINA.get());
			tabData.accept(PoopModItems.TAIWAN.get());
		}
	}
}
