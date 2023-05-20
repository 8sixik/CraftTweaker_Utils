package net.sixik.crafttweakerutils.utils;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.stats.ServerStatisticsManager;
import net.minecraft.stats.Stat;
import net.minecraft.util.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.misc.StatisticsManager")
public class StatisticsManager {

    private final ServerPlayerEntity player;
    private final ServerStatisticsManager playerStat;

    public StatisticsManager(ServerPlayerEntity player) {
        this.player = player;
        this.playerStat = player.getStats();
    }

    public static StatisticsManager getPlayer(ServerPlayerEntity sPlayer){
        return new StatisticsManager(sPlayer);
    }

    @ZenCodeType.Method
    public int getValue(String stat){
        if(Stat.CRITERIA_BY_NAME.containsKey(stat)){
            return playerStat.getValue((Stat<?>) Stat.byName(stat).get());
        }
        else {
            CraftTweakerAPI.logInfo("Not Found Stat");
            return -1;
        }
    }
    @ZenCodeType.Method
    public int getValue(ResourceLocation stat){
        if(Stat.CRITERIA_BY_NAME.containsKey(stat.getNamespace())){
            return playerStat.getValue((Stat<?>) Stat.byName(stat.getNamespace()).get());
        }
        else {
            CraftTweakerAPI.logInfo("Not Found Stat");
            return -1;
        }
    }
    @ZenCodeType.Method
    public List<String> getStatsName(){
        List<String> statList = new ArrayList<>();
        for(ScoreCriteria stat : Stat.CRITERIA_BY_NAME.values()){
            statList.add(stat.getName());
        }
        return statList;
    }

    @ZenCodeType.Method
    public List<ResourceLocation> getStats(){
        List<ResourceLocation> statList = new ArrayList<>();
        for(ScoreCriteria stat : Stat.CRITERIA_BY_NAME.values()){
            statList.add(new ResourceLocation(stat.getName()));
        }
        return statList;
    }
}
