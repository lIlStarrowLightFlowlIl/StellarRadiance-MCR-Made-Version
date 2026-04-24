package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.stellarradiance.init.StellarRadianceModItems;

public class Anxia2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("stellar_radiance:v_1"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == StellarRadianceModItems.STELLAR_GOD_SPEAR.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}
}
