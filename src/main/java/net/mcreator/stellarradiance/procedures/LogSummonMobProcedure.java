package net.mcreator.stellarradiance.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.stellarradiance.init.StellarRadianceModParticleTypes;
import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;
import net.mcreator.stellarradiance.init.StellarRadianceModEntities;

public class LogSummonMobProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.WOOD_PARASITE_EVENTS) == true) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = StellarRadianceModEntities.STELLAR_PARASITER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			world.addParticle((SimpleParticleType) (StellarRadianceModParticleTypes.STELLAR_EXPLOSION.get()), x, y, z, 0, 0, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.BLOCKS, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.BLOCKS, (float) 0.5, 1, false);
				}
			}
		}
	}
}
