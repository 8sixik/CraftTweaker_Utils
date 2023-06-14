package net.sixik.crafttweakerutils.ct.events.server.misc;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
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
    public static Component getComponent(ServerChatEvent event){
       return event.getComponent();
    }
    @ZenCodeType.Method
    public static ServerPlayer getPlayer(ServerChatEvent event){
       return event.getPlayer();
    }
    @ZenCodeType.Method
    public static Event.Result getResult(ServerChatEvent event){
       return event.getResult();
    }
}
