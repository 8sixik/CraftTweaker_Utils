package net.sixik.crafttweakerutils.ct.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = BlockEntity.class, zenCodeName = "crafttweaker.api.block.entity.BlockEntity")
public class MCBlockEntity {
    @ZenCodeType.Method
    @ZenCodeType.Getter("containerBlockEntity")
    public static MCBaseContainerBlockEntity getBaseContainerBlockEntity(BlockEntity entity){
        if(entity != null){
            return new MCBaseContainerBlockEntity(entity);
        }
        return null;
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
