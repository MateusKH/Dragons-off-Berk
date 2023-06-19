package net.mcreator.dragon_of_berk.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.dragon_of_berk.init.DragonOfBerkModBlocks;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

import java.util.Map;

public class BlockMDevADDProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DragonOfBerkMod.queueServerWork(5, () -> {
			if (world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.UP)) {
				if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.OBSIDIAN)) {
					{
						BlockPos _bp = BlockPos.containing(x, y + 1, z);
						BlockState _bs = DragonOfBerkModBlocks.BLOCK_M_DEV.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.DOWN)) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.OBSIDIAN)) {
					{
						BlockPos _bp = BlockPos.containing(x, y - 1, z);
						BlockState _bs = DragonOfBerkModBlocks.BLOCK_M_DEV.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (world.getBlockState(BlockPos.containing(x, y, z + 1)).isFaceSturdy(world, BlockPos.containing(x, y, z + 1), Direction.NORTH)) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.OBSIDIAN)) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z + 1);
						BlockState _bs = DragonOfBerkModBlocks.BLOCK_M_DEV.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (world.getBlockState(BlockPos.containing(x, y, z - 1)).isFaceSturdy(world, BlockPos.containing(x, y, z - 1), Direction.SOUTH)) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.OBSIDIAN)) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z - 1);
						BlockState _bs = DragonOfBerkModBlocks.BLOCK_M_DEV.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (world.getBlockState(BlockPos.containing(x + 1, y, z)).isFaceSturdy(world, BlockPos.containing(x + 1, y, z), Direction.WEST)) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.OBSIDIAN)) {
					{
						BlockPos _bp = BlockPos.containing(x + 1, y, z);
						BlockState _bs = DragonOfBerkModBlocks.BLOCK_M_DEV.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
			if (world.getBlockState(BlockPos.containing(x - 1, y, z)).isFaceSturdy(world, BlockPos.containing(x - 1, y, z), Direction.EAST)) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.OBSIDIAN)) {
					{
						BlockPos _bp = BlockPos.containing(x - 1, y, z);
						BlockState _bs = DragonOfBerkModBlocks.BLOCK_M_DEV.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		});
	}
}
