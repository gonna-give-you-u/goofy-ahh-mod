
package net.mcreator.poop.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HydrogenItem extends Item {
	public HydrogenItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
