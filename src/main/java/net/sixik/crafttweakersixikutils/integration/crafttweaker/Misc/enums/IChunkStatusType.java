package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.enums;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.chunk.ChunkStatus;

@ZenRegister
@Document("mods/sixikutils/utils/world/chunk/ChunkStatusType")
@NativeTypeRegistration(
        value = ChunkStatus.ChunkType.class,
        zenCodeName = "mods.crafttweakerutils.api.misc.world.chunk.ChunkStatusType"
)
@BracketEnum("minecraft:chunkstatustype")
public class IChunkStatusType {

    public IChunkStatusType(){

    }
}
