
package net.mcreator.poop.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DebianUnstableItem extends Item {
	public DebianUnstableItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
