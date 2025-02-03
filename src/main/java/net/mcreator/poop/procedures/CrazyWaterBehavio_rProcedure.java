package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.init.PoopModBlocks;

public class CrazyWaterBehavio_rProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PoopModBlocks.ALPHA_WATER.get().defaultBlockState(), 3);
	}
}
