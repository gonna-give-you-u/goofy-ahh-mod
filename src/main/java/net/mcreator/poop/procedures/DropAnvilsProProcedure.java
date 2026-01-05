package net.mcreator.poop.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class DropAnvilsProProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double anvils = 0;
		anvils = 0;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.ANVIL)) : false) {
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (Blocks.ANVIL.asItem() == itemstackiterator.getItem()) {
							anvils = anvils + itemstackiterator.getCount();
						}
					}
				}
			}
			if (anvils >= 9) {
				world.setBlock(BlockPos.containing(x, y + 15, z), Blocks.ANVIL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 1, y + 15, z + 1), Blocks.ANVIL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 1, y + 15, z), Blocks.ANVIL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 1, y + 15, z - 1), Blocks.ANVIL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 15, z - 1), Blocks.ANVIL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 15, z + 1), Blocks.ANVIL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 1, y + 15, z + 1), Blocks.ANVIL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 1, y + 15, z), Blocks.ANVIL.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 1, y + 15, z - 1), Blocks.ANVIL.defaultBlockState(), 3);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.ANVIL);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 9, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
