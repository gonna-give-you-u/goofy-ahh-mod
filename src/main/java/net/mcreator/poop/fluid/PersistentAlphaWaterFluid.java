
package net.mcreator.poop.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.poop.init.PoopModItems;
import net.mcreator.poop.init.PoopModFluids;
import net.mcreator.poop.init.PoopModFluidTypes;
import net.mcreator.poop.init.PoopModBlocks;

public abstract class PersistentAlphaWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PoopModFluidTypes.PERSISTENT_ALPHA_WATER_TYPE.get(), () -> PoopModFluids.PERSISTENT_ALPHA_WATER.get(),
			() -> PoopModFluids.FLOWING_PERSISTENT_ALPHA_WATER.get()).explosionResistance(100f).bucket(() -> PoopModItems.PERSISTENT_ALPHA_WATER_BUCKET.get()).block(() -> (LiquidBlock) PoopModBlocks.PERSISTENT_ALPHA_WATER.get());

	private PersistentAlphaWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_WATER;
	}

	public static class Source extends PersistentAlphaWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PersistentAlphaWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
