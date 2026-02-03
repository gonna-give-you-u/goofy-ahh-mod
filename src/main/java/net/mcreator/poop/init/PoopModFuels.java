
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class PoopModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == PoopModItems.THREE_COALS.get())
			event.setBurnTime(4800);
		else if (itemstack.getItem() == PoopModItems.CRAZY_FUEL.get())
			event.setBurnTime(2147483647);
		else if (itemstack.getItem() == PoopModItems.COAL_NUGGET.get())
			event.setBurnTime(178);
		else if (itemstack.getItem() == Items.AXOLOTL_BUCKET)
			event.setBurnTime(6400);
		else if (itemstack.getItem() == PoopModItems.HYDROGEN.get())
			event.setBurnTime(1600);
	}
}
