package net.sixik.crafttweakerutils.ct.curios;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.items.IItemHandlerModifiable;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.type.ISlotType;
import top.theillusivec4.curios.api.type.inventory.IDynamicStackHandler;
import top.theillusivec4.curios.api.type.util.ICuriosHelper;
import top.theillusivec4.curios.api.type.util.IIconHelper;
import top.theillusivec4.curios.api.type.util.ISlotHelper;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.curios.ACurios")
public class ACurios {

    @ZenCodeType.Method
    public static ISlotHelper getSlotHelper(){
        return CuriosApi.getSlotHelper();
    }

    @ZenCodeType.Method
    public static ICuriosHelper getCuriosHelper(){
        return CuriosApi.getCuriosHelper();
    }

    @ZenCodeType.Method
    public static void setSlotsForPlayer(PlayerEntity player, String slot, int amount){
        CuriosApi.getSlotHelper().setSlotsForType(slot, player, amount);
    }
    @ZenCodeType.Method
    public static void growSlotForPlayer(PlayerEntity player, String slot, int amount){
        CuriosApi.getSlotHelper().growSlotType(slot,amount, player);
    }
    @ZenCodeType.Method
    public static void shrinkSlotForPlayer(PlayerEntity player, String slot, int amount){
        CuriosApi.getSlotHelper().shrinkSlotType(slot,amount, player);
    }



//    public static void dropSlotsForPlayer(PlayerEntity player, String slot){
//        CuriosApi.getCuriosHelper().getCuriosHandler(player).ifPresent(handler);
//    }
}
