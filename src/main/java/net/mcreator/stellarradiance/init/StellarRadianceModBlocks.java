
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.stellarradiance.block.StellardizuoBlock;
import net.mcreator.stellarradiance.block.StellarTrapDoorBlock;
import net.mcreator.stellarradiance.block.StellarRadienceLogBlock;
import net.mcreator.stellarradiance.block.StellarRadienceLeavesBlock;
import net.mcreator.stellarradiance.block.StellarRadienceBranchBlock;
import net.mcreator.stellarradiance.block.StellarRadianceWoodBlock;
import net.mcreator.stellarradiance.block.StellarRadianceStairsBlock;
import net.mcreator.stellarradiance.block.StellarRadianceSlabBlock;
import net.mcreator.stellarradiance.block.StellarRadiancePlanksBlock;
import net.mcreator.stellarradiance.block.StellarRadianceDoorBlock;
import net.mcreator.stellarradiance.block.StellarOreOnGroundBlock;
import net.mcreator.stellarradiance.block.StellarOreBlock;
import net.mcreator.stellarradiance.block.StellarGravelStoneBlock;
import net.mcreator.stellarradiance.block.StellarGravelBlock;
import net.mcreator.stellarradiance.block.StellarFlowerBlock;
import net.mcreator.stellarradiance.block.StellarFenceGateBlock;
import net.mcreator.stellarradiance.block.StellarFenceBlock;
import net.mcreator.stellarradiance.block.StellarDirtBlock;
import net.mcreator.stellarradiance.block.StellarCrystalNatureBlock;
import net.mcreator.stellarradiance.block.StellarCrystalBlockNatureBlock;
import net.mcreator.stellarradiance.block.StellarCrystalBlockBlock;
import net.mcreator.stellarradiance.block.StellarBlockBlock;
import net.mcreator.stellarradiance.block.StellarBarrierBlock;
import net.mcreator.stellarradiance.block.ParasitizedStellarRadianceLogBlock;
import net.mcreator.stellarradiance.block.FloatingStellarRadianceTreeRootBlock;
import net.mcreator.stellarradiance.block.DeepslateStellarOreBlock;
import net.mcreator.stellarradiance.block.CrystalWirelessTransmitterOnBlock;
import net.mcreator.stellarradiance.block.CrystalWirelessTransmitterBlock;
import net.mcreator.stellarradiance.block.CrystalWirelessReceverOnBlock;
import net.mcreator.stellarradiance.block.CrystalWirelessReceverBlock;
import net.mcreator.stellarradiance.block.CrystalActiveBasePlateBlock;
import net.mcreator.stellarradiance.StellarRadianceMod;

