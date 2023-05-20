package net.sixik.crafttweakerutils.ct.entity.player.inventory;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EnderChestInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.entity.player.inventory.MCEnderChestInventory")
public class MCEnderChestInventory {
    private EnderChestInventory inventory;
    private PlayerEntity player;
    public MCEnderChestInventory(PlayerEntity player, EnderChestInventory inventory){
        this.inventory = inventory;
        this.player = player;
    }

    @Nullable
    public static MCEnderChestInventory getForPlayer(PlayerEntity player){
        if (player == null || player.level.isClientSide)
            return null;
        return new MCEnderChestInventory(player, player.getEnderChestInventory());
    }

    @ZenCodeType.Method
    public IItemStack getItem(int index){
        return new MCItemStack(inventory.getItem(index));
    }

    @ZenCodeType.Method
    public List<IItemStack> getItems(){
        List<IItemStack> item = new ArrayList<>();
        for(int i = 0; i < inventory.getContainerSize(); i++){
            item.add(new MCItemStack(inventory.getItem(i)));
        }
        return item;
    }
    @ZenCodeType.Method
    public int getContainerSize(){
        return inventory.getContainerSize();
    }
    @ZenCodeType.Method
    public int getMaxStackSize(){
        return inventory.getMaxStackSize();
    }
    @ZenCodeType.Method
    public void setItem(int index, IItemStack item){
        inventory.setItem(index, item.getInternal());
    }
    @ZenCodeType.Method
    public void addItem(IItemStack item){
        inventory.addItem(item.getInternal());
    }
}
