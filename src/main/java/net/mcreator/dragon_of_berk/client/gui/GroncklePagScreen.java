package net.mcreator.dragon_of_berk.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.dragon_of_berk.world.inventory.GroncklePagMenu;
import net.mcreator.dragon_of_berk.network.GroncklePagButtonMessage;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GroncklePagScreen extends AbstractContainerScreen<GroncklePagMenu> {
	private final static HashMap<String, Object> guistate = GroncklePagMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_seta_1virada;

	public GroncklePagScreen(GroncklePagMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 141;
		this.imageHeight = 166;
	}

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
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.gronckle_pag.label_hobgobblers"), 52, -2, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.gronckle_pag.label_habitat_all_habitats"), 16, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.gronckle_pag.label_class_fire"), 16, 97, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.gronckle_pag.label_fire_type_propane"), 16, 106, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.gronckle_pag.label_tamanhopequeno"), 16, 115, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.gronckle_pag.label_length15_meters"), 16, 124, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_seta_1virada = new ImageButton(this.leftPos + 16, this.topPos + 142, 18, 10, 0, 0, 10, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_seta_1virada.png"), 18, 20, e -> {
			if (true) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new GroncklePagButtonMessage(0, x, y, z));
				GroncklePagButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_seta_1virada", imagebutton_seta_1virada);
		this.addRenderableWidget(imagebutton_seta_1virada);
	}
}
