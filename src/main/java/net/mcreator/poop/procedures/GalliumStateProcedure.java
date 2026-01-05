package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.init.PoopModBlocks;

public class GalliumStateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f >= 100) {
			world.setBlock(BlockPos.containing(x, y, z), PoopModBlocks.LIQUID_GALLIUM.get().defaultBlockState(), 3);
		}
	}
}
