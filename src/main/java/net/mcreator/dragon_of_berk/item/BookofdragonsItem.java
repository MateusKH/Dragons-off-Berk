
package net.mcreator.dragon_of_berk.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.dragon_of_berk.procedures.Openpag1Procedure;
import net.mcreator.dragon_of_berk.init.DragonOfBerkModTabs;

public class BookofdragonsItem extends Item {
	public BookofdragonsItem() {
		super(new Item.Properties().tab(DragonOfBerkModTabs.TAB_DRAGONOFBERKITENS).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		Openpag1Procedure.execute(world, x, y, z, entity);
		return ar;
	}
}
