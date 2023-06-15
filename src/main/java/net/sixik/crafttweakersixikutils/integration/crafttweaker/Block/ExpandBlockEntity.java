package net.sixik.crafttweakersixikutils.integration.crafttweaker.Block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.Container;
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
>>>>>>> Stashed changes
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
@NativeTypeRegistration(value = BlockEntity.class, zenCodeName = "crafttweaker.api.block.entity.BlockEntity")
=======
@Document("mods/sixikutils/utils/block/BlockEntity")
@NativeTypeRegistration(value = BlockEntity.class, zenCodeName = "crafttweaker.api.block.entity.BlockEntity")
@ZenCodeType.Expansion("crafttweaker.api.block.entity.BlockEntity")
>>>>>>> Stashed changes
public class ExpandBlockEntity {
    @ZenCodeType.Method
    @ZenCodeType.Getter("container")
    public static Container getContainer(BlockEntity entity){
        if(entity != null){
            if(!onHaveContainer(entity)) return null;
            if(entity instanceof BaseContainerBlockEntity block){
                return block;
            }
            return null;
        }
        return null;
    }
    private static boolean onHaveContainer(BlockEntity blockEntity){
        if(blockEntity == null) return false;
        return blockEntity instanceof BaseContainerBlockEntity;
    }
    @ZenCodeType.Method
    public static int testSixik(BlockEntity blockEntity){
        if(blockEntity instanceof BaseContainerBlockEntity baseContainer){
            Container container = (Container) baseContainer;
            return container.getContainerSize();
        }
        return -1;
    }
}
