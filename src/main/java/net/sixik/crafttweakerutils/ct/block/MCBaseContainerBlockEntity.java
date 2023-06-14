package net.sixik.crafttweakerutils.ct.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.LockCode;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Nameable;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.lang.constant.Constable;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.block.MCBaseContainerBlockEntity")
public class MCBaseContainerBlockEntity {

    private BlockEntity blockEntity;
    private Container container;
    public MCBaseContainerBlockEntity(BlockEntity blockEntity){
        this.blockEntity = blockEntity;
    }

    @ZenCodeType.Method
    public Container getContainer(){
        if(!onHaveContainer(blockEntity)) return null;
        if(blockEntity instanceof BaseContainerBlockEntity block){
            return block;
        }
        return null;
    }

    private boolean onHaveContainer(BlockEntity blockEntity){
        if(blockEntity == null) return false;
        return blockEntity instanceof BaseContainerBlockEntity;
    }

}
