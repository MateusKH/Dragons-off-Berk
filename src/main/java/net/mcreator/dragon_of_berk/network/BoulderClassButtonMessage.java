
package net.mcreator.dragon_of_berk.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dragon_of_berk.world.inventory.BoulderClassMenu;
import net.mcreator.dragon_of_berk.procedures.WhisperingDeathOpenProcedure;
import net.mcreator.dragon_of_berk.procedures.Seta1Procedure;
import net.mcreator.dragon_of_berk.procedures.GronckleOpenProcedure;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BoulderClassButtonMessage {
	private final int buttonID, x, y, z;

	public BoulderClassButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BoulderClassButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BoulderClassButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BoulderClassButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = BoulderClassMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GronckleOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			WhisperingDeathOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Seta1Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DragonOfBerkMod.addNetworkMessage(BoulderClassButtonMessage.class, BoulderClassButtonMessage::buffer, BoulderClassButtonMessage::new, BoulderClassButtonMessage::handler);
	}
}
