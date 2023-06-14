package net.sixik.crafttweakerutils.ct.events.server.entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerSetSpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = PlayerSetSpawnEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCPlayerSetSpawnEvent")
public class MCPlayerSetSpawnEvent {
    @ZenCodeType.Method
    public static Player getPlayer(PlayerSetSpawnEvent event){
      return event.getPlayer();
    }
    @ZenCodeType.Method
    public static BlockPos getNewSpawn(PlayerSetSpawnEvent event){
        return event.getNewSpawn();
    }
    @ZenCodeType.Method
    public static String getSpawnWorld(PlayerSetSpawnEvent event){
        return event.getSpawnWorld().toString();
    }
}
