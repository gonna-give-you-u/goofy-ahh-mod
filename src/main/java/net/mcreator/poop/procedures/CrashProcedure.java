package net.mcreator.poop.procedures;

import net.mcreator.poop.network.PoopModVariables;
import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;

public class CrashProcedure {
	public static void execute() {
		if (GoofyAhhModServerConfigConfiguration.ENABLE_CRASHER.get()) {
			PoopModVariables.shouldShowBSOD = true;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			throw new RuntimeException("nihahahaha");
		}
	}
}
