package net.sixik.crafttweakerutils.ct.events.entity.player;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerSetSpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = PlayerSetSpawnEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCPlayerSetSpawnEvent")
public class MCPlayerSetSpawnEvent {
    @ZenCodeType.Method
    public static PlayerEntity getPlayer(PlayerSetSpawnEvent event){
      return event.getPlayer();
    }
    @ZenCodeType.Method
    public static BlockPos getNewSpawn(PlayerSetSpawnEvent event){
        return event.getNewSpawn();
    }
    @ZenCodeType.Method
    public static String getSpawnWorld(PlayerSetSpawnEvent event){
        return event.getSpawnWorld().toString();
    }

    @ZenCodeType.Method
    public static LivingEntity getEntityLiving(PlayerSetSpawnEvent event){
        return event.getEntityLiving();
    }
}
