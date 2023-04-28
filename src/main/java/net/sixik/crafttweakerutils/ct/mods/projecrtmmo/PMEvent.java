package net.sixik.crafttweakerutils.ct.mods.projecrtmmo;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import harmonised.pmmo.api.events.XpEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = XpEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.projecrtmmo.XpEvent")
public class PMEvent {
    @ZenCodeType.Method
    public static Entity getEntity(XpEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static LivingEntity getEntityLiving(XpEvent event){
        return event.getEntityLiving();
    }
    @ZenCodeType.Method
    public static PlayerEntity getPlayer(XpEvent event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    public static String getSkill(XpEvent event){
        return event.getSkill();
    }
    @ZenCodeType.Method
    public static String getSourceName(XpEvent event){
        return event.getSourceName();
    }
    @ZenCodeType.Method
    public static double getAmount(XpEvent event){
        return event.getAmount();
    }
    @ZenCodeType.Method
    public static Event.Result getResult(XpEvent event){
        return event.getResult();
    }
    @ZenCodeType.Method
    public static void setAmount(XpEvent event, double amount){
        event.setAmount(amount);
    }
    @ZenCodeType.Method
    public static void setCausedByParty(XpEvent event, boolean bool){
        event.setCausedByParty(bool);
    }
    @ZenCodeType.Method
    public static void setIgnoreBonuses(XpEvent event, boolean bool){
        event.setIgnoreBonuses(bool);
    }
    @ZenCodeType.Method
    public static void setSkill(XpEvent event, String string){
        event.setSkill(string);
    }
    @ZenCodeType.Method
    public static void setSkip(XpEvent event, boolean bool){
        event.setSkip(bool);
    }
    @ZenCodeType.Method
    public static void setSourceName(XpEvent event, String name){
        event.setSourceName(name);
    }
    @ZenCodeType.Method
    public static void setCanceled(XpEvent event, boolean bool){
        event.setCanceled(bool);
    }

}
