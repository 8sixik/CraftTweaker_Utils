package net.sixik.crafttweakerutils.ct.events.server.misc;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraftforge.common.world.StructureSpawnManager;
import net.minecraftforge.event.world.StructureSpawnListGatherEvent;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@NativeTypeRegistration(value = StructureSpawnListGatherEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.misc.MCStructureSpawnListGatherEvent")
public class MCStructureSpawnListGatherEvent {

    @ZenCodeType.Method
    public static Event.Result getResult(StructureSpawnListGatherEvent event){
       return event.getResult();
    }
    @ZenCodeType.Method
    public static boolean isInsideOnly(StructureSpawnListGatherEvent event){
       return event.isInsideOnly();
    }
    @ZenCodeType.Method
    public static ResourceLocation getRegistryName(StructureSpawnListGatherEvent event){
       return event.getStructure().getRegistryName();
    }
    @ZenCodeType.Method
    public static String getFeatureName(StructureSpawnListGatherEvent event){
       return event.getStructure().getFeatureName();
    }
    @ZenCodeType.Method
    public static List<MobSpawnInfo.Spawners> getSpawnList(StructureSpawnListGatherEvent event){
       return event.getStructure().getSpawnList(EntityClassification.MONSTER);
    }
    @ZenCodeType.Method
    public static String getSpawnListString(StructureSpawnListGatherEvent event){
       return event.getStructure().getSpawnList(EntityClassification.MONSTER).toString();
    }

}
