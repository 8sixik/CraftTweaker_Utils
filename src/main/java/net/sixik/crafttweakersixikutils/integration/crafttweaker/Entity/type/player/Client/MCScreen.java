package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.Client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import net.minecraft.client.Game;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.openzen.zencode.java.ZenCodeType;


@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/entity/type/player/client/Screen")
>>>>>>> Stashed changes
@ZenCodeType.Name("mods.crafttweakerutils.api.client.Screen")
public class MCScreen {

    private Screen screen;
    public MCScreen(Screen screen){
        this.screen = screen;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("title")
    public Component getTitle(){
      return screen.getTitle();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("narrationMessage")
    public Component getNarrationMessage(){
      return screen.getNarrationMessage();
    }
    @ZenCodeType.Getter("game")
    @ZenCodeType.Method
    public Game getGame(){
      return screen.getMinecraft().getGame();
    }
}
