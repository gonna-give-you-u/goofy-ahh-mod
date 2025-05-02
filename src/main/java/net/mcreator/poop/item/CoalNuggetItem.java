
package net.mcreator.poop.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CoalNuggetItem extends Item {
	public CoalNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
