package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChestLootEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/entity/player/PlayerChestLootEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = PlayerChestLootEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.PlayerChestLootEvent")
public class ExpandPlayerChestLootEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(PlayerChestLootEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getPos(PlayerChestLootEvent event){
        return event.getPos();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("inventory")
    public static Container getInventory(PlayerChestLootEvent event){
        return event.getInventory();
    }
}
