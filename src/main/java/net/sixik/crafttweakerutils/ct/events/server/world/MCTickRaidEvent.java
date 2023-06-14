package net.sixik.crafttweakerutils.ct.events.server.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.Level;
import net.sixik.crafttweakerutils.ct.misc.MCRaid;
import net.sixik.crafttweakerutils.source.events.RaidEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
@NativeTypeRegistration(value = RaidEvent.TickRaidEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.MCTickRaidEvent")
public class MCTickRaidEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("raid")
    public static MCRaid getRaid(RaidEvent.TickRaidEvent event){
        return event.getRaid();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(RaidEvent.TickRaidEvent event){
        return event.isCancelable();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("world")
    public static Level getWorld(RaidEvent.TickRaidEvent event){
        return event.getWorld();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("raidMap")
    public static Map<Integer, Raid> getRaidMap(RaidEvent.TickRaidEvent event) {
        return event.getRaidMap();
    }
}
