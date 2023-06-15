package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.Difficulty;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.storage.LevelData;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/LevelData")
@NativeTypeRegistration(value = LevelData.class,zenCodeName = "mods.crafttweakerutils.api.misc.world.LevelData")
public class ExpandLevelData {
    @ZenCodeType.Method
    public static Difficulty getDifficulty(LevelData internal){
        return internal.getDifficulty();
    }
    @ZenCodeType.Method
    public static GameRules getGameRules(LevelData internal){
        return internal.getGameRules();
    }
    @ZenCodeType.Method
    public static long getDayTime(LevelData internal){
        return internal.getDayTime();
    }
    @ZenCodeType.Method
    public static long getGameTime(LevelData internal){
        return internal.getGameTime();
    }
    @ZenCodeType.Method
    public static int getXSpawn(LevelData internal){
        return internal.getXSpawn();
    }
    @ZenCodeType.Method
    public static int getYSpawn(LevelData internal){
        return internal.getYSpawn();
    }
    @ZenCodeType.Method
    public static int getZSpawn(LevelData internal){
        return internal.getZSpawn();
    }


}
