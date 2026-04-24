package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.Comparator;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class RunCommandRunProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		{
			final Vec3 _center = new Vec3((new Object() {
				public double getX() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "pos").getX();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getX()), (new Object() {
				public double getY() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "pos").getY();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getY()), (new Object() {
				public double getZ() {
					try {
						return BlockPosArgument.getLoadedBlockPos(arguments, "pos").getZ();
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return 0;
					}
				}
			}.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((DoubleArgumentType.getDouble(arguments, "area")) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				{
					Entity _ent = entityiterator;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), (new Object() {
									public String getMessage() {
										try {
											return MessageArgument.getMessage(arguments, "command").getString();
										} catch (CommandSyntaxException ignored) {
											return "";
										}
									}
								}).getMessage());
					}
				}
			}
		}
	}
}
