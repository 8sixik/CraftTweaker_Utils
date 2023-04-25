package net.sixik.crafttweakerutils.source.items;

import net.minecraft.item.ItemStack;

public interface ItemUpgradeProperty extends Comparable<ItemUpgradeProperty> {

    ItemStack getItem();

    String getName();
}
