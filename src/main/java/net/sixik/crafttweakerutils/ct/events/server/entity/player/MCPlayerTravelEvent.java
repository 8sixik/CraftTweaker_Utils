package net.sixik.crafttweakerutils.ct.events.server.entity.player;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.sixik.crafttweakerutils.source.events.PlayerTravelEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = PlayerTravelEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCPlayerTravelEvent")
public class MCPlayerTravelEvent {
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static PlayerEntity getPlayer(PlayerTravelEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(PlayerTravelEvent event){
        return event.isCancelable();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("vector")
    public static Vector3d getVecntor(PlayerTravelEvent event){
        return event.getVector3d();
    }
}
