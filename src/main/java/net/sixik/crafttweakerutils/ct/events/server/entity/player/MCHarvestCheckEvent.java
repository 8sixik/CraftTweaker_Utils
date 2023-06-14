package net.sixik.crafttweakerutils.ct.events.server.entity.player;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.sixik.crafttweakerutils.source.events.EnchantEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = PlayerEvent.HarvestCheck.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCHarvestCheckEvent")
public class MCHarvestCheckEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(PlayerEvent.HarvestCheck event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("blockState")
    public static BlockState getBlockState(PlayerEvent.HarvestCheck event){
        return event.getTargetBlock();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("harvest")
    public static boolean canHarvest(PlayerEvent.HarvestCheck event){
        return event.canHarvest();
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("harvest")
    public static void canHarvest(PlayerEvent.HarvestCheck event, boolean t){
        event.setCanHarvest(t);
    }
}
