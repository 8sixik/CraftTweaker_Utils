package net.sixik.crafttweakerutils.ct.events.server.entity;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraftforge.event.entity.EntityMobGriefingEvent;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = EntityMobGriefingEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCEntityMobGriefingEvent")
public class MCEntityMobGriefingEvent {

    @ZenCodeType.Method
    public static Entity getEntity(EntityMobGriefingEvent event){
        return event.getEntity();
    }
}
