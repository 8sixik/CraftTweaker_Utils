package net.sixik.crafttweakerutils.ct.events.server.entity;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.DifficultyChangeEvent;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = BabyEntitySpawnEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCBabyEntitySpawnEvent")
public class MCBabyEntitySpawnEvent {

    @ZenCodeType.Method
    public static Entity getChildEntity(BabyEntitySpawnEvent event){
       return event.getChild().getEntity();
    }
    @ZenCodeType.Method
    public static int getChildEntityAge(BabyEntitySpawnEvent event){
       return event.getChild().getAge();
    }
    @ZenCodeType.Method
    public static void setChildEntityBaby(BabyEntitySpawnEvent event, boolean bool){
        event.getChild().setBaby(bool);
    }
    @ZenCodeType.Method
    public static Entity getParentA(BabyEntitySpawnEvent event){
       return event.getParentA().getEntity();
    }
    @ZenCodeType.Method
    public static Entity getParentB(BabyEntitySpawnEvent event){
       return event.getParentB().getEntity();
    }
    @ZenCodeType.Method
    public static PlayerEntity getCausedByPlayer(BabyEntitySpawnEvent event){
       return event.getCausedByPlayer();
    }
}
