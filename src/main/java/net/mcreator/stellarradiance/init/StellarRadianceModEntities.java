
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

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

import net.mcreator.stellarradiance.entity.YxhEntity;
import net.mcreator.stellarradiance.entity.StellarRadianceBirdEntity;
import net.mcreator.stellarradiance.entity.StellarParasiterEntity;
import net.mcreator.stellarradiance.entity.StellarEnergyNexusEntity;
import net.mcreator.stellarradiance.entity.StellarCrystalArrowEntity;
import net.mcreator.stellarradiance.entity.LongTailedTitEntity;
import net.mcreator.stellarradiance.entity.JiHuoDeHexinEntity;
import net.mcreator.stellarradiance.entity.ActiveCrystalEntity;
import net.mcreator.stellarradiance.entity.ABlockEntity;
import net.mcreator.stellarradiance.StellarRadianceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StellarRadianceModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StellarRadianceMod.MODID);
	public static final RegistryObject<EntityType<StellarCrystalArrowEntity>> STELLAR_CRYSTAL_ARROW = register("stellar_crystal_arrow", EntityType.Builder.<StellarCrystalArrowEntity>of(StellarCrystalArrowEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StellarCrystalArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<JiHuoDeHexinEntity>> JI_HUO_DE_HEXIN = register("ji_huo_de_hexin", EntityType.Builder.<JiHuoDeHexinEntity>of(JiHuoDeHexinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(JiHuoDeHexinEntity::new).fireImmune().sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ABlockEntity>> A_BLOCK = register("a_block",
			EntityType.Builder.<ABlockEntity>of(ABlockEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ABlockEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<YxhEntity>> YXH = register("yxh",
			EntityType.Builder.<YxhEntity>of(YxhEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(YxhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StellarRadianceBirdEntity>> STELLAR_RADIANCE_BIRD = register("stellar_radiance_bird",
			EntityType.Builder.<StellarRadianceBirdEntity>of(StellarRadianceBirdEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StellarRadianceBirdEntity::new)

					.sized(0.5f, 0.8f));
	public static final RegistryObject<EntityType<LongTailedTitEntity>> LONG_TAILED_TIT = register("long_tailed_tit",
			EntityType.Builder.<LongTailedTitEntity>of(LongTailedTitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LongTailedTitEntity::new)

					.sized(0.5f, 0.7f));
	public static final RegistryObject<EntityType<StellarParasiterEntity>> STELLAR_PARASITER = register("stellar_parasiter",
			EntityType.Builder.<StellarParasiterEntity>of(StellarParasiterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StellarParasiterEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<ActiveCrystalEntity>> ACTIVE_CRYSTAL = register("active_crystal", EntityType.Builder.<ActiveCrystalEntity>of(ActiveCrystalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ActiveCrystalEntity::new).fireImmune().sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StellarEnergyNexusEntity>> STELLAR_ENERGY_NEXUS = register("stellar_energy_nexus", EntityType.Builder.<StellarEnergyNexusEntity>of(StellarEnergyNexusEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StellarEnergyNexusEntity::new).fireImmune().sized(2f, 2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			JiHuoDeHexinEntity.init();
			ABlockEntity.init();
			YxhEntity.init();
			StellarRadianceBirdEntity.init();
			LongTailedTitEntity.init();
			StellarParasiterEntity.init();
			ActiveCrystalEntity.init();
			StellarEnergyNexusEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(JI_HUO_DE_HEXIN.get(), JiHuoDeHexinEntity.createAttributes().build());
		event.put(A_BLOCK.get(), ABlockEntity.createAttributes().build());
		event.put(YXH.get(), YxhEntity.createAttributes().build());
		event.put(STELLAR_RADIANCE_BIRD.get(), StellarRadianceBirdEntity.createAttributes().build());
		event.put(LONG_TAILED_TIT.get(), LongTailedTitEntity.createAttributes().build());
		event.put(STELLAR_PARASITER.get(), StellarParasiterEntity.createAttributes().build());
		event.put(ACTIVE_CRYSTAL.get(), ActiveCrystalEntity.createAttributes().build());
		event.put(STELLAR_ENERGY_NEXUS.get(), StellarEnergyNexusEntity.createAttributes().build());
	}
}
