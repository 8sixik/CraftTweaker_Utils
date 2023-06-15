package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.chunk.ChunkAccess;
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.BelowZeroRetrogen;
import net.minecraft.world.level.levelgen.blending.BlendingData;
>>>>>>> Stashed changes
import net.minecraft.world.level.levelgen.structure.Structure;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/world/Chunk")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = ChunkAccess.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.Chunk")
public class ExpandChunk {
    @ZenCodeType.Method
    public static void addEntity(ChunkAccess chunk,Entity entity){
        chunk.addEntity(entity);
    }
    @ZenCodeType.Method
    public static void addEntity(ChunkAccess chunk,Structure structure, long lg){
        chunk.addReferenceForStructure(structure, lg);
    }
    @ZenCodeType.Method
    public static void fillBiomesFromNoise(ChunkAccess chunk,BiomeResolver biomeResolver, Climate.Sampler climateSampler){
        chunk.fillBiomesFromNoise(biomeResolver, climateSampler);
    }
<<<<<<< Updated upstream
=======
    @ZenCodeType.Method
    public static ChunkPos getPos(ChunkAccess internal) {
        return internal.getPos();
    }
    @ZenCodeType.Method
    public static LevelAccessor getWorldForge(ChunkAccess internal) {
        return internal.getWorldForge();
    }
    @ZenCodeType.Method
    public static BlendingData getBlendingData(ChunkAccess internal) {
        return internal.getBlendingData();
    }
    @ZenCodeType.Method
    public static BlockPos[] getBlockEntitiesPos(ChunkAccess internal) {
        return (BlockPos[]) internal.getBlockEntitiesPos().toArray();
    }
    @ZenCodeType.Method
    public static BelowZeroRetrogen getBelowZeroRetrogen(ChunkAccess internal) {
        return internal.getBelowZeroRetrogen();
    }
>>>>>>> Stashed changes
}
