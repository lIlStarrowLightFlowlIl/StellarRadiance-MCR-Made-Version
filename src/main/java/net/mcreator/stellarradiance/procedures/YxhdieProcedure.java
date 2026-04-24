package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stellarradiance.init.StellarRadianceModParticleTypes;
import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

public class YxhdieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.MOD_ENTITY_SPEAKING) == true) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
							"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u54CE\u6211\u600E\u4E48\u4F3C\u4E86\",\"color\":\"#49cdff\"}]");
				}
			}
		}
		world.addParticle((SimpleParticleType) (StellarRadianceModParticleTypes.STELLAR_EXPLOSION_2.get()), x, y, z, 0, 0, 0);
	}
}
