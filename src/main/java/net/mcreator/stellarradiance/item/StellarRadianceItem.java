
package net.mcreator.stellarradiance.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.stellarradiance.procedures.GetBookProcedure;

import java.util.List;

public class StellarRadianceItem extends Item {
	public StellarRadianceItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77\u8FD9\u624b\u6301\u7269\u54c1\u53f3\u952e\u53ef\u83b7\u5f97\u661f\u8f89\u4e4b\u4e66(\u6559\u7a0b)\u9664\u6b64\u4e4b\u5916\u2026\u2026\u4f3c\u4e4e\u53ea\u80fd\u5f53\u5c01\u9762\u7528\u4e86\u554a"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		GetBookProcedure.execute(entity);
		return ar;
	}
}
