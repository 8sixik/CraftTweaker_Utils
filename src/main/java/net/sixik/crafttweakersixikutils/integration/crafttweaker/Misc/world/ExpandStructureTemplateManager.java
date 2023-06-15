package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import jdk.jfr.Registered;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;


@Registered
@Document("mods/sixikutils/utils/world/StructureTemplateManager")
@NativeTypeRegistration(value = StructureTemplateManager.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.StructureTemplateManager")
public class ExpandStructureTemplateManager {

    @ZenCodeType.Method
    public static List<String> getNamespace(StructureTemplateManager template){
        List<String> list = new ArrayList<>();
        template.listTemplates().forEach(s -> {
            list.add(s.getNamespace());
        });
        return list;
    }
    @ZenCodeType.Method
    public static List<String> getPath(StructureTemplateManager template){
        List<String> list = new ArrayList<>();
        template.listTemplates().forEach(s -> {
            list.add(s.getPath());
        });
        return list;
    }
    @ZenCodeType.Method
    public static List<String> getLanguageKey(StructureTemplateManager template){
        List<String> list = new ArrayList<>();
        template.listTemplates().forEach(s -> {
            list.add(s.toLanguageKey());
        });
        return list;
    }
    @ZenCodeType.Method
    public static List<String> getShortLanguageKey(StructureTemplateManager template){
        List<String> list = new ArrayList<>();
        template.listTemplates().forEach(s -> {
            list.add(s.toShortLanguageKey());
        });
        return list;
    }

    @ZenCodeType.Method
    public static boolean placeInWorld(StructureTemplateManager template,ResourceLocation res, ServerLevel serverLevel, BlockPos pos, BlockPos pos2, int type){
        switch (type){
            case 1:
                if(template.get(res).isEmpty()) return false;
                return template.get(res).get().placeInWorld(serverLevel, pos, pos2, new StructurePlaceSettings().setRandom(serverLevel.random), serverLevel.random, 10);
            case 2:
                template.getOrCreate(res).placeInWorld(serverLevel, pos, pos2, new StructurePlaceSettings().setRandom(serverLevel.random), serverLevel.random, 10);
            default:
                return false;
        }
    }
}
