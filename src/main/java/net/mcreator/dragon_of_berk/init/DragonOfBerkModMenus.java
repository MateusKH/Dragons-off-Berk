
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.dragon_of_berk.world.inventory.WhisperingDeathPagMenu;
import net.mcreator.dragon_of_berk.world.inventory.TerribleTerrorPagMenu;
import net.mcreator.dragon_of_berk.world.inventory.StokerClassMenu;
import net.mcreator.dragon_of_berk.world.inventory.Pag2Menu;
import net.mcreator.dragon_of_berk.world.inventory.Pag1Menu;
import net.mcreator.dragon_of_berk.world.inventory.MonstruousNightmarePagMenu;
import net.mcreator.dragon_of_berk.world.inventory.GroncklePagMenu;
import net.mcreator.dragon_of_berk.world.inventory.BoulderClassMenu;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

public class DragonOfBerkModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DragonOfBerkMod.MODID);
	public static final RegistryObject<MenuType<Pag1Menu>> PAG_1 = REGISTRY.register("pag_1", () -> IForgeMenuType.create(Pag1Menu::new));
	public static final RegistryObject<MenuType<Pag2Menu>> PAG_2 = REGISTRY.register("pag_2", () -> IForgeMenuType.create(Pag2Menu::new));
	public static final RegistryObject<MenuType<StokerClassMenu>> STOKER_CLASS = REGISTRY.register("stoker_class", () -> IForgeMenuType.create(StokerClassMenu::new));
	public static final RegistryObject<MenuType<BoulderClassMenu>> BOULDER_CLASS = REGISTRY.register("boulder_class", () -> IForgeMenuType.create(BoulderClassMenu::new));
	public static final RegistryObject<MenuType<MonstruousNightmarePagMenu>> MONSTRUOUS_NIGHTMARE_PAG = REGISTRY.register("monstruous_nightmare_pag", () -> IForgeMenuType.create(MonstruousNightmarePagMenu::new));
	public static final RegistryObject<MenuType<TerribleTerrorPagMenu>> TERRIBLE_TERROR_PAG = REGISTRY.register("terrible_terror_pag", () -> IForgeMenuType.create(TerribleTerrorPagMenu::new));
	public static final RegistryObject<MenuType<GroncklePagMenu>> GRONCKLE_PAG = REGISTRY.register("gronckle_pag", () -> IForgeMenuType.create(GroncklePagMenu::new));
	public static final RegistryObject<MenuType<WhisperingDeathPagMenu>> WHISPERING_DEATH_PAG = REGISTRY.register("whispering_death_pag", () -> IForgeMenuType.create(WhisperingDeathPagMenu::new));
}
