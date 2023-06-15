package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.storage.ServerLevelData;
import net.minecraftforge.event.level.LevelEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/level/server/ChunkCreateSpawnPositionEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = LevelEvent.CreateSpawnPosition.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.ChunkCreateSpawnPositionEvent")
public class ExpandChunkCreateSpawnPositionEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("levelData")
<<<<<<< Updated upstream
    public ServerLevelData getLevelData(LevelEvent.CreateSpawnPosition event){
=======
    public static ServerLevelData getLevelData(LevelEvent.CreateSpawnPosition event){
>>>>>>> Stashed changes
        return event.getSettings();
    }
}
