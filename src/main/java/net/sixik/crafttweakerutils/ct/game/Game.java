package net.sixik.crafttweakerutils.ct.game;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;

import com.blamejared.crafttweaker.impl.game.MCGame;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraftforge.client.MinecraftForgeClient;
import org.openzen.zencode.java.ZenCodeType;
@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.game.Game")
public class Game {
    @ZenCodeType.Method
    public static String getLang(){
       return MinecraftForgeClient.getLocale().getLanguage();
    }

    @ZenCodeType.Method
    public static String getLanguageTag(){
       return MinecraftForgeClient.getLocale().toLanguageTag();
    }
}
