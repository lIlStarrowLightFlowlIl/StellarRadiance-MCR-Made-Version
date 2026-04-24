
package net.mcreator.stellarradiance.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscEchoInTheValleyItem extends RecordItem {
	public MusicDiscEchoInTheValleyItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stellar_radiance:echo_in_the_valley")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 5040);
	}
}
