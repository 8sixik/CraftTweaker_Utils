package net.sixik.crafttweakerutils.ct.items;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;

import static net.sixik.crafttweakerutils.utils.Random.getRandomInt;

@ZenCodeType.Name("mods.crafttweakerutils.api.items.EventItems")
@ZenRegister
public class EventItems {

    private static ArrayList<ItemStack> RandomGiveItems = new ArrayList<>();

    @ZenCodeType.Method
    public static void setRandomGiveItems(IItemStack item){
        RandomGiveItems.add(item.getInternal());
    }
    @ZenCodeType.Method
    public static void setRandomGiveItems(IItemStack[] item){
        for(int i = 0; i < item.length; i++){
            RandomGiveItems.add(item[i].getInternal());
        }
    }

    @ZenCodeType.Method
    public static IItemStack getRandomGiveItems(){
        if(RandomGiveItems.isEmpty()) return null;
        else {
            return new MCItemStack(RandomGiveItems.get(getRandomInt(0, RandomGiveItems.size())));
        }
    }
    @ZenCodeType.Method
    public static IItemStack getRandomGiveItems(int index){
        if(RandomGiveItems.isEmpty()) return null;
        else {
            return new MCItemStack(RandomGiveItems.get(index));
        }
    }

}
