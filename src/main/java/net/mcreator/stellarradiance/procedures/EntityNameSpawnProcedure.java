package net.mcreator.stellarradiance.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityNameSpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String entity_name_length = "";
		double jizhun = 0;
		entity_name_length = entity.getDisplayName().getString();
		int name_length = (entity_name_length.length());
		if ((world.getLevelData().getGameRules().getInt(StellarRadianceModGameRules.ENTITY_NAME_MAX_LENGTH)) >= 20) {
			if (name_length >= world.getLevelData().getGameRules().getInt(StellarRadianceModGameRules.ENTITY_NAME_MAX_LENGTH)) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else {
			if (name_length >= 20) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
