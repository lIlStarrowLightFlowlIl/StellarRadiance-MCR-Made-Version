package net.mcreator.stellarradiance.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.stellarradiance.init.StellarRadianceModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ISProtectingProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(StellarRadianceModMobEffects.PROTECTING.get()) && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("stellar_radiance:protecting")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			entity.clearFire();
			entity.setAirSupply(300);
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(20);
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation(10);
		}
	}
}
