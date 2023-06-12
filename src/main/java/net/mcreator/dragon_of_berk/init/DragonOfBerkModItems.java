
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class DragonOfBerkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonOfBerkMod.MODID);
	public static final RegistryObject<Item> PAPA_TUDO_SPAWN_EGG = REGISTRY.register("papa_tudo_spawn_egg", () -> new ForgeSpawnEggItem(DragonOfBerkModEntities.PAPA_TUDO, -13369549, -13369600, new Item.Properties()));
}
