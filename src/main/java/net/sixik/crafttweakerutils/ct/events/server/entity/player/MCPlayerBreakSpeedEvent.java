package net.sixik.crafttweakerutils.ct.events.server.entity.player;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = PlayerEvent.BreakSpeed.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCPlayerBreakSpeedEvent")
public class MCPlayerBreakSpeedEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(PlayerEvent.BreakSpeed event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getPos(PlayerEvent.BreakSpeed event){
        return event.getPos();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("originalSpeed")
    public static float getOriginalSpeed(PlayerEvent.BreakSpeed event){
        return event.getOriginalSpeed();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("newSpeed")
    public static float getNewSpeed(PlayerEvent.BreakSpeed event){
        return event.getNewSpeed();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("state")
    public static BlockState getState(PlayerEvent.BreakSpeed event){
        return event.getState();
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("newSpeed")
    public static void setNewSpeed(PlayerEvent.BreakSpeed event, float speed){
        event.setNewSpeed(speed);
    }
}
