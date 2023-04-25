package net.sixik.crafttweakerutils.ct.curios.events;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.event.CurioUnequipEvent;

@ZenRegister
@NativeTypeRegistration(value = CurioUnequipEvent.class, zenCodeName = "mods.crafttweakerutils.api.curios.events.CurioUnequipEvent")
public class UnequipEvent {

    @ZenCodeType.Method
    public static int getSlotIndex(CurioUnequipEvent internal){
        return internal.getSlotContext().getIndex();
    }
    @ZenCodeType.Method
    public static String getSlotString(CurioUnequipEvent internal){
        return internal.getSlotContext().getIdentifier();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getStack(CurioUnequipEvent event){
        return new MCItemStack(event.getStack());
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("entity")
    public static Entity getEntity(CurioUnequipEvent internal){
        return internal.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("livingEntity")
    public static LivingEntity getLivingEntity(CurioUnequipEvent internal){
        return internal.getEntityLiving();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("result")
    public static Event.Result getResult(CurioUnequipEvent internal){
        return internal.getResult();
    }
    @ZenCodeType.Method
    public static LivingEntity getSLotWearer(CurioUnequipEvent internal){
        return internal.getSlotContext().getWearer();
    }
}
