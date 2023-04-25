package net.sixik.crafttweakerutils.ct.block;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.impl.tag.MCTag;
import net.minecraft.block.*;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import org.openzen.zencode.java.ZenCodeType;

@ZenCodeType.Name("mods.crafttweakerutils.api.block.ABlock")
@ZenRegister
public class ABlock {



    @ZenCodeType.Method
    public static boolean isAir(BlockState block){
        if(block.getBlock().equals(Blocks.AIR)) return true;
        else return false;
    }
}
