
package net.mcreator.poop.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class HardPoopBlockBlock extends Block {
	public HardPoopBlockBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.STONE).strength(1.2f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return new float[]{0.2980392157f, 0.1568627451f, 0.0862745098f};
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
