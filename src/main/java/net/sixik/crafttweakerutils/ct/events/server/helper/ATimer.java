package net.sixik.crafttweakerutils.ct.events.server.helper;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.sixik.crafttweakerutils.CraftTweakerUtils;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;

import static com.blamejared.crafttweaker.api.CraftTweakerConstants.MOD_ID;


@ZenCodeType.Name("mods.crafttweakerutils.events.helper.ATimer")
@ZenRegister
public class ATimer {
    public static ATimer INSTANCE;




    public static long endTime = 0;
    public static HashMap<Player, String> playerData = new HashMap<Player, String>();
    public static HashMap<String, Boolean> timerData = new HashMap<String, Boolean>();
    public static HashMap<Player, Boolean> timerEnd = new HashMap<Player, Boolean>();
    public static HashMap<Player, Long> timeData = new HashMap<Player, Long>();
    public static Level world;

    @ZenCodeType.Method
    public static void setTimer(int time, Player player){
        if(!player.getPersistentData().getBoolean(MOD_ID + "timer")){
            world = player.level;
            long startTime = world.getGameTime();
            endTime = time*20 + startTime;
            player.getPersistentData().putBoolean(MOD_ID + "timer", true);
            player.getPersistentData().putLong(MOD_ID + "timerstart", startTime);
            player.getPersistentData().putLong(MOD_ID + "timerend", endTime);
            player.getPersistentData().putBoolean(MOD_ID + "timercomplite", false);
        }
    }

    @ZenCodeType.Method
    public static void nullTimer(Player player){
        player.getPersistentData().putLong(MOD_ID + "timerend", 0);
    }
    @ZenCodeType.Method
    public static long getStartTime(Player player) {
        if(player.getPersistentData().contains(MOD_ID + "timerstart")) return player.getPersistentData().getLong(MOD_ID + "timerstart");
        else return -1;
    }
    @ZenCodeType.Method
    public static long getEndTime(Player player){
        if(player.getPersistentData().contains(MOD_ID + "timerend")) return player.getPersistentData().getLong(MOD_ID + "timerend");
        else return -1;
    }
    @ZenCodeType.Method
    public static long getLeftTime(Player player){
        if(player.getPersistentData().contains(MOD_ID + "lefttime")) return player.getPersistentData().getLong(MOD_ID + "lefttime");
        else return -1;
    }
    @ZenCodeType.Method
    public static void setEndTime(Player player, long l){
        player.getPersistentData().remove(MOD_ID + "timerend");
        player.getPersistentData().putLong(MOD_ID + "timerend", l);
    }
    @ZenCodeType.Method
    public static boolean isStart(Player player){
        if(player.getPersistentData().contains(MOD_ID + "timer")) return player.getPersistentData().getBoolean(MOD_ID + "timer");
        else return false;
    }
    @ZenCodeType.Method
    public static void TimerStart(Player player, boolean timer){
        player.getPersistentData().putBoolean(MOD_ID + "timer",timer);
    }

    @ZenCodeType.Method
    public static boolean TimerComplite(Player player){
        if(player.getPersistentData().contains(MOD_ID + "timercomplite")) return player.getPersistentData().getBoolean(MOD_ID + "timercomplite");
        else return false;
    }
}
