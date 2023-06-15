package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraftforge.event.level.ChunkEvent;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/level/server/ChunkUnloadEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = ChunkEvent.Unload.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.ChunkUnloadEvent")
public class ExpandChunkUnloadEvent {
}
