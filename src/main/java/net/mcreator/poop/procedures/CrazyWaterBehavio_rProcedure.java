package net.mcreator.poop.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.init.PoopModBlocks;
import net.mcreator.poop.PoopMod;

public class CrazyWaterBehavio_rProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PoopModBlocks.ALPHA_WATER.get().defaultBlockState(), 3);
		PoopMod.queueServerWork(50, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
		});
	}
}
