package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/ChunkPos")
@NativeTypeRegistration(value = ChunkPos.class, zenCodeName = "mods.crafttweakerutils.api.misc.ChunkPos")
public class ExpandChunkPos {

    @ZenCodeType.Method
    @ZenCodeType.Getter("worldpos")
    public static BlockPos getWorldPosition(ChunkPos internal){
        return internal.getWorldPosition();
    }
    @ZenCodeType.Method
    public static BlockPos getBlockAt(ChunkPos internal, int x, int y, int z){
        return internal.getBlockAt(x,y,z);
    }
    @ZenCodeType.Method
    public static BlockPos getMiddleBlockPosition(ChunkPos internal, int num){
        return internal.getMiddleBlockPosition(num);
    }
    @ZenCodeType.Method
    public static int getBlockX(ChunkPos internal, int num){
        return internal.getBlockX(num);
    }
    @ZenCodeType.Method
    public static int getBlockZ(ChunkPos internal, int num){
        return internal.getBlockZ(num);
    }
    @ZenCodeType.Method
    public static int getMaxBlockX(ChunkPos internal){
        return internal.getMaxBlockX();
    }
    @ZenCodeType.Method
    public static int getMaxBlockZ(ChunkPos internal){
        return internal.getMaxBlockZ();
    }
    @ZenCodeType.Method
    public static int getMiddleBlockX(ChunkPos internal){
        return internal.getMiddleBlockX();
    }
    @ZenCodeType.Method
    public static int getMiddleBlockZ(ChunkPos internal){
        return internal.getMiddleBlockZ();
    }
    @ZenCodeType.Method
    public static int getMinBlockX(ChunkPos internal){
        return internal.getMinBlockX();
    }
    @ZenCodeType.Method
    public static int getMinBlockZ(ChunkPos internal){
        return internal.getMinBlockZ();
    }
    @ZenCodeType.Method
    public static int getRegionLocalX(ChunkPos internal){
        return internal.getRegionLocalX();
    }
    @ZenCodeType.Method
    public static int getRegionLocalZ(ChunkPos internal){
        return internal.getRegionLocalZ();
    }
    @ZenCodeType.Method
    public static int getRegionX(ChunkPos internal){
        return internal.getRegionX();
    }
    @ZenCodeType.Method
    public static int getRegionZ(ChunkPos internal){
        return internal.getRegionZ();
    }
}
