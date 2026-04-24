
package net.mcreator.stellarradiance.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ProcessedStellarCrystalItem extends Item {
	public ProcessedStellarCrystalItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
