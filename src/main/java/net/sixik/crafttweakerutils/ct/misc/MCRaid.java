package net.sixik.crafttweakerutils.ct.misc;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.misc.MCRaid")
public class MCRaid {

    private final Raid pRaid;

    public MCRaid (Raid raid){
        this.pRaid = raid;
    }

    @Nullable
    public static MCRaid getRaid(Raid raid){
        if(raid == null) return null;

        return new MCRaid(raid);
    }

    @ZenCodeType.Method
    public int getBadOmenLevel(){
        return pRaid.getBadOmenLevel();
    }
    @ZenCodeType.Method
    public int getMaxBadOmenLevel(){
        return pRaid.getMaxBadOmenLevel();
    }
    @ZenCodeType.Method
    public Level getWorld(){
        return pRaid.getLevel();
    }
    @ZenCodeType.Method
    public BlockPos getCenter(){
        return pRaid.getCenter();
    }
    @ZenCodeType.Method
    public float getEnchantOdds(){
        return pRaid.getEnchantOdds();
    }
    @ZenCodeType.Method
    public float getGroupsSpawned(){
        return pRaid.getGroupsSpawned();
    }
    @ZenCodeType.Method
    public float getHealthOfLivingRaiders(){
        return pRaid.getHealthOfLivingRaiders();
    }
    @ZenCodeType.Method
    public int getTotalRaidersAlive(){
        return pRaid.getTotalRaidersAlive();
    }
    @ZenCodeType.Method
    public int getId(){
        return pRaid.getId();
    }
    @ZenCodeType.Method
    public boolean isActive(){
        return pRaid.isActive();
    }
    @ZenCodeType.Method
    public boolean isLoss(){
        return pRaid.isLoss();
    }
    @ZenCodeType.Method
    public boolean isBetweenWaves(){
        return pRaid.isBetweenWaves();
    }
    @ZenCodeType.Method
    public boolean isOver(){
        return pRaid.isOver();
    }
    @ZenCodeType.Method
    public boolean isStarted(){
        return pRaid.isStarted();
    }
    @ZenCodeType.Method
    public boolean isStopped(){
        return pRaid.isStopped();
    }
    @ZenCodeType.Method
    public boolean isVictory(){
        return pRaid.isVictory();
    }
    @ZenCodeType.Method
    public void stop(){
        pRaid.stop();
    }
}
