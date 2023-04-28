package net.sixik.crafttweakerutils.ct.events.server.helper;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.sixik.crafttweakerutils.CraftTweakerUtils;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;


@ZenCodeType.Name("mods.crafttweakerutils.events.helper.ATimer")
@ZenRegister
public class ATimer {
    public static ATimer INSTANCE;




    public static long endTime = 0;
    public static HashMap<PlayerEntity, String> playerData = new HashMap<PlayerEntity, String>();
    public static HashMap<String, Boolean> timerData = new HashMap<String, Boolean>();
    public static HashMap<PlayerEntity, Boolean> timerEnd = new HashMap<PlayerEntity, Boolean>();
    public static HashMap<PlayerEntity, Long> timeData = new HashMap<PlayerEntity, Long>();
    public static World world;

    @ZenCodeType.Method
    public static void setTimer(int time, PlayerEntity player){
        if(!player.getPersistentData().getBoolean(CraftTweakerUtils.MOD_ID + "timer")){
            world = player.level;
            long startTime = world.getGameTime();
            endTime = time*20 + startTime;
            player.getPersistentData().putBoolean(CraftTweakerUtils.MOD_ID + "timer", true);
            player.getPersistentData().putLong(CraftTweakerUtils.MOD_ID + "timerstart", startTime);
            player.getPersistentData().putLong(CraftTweakerUtils.MOD_ID + "timerend", endTime);
            player.getPersistentData().putBoolean(CraftTweakerUtils.MOD_ID + "timercomplite", false);
        }
    }

    @ZenCodeType.Method
    public static void nullTimer(PlayerEntity player){
        player.getPersistentData().putLong(CraftTweakerUtils.MOD_ID + "timerend", 0);
    }
    @ZenCodeType.Method
    public static long getStartTime(PlayerEntity player) {
        if(player.getPersistentData().contains(CraftTweakerUtils.MOD_ID + "timerstart")) return player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "timerstart");
        else return -1;
    }
    @ZenCodeType.Method
    public static long getEndTime(PlayerEntity player){
        if(player.getPersistentData().contains(CraftTweakerUtils.MOD_ID + "timerend")) return player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "timerend");
        else return -1;
    }
    @ZenCodeType.Method
    public static long getLeftTime(PlayerEntity player){
        if(player.getPersistentData().contains(CraftTweakerUtils.MOD_ID + "lefttime")) return player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "lefttime");
        else return -1;
    }
    @ZenCodeType.Method
    public static void setEndTime(PlayerEntity player, long l){
        player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "timerend");
        player.getPersistentData().putLong(CraftTweakerUtils.MOD_ID + "timerend", l);
    }
    @ZenCodeType.Method
    public static boolean isStart(PlayerEntity player){
        if(player.getPersistentData().contains(CraftTweakerUtils.MOD_ID + "timer")) return player.getPersistentData().getBoolean(CraftTweakerUtils.MOD_ID + "timer");
        else return false;
    }
    @ZenCodeType.Method
    public static void TimerStart(PlayerEntity player, boolean timer){
        player.getPersistentData().putBoolean(CraftTweakerUtils.MOD_ID + "timer",timer);
    }

    @ZenCodeType.Method
    public static boolean TimerComplite(PlayerEntity player){
        if(player.getPersistentData().contains(CraftTweakerUtils.MOD_ID + "timercomplite")) return player.getPersistentData().getBoolean(CraftTweakerUtils.MOD_ID + "timercomplite");
        else return false;
    }
}
