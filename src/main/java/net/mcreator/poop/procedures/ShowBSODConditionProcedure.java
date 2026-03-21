package net.mcreator.poop.procedures;

import net.mcreator.poop.network.PoopModVariables;

public class ShowBSODConditionProcedure {
	public static boolean execute() {
		if (PoopModVariables.shouldShowBSOD) {
			return true;
		}
		return false;
	}
}
