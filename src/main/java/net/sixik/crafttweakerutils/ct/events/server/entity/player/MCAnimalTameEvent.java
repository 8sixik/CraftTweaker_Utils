package net.sixik.crafttweakerutils.ct.events.server.entity.player;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.event.entity.living.AnimalTameEvent;
import net.minecraftforge.event.entity.player.PlayerSetSpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = AnimalTameEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCAnimalTameEvent")
public class MCAnimalTameEvent {
    @ZenCodeType.Method
    public static Entity getEntity(AnimalTameEvent event){
        return event.getAnimal().getEntity();
    }
    @ZenCodeType.Method
    public static PlayerEntity getPlayer(AnimalTameEvent event){
        return event.getTamer();
    }
    @ZenCodeType.Method
    public static Entity getAnimal(AnimalTameEvent event){
        return event.getAnimal().getEntity();
    }
    @ZenCodeType.Method
    public static void setCancel(AnimalTameEvent event, boolean bool){
        event.setCanceled(bool);
    }
    @ZenCodeType.Method
    public static boolean isCancel(AnimalTameEvent event){
       return event.isCancelable();
    }
}
