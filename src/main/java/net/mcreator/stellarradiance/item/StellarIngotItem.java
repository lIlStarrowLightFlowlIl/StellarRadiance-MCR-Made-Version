
package net.mcreator.stellarradiance.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class StellarIngotItem extends Item {
	public StellarIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f).alwaysEat().build()));
	}

	@Override
	public int getEnchantmentValue() {
		return 10;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
