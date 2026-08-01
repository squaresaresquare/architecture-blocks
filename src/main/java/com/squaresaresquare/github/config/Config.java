package com.squaresaresquare.github.config;

import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.api.RegisterType;
import com.squaresaresquare.github.config.ClientConfig;
import com.squaresaresquare.github.config.CommonConfig;

import java.util.function.Supplier;

public class Config {
   public static final CommonConfig COMMON = register(CommonConfig::new, RegisterType.BOTH);
   public static final ClientConfig CLIENT = register(ClientConfig::new, RegisterType.CLIENT);

   public static void init() {
   }

   private static <T extends me.fzzyhmstrs.fzzy_config.config.Config> T register(Supplier<T> supplier, RegisterType type) {
      return (T)ConfigApiJava.registerAndLoadConfig(supplier, type);
   }
}
