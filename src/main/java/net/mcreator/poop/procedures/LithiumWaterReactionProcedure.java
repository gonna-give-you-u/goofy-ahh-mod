package net.mcreator.poop.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.poop.network.PoopModVariables;
import net.mcreator.poop.init.PoopModItems;
import net.mcreator.poop.configuration.GoofyAhhModServerConfigConfiguration;

public class LithiumWaterReactionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (GoofyAhhModServerConfigConfiguration.LITHIUM_WATER_REACTION.get()) {
			if (PoopModVariables.MapVariables.get(world).LithiumTicksPassed == 20) {
				PoopModVariables.MapVariables.get(world).LithiumTicksPassed = 0;
				PoopModVariables.MapVariables.get(world).syncData(world);
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PoopModItems.LITHIUM_6.get())) : false) && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.EXPLOSION)), 1);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y + 1, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, (y + 1), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(PoopModItems.LITHIUM_6.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PoopModItems.HYDROGEN.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			PoopModVariables.MapVariables.get(world).LithiumTicksPassed = PoopModVariables.MapVariables.get(world).LithiumTicksPassed + 1;
			PoopModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
