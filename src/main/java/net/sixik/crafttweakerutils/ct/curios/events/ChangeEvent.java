package net.sixik.crafttweakerutils.ct.curios.events;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.event.CurioChangeEvent;

@ZenRegister
@NativeTypeRegistration(value = CurioChangeEvent.class, zenCodeName = "mods.crafttweakerutils.api.curios.events.CurioChangeEvent")
public class ChangeEvent {
    @ZenCodeType.Method
    public static IItemStack getFrom(CurioChangeEvent internal){
        return new MCItemStack(internal.getFrom());
    }
    @ZenCodeType.Method
    public static IItemStack getTo(CurioChangeEvent internal){
        return new MCItemStack(internal.getTo());
    }
    @ZenCodeType.Method
    public static int getSlotIndex(CurioChangeEvent internal){
        return internal.getSlotIndex();
    }
    @ZenCodeType.Method
    public static String getSlotString(CurioChangeEvent internal){
        return internal.getIdentifier();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("entity")
    public static Entity getEntity(CurioChangeEvent internal){
        return internal.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("livingEntity")
    public static LivingEntity getLivingEntity(CurioChangeEvent internal){
        return internal.getEntityLiving();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("result")
    public static Event.Result getResult(CurioChangeEvent internal){
        return internal.getResult();
    }
}
