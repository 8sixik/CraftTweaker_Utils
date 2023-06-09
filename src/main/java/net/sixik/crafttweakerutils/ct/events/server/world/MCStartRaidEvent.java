package net.sixik.crafttweakerutils.ct.events.server.world;


import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.raid.Raid;
import net.sixik.crafttweakerutils.ct.misc.MCRaid;
import net.sixik.crafttweakerutils.source.events.RaidEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
@NativeTypeRegistration(value = RaidEvent.StartRaidEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.MCStartRaidEvent")
public class MCStartRaidEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("raid")
    public static MCRaid getRaid(RaidEvent.StartRaidEvent event){
        return event.getRaid();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getBlockpos(RaidEvent.StartRaidEvent event){
        return event.getBlockpos();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static PlayerEntity getPlayer(RaidEvent.StartRaidEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(RaidEvent.StartRaidEvent event){
        return event.isCancelable();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("world")
    public static World getWorld(RaidEvent.StartRaidEvent event){
        return event.getWorld();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("raidMap")
    public static Map<Integer, Raid> getRaidMap(RaidEvent.StartRaidEvent event) {
        return event.getRaidMap();
    }
}
