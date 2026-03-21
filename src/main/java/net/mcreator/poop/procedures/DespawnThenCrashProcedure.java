package net.mcreator.poop.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.poop.network.PoopModVariables;
import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;

public class DespawnThenCrashProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (GoofyAhhModServerConfigConfiguration.ENABLE_CRASHER.get()) {
			PoopModVariables.shouldShowBSOD = true;
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
			CrashProcedure.execute();
		}
	}
}
