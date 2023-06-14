package net.sixik.crafttweakerutils.ct.game;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = MinecraftServer.class, zenCodeName = "crafttweaker.api.game.Server")
public class Server {
    @ZenCodeType.Method
    @ZenCodeType.Getter("ownerPlayer")
    public static Player getOwnerPlayer(MinecraftServer event){
        for(Player player : event.getPlayerList().getPlayers()){
            if(event.isSingleplayerOwner(player.getGameProfile())){
                return player;
            }
        }

        return null;
    }

}
