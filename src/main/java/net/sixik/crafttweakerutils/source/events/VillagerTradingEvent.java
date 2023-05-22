package net.sixik.crafttweakerutils.source.events;

import net.minecraft.entity.merchant.villager.VillagerData;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.villager.VillagerType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class VillagerTradingEvent extends Event {

    PlayerEntity player;
    ItemStack itemStack;
    VillagerData villagerData;
    @Nullable PlayerEntity lastPlayer;
    public VillagerTradingEvent(PlayerEntity player, ItemStack itemStack, VillagerData villagerData, @Nullable PlayerEntity lastPlayer){
        this.itemStack = itemStack;
        this.player = player;
        this.villagerData = villagerData;
        this.lastPlayer = lastPlayer;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public PlayerEntity getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelable() {
        return false;
    }

    @Nullable
    public PlayerEntity getLastPlayer() {
        return lastPlayer;
    }

    public VillagerType getType() {
        return villagerData.getType();
    }

    public VillagerProfession getProfession() {
        return villagerData.getProfession();
    }
}
