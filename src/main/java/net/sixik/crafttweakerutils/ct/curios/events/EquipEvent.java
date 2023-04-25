package net.sixik.crafttweakerutils.ct.curios.events;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;
import net.minecraft.entity.Entity;
import top.theillusivec4.curios.api.event.CurioEquipEvent;
@ZenRegister
@NativeTypeRegistration(value = CurioEquipEvent.class, zenCodeName = "mods.crafttweakerutils.api.curios.events.CurioEquipEvent")
public class EquipEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(CurioEquipEvent internal) {
        return new MCItemStack(internal.getStack());
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("entity")
    public static Entity getEntity(CurioEquipEvent internal) {
        return internal.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("livingEntity")
    public static LivingEntity getLivingEntity(CurioEquipEvent internal){
        return internal.getEntityLiving();
    }
    @ZenCodeType.Method
    public static String getSlotString(CurioEquipEvent internal){
        return internal.getSlotContext().getIdentifier();
    }
    @ZenCodeType.Method
    public static int getSlotIndex(CurioEquipEvent internal){
        return internal.getSlotContext().getIndex();
    }
    @ZenCodeType.Method
    public static LivingEntity getSlotWearer(CurioEquipEvent internal){
        return internal.getSlotContext().getWearer();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("result")
    public static Event.Result getResult(CurioEquipEvent internal){
        return internal.getResult();
    }
}
