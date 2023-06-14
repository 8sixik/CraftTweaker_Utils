package net.sixik.crafttweakerutils.ct.misc;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.ServerStatsCounter;
import net.minecraft.stats.Stat;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;
@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.misc.StatisticsManager")
public class MCStatisticsManager {

    private final ServerPlayer player;
    private final ServerStatsCounter playerStat;

    public MCStatisticsManager(ServerPlayer player) {
        this.player = player;
        this.playerStat = player.getStats();
    }

    public static MCStatisticsManager getPlayer(ServerPlayer sPlayer){
        return new MCStatisticsManager(sPlayer);
    }

    @ZenCodeType.Method
    public int getValue(String stat){
        if(Stat.getCustomCriteriaNames().contains(stat)){
            return playerStat.getValue((Stat<?>) Stat.byName(stat).get());
        }
        else {
            return -1;
        }
    }
    @ZenCodeType.Method
    public int getValue(ResourceLocation stat){
        if(Stat.getCustomCriteriaNames().contains(stat.getNamespace())){
            return playerStat.getValue((Stat<?>) Stat.byName(stat.getNamespace()).get());
        }
        else {
            return -1;
        }
    }
//    @ZenCodeType.Method
//    public List<String> getStatsName(){
//        List<String> statList = new ArrayList<>();
//        for(String stat : Stats.){
//            statList.add(stat.getName());
//        }
//        return statList;
//    }

//    @ZenCodeType.Method
//    public List<ResourceLocation> getStats(){
//        List<ResourceLocation> statList = new ArrayList<>();
//        for(ScoreCriteria stat : Stat.CRITERIA_BY_NAME.values()){
//            statList.add(new ResourceLocation(stat.getName()));
//        }
//        return statList;
//    }
}
