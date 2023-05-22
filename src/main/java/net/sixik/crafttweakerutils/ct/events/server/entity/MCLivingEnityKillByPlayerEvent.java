package net.sixik.crafttweakerutils.ct.events.server.entity;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.sixik.crafttweakerutils.source.events.LivingEnityKillByPlayerEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingEnityKillByPlayerEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCLivingEntityKillByPlayerEvent")
public class MCLivingEnityKillByPlayerEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("entityLiving")
    public static LivingEntity getLivingEntity(LivingEnityKillByPlayerEvent event){
        return event.getEntityLiving();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static PlayerEntity getPlayer(LivingEnityKillByPlayerEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(LivingEnityKillByPlayerEvent event) {return new MCItemStack(event.getItem());}
}
