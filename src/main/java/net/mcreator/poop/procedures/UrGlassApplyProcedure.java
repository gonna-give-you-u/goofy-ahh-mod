package net.mcreator.poop.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class UrGlassApplyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.ARMOR))
			_livingEntity0.getAttribute(Attributes.ARMOR).setBaseValue((-100));
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS))
			_livingEntity1.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue((-100));
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity2.getAttribute(Attributes.MAX_HEALTH).setBaseValue(1);
	}
}
