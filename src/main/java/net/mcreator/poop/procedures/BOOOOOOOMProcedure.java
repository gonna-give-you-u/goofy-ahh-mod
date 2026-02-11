package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.poop.init.PoopModItems;
import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;

public class BOOOOOOOMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!GoofyAhhModServerConfigConfiguration.ANTICARBON_AUTO_EXPLOSION.get()) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 50, Level.ExplosionInteraction.TNT);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(PoopModItems.ANTICARBON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
