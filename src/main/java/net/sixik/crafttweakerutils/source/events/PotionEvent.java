package net.sixik.crafttweakerutils.source.events;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PotionEvent extends PlayerEvent {
    ItemStack potion;
    public PotionEvent(PlayerEntity player, ItemStack potion) {
        super(player);
        this.potion = potion;
    }

    @Override
    public boolean isCancelable() {
        return false;
    }

    public ItemStack getPotion() {return potion;}
}
