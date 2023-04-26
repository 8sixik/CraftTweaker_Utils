package net.sixik.crafttweakerutils.ct.events.misc;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ServerChatEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.misc.MCServerChatEvent")
public class MCServerChatEvent {

    @ZenCodeType.Method
    public static String getMessage(ServerChatEvent event){
       return event.getMessage();
    }
    @ZenCodeType.Method
    public static String getUsername(ServerChatEvent event){
       return event.getUsername();
    }
    @ZenCodeType.Method
    public static ITextComponent getComponent(ServerChatEvent event){
       return event.getComponent();
    }
    @ZenCodeType.Method
    public static ServerPlayerEntity getPlayer(ServerChatEvent event){
       return event.getPlayer();
    }
    @ZenCodeType.Method
    public static Event.Result getResult(ServerChatEvent event){
       return event.getResult();
    }
}
