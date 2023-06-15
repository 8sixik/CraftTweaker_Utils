package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.inventory;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/entity/type/player/inventory/EnderChestInventory")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = PlayerEnderChestContainer.class, zenCodeName = "mods.crafttweakerutils.entity.player.inventory.EnderChestInventory")
public class ExpandEnderChestInventory {



    @ZenCodeType.Method
    public static IItemStack getItem(PlayerEnderChestContainer inventory,int index){
        return new MCItemStack(inventory.getItem(index));
    }

    @ZenCodeType.Method
<<<<<<< Updated upstream
    public static List<IItemStack> getItems(PlayerEnderChestContainer inventory){
=======
    public static IItemStack[] getItems(PlayerEnderChestContainer inventory){
>>>>>>> Stashed changes
        List<IItemStack> item = new ArrayList<>();
        for(int i = 0; i < inventory.getContainerSize(); i++){
            item.add(new MCItemStack(inventory.getItem(i)));
        }
<<<<<<< Updated upstream
        return item;
=======
        return (IItemStack[]) item.toArray();
>>>>>>> Stashed changes
    }
    @ZenCodeType.Method
    public static int getContainerSize(PlayerEnderChestContainer inventory){
        return inventory.getContainerSize();
    }
    @ZenCodeType.Method
    public static int getMaxStackSize(PlayerEnderChestContainer inventory){
        return inventory.getMaxStackSize();
    }
    @ZenCodeType.Method
    public static void setItem(PlayerEnderChestContainer inventory,int index, IItemStack item){
        inventory.setItem(index, item.getInternal());
    }
    @ZenCodeType.Method
    public static void addItem(PlayerEnderChestContainer inventory,IItemStack item){
        inventory.addItem(item.getInternal());
    }
}