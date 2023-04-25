package net.sixik.crafttweakerutils.ct.curios;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.sixik.crafttweakerutils.source.items.ItemsUpgrade;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.event.CurioChangeEvent;
import top.theillusivec4.curios.api.event.CurioDropsEvent;
import top.theillusivec4.curios.api.event.CurioEquipEvent;
import top.theillusivec4.curios.api.event.CurioUnequipEvent;
import top.theillusivec4.curios.api.type.capability.ICurio;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.curios.ACuriosSlotHelper")
public class ACuriosSlotHelper {

    @ZenCodeType.Method
    public static void setPlayerCuriosSlot(PlayerEntity player, String slot, int index){
        CuriosApi.getSlotHelper().setSlotsForType(slot, player, index);
    }

    @ZenCodeType.Method
    public static String getPlayerSlotTypes(PlayerEntity player){
        return CuriosApi.getSlotHelper().getSlotTypes(player).toString();
    }

    @ZenCodeType.Method
    public static String[] getSlotTypes(){
        return CuriosApi.getSlotHelper().getSlotTypeIds().toArray(new String[0]);
    }
}
