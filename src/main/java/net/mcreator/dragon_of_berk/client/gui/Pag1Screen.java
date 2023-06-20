package net.mcreator.dragon_of_berk.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.dragon_of_berk.world.inventory.Pag1Menu;
import net.mcreator.dragon_of_berk.network.Pag1ButtonMessage;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Pag1Screen extends AbstractContainerScreen<Pag1Menu> {
	private final static HashMap<String, Object> guistate = Pag1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_seta;
	ImageButton imagebutton_nada3;
	ImageButton imagebutton_nada31;
	ImageButton imagebutton_nada32;
	ImageButton imagebutton_nada33;
	ImageButton imagebutton_nada34;

	public Pag1Screen(Pag1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 141;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("dragon_of_berk:textures/screens/pag_1.png");

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
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.pag_1.label_hobgobblers"), 61, -2, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_seta = new ImageButton(this.leftPos + 106, this.topPos + 142, 18, 10, 0, 0, 10, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_seta.png"), 18, 20, e -> {
			if (true) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new Pag1ButtonMessage(0, x, y, z));
				Pag1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_seta", imagebutton_seta);
		this.addRenderableWidget(imagebutton_seta);
		imagebutton_nada3 = new ImageButton(this.leftPos + 19, this.topPos + 8, 48, 48, 0, 0, 48, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_nada3.png"), 48, 96, e -> {
			if (true) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new Pag1ButtonMessage(1, x, y, z));
				Pag1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_nada3", imagebutton_nada3);
		this.addRenderableWidget(imagebutton_nada3);
		imagebutton_nada31 = new ImageButton(this.leftPos + 79, this.topPos + 8, 48, 48, 0, 0, 48, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_nada31.png"), 48, 96, e -> {
			if (true) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new Pag1ButtonMessage(2, x, y, z));
				Pag1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_nada31", imagebutton_nada31);
		this.addRenderableWidget(imagebutton_nada31);
		imagebutton_nada32 = new ImageButton(this.leftPos + 19, this.topPos + 61, 48, 48, 0, 0, 48, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_nada32.png"), 48, 96, e -> {
		});
		guistate.put("button:imagebutton_nada32", imagebutton_nada32);
		this.addRenderableWidget(imagebutton_nada32);
		imagebutton_nada33 = new ImageButton(this.leftPos + 80, this.topPos + 61, 48, 48, 0, 0, 48, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_nada33.png"), 48, 96, e -> {
		});
		guistate.put("button:imagebutton_nada33", imagebutton_nada33);
		this.addRenderableWidget(imagebutton_nada33);
		imagebutton_nada34 = new ImageButton(this.leftPos + 51, this.topPos + 110, 48, 48, 0, 0, 48, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_nada34.png"), 48, 96, e -> {
		});
		guistate.put("button:imagebutton_nada34", imagebutton_nada34);
		this.addRenderableWidget(imagebutton_nada34);
	}
}
