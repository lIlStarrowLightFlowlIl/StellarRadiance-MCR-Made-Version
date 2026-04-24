package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.stellarradiance.init.StellarRadianceModParticleTypes;

public class CrystalTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (StellarRadianceModParticleTypes.BIOME_DUST.get()), (x + 0.5), (y + 0.5), (z + 0.5), 5, 0.5, 0.5, 0.5, 0.5);
	}
}
