package net.mcreator.poop.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.network.PoopModVariables;
import net.mcreator.poop.init.PoopModItems;
import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;

import java.util.List;
import java.util.Comparator;

public class VeryLoudProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
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
		double nx = 0;
		double ny = 0;
		double nz = 0;
		if ((entity.getCapability(PoopModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PoopModVariables.PlayerVariables())).shouldBeLoud
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PoopModItems.LRAD.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == PoopModItems.LRAD.get())) {
			if (PoopModVariables.MapVariables.get(world).lradSoundTicks >= 3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("poop:lrad_sound")), SoundSource.MASTER, 30, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("poop:lrad_sound")), SoundSource.MASTER, 30, 1, false);
					}
				}
				nx = x;
				ny = y + 1;
				nz = z;
				for (int index0 = 0; index0 < 90; index0++) {
					{
						final Vec3 _center = new Vec3(nx, ny, nz);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							entityiterator.invulnerableTime = 0;
							if (!((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == PoopModItems.EARMUFFS_HELMET.get())
									&& !(entityiterator instanceof Minecart || entityiterator instanceof Boat || entityiterator instanceof ItemEntity)) {
								if (!(entityiterator instanceof Player && !GoofyAhhModServerConfigConfiguration.LRAD_EARMUFFS_NEEDED.get())) {
									x1 = entity.getX();
									y1 = entity.getY();
									z1 = entity.getZ();
									x2 = entityiterator.getX();
									y2 = entityiterator.getY();
									z2 = entityiterator.getZ();
									vx = x2 - x1;
									vy = y2 - y1;
									vz = z2 - z1;
									entityiterator.hurt(
											new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("poop:ear_ape_damage"))), entity),
											(float) 0.5);
								}
							}
						}
					}
					nx = nx + entity.getLookAngle().x;
					ny = ny + entity.getLookAngle().y;
					nz = nz + entity.getLookAngle().z;
					if (world.getBlockState(BlockPos.containing(nx, ny, nz)).canOcclude()) {
						break;
					}
				}
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				PoopModVariables.MapVariables.get(world).lradSoundTicks = 0;
				PoopModVariables.MapVariables.get(world).syncData(world);
			}
			PoopModVariables.MapVariables.get(world).lradSoundTicks = PoopModVariables.MapVariables.get(world).lradSoundTicks + 1;
			PoopModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
