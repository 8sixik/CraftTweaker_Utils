package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChestCloseEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/entity/player/PlayerChestCloseEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = PlayerChestCloseEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.PlayerChestCloseEvent")
public class ExpandPlayerChestCloseEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
<<<<<<< Updated upstream
    public Player getPlayer(PlayerChestCloseEvent event){
=======
    public static Player getPlayer(PlayerChestCloseEvent event){
>>>>>>> Stashed changes
        return event.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("block")
<<<<<<< Updated upstream
    public BlockEntity getBlockEntity(PlayerChestCloseEvent event){
=======
    public static BlockEntity getBlockEntity(PlayerChestCloseEvent event){
>>>>>>> Stashed changes
        return event.getBlock();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("openCount")
<<<<<<< Updated upstream
    public int getOpenCount(PlayerChestCloseEvent event){
=======
    public static int getOpenCount(PlayerChestCloseEvent event){
>>>>>>> Stashed changes
        return event.getOpenCount();
    }
}
