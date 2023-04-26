package net.sixik.crafttweakerutils.ct.events.entity.player;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ArrowLooseEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCArrowLooseEvent")
public class MCArrowLooseEvent {

    @ZenCodeType.Method
    public static PlayerEntity getPlayer(ArrowLooseEvent event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    public static World getWorld(ArrowLooseEvent event){
        return event.getWorld();
    }
    @ZenCodeType.Method
    public static IItemStack getBow(ArrowLooseEvent event){
        return new MCItemStack(event.getBow());
    }
    @ZenCodeType.Method
    public static int getCharge(ArrowLooseEvent event){
       return event.getCharge();
    }
}
