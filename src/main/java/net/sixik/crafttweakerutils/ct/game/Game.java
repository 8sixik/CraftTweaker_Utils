package net.sixik.crafttweakerutils.ct.game;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;

import com.blamejared.crafttweaker.impl.game.MCGame;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.client.MinecraftGame;
import net.minecraftforge.client.MinecraftForgeClient;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;

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
    @ZenCodeType.Method
    public static long getTime(){
        Date date1 = new Date();
        return date1.getTime();
    }
    @ZenCodeType.Method
    public static int getDate(){
        Date date1 = new Date();
        return date1.getDate();
    }
    @ZenCodeType.Method
    public static int getDay(){
        Date date1 = new Date();
        return date1.getDay();
    }
    @ZenCodeType.Method
    public static int getHours(){
        Date date1 = new Date();
        return date1.getHours();
    }
    @ZenCodeType.Method
    public static int getMinutes(){
        Date date1 = new Date();
        return date1.getMinutes();
    }
    @ZenCodeType.Method
    public static int getSeconds(){
        Date date1 = new Date();
        return date1.getSeconds();
    }
    @ZenCodeType.Method
    public static int getMonth(){
        Date date1 = new Date();
        return date1.getMonth();
    }
    @ZenCodeType.Method
    public static int getYear(){
        Date date1 = new Date();
        return date1.getYear();
    }
    @ZenCodeType.Method
    public static int getTimezoneOffset(){
        Date date1 = new Date();
        return date1.getTimezoneOffset();
    }
}
