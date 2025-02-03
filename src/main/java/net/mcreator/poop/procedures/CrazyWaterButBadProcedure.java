package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.init.PoopModBlocks;

public class CrazyWaterButBadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PoopModBlocks.PERSISTENT_ALPHA_WATER.get().defaultBlockState(), 3);
	}
}
