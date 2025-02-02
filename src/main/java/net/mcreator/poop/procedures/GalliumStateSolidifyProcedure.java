package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.init.PoopModBlocks;

public class GalliumStateSolidifyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < 100) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource()) {
				world.setBlock(BlockPos.containing(x, y, z), PoopModBlocks.SOLID_GALLIUM.get().defaultBlockState(), 3);
			}
		}
	}
}
