package net.mcreator.poop.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.init.PoopModItems;
import net.mcreator.poop.PoopMod;

import java.util.List;
import java.util.Comparator;

public class LithiumDroppedItemWaterReactionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 2000; index0++) {
			PoopMod.queueServerWork(1, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof ItemEntity) {
							if ((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == PoopModItems.LITHIUM_6.get()) {
								if ((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()))).getBlock() == Blocks.WATER) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")),
													SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.PLAYERS, 1,
													1, false);
										}
									}
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), new ItemStack(PoopModItems.HYDROGEN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (!entityiterator.level().isClientSide())
										entityiterator.discard();
								}
							}
						}
					}
				}
			});
		}
	}
}
