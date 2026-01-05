package net.mcreator.poop.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class NukeCheckAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double boomRadius = 0;
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR)) {
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.VOID_AIR)) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CAVE_AIR)) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 250, Level.ExplosionInteraction.TNT);
				}
			}
		}
	}
}
