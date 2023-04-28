package net.sixik.crafttweakerutils.ct.mods.projecrtmmo;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import harmonised.pmmo.api.events.TreasureEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;


@ZenRegister
@NativeTypeRegistration(value = TreasureEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.projecrtmmo.TreasureEvent")
public class PMTreasureEvent {
    @ZenCodeType.Method
    public static Entity getEntity(TreasureEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static LivingEntity getEntityLiving(TreasureEvent event){
        return event.getEntityLiving();
    }
    @ZenCodeType.Method
    public PlayerEntity getPlayer(TreasureEvent event){
       return event.getPlayer();
    }
    @ZenCodeType.Method
    public static BlockPos getBlockPos(TreasureEvent event){
        return event.getBlockPos();
    }
    @ZenCodeType.Method
    public static IItemStack getItem(TreasureEvent event){
        return new MCItemStack(event.getItemStack());
    }
    @ZenCodeType.Method
    public static void setAward(TreasureEvent event, Map<String, Double> awage){
        event.setAward(awage);
    }
    @ZenCodeType.Method
    public static Map<String, Double> getAward(TreasureEvent event){
        return event.getAward();
    }
    @ZenCodeType.Method
    public static void setCanceled(TreasureEvent event, boolean bool){
        event.setCanceled(bool);
    }
}
