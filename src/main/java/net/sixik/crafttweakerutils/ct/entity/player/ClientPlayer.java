package net.sixik.crafttweakerutils.ct.entity.player;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.advancements.criterion.LocationPredicate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.stats.Stat;
import net.minecraft.stats.Stats;
import net.sixik.crafttweakerutils.utils.StatisticsManager;
import org.openzen.zencode.java.ZenCodeType;
import java.util.Optional;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.entity.player.ClientPlayer")
public class ClientPlayer{

    private final ClientPlayerEntity player;

    public ClientPlayer(PlayerEntity player) {
        this.player = (ClientPlayerEntity) player;
    }

    @ZenCodeType.Nullable
    public static ClientPlayer getClient(PlayerEntity player) {
        if (player == null) return null;
        return new ClientPlayer(player);
    }

    @ZenCodeType.Method
    public boolean inventoryMenuOpen(){
       return player.inventoryMenu.active;
    }
    @ZenCodeType.Method
    public boolean getInputKey(int Type){
        switch (Type){
            case 1:
                return player.input.up;
            case 2:
                return player.input.down;
            case 3:
                return player.input.left;
            case 4:
                return player.input.right;
            case 5:
                return player.input.jumping;
            case 6:
                return player.input.shiftKeyDown;
            default:
                CraftTweakerAPI.logInfo("Invalid key code");
                return false;
        }
    }
    @ZenCodeType.Method
    public void sendChat(String message){
        player.chat(message);
    }
}
