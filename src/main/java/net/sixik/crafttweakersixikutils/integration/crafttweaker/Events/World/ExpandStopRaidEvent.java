package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.Level;
import net.sixik.crafttweakersixikutils.source.events.RaidEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
<<<<<<< Updated upstream
@NativeTypeRegistration(value = RaidEvent.StopRaidEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.MCStopRaidEvent")
=======
@Document("mods/sixikutils/utils/events/level/StopRaidEvent")
@NativeTypeRegistration(value = RaidEvent.StopRaidEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.StopRaidEvent")
>>>>>>> Stashed changes
public class ExpandStopRaidEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("raid")
    public static Raid getRaid(RaidEvent.StopRaidEvent event){
        return event.getRaid();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(RaidEvent.StopRaidEvent event){
        return event.isCancelable();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("world")
    public static Level getWorld(RaidEvent.StopRaidEvent event){
        return event.getWorld();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("raidMap")
    public static Map<Integer, Raid> getRaidMap(RaidEvent.StopRaidEvent event) {
        return event.getRaidMap();
    }
}
