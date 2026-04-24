package net.mcreator.stellarradiance.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CDEwhenTureProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.CLEAR_DEAD_ENTITIES) == true && !entity.isAlive() && !(ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("minecraft:player")) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.CLEAR_DEAD_ENTITIES) == true && !entity.isAlive() && (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("minecraft:player")) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(0);
		}
	}
}
