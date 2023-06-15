package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.level.LevelEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/level/server/LevelEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = LevelEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.LevelEvent")
public class ExpandLevelEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
<<<<<<< Updated upstream
    public Level getLevel(LevelEvent event){
=======
    public static Level getLevel(LevelEvent event){
>>>>>>> Stashed changes
        if(event.getLevel() instanceof Level level) {
            return level;
        }
        throw new IllegalArgumentException("LevelAccessor instance was not an instance of Level!");
    }
}
