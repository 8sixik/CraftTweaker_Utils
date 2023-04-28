package net.sixik.crafttweakerutils.utils;

import net.minecraft.loot.RandomRanges;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class math {

    public static int getRanodmInt(int min, int max){
        int rand = ThreadLocalRandom.current().nextInt(min,max);
        return rand;
    }
}
