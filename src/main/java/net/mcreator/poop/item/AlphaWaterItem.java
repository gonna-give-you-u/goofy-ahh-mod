
package net.mcreator.poop.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.poop.init.PoopModFluids;

public class AlphaWaterItem extends BucketItem {
	public AlphaWaterItem() {
		super(PoopModFluids.ALPHA_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
