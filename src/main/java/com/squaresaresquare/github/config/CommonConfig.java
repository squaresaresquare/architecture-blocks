package com.squaresaresquare.github.config;

import me.fzzyhmstrs.fzzy_config.annotations.Translation;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.config.ConfigGroup;
import me.fzzyhmstrs.fzzy_config.config.ConfigGroup.Pop;
import net.conczin.immersive_paintings.ImmersivePaintings;

@Translation(prefix = "config.immersive_paintings.common")
public class CommonConfig extends Config {
   public ConfigGroup generalGroup = new ConfigGroup("general");
   public boolean testIfSpaceEmpty = false;
   public boolean paintingsHaveCollision = false;
   public boolean showOtherPlayersPaintings = true;
   public boolean automaticImageResizing = false;
   public boolean enableBundledPaintings = true;
   @Pop
   public int uploadPermissionLevel = 0;
   public ConfigGroup advancedGroup = new ConfigGroup("advanced");
   public int maxUserImageWidth = 4096;
   public int maxUserImageHeight = 4096;
   public int maxUserImages = 1000;
   public int minPaintingResolution = 8;
   public int maxPaintingResolution = 256;
   public int maxPacketsPerSecond = 20;
   public int packetSize = 65536;
   @Pop
   public int packetSplitInterval = 250;

   public CommonConfig() {
      super(ImmersivePaintings.locate("common_config"));
   }
}
