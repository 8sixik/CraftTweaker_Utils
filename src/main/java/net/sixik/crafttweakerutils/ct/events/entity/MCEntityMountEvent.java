package net.sixik.crafttweakerutils.ct.events.entity;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.NBTTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityMobGriefingEvent;
import net.minecraftforge.event.entity.EntityMountEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = EntityMountEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCEntityMountEvent")
public class MCEntityMountEvent {
    @ZenCodeType.Method
    public static Entity getEntity(EntityMountEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static Entity getEntityMounting(EntityMountEvent event){
        return event.getEntityMounting();
    }
    @ZenCodeType.Method
    public static Entity getEntityBeingMounted(EntityMountEvent event){
        return event.getEntityBeingMounted();
    }
    @ZenCodeType.Method
    public static World getWorld(EntityMountEvent event){
        return event.getWorldObj();
    }
}
