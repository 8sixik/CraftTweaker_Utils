package net.sixik.crafttweakerutils.ct.events.server.entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.sixik.crafttweakerutils.source.events.ChestLootedEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ChestLootedEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCPlayerChestLootEvent")
public class MCPlayerChestLootEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(ChestLootedEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getPos(ChestLootedEvent event){
        return event.getPos();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("inventory")
    public static Container getInventory(ChestLootedEvent event){
        return event.getInventory();
    }
}
