package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.init.PoopModBlocks;
import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;

public class GalliumStateSolidifyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < (double) GoofyAhhModServerConfigConfiguration.GALLIUM_TEMP_THRESHOLD.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource()) {
				world.setBlock(BlockPos.containing(x, y, z), PoopModBlocks.SOLID_GALLIUM.get().defaultBlockState(), 3);
			}
		}
	}
}
