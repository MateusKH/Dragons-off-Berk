
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragon_of_berk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.dragon_of_berk.entity.PapaTudoEntity;
import net.mcreator.dragon_of_berk.entity.GronkelEntity;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonOfBerkModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DragonOfBerkMod.MODID);
	public static final RegistryObject<EntityType<GronkelEntity>> GRONKEL = register("gronkel",
			EntityType.Builder.<GronkelEntity>of(GronkelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronkelEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PapaTudoEntity>> PAPA_TUDO = register("papa_tudo",
			EntityType.Builder.<PapaTudoEntity>of(PapaTudoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(20).setUpdateInterval(3).setCustomClientFactory(PapaTudoEntity::new)

					.sized(0.6f, 0.6f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GronkelEntity.init();
			PapaTudoEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GRONKEL.get(), GronkelEntity.createAttributes().build());
		event.put(PAPA_TUDO.get(), PapaTudoEntity.createAttributes().build());
	}
}
