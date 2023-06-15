package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraftforge.event.level.SleepFinishedTimeEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
@NativeTypeRegistration(value = SleepFinishedTimeEvent.class,zenCodeName = "mods.crafttweakerutils.api.events.world.level.SleepFinishedTimeEvent")
public class ExpandSleepFinishedTimeEvent {
    @ZenCodeType.Method
    public long getNewTime(SleepFinishedTimeEvent event){
        return event.getNewTime();
    }
    @ZenCodeType.Method
    public boolean setTimeAddition(SleepFinishedTimeEvent event, long l){
=======
@Document("mods/sixikutils/utils/events/level/server/SleepFinishedTimeEvent")
@NativeTypeRegistration(value = SleepFinishedTimeEvent.class,zenCodeName = "mods.crafttweakerutils.api.events.world.level.SleepFinishedTimeEvent")
public class ExpandSleepFinishedTimeEvent {
    @ZenCodeType.Method
    public static long getNewTime(SleepFinishedTimeEvent event){
        return event.getNewTime();
    }
    @ZenCodeType.Method
    public static boolean setTimeAddition(SleepFinishedTimeEvent event, long l){
>>>>>>> Stashed changes
       return event.setTimeAddition(l);
    }
}
