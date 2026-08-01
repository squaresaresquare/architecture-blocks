package com.squaresaresquare.github.config;

import me.fzzyhmstrs.fzzy_config.annotations.Translation;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.config.ConfigGroup;
import me.fzzyhmstrs.fzzy_config.config.ConfigGroup.Pop;
import net.conczin.immersive_paintings.ImmersivePaintings;

@Translation(prefix = "config.immersive_paintings.client")
public class ClientConfig extends Config {
   public ConfigGroup generalGroup = new ConfigGroup("general");
   public boolean showOtherPlayersPaintings = true;
   @Pop
   public boolean showNSFWPaintings = true;
   public float nsfwBlurAmount = 0.25F;
   public ConfigGroup advancedGroup = new ConfigGroup("advanced");
   public int thumbnailSize = 128;
   public int lodResolutionMinimum = 32;
   public float halfResolutionThreshold = 4.0F;
   public float quarterResolutionThreshold = 8.0F;
   @Pop
   public float thumbResolutionThreshold = 16.0F;

   public ClientConfig() {
      super(ImmersivePaintings.locate("client_config"));
   }
}
