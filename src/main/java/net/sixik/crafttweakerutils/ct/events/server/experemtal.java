package net.sixik.crafttweakerutils.ct.events.server;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.DifficultyChangeEvent;
import net.sixik.crafttweakerutils.source.events.ExperementalEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ExperementalEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.experemtal")
public class experemtal {

    @ZenCodeType.Method
    public String getString(ExperementalEvent event){
        return event.getMenuProvider().getDisplayName().getString();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public Player getPlayer(ExperementalEvent event){
        return event.getEntity();
    }

}
