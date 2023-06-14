package net.sixik.crafttweakerutils.ct.events.server.misc;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.RandomSource;
import net.minecraftforge.event.world.SaplingGrowTreeEvent;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Random;

@ZenRegister
@NativeTypeRegistration(value = SaplingGrowTreeEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.misc.MCSaplingGrowTreeEvent")
public class MCSaplingGrowTreeEvent {

    @ZenCodeType.Method
    public static Level getWorld(SaplingGrowTreeEvent event){
        return (Level) event.getWorld();
    }
    @ZenCodeType.Method
    public static BlockPos getPos(SaplingGrowTreeEvent event){
        return event.getPos();
    }
    @ZenCodeType.Method
    public static Random getRand(SaplingGrowTreeEvent event){
        return event.getRand();
    }
    @ZenCodeType.Method
    public static Event.Result getResult(SaplingGrowTreeEvent event){
        return event.getResult();
    }
}
