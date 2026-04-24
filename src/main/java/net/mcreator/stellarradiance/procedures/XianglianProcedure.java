package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.entity.Entity;

public class XianglianProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
		entity.setAirSupply(20);
	}
}
