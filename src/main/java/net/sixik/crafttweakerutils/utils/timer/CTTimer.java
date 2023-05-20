package net.sixik.crafttweakerutils.utils.timer;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.misc.timer.Timer")
public class CTTimer {
    @ZenCodeType.Method
    public static void addTimer(String id, int time) {
        CraftTweakerAPI.apply(new Timer(id, time, false));
    }
    @ZenCodeType.Method
    public static void isComplete(String id){
        AddTimer.isComplete(id);
    }
}
