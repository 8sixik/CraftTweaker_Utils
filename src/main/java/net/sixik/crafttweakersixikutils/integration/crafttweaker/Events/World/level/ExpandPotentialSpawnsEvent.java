package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.level.LevelEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/level/server/ChunkPotentialSpawnsEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = LevelEvent.PotentialSpawns.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.ChunkPotentialSpawnsEvent")
public class ExpandPotentialSpawnsEvent {

    @ZenCodeType.Method
<<<<<<< Updated upstream
    public BlockPos getPos(LevelEvent.PotentialSpawns event){
       return event.getPos();
    }
    @ZenCodeType.Method
    public MobCategory getMobCategory(LevelEvent.PotentialSpawns event){
       return event.getMobCategory();
    }
//    public void getSpawnerDataList(LevelEvent.PotentialSpawns event){
//
//    }
=======
    public static BlockPos getPos(LevelEvent.PotentialSpawns event){
       return event.getPos();
    }
    @ZenCodeType.Method
    public static MobCategory getMobCategory(LevelEvent.PotentialSpawns event){
       return event.getMobCategory();
    }

>>>>>>> Stashed changes
}
