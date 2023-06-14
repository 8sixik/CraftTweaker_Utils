package net.sixik.crafttweakerutils.ct.events.server.misc;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ExplosionEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.misc.MCExplosionEvent")
public class MCExplosionEvent {
    @ZenCodeType.Method
    public static Explosion getExplosion(ExplosionEvent event){
        return event.getExplosion();
    }
    @ZenCodeType.Method
    public static Level getWorld(ExplosionEvent event){
        return event.getWorld();
    }
    @ZenCodeType.Method
    public static Event.Result getResult(ExplosionEvent event){
        return event.getResult();
    }
    @ZenCodeType.Method
    public static Vec3 getPos(ExplosionEvent event){
        return event.getExplosion().getPosition();
    }
}
