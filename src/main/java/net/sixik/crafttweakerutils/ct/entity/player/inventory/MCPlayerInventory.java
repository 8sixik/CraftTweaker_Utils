package net.sixik.crafttweakerutils.ct.entity.player.inventory;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;

@ZenRegister
@NativeTypeRegistration(value = PlayerInventory.class, zenCodeName = "crafttweaker.api.inventory.PlayerInventory")
public class MCPlayerInventory {

    @ZenCodeType.Method
    public static int getItemSlot(PlayerInventory inventory, IItemStack item){
        for(int i = 0; i < inventory.getContainerSize(); i++){
            if(inventory.getItem(i).equals(item.getInternal())){
                return i;
            }
        }
        return -1;
    }
    @ZenCodeType.Method
    public static IItemStack getArmor(PlayerInventory inventory, int slot) {
        return new MCItemStack(inventory.armor.get(slot));
    }
    @ZenCodeType.Method
    public static boolean isArmor(PlayerInventory inventory, int slot, IItemStack item){
        if(inventory.armor.get(slot) == item.getInternal()) return true;
        else return false;
    }
    @ZenCodeType.Method
    public static void setArrmor(PlayerInventory inventory, int slot, IItemStack item){
        inventory.armor.set(slot, item.getInternal());
    }

}
