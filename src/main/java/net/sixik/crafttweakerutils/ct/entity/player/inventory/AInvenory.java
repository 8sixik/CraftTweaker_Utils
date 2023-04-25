package net.sixik.crafttweakerutils.ct.entity.player.inventory;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.CuriosApi;

@ZenCodeType.Name("mods.crafttweakerutils.entity.player.inventory.AInvenory")
@ZenRegister
public class AInvenory {

    @ZenCodeType.Method
    public static int getItemSlot(PlayerEntity player, IItemStack item){
        for(int i = 0; i < player.inventory.getContainerSize(); i++){
            if(new MCItemStack(player.inventory.getItem(i)).equals(item)){
                return i;
            }
        }
        return -1;
    }

//    @ZenCodeType.Method
//    public static IItemStack getCuriosItems(PlayerEntity player){
//        return new MCItemStack(CuriosApi.getCuriosHelper().getEquippedCurios(player));
//    }


    @ZenCodeType.Method
    public static String test(){
        return "Its AInventory";
    }
}
