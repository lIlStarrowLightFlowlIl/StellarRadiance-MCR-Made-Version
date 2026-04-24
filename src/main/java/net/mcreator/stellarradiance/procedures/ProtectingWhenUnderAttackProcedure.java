package net.mcreator.stellarradiance.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.stellarradiance.init.StellarRadianceModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ProtectingWhenUnderAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, double amount) {
		execute(null, entity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, double amount) {
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
			if (amount >= 3.4 * Math.pow(10, 38)) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("stellar_radiance:out_of_die"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}
