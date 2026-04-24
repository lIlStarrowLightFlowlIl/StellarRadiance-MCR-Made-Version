package net.mcreator.stellarradiance.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stellarradiance.init.StellarRadianceModItems;
import net.mcreator.stellarradiance.entity.ActiveCrystalEntity;

public class ZhuangshuijingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(!world.getEntitiesOfClass(ActiveCrystalEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).isEmpty())
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == StellarRadianceModItems.STELLAR_CRYSTAL_PRISM.get()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon stellar_radiance:active_crystal ~0.5 ~0.5 ~0.5");
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(StellarRadianceModItems.STELLAR_CRYSTAL_PRISM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
