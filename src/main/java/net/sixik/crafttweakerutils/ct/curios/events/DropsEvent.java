package net.sixik.crafttweakerutils.ct.curios.events;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.event.CurioDropsEvent;

@ZenRegister
@NativeTypeRegistration(value = CurioDropsEvent.class, zenCodeName = "mods.crafttweakerutils.api.curios.events.CurioDropsEvent")
public class DropsEvent {
    @ZenCodeType.Method
    public static CompoundNBT getCompoundNBT(CurioDropsEvent internal){
        return internal.getCurioHandler().writeNBT();
    }

    @ZenCodeType.Method
    public static int getSlots(CurioDropsEvent internal){
        return internal.getCurioHandler().getSlots();
    }
    @ZenCodeType.Method
    public static int getVisibleSlots(CurioDropsEvent internal){
        return internal.getCurioHandler().getVisibleSlots();
    }

    @ZenCodeType.Method
    public static int getFortuneBonus(CurioDropsEvent internal){
        return internal.getCurioHandler().getFortuneBonus();
    }

    @ZenCodeType.Method
    public static String getCuriosString(CurioDropsEvent internal){
        return internal.getCurioHandler().getCurios().values().toString();
    }

    @ZenCodeType.Method
    public static ItemEntity[] getItemEntity(CurioDropsEvent internal){
        return internal.getDrops().toArray(new ItemEntity[0]);
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("damageSource")
    public static DamageSource getDamageSource(CurioDropsEvent internal){
        return internal.getSource();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("entity")
    public static Entity getEntity(CurioDropsEvent internal){
        return internal.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("livingEntity")
    public static LivingEntity getLivingEntity(CurioDropsEvent internal){
        return internal.getEntityLiving();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("result")
    public static Event.Result getResult(CurioDropsEvent internal){
        return internal.getResult();
    }
    @ZenCodeType.Method
    public static LivingEntity getSlotWearer(CurioDropsEvent internal){
        return internal.getCurioHandler().getWearer();
    }
}
