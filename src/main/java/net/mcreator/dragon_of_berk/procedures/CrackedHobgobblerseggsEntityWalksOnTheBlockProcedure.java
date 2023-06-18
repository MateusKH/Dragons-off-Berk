package net.mcreator.dragon_of_berk.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.dragon_of_berk.init.DragonOfBerkModBlocks;

public class CrackedHobgobblerseggsEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), DragonOfBerkModBlocks.CRACKED_HOBGOBBLERSEGGS.get().defaultBlockState(), 3);
	}
}
