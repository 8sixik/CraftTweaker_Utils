package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.sixik.crafttweakersixikutils.source.events.StrucutreSpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/level/server/StructureSpawnEvent")
@NativeTypeRegistration(value = StrucutreSpawnEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.StructureSpawnEvent")
public class ExpandCreateStructuresEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("levelAccessor")
    public static LevelAccessor getLevel(StrucutreSpawnEvent event) {
        return event.getLevel();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("chunkAccess")
    public static ChunkAccess getChunkAccess(StrucutreSpawnEvent event) {
        return event.getChunkAccess();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("chunkPos")
    public static ChunkPos getChunkPos(StrucutreSpawnEvent event) {
        return event.getChunkPos();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("l")
    public static long getL(StrucutreSpawnEvent event) {
        return event.getL();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("randomState")
    public static RandomState getRandomState(StrucutreSpawnEvent event) {
        return event.getRandomState();
    }
//    @ZenCodeType.Method
//    @ZenCodeType.Getter("chunkPos")
//    public static RegistryAccess getRegistryAccess(StrucutreSpawnEvent event) {
//        return event.getRegistryAccess();
//    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("sectionPos")
    public static SectionPos getSectionPos(StrucutreSpawnEvent event) {
        return event.getSectionPos();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("structureManager")
    public static StructureManager getStructureManager(StrucutreSpawnEvent event) {
        return event.getStructureManager();
    }
//    @ZenCodeType.Method
//    @ZenCodeType.Getter("chunkPos")
//    public static StructureSet.StructureSelectionEntry getStructureSelectionEntry(StrucutreSpawnEvent event) {
//        return event.getStructureSelectionEntry();
//    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("templateManager")
    public static StructureTemplateManager getTemplateManager(StrucutreSpawnEvent event) {
        return event.getTemplateManager();
    }
}
