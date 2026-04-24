package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.stellarradiance.init.StellarRadianceModItems;
import net.mcreator.stellarradiance.init.StellarRadianceModBlocks;

public class ClearMenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StellarRadianceModBlocks.STELLARDIZUO.get())) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(StellarRadianceModItems.STELLAR_CHEST_FILLED.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
