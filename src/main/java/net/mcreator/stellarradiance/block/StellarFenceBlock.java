
package net.mcreator.stellarradiance.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class StellarFenceBlock extends FenceBlock {
	public StellarFenceBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(2f, 10f).lightLevel(s -> 5).dynamicShape().forceSolidOn());
	}

	@Override
	public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter world, BlockPos pos, FluidState fluidstate) {
		return true;
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
		return 5f;
	}

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 3;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}
}
