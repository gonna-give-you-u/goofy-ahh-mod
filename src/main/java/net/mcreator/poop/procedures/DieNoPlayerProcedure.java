package net.mcreator.poop.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;
import net.mcreator.poop.PoopMod;

public class DieNoPlayerProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity == entity)) {
			if (!(!GoofyAhhModServerConfigConfiguration.ENTITY_DELETERS_PLAYERS.get() && entity instanceof Player)) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(1);
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK), sourceentity), 1000000);
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), sourceentity), 1000000);
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC_KILL), sourceentity), 1000000);
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(0);
				PoopMod.queueServerWork(40, () -> {
					if (!entity.level().isClientSide())
						entity.discard();
				});
			}
		}
	}
}
