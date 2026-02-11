package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;

public class RsatdarsfdthfsgProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (GoofyAhhModServerConfigConfiguration.REI_BREAKS_BLOCKS.get()) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.TNT);
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.NONE);
		}
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.EXPLOSION)), 50);
	}
}
