
package net.mcreator.stellarradiance.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.stellarradiance.procedures.Impreaction_tickProcedure;

public class ImprecationMobEffect extends MobEffect {
	public ImprecationMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434625);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Impreaction_tickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
