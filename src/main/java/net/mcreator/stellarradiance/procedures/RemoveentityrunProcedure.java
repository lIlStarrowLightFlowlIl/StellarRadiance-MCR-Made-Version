package net.mcreator.stellarradiance.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class RemoveentityrunProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "target")) {
				if ((world.getLevelData().getGameRules().getInt(StellarRadianceModGameRules.ENABLE_ENTITY_CLEARANCE)) == 114514) {
					if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:player")) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeAllEffects();
						if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_SHOWDEATHMESSAGES) == true) {
							world.getLevelData().getGameRules().getRule(GameRules.RULE_SHOWDEATHMESSAGES).set(false, world.getServer());
							{
								Entity _ent = entityiterator;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill @s");
								}
							}
							world.getLevelData().getGameRules().getRule(GameRules.RULE_SHOWDEATHMESSAGES).set(true, world.getServer());
						} else {
							{
								Entity _ent = entityiterator;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill @s");
								}
							}
						}
						if (entityiterator instanceof LivingEntity _entity)
							_entity.setHealth(0);
					} else {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				} else {
					{
						Entity _ent = entityiterator;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "say \u547D\u4EE4removeentity\u6267\u884C\u5931\u8D25\uFF0C\u56E0\u4E3A\u5BC6\u7801\u9519\u8BEF");
						}
					}
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
