
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.stellarradiance.item.StellarcrystalItem;
import net.mcreator.stellarradiance.item.StellarRadianceItem;
import net.mcreator.stellarradiance.item.StellarRadianceFeatherItem;
import net.mcreator.stellarradiance.item.StellarRadianceBookItem;
import net.mcreator.stellarradiance.item.StellarIngotItem;
import net.mcreator.stellarradiance.item.StellarGodSpearItem;
import net.mcreator.stellarradiance.item.StellarCrystalashItem;
import net.mcreator.stellarradiance.item.StellarCrystalPrismItem;
import net.mcreator.stellarradiance.item.StellarChestItem;
import net.mcreator.stellarradiance.item.StellarChestFilledItem;
import net.mcreator.stellarradiance.item.StellarChestFilledButDangerItem;
import net.mcreator.stellarradiance.item.StellarArmorItem;
import net.mcreator.stellarradiance.item.ShatteredStellarCrystalCoreItem;
import net.mcreator.stellarradiance.item.ProcessedStellarCrystalItem;
import net.mcreator.stellarradiance.item.PrismControllerItem;
import net.mcreator.stellarradiance.item.MusicDiscEchoInTheValleyItem;
import net.mcreator.stellarradiance.item.IronStickItem;
import net.mcreator.stellarradiance.item.CrushedSlimeBallItem;
import net.mcreator.stellarradiance.item.BasicStellarSpearItem;
import net.mcreator.stellarradiance.StellarRadianceMod;

