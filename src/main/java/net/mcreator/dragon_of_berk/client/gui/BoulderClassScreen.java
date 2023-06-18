package net.mcreator.dragon_of_berk.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.dragon_of_berk.world.inventory.BoulderClassMenu;
import net.mcreator.dragon_of_berk.network.BoulderClassButtonMessage;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BoulderClassScreen extends AbstractContainerScreen<BoulderClassMenu> {
	private final static HashMap<String, Object> guistate = BoulderClassMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_terrible_terror;
	Button button_monstrous_nightmare;
	ImageButton imagebutton_seta_1virada;

	public BoulderClassScreen(BoulderClassMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 141;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("dragon_of_berk:textures/screens/boulder_class.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("dragon_of_berk:textures/screens/pagina.png"));
		this.blit(ms, this.leftPos + -2, this.topPos + -11, 0, 0, 146, 180, 146, 180);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.boulder_class.label_hobgobblers"), 54, -4, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_terrible_terror = new Button(this.leftPos + 21, this.topPos + 10, 103, 20, Component.translatable("gui.dragon_of_berk.boulder_class.button_terrible_terror"), e -> {
			if (true) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new BoulderClassButtonMessage(0, x, y, z));
				BoulderClassButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_terrible_terror", button_terrible_terror);
		this.addRenderableWidget(button_terrible_terror);
		button_monstrous_nightmare = new Button(this.leftPos + 10, this.topPos + 37, 124, 20, Component.translatable("gui.dragon_of_berk.boulder_class.button_monstrous_nightmare"), e -> {
			if (true) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new BoulderClassButtonMessage(1, x, y, z));
				BoulderClassButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_monstrous_nightmare", button_monstrous_nightmare);
		this.addRenderableWidget(button_monstrous_nightmare);
		imagebutton_seta_1virada = new ImageButton(this.leftPos + -5, this.topPos + 141, 35, 33, 0, 0, 33, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_seta_1virada.png"), 35, 66, e -> {
			if (true) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new BoulderClassButtonMessage(2, x, y, z));
				BoulderClassButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_seta_1virada", imagebutton_seta_1virada);
		this.addRenderableWidget(imagebutton_seta_1virada);
	}
}
