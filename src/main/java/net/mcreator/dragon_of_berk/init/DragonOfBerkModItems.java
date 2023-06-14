
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dragon_of_berk.item.MaceItem;
import net.mcreator.dragon_of_berk.item.GronkelmagmashovelItem;
import net.mcreator.dragon_of_berk.item.GronkelironnuggetItem;
import net.mcreator.dragon_of_berk.item.GronkelironmixItem;
import net.mcreator.dragon_of_berk.item.GronkelIronItem;
import net.mcreator.dragon_of_berk.item.BattleaxeItem;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class DragonOfBerkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonOfBerkMod.MODID);
	public static final RegistryObject<Item> GRONKEL_IRON = REGISTRY.register("gronkel_iron", () -> new GronkelIronItem());
	public static final RegistryObject<Item> PAPA_TUDO_SPAWN_EGG = REGISTRY.register("papa_tudo_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonOfBerkModEntities.PAPA_TUDO, -10092493, -13210, new Item.Properties().tab(DragonOfBerkModTabs.TAB_DRAGONSOFBERKDRAGONS)));
	public static final RegistryObject<Item> GRONKEL_IRON_BLOCK = block(DragonOfBerkModBlocks.GRONKEL_IRON_BLOCK, DragonOfBerkModTabs.TAB_DRAGONSOFBERKBLOCKS);
	public static final RegistryObject<Item> GRONKELMAGMA = block(DragonOfBerkModBlocks.GRONKELMAGMA, DragonOfBerkModTabs.TAB_DRAGONSOFBERKBLOCKS);
	public static final RegistryObject<Item> GRONKELIRONMIX = REGISTRY.register("gronkelironmix", () -> new GronkelironmixItem());
	public static final RegistryObject<Item> GRONKELMAGMASHOVEL = REGISTRY.register("gronkelmagmashovel", () -> new GronkelmagmashovelItem());
	public static final RegistryObject<Item> LIQUIDGRONKELIRON = block(DragonOfBerkModBlocks.LIQUIDGRONKELIRON, DragonOfBerkModTabs.TAB_DRAGONSOFBERKBLOCKS);
	public static final RegistryObject<Item> GRONKEL_SPAWN_EGG = REGISTRY.register("gronkel_spawn_egg",
			() -> new ForgeSpawnEggItem(DragonOfBerkModEntities.GRONKEL, -26368, -3381760, new Item.Properties().tab(DragonOfBerkModTabs.TAB_DRAGONSOFBERKDRAGONS)));
	public static final RegistryObject<Item> MACE = REGISTRY.register("mace", () -> new MaceItem());
	public static final RegistryObject<Item> FISHBLOCK = block(DragonOfBerkModBlocks.FISHBLOCK, DragonOfBerkModTabs.TAB_DRAGONSOFBERKBLOCKS);
	public static final RegistryObject<Item> BATTLEAXE = REGISTRY.register("battleaxe", () -> new BattleaxeItem());
	public static final RegistryObject<Item> GRONKELIRONNUGGET = REGISTRY.register("gronkelironnugget", () -> new GronkelironnuggetItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
