package net.sixik.crafttweakerutils.ct.events.server.helper;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import org.openzen.zencode.java.ZenCodeType;

import java.awt.*;
import java.util.Random;
@ZenCodeType.Name("mods.crafttweakerutils.events.helper.AEventsHelper")
@ZenRegister
public class AEventsHelper {
    private static IItemStack[] itemsGive = {};
    private static IItemStack[] randomItemGive = {};

    @ZenCodeType.Method
    public static void setGiveItems(IItemStack[] item){
        itemsGive = item;
    }
    @ZenCodeType.Method
    public static void setGiveRandomItem(IItemStack[] item){
        randomItemGive = item;
    }


    @ZenCodeType.Method
    public static IItemStack getGiveItem(int i){
        return itemsGive[i];
    }
    @ZenCodeType.Method
    public static IItemStack[] getGiveItems() {
        return itemsGive;
    }
    @ZenCodeType.Method
    public static IItemStack[] getGiveRandomItem() {
        return randomItemGive;
    }
    @ZenCodeType.Method
    public static IItemStack getRandomItem(int i){
        return randomItemGive[i];
    }
}
