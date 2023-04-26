package net.sixik.crafttweakerutils.ct.events.misc;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
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
    public static World getWorld(ExplosionEvent event){
        return event.getWorld();
    }
    @ZenCodeType.Method
    public static Event.Result getResult(ExplosionEvent event){
        return event.getResult();
    }
    @ZenCodeType.Method
    public static Vector3d getPos(ExplosionEvent event){
        return event.getExplosion().getPosition();
    }
}
