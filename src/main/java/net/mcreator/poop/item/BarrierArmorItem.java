
package net.mcreator.poop.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

import net.mcreator.poop.procedures.BarrierArmourCancelAttackProcedure;
import net.mcreator.poop.procedures.BarrierArmorSetBonusProcedure;

import com.google.common.collect.Iterables;

public abstract class BarrierArmorItem extends ArmorItem {
	public BarrierArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{1073741823, 1073741823, 1073741823, 1073741823}[type.getSlot().getIndex()] * 1;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{10000, 10000, 10000, 10000}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 128000;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BARRIER));
			}

			@Override
			public String getName() {
				return "barrier_armor";
			}

			@Override
			public float getToughness() {
				return 1024f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, type, properties);
	}

	public static class Helmet extends BarrierArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "poop:textures/models/armor/barrier_armor_layer_1.png";
		}
	}

	public static class Chestplate extends BarrierArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "poop:textures/models/armor/barrier_armor_layer_1.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				BarrierArmorSetBonusProcedure.execute(world, entity);
			}
		}
	}

	public static class Leggings extends BarrierArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "poop:textures/models/armor/barrier_armor_layer_2.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				BarrierArmourCancelAttackProcedure.execute(entity);
			}
		}
	}

	public static class Boots extends BarrierArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "poop:textures/models/armor/barrier_armor_layer_1.png";
		}
	}
}
