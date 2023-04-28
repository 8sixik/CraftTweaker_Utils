package net.sixik.crafttweakerutils.ct.mods.projecrtmmo;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;

import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import harmonised.pmmo.api.events.SalvageEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;


@ZenRegister
@NativeTypeRegistration(value = SalvageEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.projecrtmmo.SalvageEvent")
public class PMSalvageEvent{

    @ZenCodeType.Method
    public static Entity getEntity(SalvageEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static LivingEntity getEntityLiving(SalvageEvent event){
        return event.getEntityLiving();
    }
    @ZenCodeType.Method
   public PlayerEntity getPlayer(SalvageEvent event){
       return event.getPlayer();
   }
    @ZenCodeType.Method
   public static BlockPos getBlockPos(SalvageEvent event){
        return event.getBlockPos();
   }
    @ZenCodeType.Method
   public static Event.Result getResult(SalvageEvent event){
        return event.getResult();
   }
    @ZenCodeType.Method
   public static void setCanceled(SalvageEvent event, boolean bool){
        event.setCanceled(bool);
   }


}