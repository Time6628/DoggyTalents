package doggytalents.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;

import doggytalents.inventory.container.ContainerFoodBowl;
import doggytalents.lib.ResourceLib;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GuiFoodBowl extends ContainerScreen<ContainerFoodBowl> {

    public GuiFoodBowl(ContainerFoodBowl foodBowl, PlayerInventory playerInventory, ITextComponent displayName) {
        super(foodBowl, playerInventory, displayName);
        this.ySize = 127;
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.font.drawString(this.title.getFormattedText(), 10.0F, 8.0F, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(ResourceLib.GUI_FOOD_BOWL);
        int var2 = (this.width - this.xSize) / 2;
        int var3 = (this.height - this.ySize) / 2;
        this.blit(var2, var3, 0, 0, this.xSize, this.ySize);
    }
}
