package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.poop.network.PoopModVariables;

public class LradKeyUpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			{
				boolean _setval = false;
				entity.getCapability(PoopModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.shouldBeLoud = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
