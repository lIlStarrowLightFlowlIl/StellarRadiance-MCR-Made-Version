
package net.mcreator.stellarradiance.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ProtectingMobEffect extends MobEffect {
	public ProtectingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10040065);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
