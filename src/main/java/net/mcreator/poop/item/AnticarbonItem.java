
package net.mcreator.poop.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.poop.procedures.BOOOOOOOMProcedure;

public class AnticarbonItem extends Item {
	public AnticarbonItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BOOOOOOOMProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
