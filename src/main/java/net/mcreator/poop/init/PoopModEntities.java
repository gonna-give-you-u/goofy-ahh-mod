
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.poop.entity.TNTProjectileEntity;
import net.mcreator.poop.entity.RickProjectileEntity;
import net.mcreator.poop.entity.PooperEntity;
import net.mcreator.poop.entity.PoopProjectileEntity;
import net.mcreator.poop.entity.NukeProjectileEntity;
import net.mcreator.poop.entity.HardPoopProjectileEntity;
import net.mcreator.poop.PoopMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoopModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PoopMod.MODID);
	public static final RegistryObject<EntityType<PooperEntity>> POOPER = register("pooper",
			EntityType.Builder.<PooperEntity>of(PooperEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(PooperEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<PoopProjectileEntity>> POOP_PROJECTILE = register("poop_projectile",
			EntityType.Builder.<PoopProjectileEntity>of(PoopProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PoopProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<HardPoopProjectileEntity>> HARD_POOP_PROJECTILE = register("hard_poop_projectile", EntityType.Builder.<HardPoopProjectileEntity>of(HardPoopProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HardPoopProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TNTProjectileEntity>> TNT_PROJECTILE = register("tnt_projectile",
			EntityType.Builder.<TNTProjectileEntity>of(TNTProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TNTProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NukeProjectileEntity>> NUKE_PROJECTILE = register("nuke_projectile",
			EntityType.Builder.<NukeProjectileEntity>of(NukeProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(NukeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RickProjectileEntity>> RICK_PROJECTILE = register("rick_projectile",
			EntityType.Builder.<RickProjectileEntity>of(RickProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(RickProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PooperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(POOPER.get(), PooperEntity.createAttributes().build());
	}
}
