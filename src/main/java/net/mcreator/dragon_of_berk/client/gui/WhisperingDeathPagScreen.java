package net.mcreator.dragon_of_berk.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.dragon_of_berk.world.inventory.WhisperingDeathPagMenu;
import net.mcreator.dragon_of_berk.network.WhisperingDeathPagButtonMessage;
import net.mcreator.dragon_of_berk.DragonOfBerkMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WhisperingDeathPagScreen extends AbstractContainerScreen<WhisperingDeathPagMenu> {
	private final static HashMap<String, Object> guistate = WhisperingDeathPagMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_seta_1virada;

	public WhisperingDeathPagScreen(WhisperingDeathPagMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 141;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("dragon_of_berk:textures/screens/whispering_death_pag.png");

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
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.whispering_death_pag.label_hobgobblers"), 32, -4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.whispering_death_pag.label_habitat_all_habitats"), 10, 93, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.whispering_death_pag.label_class_fire"), 9, 105, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.whispering_death_pag.label_fire_type_propane"), 9, 118, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.whispering_death_pag.label_tamanhopequeno"), 10, 130, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.dragon_of_berk.whispering_death_pag.label_length15_meters"), 10, 142, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_seta_1virada = new ImageButton(this.leftPos + -5, this.topPos + 141, 35, 33, 0, 0, 33, new ResourceLocation("dragon_of_berk:textures/screens/atlas/imagebutton_seta_1virada.png"), 35, 66, e -> {
			if (true) {
				DragonOfBerkMod.PACKET_HANDLER.sendToServer(new WhisperingDeathPagButtonMessage(0, x, y, z));
				WhisperingDeathPagButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_seta_1virada", imagebutton_seta_1virada);
		this.addRenderableWidget(imagebutton_seta_1virada);
	}
}
