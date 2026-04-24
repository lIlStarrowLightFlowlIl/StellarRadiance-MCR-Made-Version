
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.stellarradiance.StellarRadianceMod;

public class StellarRadianceModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StellarRadianceMod.MODID);
	public static final RegistryObject<CreativeModeTab> STELLAR_RADIANCE_TAB = REGISTRY.register("stellar_radiance_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stellar_radiance.stellar_radiance_tab")).icon(() -> new ItemStack(StellarRadianceModItems.STELLAR_RADIANCE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StellarRadianceModItems.STELLAR_RADIANCE.get());
				tabData.accept(StellarRadianceModBlocks.STELLAR_DIRT.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_GRAVEL.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_GRAVEL_STONE.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_ORE_ON_GROUND.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_ORE.get().asItem());
				tabData.accept(StellarRadianceModBlocks.DEEPSLATE_STELLAR_ORE.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_RADIENCE_LEAVES.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_RADIANCE_WOOD.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_RADIENCE_LOG.get().asItem());
				tabData.accept(StellarRadianceModBlocks.PARASITIZED_STELLAR_RADIANCE_LOG.get().asItem());
				tabData.accept(StellarRadianceModBlocks.FLOATING_STELLAR_RADIANCE_TREE_ROOT.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_RADIANCE_PLANKS.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_RADIANCE_STAIRS.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_RADIANCE_SLAB.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_FENCE.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_FENCE_GATE.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_RADIANCE_DOOR.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_TRAP_DOOR.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_BLOCK.get().asItem());
				tabData.accept(StellarRadianceModItems.STELLAR_INGOT.get());
				tabData.accept(StellarRadianceModItems.STELLAR_ARMOR_HELMET.get());
				tabData.accept(StellarRadianceModItems.STELLAR_ARMOR_CHESTPLATE.get());
				tabData.accept(StellarRadianceModItems.STELLAR_ARMOR_LEGGINGS.get());
				tabData.accept(StellarRadianceModItems.STELLAR_ARMOR_BOOTS.get());
				tabData.accept(StellarRadianceModItems.BASIC_STELLAR_SPEAR.get());
				tabData.accept(StellarRadianceModItems.STELLAR_GOD_SPEAR.get());
				tabData.accept(StellarRadianceModBlocks.STELLAR_CRYSTAL_BLOCK_NATURE.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_CRYSTAL_NATURE.get().asItem());
				tabData.accept(StellarRadianceModItems.STELLAR_CRYSTALASH.get());
				tabData.accept(StellarRadianceModBlocks.STELLAR_CRYSTAL_BLOCK.get().asItem());
				tabData.accept(StellarRadianceModItems.STELLARCRYSTAL.get());
				tabData.accept(StellarRadianceModItems.PROCESSED_STELLAR_CRYSTAL.get());
				tabData.accept(StellarRadianceModItems.STELLAR_CRYSTAL_PRISM.get());
				tabData.accept(StellarRadianceModItems.PRISM_CONTROLLER.get());
				tabData.accept(StellarRadianceModBlocks.CRYSTAL_WIRELESS_TRANSMITTER.get().asItem());
				tabData.accept(StellarRadianceModBlocks.CRYSTAL_WIRELESS_RECEVER.get().asItem());
				tabData.accept(StellarRadianceModBlocks.CRYSTAL_ACTIVE_BASE_PLATE.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_RADIENCE_BRANCH.get().asItem());
				tabData.accept(StellarRadianceModBlocks.STELLAR_FLOWER.get().asItem());
				tabData.accept(StellarRadianceModItems.STELLAR_RADIANCE_FEATHER.get());
				tabData.accept(StellarRadianceModBlocks.STELLARDIZUO.get().asItem());
				tabData.accept(StellarRadianceModItems.STELLAR_CHEST_FILLED.get());
				tabData.accept(StellarRadianceModItems.STELLAR_CHEST_FILLED_BUT_DANGER.get());
				tabData.accept(StellarRadianceModItems.STELLAR_CHEST.get());
				tabData.accept(StellarRadianceModItems.SHATTERED_STELLAR_CRYSTAL_CORE.get());
				tabData.accept(StellarRadianceModItems.CRUSHED_SLIME_BALL.get());
				tabData.accept(StellarRadianceModItems.IRON_STICK.get());
				tabData.accept(StellarRadianceModItems.YXH_SPAWN_EGG.get());
				tabData.accept(StellarRadianceModItems.STELLAR_RADIANCE_BIRD_SPAWN_EGG.get());
				tabData.accept(StellarRadianceModItems.STELLAR_PARASITER_SPAWN_EGG.get());
				tabData.accept(StellarRadianceModItems.LONG_TAILED_TIT_SPAWN_EGG.get());
				tabData.accept(StellarRadianceModItems.STELLAR_ENERGY_NEXUS_SPAWN_EGG.get());
				tabData.accept(StellarRadianceModBlocks.STELLAR_BARRIER.get().asItem());
				tabData.accept(StellarRadianceModItems.MUSIC_DISC_ECHO_IN_THE_VALLEY.get());
			})

					.build());
}
