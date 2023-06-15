package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.enums;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import net.minecraft.Util;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.material.Material;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Locale;
import java.util.Optional;

@ZenRegister
@Document("mods/sixikutils/utils/world/chunk/ChunkStatus")
@NativeTypeRegistration(
        value = ChunkStatus.class,
        zenCodeName = "mods.crafttweakerutils.api.misc.world.chunk.ChunkStatus"
)
public class IChunkStatus {
    public static final BiMap<String, ChunkStatus> VANILLA_CHUNK_STATUS = Util.make(HashBiMap.create(), (map) -> {
        map.put("EMPTY", ChunkStatus.EMPTY);
        map.put("FULL", ChunkStatus.FULL);
        map.put("BIOMES", ChunkStatus.BIOMES);
        map.put("CARVERS", ChunkStatus.CARVERS);
        map.put("FEATURES", ChunkStatus.FEATURES);
        map.put("HEIGHTMAPS", ChunkStatus.HEIGHTMAPS);
        map.put("LIGHT", ChunkStatus.LIGHT);
        map.put("LIQUID_CARVERS", ChunkStatus.LIQUID_CARVERS);
        map.put("NOISE", ChunkStatus.NOISE);
        map.put("SPAWN", ChunkStatus.SPAWN);
        map.put("STRUCTURE_REFERENCES", ChunkStatus.STRUCTURE_REFERENCES);
        map.put("STRUCTURE_STARTS", ChunkStatus.STRUCTURE_STARTS);
        map.put("SURFACE", ChunkStatus.SURFACE);
    });

    public IChunkStatus(){

    }


    public static Optional<ChunkStatus> getOptionalStatus(String tokens) {
        return Optional.ofNullable(VANILLA_CHUNK_STATUS.get(tokens));
    }
    @ZenCodeType.Method
    public static int getIndex(ChunkStatus internal){
        return internal.getIndex();
    }
    @ZenCodeType.Method
    public static int getRange(ChunkStatus internal){
        return internal.getRange();
    }
    @ZenCodeType.Method
    public static String getName(ChunkStatus internal){
        return internal.getName();
    }
    @ZenCodeType.Method
    public static ChunkStatus getParent(ChunkStatus internal){
        return internal.getParent();
    }
    @ZenCodeType.Method
    public static ChunkStatus.ChunkType getChunkType(ChunkStatus internal){
        return internal.getChunkType();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("commandString")
    public static String getCommandString(ChunkStatus internal) {
        BiMap<ChunkStatus, String> inverse = VANILLA_CHUNK_STATUS.inverse();
        String name = (String) inverse.getOrDefault(internal, "UNKNOWN");
        return "<chunkstatus:" + name.toLowerCase(Locale.ROOT) + ">";
    }
}
