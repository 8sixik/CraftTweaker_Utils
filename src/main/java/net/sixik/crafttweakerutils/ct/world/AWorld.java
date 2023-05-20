package net.sixik.crafttweakerutils.ct.world;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import static net.minecraft.world.gen.feature.structure.StructureFeatures.DESERT_PYRAMID;
import static net.minecraft.world.gen.feature.structure.StructureFeatures.MINESHAFT;

@ZenCodeType.Name("mods.crafttweakerutils.api.world.AWorld")
@ZenRegister
public class AWorld {

    @ZenCodeType.Method
    public static void spawnStructure(ResourceLocation res, World world, BlockPos pos){
        if(world instanceof ServerWorld){
            ServerWorld server = (ServerWorld) world;
            GameRules tst = server.getGameRules();
            tst.getRule(GameRules.RULE_KEEPINVENTORY).set(true, server.getServer());
            TemplateManager templateManager = server.getStructureManager();
            Template template = templateManager.getOrCreate(res);
            if (template != null) {
                template.placeInWorld(server, pos, new PlacementSettings().setRandom(server.random), server.random);
                CraftTweakerAPI.logInfo("Template loaded");
            }
            else {
                CraftTweakerAPI.logInfo("Template " + res + " does not exist");
            }
        }
    }
    @ZenCodeType.Method
    public static List<ResourceLocation> getStructure(World world, BlockPos pos){
        List<ResourceLocation> structureList = new ArrayList<>();
        for (Structure<?> structureFeature : net.minecraftforge.registries.ForgeRegistries.STRUCTURE_FEATURES) {
            ResourceLocation location = structureFeature.getRegistryName();
            if(location != null) {
                if(!structureList.contains(structureFeature.getRegistryName())) {
                    structureList.add(structureFeature.getRegistryName());
                }
            }
        }
        return structureList;
    }
}
