package net.sixik.crafttweakerutils.ct.events.server.entity;


import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.LivingEntity;
import net.sixik.crafttweakerutils.source.events.LivingEntityTickEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingEntityTickEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCLivingTickEvent")
public class MCLivingTickEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("entityLiving")
    public static LivingEntity getEntity(LivingEntityTickEvent event){
        return event.getEntityLiving();
    }
}
