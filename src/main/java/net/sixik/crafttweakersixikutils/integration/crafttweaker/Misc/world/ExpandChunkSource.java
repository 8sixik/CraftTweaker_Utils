package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkSource;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.chunk.LevelChunk;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/ChunkSource")
@NativeTypeRegistration(value = ChunkSource.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.ChunkSource")
public class ExpandChunkSource {

    @ZenCodeType.Method
    public static LevelChunk getChunkLevel(ChunkSource internal, int x, int z, boolean b){
       return internal.getChunk(x,z,b);
    }
    @ZenCodeType.Method
    public static LevelChunk getChunkNow(ChunkSource internal, int x, int z){
        return internal.getChunkNow(x,z);
    }
    @ZenCodeType.Method
    public static int getLoadedChunksCount(ChunkSource internal){
       return internal.getLoadedChunksCount();
    }
    @ZenCodeType.Method
    public static ChunkAccess getChunkAccess(ChunkSource internal, int x, int z, ChunkStatus status, boolean b){
       return internal.getChunk(x,z, status, b);
    }
}
