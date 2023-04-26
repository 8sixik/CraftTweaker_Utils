package net.sixik.crafttweakerutils.ct.events.entity;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingSetAttackTargetEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCLivingSetAttackTargetEvent")
public class MCLivingSetAttackTargetEvent {

    @ZenCodeType.Method
    public static Entity getTarget(LivingSetAttackTargetEvent event){
        return event.getTarget();
    }
    @ZenCodeType.Method
    public static Entity getEntity(LivingSetAttackTargetEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static LivingEntity getLivingEntity(LivingSetAttackTargetEvent event){
        return event.getEntityLiving();
    }
}
