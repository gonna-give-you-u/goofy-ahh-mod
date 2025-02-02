
package net.mcreator.poop.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.poop.init.PoopModItems;
import net.mcreator.poop.init.PoopModFluids;
import net.mcreator.poop.init.PoopModFluidTypes;
import net.mcreator.poop.init.PoopModBlocks;

public abstract class LiquidGalliumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PoopModFluidTypes.LIQUID_GALLIUM_TYPE.get(), () -> PoopModFluids.LIQUID_GALLIUM.get(), () -> PoopModFluids.FLOWING_LIQUID_GALLIUM.get())
			.explosionResistance(150f).tickRate(6).slopeFindDistance(3).bucket(() -> PoopModItems.LIQUID_GALLIUM_BUCKET.get()).block(() -> (LiquidBlock) PoopModBlocks.LIQUID_GALLIUM.get());

	private LiquidGalliumFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidGalliumFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidGalliumFluid {
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
