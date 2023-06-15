package net.sixik.crafttweakersixikutils.mixin;

import net.minecraft.core.RegistryAccess;
import net.minecraft.core.SectionPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakersixikutils.source.events.StrucutreSpawnEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChunkGenerator.class)
public class ChunkGeneratorMixin {

    //    @Inject(method = "Lnet/minecraft/world/level/chunk/ChunkGenerator;getNearestGeneratedStructure(Ljava/util/Set;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/core/BlockPos;ZLnet/minecraft/world/level/levelgen/structure/placement/ConcentricRingsStructurePlacement;)Lcom/mojang/datafixers/util/Pair;",
//            at = @At(value = "HEAD"))
//    private void sixik$getNearestGeneratedStructureA(Set<Holder<Structure>> p_223182_, ServerLevel p_223183_, StructureManager p_223184_, BlockPos p_223185_, boolean p_223186_, ConcentricRingsStructurePlacement p_223187_, CallbackInfoReturnable<Pair<BlockPos, Holder<Structure>>> cir){
//        SixikInvasion.LOGGER.debug("Mixin ! Work" + "\n"+
//                p_223185_.toString() + "\n" +
//                "BlockPOS:");
//    }
//
//    @Inject(method = "Lnet/minecraft/world/level/chunk/ChunkGenerator;getNearestGeneratedStructure(Ljava/util/Set;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/StructureManager;IIIZJLnet/minecraft/world/level/levelgen/structure/placement/RandomSpreadStructurePlacement;)Lcom/mojang/datafixers/util/Pair;",
//            at = @At(value = "HEAD"))
//    private static void sixik$getNearestGeneratedStructureB(Set<Holder<Structure>> p_223189_, LevelReader p_223190_, StructureManager p_223191_, int p_223192_, int p_223193_, int p_223194_, boolean p_223195_, long p_223196_, RandomSpreadStructurePlacement p_223197_, CallbackInfoReturnable<Pair<BlockPos, Holder<Structure>>> cir){
//        SixikInvasion.LOGGER.debug("Mixin B Work" + "\n"+
//                p_223192_ + "\n"+
//                p_223193_ + "\n"+
//                p_223194_);
//
//    }
//
//    @Inject(method = "Lnet/minecraft/world/level/chunk/ChunkGenerator;getStructureGeneratingAt(Ljava/util/Set;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/StructureManager;ZLnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement;Lnet/minecraft/world/level/ChunkPos;)Lcom/mojang/datafixers/util/Pair;",
//    at = @At(value = "HEAD"))
//    private static void sixik$getStructureGeneratingAt(Set<Holder<Structure>> p_223199_, LevelReader p_223200_, StructureManager p_223201_, boolean p_223202_, StructurePlacement p_223203_, ChunkPos p_223204_, CallbackInfoReturnable<Pair<BlockPos, Holder<Structure>>> cir){
//        SixikInvasion.LOGGER.debug("Mixin C Work" + "\n"+
//                p_223203_.toString() + "\n"+
//                p_223204_.toString() + "\n" +
//                "BlockPOS:");
//        SixikInvasion.LOGGER.debug(String.valueOf(p_223203_.getLocatePos(p_223204_)));
//    }

    @Inject(method = "Lnet/minecraft/world/level/chunk/ChunkGenerator;tryGenerateStructure(Lnet/minecraft/world/level/levelgen/structure/StructureSet$StructureSelectionEntry;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;JLnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/SectionPos;)Z",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/world/level/StructureManager;setStartForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;Lnet/minecraft/world/level/levelgen/structure/StructureStart;Lnet/minecraft/world/level/chunk/StructureAccess;)V"))
    private void sixik$createStructures(StructureSet.StructureSelectionEntry structureSelectionEntry, StructureManager structureManager, RegistryAccess registryAccess, RandomState randomState, StructureTemplateManager templateManager, long l, ChunkAccess chunkAccess, ChunkPos chunkPos, SectionPos sectionPos, CallbackInfoReturnable<Boolean> cir){
        try {
            MinecraftForge.EVENT_BUS.post(new StrucutreSpawnEvent(chunkAccess.getWorldForge(), structureSelectionEntry, structureManager, registryAccess, randomState, templateManager, l, chunkAccess, chunkPos, sectionPos));
        } catch (NullPointerException ec){}
    }

//    @Inject(method = "Lnet/minecraft/world/level/chunk/ChunkGenerator;createReferences(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)V",
//    at = @At(value = "INVOKE",
//    target = "Lnet/minecraft/world/level/StructureManager;addReferenceForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;JLnet/minecraft/world/level/chunk/StructureAccess;)V"))
//    private void sixik$createReferences(WorldGenLevel p_223077_, StructureManager p_223078_, ChunkAccess p_223079_, CallbackInfo ci){
//        SixikInvasion.LOGGER.debug("Mixin F Work");
//        SixikInvasion.LOGGER.debug(String.valueOf(p_223079_.getPos().getWorldPosition()));
//        SixikInvasion.LOGGER.debug(String.valueOf(p_223079_.getPos().g));
//    }
}
