package net.sixik.crafttweakerutils.ct.events.server.entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.sixik.crafttweakerutils.source.events.PlayerTravelEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = PlayerTravelEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCPlayerTravelEvent")
public class MCPlayerTravelEvent {
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(PlayerTravelEvent event){
        return event.getEntity();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(PlayerTravelEvent event){
        return event.isCancelable();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("vector")
    public static Vec3 getVecntor(PlayerTravelEvent event){
        return event.getVector3d();
    }
}
