package net.sixik.crafttweakerutils.ct.events.entity.player;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ArrowNockEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCArrowNockEvent")
public class MCArrowNockEvent {
    @ZenCodeType.Method
    public static PlayerEntity getPlayer(ArrowNockEvent event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    public static World getWorld(ArrowNockEvent event){
        return event.getWorld();
    }
    @ZenCodeType.Method
    public static IItemStack getBow(ArrowNockEvent event){
        return new MCItemStack(event.getBow());
    }
    @ZenCodeType.Method
    public static Hand getHand(ArrowNockEvent event){
        return event.getHand();
    }
}
