
package net.mcreator.poop.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.poop.procedures.UrGlassApplyProcedure;

import java.util.List;
import java.util.ArrayList;

public class UrGlassMobEffect extends MobEffect {
	public UrGlassMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		UrGlassApplyProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
