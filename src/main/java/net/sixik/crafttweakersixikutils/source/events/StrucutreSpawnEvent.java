package net.sixik.crafttweakersixikutils.source.events;

import net.minecraft.core.RegistryAccess;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraftforge.event.level.LevelEvent;

public class StrucutreSpawnEvent extends LevelEvent {
    private StructureSet.StructureSelectionEntry structureSelectionEntry;
    private StructureManager structureManager;
    private RegistryAccess registryAccess;
    private RandomState randomState;
    private StructureTemplateManager templateManager;
    private long l;
    private ChunkAccess chunkAccess;
    private ChunkPos chunkPos;
    private SectionPos sectionPos;
    public StrucutreSpawnEvent(LevelAccessor level, StructureSet.StructureSelectionEntry structureSelectionEntry, StructureManager structureManager, RegistryAccess registryAccess, RandomState randomState, StructureTemplateManager templateManager, long l, ChunkAccess chunkAccess, ChunkPos chunkPos, SectionPos sectionPos) {
        super(level);
        this.structureSelectionEntry = structureSelectionEntry;
        this.structureManager = structureManager;
        this.registryAccess = registryAccess;
        this.randomState = randomState;
        this.templateManager = templateManager;
        this.l = l;
        this.chunkAccess = chunkAccess;
        this.chunkPos = chunkPos;
    }

    @Override
    public LevelAccessor getLevel() {
        return super.getLevel();
    }

    public ChunkAccess getChunkAccess() {
        return chunkAccess;
    }

    public ChunkPos getChunkPos() {
        return chunkPos;
    }

    public long getL() {
        return l;
    }

    public RandomState getRandomState() {
        return randomState;
    }

    public RegistryAccess getRegistryAccess() {
        return registryAccess;
    }

    public SectionPos getSectionPos() {
        return sectionPos;
    }

    public StructureManager getStructureManager() {
        return structureManager;
    }

    public StructureSet.StructureSelectionEntry getStructureSelectionEntry() {
        return structureSelectionEntry;
    }

    public StructureTemplateManager getTemplateManager() {
        return templateManager;
    }
}
