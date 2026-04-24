
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class StellarRadianceModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == StellarRadianceModBlocks.STELLAR_RADIENCE_LOG.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StellarRadianceModBlocks.FLOATING_STELLAR_RADIANCE_TREE_ROOT.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StellarRadianceModBlocks.STELLAR_RADIANCE_PLANKS.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StellarRadianceModBlocks.STELLAR_RADIANCE_SLAB.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StellarRadianceModBlocks.STELLAR_RADIANCE_STAIRS.get().asItem())
			event.setBurnTime(1600);
	}
}
