package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChestOpenEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/entity/player/PlayerChestOpenEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = PlayerChestOpenEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.PlayerChestOpenEvent")
public class ExpandPlayerChestOpenEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
<<<<<<< Updated upstream
    public Player getPlayer(PlayerChestOpenEvent event){
=======
    public static Player getPlayer(PlayerChestOpenEvent event){
>>>>>>> Stashed changes
        return event.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("block")
<<<<<<< Updated upstream
    public BlockEntity getBlockEntity(PlayerChestOpenEvent event){
=======
    public static BlockEntity getBlockEntity(PlayerChestOpenEvent event){
>>>>>>> Stashed changes
        return event.getBlock();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("openCount")
<<<<<<< Updated upstream
    public int getOpenCount(PlayerChestOpenEvent event){
=======
    public static int getOpenCount(PlayerChestOpenEvent event){
>>>>>>> Stashed changes
        return event.getOpenCount();
    }
}