public class StellarRadianceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StellarRadianceMod.MODID);
	public static final RegistryObject<Item> STELLARCRYSTAL = REGISTRY.register("stellarcrystal", () -> new StellarcrystalItem());
	public static final RegistryObject<Item> STELLAR_ORE = block(StellarRadianceModBlocks.STELLAR_ORE);
	public static final RegistryObject<Item> DEEPSLATE_STELLAR_ORE = block(StellarRadianceModBlocks.DEEPSLATE_STELLAR_ORE);
	public static final RegistryObject<Item> STELLAR_INGOT = REGISTRY.register("stellar_ingot", () -> new StellarIngotItem());
	public static final RegistryObject<Item> STELLAR_RADIENCE_LOG = block(StellarRadianceModBlocks.STELLAR_RADIENCE_LOG);
	public static final RegistryObject<Item> STELLAR_RADIENCE_LEAVES = block(StellarRadianceModBlocks.STELLAR_RADIENCE_LEAVES);
	public static final RegistryObject<Item> STELLAR_FLOWER = block(StellarRadianceModBlocks.STELLAR_FLOWER);
	public static final RegistryObject<Item> STELLAR_RADIENCE_BRANCH = block(StellarRadianceModBlocks.STELLAR_RADIENCE_BRANCH);
	public static final RegistryObject<Item> STELLAR_RADIANCE_FEATHER = REGISTRY.register("stellar_radiance_feather", () -> new StellarRadianceFeatherItem());
	public static final RegistryObject<Item> SHATTERED_STELLAR_CRYSTAL_CORE = REGISTRY.register("shattered_stellar_crystal_core", () -> new ShatteredStellarCrystalCoreItem());
	public static final RegistryObject<Item> IRON_STICK = REGISTRY.register("iron_stick", () -> new IronStickItem());
	public static final RegistryObject<Item> BASIC_STELLAR_SPEAR = REGISTRY.register("basic_stellar_spear", () -> new BasicStellarSpearItem());
	public static final RegistryObject<Item> STELLAR_RADIANCE = REGISTRY.register("stellar_radiance", () -> new StellarRadianceItem());
	public static final RegistryObject<Item> STELLAR_CHEST = REGISTRY.register("stellar_chest", () -> new StellarChestItem());
	public static final RegistryObject<Item> STELLAR_CHEST_FILLED = REGISTRY.register("stellar_chest_filled", () -> new StellarChestFilledItem());
	public static final RegistryObject<Item> STELLARDIZUO = block(StellarRadianceModBlocks.STELLARDIZUO);
	public static final RegistryObject<Item> STELLAR_RADIANCE_PLANKS = block(StellarRadianceModBlocks.STELLAR_RADIANCE_PLANKS);
	public static final RegistryObject<Item> STELLAR_RADIANCE_SLAB = block(StellarRadianceModBlocks.STELLAR_RADIANCE_SLAB);
	public static final RegistryObject<Item> STELLAR_RADIANCE_STAIRS = block(StellarRadianceModBlocks.STELLAR_RADIANCE_STAIRS);
	public static final RegistryObject<Item> STELLAR_RADIANCE_DOOR = doubleBlock(StellarRadianceModBlocks.STELLAR_RADIANCE_DOOR);
	public static final RegistryObject<Item> STELLAR_CRYSTALASH = REGISTRY.register("stellar_crystalash", () -> new StellarCrystalashItem());
	public static final RegistryObject<Item> FLOATING_STELLAR_RADIANCE_TREE_ROOT = block(StellarRadianceModBlocks.FLOATING_STELLAR_RADIANCE_TREE_ROOT);
	public static final RegistryObject<Item> STELLAR_CRYSTAL_BLOCK = block(StellarRadianceModBlocks.STELLAR_CRYSTAL_BLOCK);
	public static final RegistryObject<Item> STELLAR_BARRIER = block(StellarRadianceModBlocks.STELLAR_BARRIER);
	public static final RegistryObject<Item> STELLAR_BLOCK = block(StellarRadianceModBlocks.STELLAR_BLOCK);
	public static final RegistryObject<Item> STELLAR_CRYSTAL_BLOCK_NATURE = block(StellarRadianceModBlocks.STELLAR_CRYSTAL_BLOCK_NATURE);
	public static final RegistryObject<Item> STELLAR_CRYSTAL_NATURE = block(StellarRadianceModBlocks.STELLAR_CRYSTAL_NATURE);
	public static final RegistryObject<Item> STELLAR_GRAVEL = block(StellarRadianceModBlocks.STELLAR_GRAVEL);
	public static final RegistryObject<Item> STELLAR_GRAVEL_STONE = block(StellarRadianceModBlocks.STELLAR_GRAVEL_STONE);
	public static final RegistryObject<Item> STELLAR_ORE_ON_GROUND = block(StellarRadianceModBlocks.STELLAR_ORE_ON_GROUND);
	public static final RegistryObject<Item> CRUSHED_SLIME_BALL = REGISTRY.register("crushed_slime_ball", () -> new CrushedSlimeBallItem());
	public static final RegistryObject<Item> YXH_SPAWN_EGG = REGISTRY.register("yxh_spawn_egg", () -> new ForgeSpawnEggItem(StellarRadianceModEntities.YXH, -10040065, -3368449, new Item.Properties()));
	public static final RegistryObject<Item> STELLAR_RADIANCE_BIRD_SPAWN_EGG = REGISTRY.register("stellar_radiance_bird_spawn_egg",
			() -> new ForgeSpawnEggItem(StellarRadianceModEntities.STELLAR_RADIANCE_BIRD, -6710785, -10053121, new Item.Properties()));
	public static final RegistryObject<Item> STELLAR_DIRT = block(StellarRadianceModBlocks.STELLAR_DIRT);
	public static final RegistryObject<Item> STELLAR_GOD_SPEAR = REGISTRY.register("stellar_god_spear", () -> new StellarGodSpearItem());
	public static final RegistryObject<Item> LONG_TAILED_TIT_SPAWN_EGG = REGISTRY.register("long_tailed_tit_spawn_egg", () -> new ForgeSpawnEggItem(StellarRadianceModEntities.LONG_TAILED_TIT, -4563385, -4370, new Item.Properties()));
	public static final RegistryObject<Item> STELLAR_RADIANCE_WOOD = block(StellarRadianceModBlocks.STELLAR_RADIANCE_WOOD);
	public static final RegistryObject<Item> PARASITIZED_STELLAR_RADIANCE_LOG = block(StellarRadianceModBlocks.PARASITIZED_STELLAR_RADIANCE_LOG);
	public static final RegistryObject<Item> STELLAR_PARASITER_SPAWN_EGG = REGISTRY.register("stellar_parasiter_spawn_egg", () -> new ForgeSpawnEggItem(StellarRadianceModEntities.STELLAR_PARASITER, -14934741, -10450945, new Item.Properties()));
	public static final RegistryObject<Item> CRYSTAL_WIRELESS_TRANSMITTER = block(StellarRadianceModBlocks.CRYSTAL_WIRELESS_TRANSMITTER);
	public static final RegistryObject<Item> CRYSTAL_WIRELESS_TRANSMITTER_ON = block(StellarRadianceModBlocks.CRYSTAL_WIRELESS_TRANSMITTER_ON);
	public static final RegistryObject<Item> CRYSTAL_ACTIVE_BASE_PLATE = block(StellarRadianceModBlocks.CRYSTAL_ACTIVE_BASE_PLATE);
	public static final RegistryObject<Item> PROCESSED_STELLAR_CRYSTAL = REGISTRY.register("processed_stellar_crystal", () -> new ProcessedStellarCrystalItem());
	public static final RegistryObject<Item> STELLAR_CRYSTAL_PRISM = REGISTRY.register("stellar_crystal_prism", () -> new StellarCrystalPrismItem());
	public static final RegistryObject<Item> PRISM_CONTROLLER = REGISTRY.register("prism_controller", () -> new PrismControllerItem());
	public static final RegistryObject<Item> CRYSTAL_WIRELESS_RECEVER = block(StellarRadianceModBlocks.CRYSTAL_WIRELESS_RECEVER);
	public static final RegistryObject<Item> CRYSTAL_WIRELESS_RECEVER_ON = block(StellarRadianceModBlocks.CRYSTAL_WIRELESS_RECEVER_ON);
	public static final RegistryObject<Item> STELLAR_ENERGY_NEXUS_SPAWN_EGG = REGISTRY.register("stellar_energy_nexus_spawn_egg",
			() -> new ForgeSpawnEggItem(StellarRadianceModEntities.STELLAR_ENERGY_NEXUS, -16724737, -13421569, new Item.Properties()));
	public static final RegistryObject<Item> STELLAR_CHEST_FILLED_BUT_DANGER = REGISTRY.register("stellar_chest_filled_but_danger", () -> new StellarChestFilledButDangerItem());
	public static final RegistryObject<Item> STELLAR_FENCE = block(StellarRadianceModBlocks.STELLAR_FENCE);
	public static final RegistryObject<Item> STELLAR_FENCE_GATE = block(StellarRadianceModBlocks.STELLAR_FENCE_GATE);
	public static final RegistryObject<Item> STELLAR_TRAP_DOOR = block(StellarRadianceModBlocks.STELLAR_TRAP_DOOR);
	public static final RegistryObject<Item> STELLAR_ARMOR_HELMET = REGISTRY.register("stellar_armor_helmet", () -> new StellarArmorItem.Helmet());
	public static final RegistryObject<Item> STELLAR_ARMOR_CHESTPLATE = REGISTRY.register("stellar_armor_chestplate", () -> new StellarArmorItem.Chestplate());
	public static final RegistryObject<Item> STELLAR_ARMOR_LEGGINGS = REGISTRY.register("stellar_armor_leggings", () -> new StellarArmorItem.Leggings());
	public static final RegistryObject<Item> STELLAR_ARMOR_BOOTS = REGISTRY.register("stellar_armor_boots", () -> new StellarArmorItem.Boots());
	public static final RegistryObject<Item> STELLAR_RADIANCE_BOOK = REGISTRY.register("stellar_radiance_book", () -> new StellarRadianceBookItem());
	public static final RegistryObject<Item> MUSIC_DISC_ECHO_IN_THE_VALLEY = REGISTRY.register("music_disc_echo_in_the_valley", () -> new MusicDiscEchoInTheValleyItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
