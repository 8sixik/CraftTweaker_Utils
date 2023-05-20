package net.sixik.crafttweakerutils.ct.events.server.entity;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.sixik.crafttweakerutils.source.events.LivingItemPickUpEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingItemPickUpEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCLivingItemPickUpEvent")
public class MCLivingItemPickUp {

    @ZenCodeType.Method
    public static Entity getEntity(LivingItemPickUpEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static LivingEntity getLivingEntity(LivingItemPickUpEvent event){
        return event.getEntityLiving();
    }
    @ZenCodeType.Method
    public static IItemStack getItem(LivingItemPickUpEvent event){
        return new MCItemStack(event.getItemStack());
    }
}
