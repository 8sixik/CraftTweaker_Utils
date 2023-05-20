package net.sixik.crafttweakerutils.utils;

import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.stats.Stat;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.FMLMCRegisterPacketHandler;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;

public class Stats {

    private final net.minecraft.stats.Stats stats;

    public Stats(net.minecraft.stats.Stats stats) {
        this.stats = stats;
    }


}
