
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dragon_of_berk.block.LiquidgronkelironBlock;
import net.mcreator.dragon_of_berk.block.HobgobblerseggsBlock;
import net.mcreator.dragon_of_berk.block.GronkelmagmaBlock;
import net.mcreator.dragon_of_berk.block.GronkelIronBlockBlock;
import net.mcreator.dragon_of_berk.block.FishblockBlock;
import net.mcreator.dragon_of_berk.block.CrackedHobgobblerseggsBlock;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class DragonOfBerkModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DragonOfBerkMod.MODID);
	public static final RegistryObject<Block> GRONKEL_IRON_BLOCK = REGISTRY.register("gronkel_iron_block", () -> new GronkelIronBlockBlock());
	public static final RegistryObject<Block> GRONKELMAGMA = REGISTRY.register("gronkelmagma", () -> new GronkelmagmaBlock());
	public static final RegistryObject<Block> LIQUIDGRONKELIRON = REGISTRY.register("liquidgronkeliron", () -> new LiquidgronkelironBlock());
	public static final RegistryObject<Block> FISHBLOCK = REGISTRY.register("fishblock", () -> new FishblockBlock());
	public static final RegistryObject<Block> HOBGOBBLERSEGGS = REGISTRY.register("hobgobblerseggs", () -> new HobgobblerseggsBlock());
	public static final RegistryObject<Block> CRACKED_HOBGOBBLERSEGGS = REGISTRY.register("cracked_hobgobblerseggs", () -> new CrackedHobgobblerseggsBlock());
}
