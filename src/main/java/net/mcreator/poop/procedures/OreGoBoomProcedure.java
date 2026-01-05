package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.poop.PoopMod;

public class OreGoBoomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		PoopMod.queueServerWork(1, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.BLOCK);
		});
	}
}
