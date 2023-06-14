package net.sixik.crafttweakerutils.ct.events.server.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingEvent.LivingJumpEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCLivingJumpEvent")
public class MCLivingJumpEvent {

    @ZenCodeType.Method
    public static LivingEntity getEntity(LivingEvent.LivingJumpEvent event){
       return event.getEntityLiving();
    }
}
