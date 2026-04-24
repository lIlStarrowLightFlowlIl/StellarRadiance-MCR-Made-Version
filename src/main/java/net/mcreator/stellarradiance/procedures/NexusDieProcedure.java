package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.stellarradiance.init.StellarRadianceModParticleTypes;
import net.mcreator.stellarradiance.init.StellarRadianceModItems;
import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

public class NexusDieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (StellarRadianceModParticleTypes.STELLAR_EXPLOSION.get()), x, y, z, 0, 0, 0);
		world.addParticle((SimpleParticleType) (StellarRadianceModParticleTypes.STELLAR_EXPLOSION_2.get()), x, y, z, 0, 0, 0);
		if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.NEXUS_EXPLOSION_WHEN_DIE) == true) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.MOB);
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(StellarRadianceModItems.SHATTERED_STELLAR_CRYSTAL_CORE.get()));
			entityToSpawn.setPickUpDelay(10);
			entityToSpawn.setUnlimitedLifetime();
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
