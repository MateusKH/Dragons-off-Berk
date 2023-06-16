
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.dragon_of_berk.world.inventory.Pag2Menu;
import net.mcreator.dragon_of_berk.world.inventory.Pag1Menu;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class DragonOfBerkModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DragonOfBerkMod.MODID);
	public static final RegistryObject<MenuType<Pag2Menu>> PAG_2 = REGISTRY.register("pag_2", () -> IForgeMenuType.create(Pag2Menu::new));
	public static final RegistryObject<MenuType<Pag1Menu>> PAG_1 = REGISTRY.register("pag_1", () -> IForgeMenuType.create(Pag1Menu::new));
}
