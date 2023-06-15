package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraftforge.event.level.ChunkEvent;
import org.openzen.zencode.java.ZenCodeType;


@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/level/server/ChunkEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = ChunkEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.ChunkEvent")
public class ExpandChunkEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("chunk")
<<<<<<< Updated upstream
    public ChunkAccess getChunk(ChunkEvent event){
=======
    public static ChunkAccess getChunk(ChunkEvent event){
>>>>>>> Stashed changes
       return event.getChunk();
    }
}
