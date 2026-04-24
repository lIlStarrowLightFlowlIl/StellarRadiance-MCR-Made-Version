package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

public class YxhspeakProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random_text = 0;
		if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.MOD_ENTITY_SPEAKING) == true) {
			random_text = Mth.nextInt(RandomSource.create(), 1, 10);
			if (random_text == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\">W<\",\"color\":\"#49cdff\"}]");
					}
				}
			} else if (random_text == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u661F\u5F71\u795E\u67AA\u66FE\u7ECF\u662F\u4E00\u4E2A\u5927\u53F7\u80E1\u841D\u535C\u9493\u7AFF\",\"color\":\"#54c2ff\"}]");
					}
				}
			} else if (random_text == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u4F60\u77E5\u9053\u5417\uFF0C\u9752\u8272\u67D3\u6599\u7ECF\u8FC7\u52A0\u5DE5\u53EF\u4EE5\u53D8\u6210\u5047\u53D1\uFF08\u80E1\u8A00\u4E71\u8BED\uFF09\",\"color\":\"#799dff\"}]");
					}
				}
			} else if (random_text == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"awa\",\"color\":\"#9283ff\"}]");
					}
				}
			} else if (random_text == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u8FD9\u4E2Amod\u6709\u4E00\u4E2A\u6CA1\u7528\u4E0A\u7684\u751F\u7269\u7FA4\u7CFB\uFF0C\u4F60\u53D1\u73B0\u4E86\u5417awa\",\"color\":\"#9283ff\"}]");
					}
				}
			} else if (random_text == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u867D\u7136\u4F46\u662F\uFF0C\u4F60\u4EEC\u4EE5\u540E\u80FD\u4E0D\u80FD\u8001\u662F\u6B3A\u8D1F\u5206\u8EAB\u4E86QAQ\",\"color\":\"light_purple\"}]");
					}
				}
			} else if (random_text == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u6211\u4E0D\u4FE1\u4F60\u5728\u65C1\u89C2\u6A21\u5F0F\u8FD8\u80FD\u6253\u5230\u6211:D\",\"color\":\"#00ffff\"}]");
					}
				}
			} else if (random_text == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u4F60\u77E5\u9053\u5417\uFF0C\u8FD9\u4E9B\u5185\u5BB9\u5176\u5B9Etellraw\u6307\u4EE4\u505A\u7684\u2026\u2026woc\u6211\u5FD8\u8BB0\u5199\u989C\u8272\u4E86\",\"color\":\"white\"}]");
					}
				}
			} else if (random_text == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u4F60\u7684\u4E0B\u4E00\u4E2A\u661F\u5F71\u795E\u67AA\uFF0C\u53C8\u4F55\u5FC5\u662F\u661F\u5F71\u795E\u67AA\",\"color\":\"#799dff\"}]");
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> \"},{\"text\":\"\u67D0\u4E24\u6761\u6307\u4EE4\u7684\u5BC6\u7801\u662F114514\u5594~\u5C31\u5728\u2026\u2026\u6E38\u620F\u89C4\u5219\u90A3\u91CC\u8BBE\u7F6Eawa\",\"color\":\"aqua\"}]");
					}
				}
			}
		}
	}
}
