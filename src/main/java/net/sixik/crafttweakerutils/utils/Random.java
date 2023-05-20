package net.sixik.crafttweakerutils.utils;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import org.openzen.zencode.java.ZenCodeType;

import java.util.concurrent.ThreadLocalRandom;
@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.misc.Random")
public class Random {

    @ZenCodeType.Method
    public static int getRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min,max);
    }
    @ZenCodeType.Method
    public static double getRandomDouble(double min, double max){
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
    @ZenCodeType.Method
    public static long getRandomLong(long min, long max){
        return ThreadLocalRandom.current().nextLong(min,max);
    }
}
