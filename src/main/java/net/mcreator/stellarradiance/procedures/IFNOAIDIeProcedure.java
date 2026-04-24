package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

public class IFNOAIDIeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.SET_A_BLOCK_NO_AI) == true) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
