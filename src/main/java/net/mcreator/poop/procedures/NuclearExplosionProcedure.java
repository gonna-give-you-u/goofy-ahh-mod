package net.mcreator.poop.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;

import java.util.List;
import java.util.Comparator;

public class NuclearExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double vx = 0;
		double vy = 0;
		double vz = 0;
		double distance = 0;
		double z1 = 0;
		double y1 = 0;
		double z2 = 0;
		double x1 = 0;
		double y2 = 0;
		double x2 = 0;
		if (GoofyAhhModServerConfigConfiguration.OLD_NUKE_BEHAVIOUR.get()) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 250, Level.ExplosionInteraction.TNT);
		} else {
			int horizontalRadiusSphere = (int) 30 - 1;
			int verticalRadiusSphere = (int) 30 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x + xi, y + i, z + zi), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, 10, 1);
								} else {
									_level.playLocalSound(x + xi, y + i, z + zi, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, 10, 1, false);
								}
							}
							{
								BlockPos _pos = BlockPos.containing(x + xi, y + i, z + zi);
								Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + xi, y + i, z + zi), null);
								world.destroyBlock(_pos, false);
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							{
								final Vec3 _center = new Vec3(x + xi, y + i, z + zi);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (true) {
										x1 = x;
										y1 = y;
										z1 = z;
										x2 = entityiterator.getX();
										y2 = entityiterator.getY();
										z2 = entityiterator.getZ();
										vx = x2 - x1;
										vy = y2 - y1;
										vz = z2 - z1;
										distance = Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2) + Math.pow(vz, 2));
									}
									if (!(entityiterator instanceof ItemEntity)) {
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.EXPLOSION)), (float) (30000 - distance * 1000));
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