public class StellarRadianceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StellarRadianceMod.MODID);
	public static final RegistryObject<Block> STELLAR_ORE = REGISTRY.register("stellar_ore", () -> new StellarOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_STELLAR_ORE = REGISTRY.register("deepslate_stellar_ore", () -> new DeepslateStellarOreBlock());
	public static final RegistryObject<Block> STELLAR_RADIENCE_LOG = REGISTRY.register("stellar_radience_log", () -> new StellarRadienceLogBlock());
	public static final RegistryObject<Block> STELLAR_RADIENCE_LEAVES = REGISTRY.register("stellar_radience_leaves", () -> new StellarRadienceLeavesBlock());
	public static final RegistryObject<Block> STELLAR_FLOWER = REGISTRY.register("stellar_flower", () -> new StellarFlowerBlock());
	public static final RegistryObject<Block> STELLAR_RADIENCE_BRANCH = REGISTRY.register("stellar_radience_branch", () -> new StellarRadienceBranchBlock());
	public static final RegistryObject<Block> STELLARDIZUO = REGISTRY.register("stellardizuo", () -> new StellardizuoBlock());
	public static final RegistryObject<Block> STELLAR_RADIANCE_PLANKS = REGISTRY.register("stellar_radiance_planks", () -> new StellarRadiancePlanksBlock());
	public static final RegistryObject<Block> STELLAR_RADIANCE_SLAB = REGISTRY.register("stellar_radiance_slab", () -> new StellarRadianceSlabBlock());
	public static final RegistryObject<Block> STELLAR_RADIANCE_STAIRS = REGISTRY.register("stellar_radiance_stairs", () -> new StellarRadianceStairsBlock());
	public static final RegistryObject<Block> STELLAR_RADIANCE_DOOR = REGISTRY.register("stellar_radiance_door", () -> new StellarRadianceDoorBlock());
	public static final RegistryObject<Block> FLOATING_STELLAR_RADIANCE_TREE_ROOT = REGISTRY.register("floating_stellar_radiance_tree_root", () -> new FloatingStellarRadianceTreeRootBlock());
	public static final RegistryObject<Block> STELLAR_CRYSTAL_BLOCK = REGISTRY.register("stellar_crystal_block", () -> new StellarCrystalBlockBlock());
	public static final RegistryObject<Block> STELLAR_BARRIER = REGISTRY.register("stellar_barrier", () -> new StellarBarrierBlock());
	public static final RegistryObject<Block> STELLAR_BLOCK = REGISTRY.register("stellar_block", () -> new StellarBlockBlock());
	public static final RegistryObject<Block> STELLAR_CRYSTAL_BLOCK_NATURE = REGISTRY.register("stellar_crystal_block_nature", () -> new StellarCrystalBlockNatureBlock());
	public static final RegistryObject<Block> STELLAR_CRYSTAL_NATURE = REGISTRY.register("stellar_crystal_nature", () -> new StellarCrystalNatureBlock());
	public static final RegistryObject<Block> STELLAR_GRAVEL = REGISTRY.register("stellar_gravel", () -> new StellarGravelBlock());
	public static final RegistryObject<Block> STELLAR_GRAVEL_STONE = REGISTRY.register("stellar_gravel_stone", () -> new StellarGravelStoneBlock());
	public static final RegistryObject<Block> STELLAR_ORE_ON_GROUND = REGISTRY.register("stellar_ore_on_ground", () -> new StellarOreOnGroundBlock());
	public static final RegistryObject<Block> STELLAR_DIRT = REGISTRY.register("stellar_dirt", () -> new StellarDirtBlock());
	public static final RegistryObject<Block> STELLAR_RADIANCE_WOOD = REGISTRY.register("stellar_radiance_wood", () -> new StellarRadianceWoodBlock());
	public static final RegistryObject<Block> PARASITIZED_STELLAR_RADIANCE_LOG = REGISTRY.register("parasitized_stellar_radiance_log", () -> new ParasitizedStellarRadianceLogBlock());
	public static final RegistryObject<Block> CRYSTAL_WIRELESS_TRANSMITTER = REGISTRY.register("crystal_wireless_transmitter", () -> new CrystalWirelessTransmitterBlock());
	public static final RegistryObject<Block> CRYSTAL_WIRELESS_TRANSMITTER_ON = REGISTRY.register("crystal_wireless_transmitter_on", () -> new CrystalWirelessTransmitterOnBlock());
	public static final RegistryObject<Block> CRYSTAL_ACTIVE_BASE_PLATE = REGISTRY.register("crystal_active_base_plate", () -> new CrystalActiveBasePlateBlock());
	public static final RegistryObject<Block> CRYSTAL_WIRELESS_RECEVER = REGISTRY.register("crystal_wireless_recever", () -> new CrystalWirelessReceverBlock());
	public static final RegistryObject<Block> CRYSTAL_WIRELESS_RECEVER_ON = REGISTRY.register("crystal_wireless_recever_on", () -> new CrystalWirelessReceverOnBlock());
	public static final RegistryObject<Block> STELLAR_FENCE = REGISTRY.register("stellar_fence", () -> new StellarFenceBlock());
	public static final RegistryObject<Block> STELLAR_FENCE_GATE = REGISTRY.register("stellar_fence_gate", () -> new StellarFenceGateBlock());
	public static final RegistryObject<Block> STELLAR_TRAP_DOOR = REGISTRY.register("stellar_trap_door", () -> new StellarTrapDoorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
