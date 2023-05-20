package net.sixik.crafttweakerutils.utils;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.loot.RandomRanges;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.misc.Math")
public class math {

    @ZenCodeType.Method
    public static int abs(int a){
       return Math.abs(a);
    }
    @ZenCodeType.Method
    public static long abs(long a){
       return Math.abs(a);
    }
    @ZenCodeType.Method
    public static float abs(float a){
       return Math.abs(a);
    }
    @ZenCodeType.Method
    public static double abs(double a){
       return Math.abs(a);
    }
    @ZenCodeType.Method
    public static double acos(double a){
       return Math.acos(a);
    }
    @ZenCodeType.Method
    public static double asin(double a){
       return Math.asin(a);
    }
    @ZenCodeType.Method
    public static double atan(double a){
       return Math.atan(a);
    }
    @ZenCodeType.Method
    public static double atan(double a,double b){
       return Math.atan2(a, b);
    }
    @ZenCodeType.Method
    public static int addExact(int a,int b){
       return Math.addExact(a, b);
    }
    @ZenCodeType.Method
    public static long addExact(long a,long b){
       return Math.addExact(a, b);
    }
}
