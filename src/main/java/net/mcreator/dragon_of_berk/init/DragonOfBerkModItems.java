
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dragon_of_berk.item.NightFuryScaleArmorItem;
import net.mcreator.dragon_of_berk.item.MaceItem;
import net.mcreator.dragon_of_berk.item.GronkelmagmashovelItem;
import net.mcreator.dragon_of_berk.item.GronkelironnuggetItem;
import net.mcreator.dragon_of_berk.item.GronkelironmixItem;
import net.mcreator.dragon_of_berk.item.GronkelIronItem;
import net.mcreator.dragon_of_berk.item.DevItem;
import net.mcreator.dragon_of_berk.item.BookOfDragonsAItem;
import net.mcreator.dragon_of_berk.item.BooKofDragonsItem;
import net.mcreator.dragon_of_berk.item.BattleaxeItem;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class DragonOfBerkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonOfBerkMod.MODID);
	public static final RegistryObject<Item> GRONKEL_IRON = REGISTRY.register("gronkel_iron", () -> new GronkelIronItem());
	public static final RegistryObject<Item> HOBGOBBLERS = REGISTRY.register("hobgobblers", () -> new PapaTudoItem());
	public static final RegistryObject<Item> GRONKEL_IRON_BLOCK = block(DragonOfBerkModBlocks.GRONKEL_IRON_BLOCK);
	public static final RegistryObject<Item> GRONKELMAGMA = block(DragonOfBerkModBlocks.GRONKELMAGMA);
	public static final RegistryObject<Item> GRONKELIRONMIX = REGISTRY.register("gronkelironmix", () -> new GronkelironmixItem());
	public static final RegistryObject<Item> GRONKELMAGMASHOVEL = REGISTRY.register("gronkelmagmashovel", () -> new GronkelmagmashovelItem());
	public static final RegistryObject<Item> LIQUIDGRONKELIRON = block(DragonOfBerkModBlocks.LIQUIDGRONKELIRON);
	public static final RegistryObject<Item> GRONKEL = REGISTRY.register("gronkel", () -> new GronkelItem());
	public static final RegistryObject<Item> MACE = REGISTRY.register("mace", () -> new MaceItem());
	public static final RegistryObject<Item> FISHBLOCK = block(DragonOfBerkModBlocks.FISHBLOCK);
	public static final RegistryObject<Item> BATTLEAXE = REGISTRY.register("battleaxe", () -> new BattleaxeItem());
	public static final RegistryObject<Item> GRONKELIRONNUGGET = REGISTRY.register("gronkelironnugget", () -> new GronkelironnuggetItem());
	public static final RegistryObject<Item> HOBGOBBLERSEGGS = block(DragonOfBerkModBlocks.HOBGOBBLERSEGGS);
	public static final RegistryObject<Item> CRACKED_HOBGOBBLERSEGGS = block(DragonOfBerkModBlocks.CRACKED_HOBGOBBLERSEGGS);
	public static final RegistryObject<Item> NIGHT_FURY_SCALE_ARMOR_HELMET = REGISTRY.register("night_fury_scale_armor_helmet", () -> new NightFuryScaleArmorItem.Helmet());
	public static final RegistryObject<Item> NIGHT_FURY_SCALE_ARMOR_CHESTPLATE = REGISTRY.register("night_fury_scale_armor_chestplate", () -> new NightFuryScaleArmorItem.Chestplate());
	public static final RegistryObject<Item> NIGHT_FURY_SCALE_ARMOR_LEGGINGS = REGISTRY.register("night_fury_scale_armor_leggings", () -> new NightFuryScaleArmorItem.Leggings());
	public static final RegistryObject<Item> NIGHT_FURY_SCALE_ARMOR_BOOTS = REGISTRY.register("night_fury_scale_armor_boots", () -> new NightFuryScaleArmorItem.Boots());
	public static final RegistryObject<Item> DEV = REGISTRY.register("dev", () -> new DevItem());
	public static final RegistryObject<Item> BLOCK_M_DEV = block(DragonOfBerkModBlocks.BLOCK_M_DEV);
	public static final RegistryObject<Item> BOOK_OF_DRAGONS_A = REGISTRY.register("book_of_dragons_a", () -> new BookOfDragonsAItem());
	public static final RegistryObject<Item> BOO_KOF_DRAGONS = REGISTRY.register("boo_kof_dragons", () -> new BooKofDragonsItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
