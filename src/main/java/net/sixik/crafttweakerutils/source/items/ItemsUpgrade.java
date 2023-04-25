package net.sixik.crafttweakerutils.source.items;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class ItemsUpgrade {

    public static void items(ItemStack item){
        item.setDamageValue(item.getDamageValue() - 10);
    }
}
