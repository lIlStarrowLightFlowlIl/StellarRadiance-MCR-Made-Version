package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class MotionTargetProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "target");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).setDeltaMovement(new Vec3(((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "target");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getLookAngle().x * DoubleArgumentType.getDouble(arguments, "multiplier")), ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "target");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getLookAngle().y * DoubleArgumentType.getDouble(arguments, "multiplier")), ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "target");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getLookAngle().z * DoubleArgumentType.getDouble(arguments, "multiplier"))));
	}
}
