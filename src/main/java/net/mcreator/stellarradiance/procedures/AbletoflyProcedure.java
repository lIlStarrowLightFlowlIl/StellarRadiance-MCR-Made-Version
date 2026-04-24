package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.client.Minecraft;

import net.mcreator.stellarradiance.init.StellarRadianceModGameRules;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class AbletoflyProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "name")) {
				if (!(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entityiterator) || new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
						}
						return false;
					}
				}.checkGamemode(entityiterator))) {
					if (BoolArgumentType.getBool(arguments, "able") == true) {
						if (entityiterator instanceof Player _player) {
							_player.getAbilities().mayfly = (BoolArgumentType.getBool(arguments, "able") == true);
							_player.onUpdateAbilities();
						}
						if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.SEND_PLAYER_FLY_MESSAGE_BACK) == true && world.getLevelData().getGameRules().getBoolean(GameRules.RULE_SENDCOMMANDFEEDBACK) == true) {
							if (entityiterator instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("\u4F60\u5DF2\u88AB\u5141\u8BB8\u98DE\u884C"), false);
						}
					}
					if (BoolArgumentType.getBool(arguments, "able") == false) {
						if (entityiterator instanceof Player _player) {
							_player.getAbilities().mayfly = (BoolArgumentType.getBool(arguments, "able") == true);
							_player.onUpdateAbilities();
						}
						if (entityiterator instanceof Player _player) {
							_player.getAbilities().flying = (BoolArgumentType.getBool(arguments, "able") == true);
							_player.onUpdateAbilities();
						}
						if (world.getLevelData().getGameRules().getBoolean(StellarRadianceModGameRules.SEND_PLAYER_FLY_MESSAGE_BACK) == true && world.getLevelData().getGameRules().getBoolean(GameRules.RULE_SENDCOMMANDFEEDBACK) == true) {
							if (entityiterator instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("\u4F60\u5DF2\u88AB\u7981\u6B62\u98DE\u884C"), false);
						}
					}
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
