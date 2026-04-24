package net.mcreator.stellarradiance.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

public class RemoveThisEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((world.getLevelData().getGameRules().getInt(StellarRadianceModGameRules.ENABLE_ENTITY_CLEARANCE)) == 114514) {
			if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("minecraft:player")) {
				if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_SHOWDEATHMESSAGES) == true) {
					world.getLevelData().getGameRules().getRule(GameRules.RULE_SHOWDEATHMESSAGES).set(false, world.getServer());
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill @s");
						}
					}
					world.getLevelData().getGameRules().getRule(GameRules.RULE_SHOWDEATHMESSAGES).set(true, world.getServer());
				} else {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("stellar_radiance:stellar_impreaction")))),
							(float) (3.4 * Math.pow(10, 38)));
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill @s");
						}
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(0);
			} else {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "say \u547D\u4EE4removeentity\u6267\u884C\u5931\u8D25\uFF0C\u56E0\u4E3A\u5BC6\u7801\u9519\u8BEF");
				}
			}
		}
	}
}
