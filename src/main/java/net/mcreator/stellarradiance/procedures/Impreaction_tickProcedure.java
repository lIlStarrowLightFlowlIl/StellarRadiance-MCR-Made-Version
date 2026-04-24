package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.stellarradiance.init.StellarRadianceModMobEffects;

public class Impreaction_tickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("stellar_key", entity) == 114514 || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("stellar_radiance:stellar"))))) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("stellar_radiance:stellar_impreaction")))),
					(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(StellarRadianceModMobEffects.IMPRECATION.get()) ? _livEnt.getEffect(StellarRadianceModMobEffects.IMPRECATION.get()).getAmplifier() : 0) * 2 + 1));
		}
	}
}
