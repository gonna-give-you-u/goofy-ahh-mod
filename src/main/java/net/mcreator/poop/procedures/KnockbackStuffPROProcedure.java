package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class KnockbackStuffPROProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		itemstack.enchant(Enchantments.KNOCKBACK, 127);
	}
}
