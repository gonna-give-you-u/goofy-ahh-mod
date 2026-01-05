
package net.mcreator.poop.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PoopFragmentItem extends Item {
	public PoopFragmentItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
