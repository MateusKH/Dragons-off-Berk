
package net.mcreator.dragon_of_berk.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.dragon_of_berk.procedures.CrackedHobgobblerseggsEntityWalksOnTheBlockProcedure;

public class HobgobblerseggsBlock extends Block {
	public HobgobblerseggsBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRAVEL).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).noLootTable());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof ShovelItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		CrackedHobgobblerseggsEntityWalksOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}
