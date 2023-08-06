package xyz.dinoshuu.github.welcomescreen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.EnumChatFormatting;

/*
 * @author dinoshuu
*/

import xyz.dinoshuu.github.welcomescreen.util.Fonts.ScreenFont;  // Someday I will add :>
import xyz.dinoshuu.github.welcomescreen.util.Render.ScreenUtil; // Someday I will add :>
import xyz.dinoshuu.github.welcomescreen.util.Render.RenderUtil; // Someday I will add :>

import java.awt.*;
import java.io.IOException;

public class WelcomeScreen 
  extends GuiScreen { // net.minecraft.client.gui.GuiScreen;

@Override
  public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
    try {
      RenderUtil.drawRect(0, 0, mc.displayWidth, mc.displayHeight, new Color(127,255,212).getRGB());
      ScreenUtil.renderGray();

      Fonts.JETBRAI_MONO_20.drawCenteredStringWithShadow("Sample Minecraft WelcomeScreen Code", sr.getScaledWidth() / 2, sr.getScaledHeight() / 2 - 30, -1);
      Fonts.JETBRAI_MONO_15.drawCenteredStringWithShadow("Created by dinoshuu", sr.getScaledWidth() / 2, sr.getScaledHeight() / 2, -1);
      
      Fonts.JETBRAI_MONO_13.drawCenteredStringWithShadow(EnumChatFormatting.UNDERLINE + "Github: dinoshuu! ", sr.getScaledWidth() / 2 + 1, sr.getScaledHeight() / 2 + 30, -1);

    } catch(Exception e) {
      e.printStackTrace();
    }
  }

@Override
  public boolean doesGuiPauseGame() {
    return false;
  }
    
@Override
  public void keyTyped(char par1, int par2) throws IOException {
    super.keyTyped(par1, par2);
  }
}
