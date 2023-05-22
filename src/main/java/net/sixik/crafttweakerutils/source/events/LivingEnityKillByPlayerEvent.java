package net.sixik.crafttweakerutils.source.events;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingEnityKillByPlayerEvent extends LivingEvent {

    private PlayerEntity player;
    private ItemStack item;
    public LivingEnityKillByPlayerEvent(LivingEntity entity, PlayerEntity player, ItemStack item) {
        super(entity);
        this.player = player;
        this.item = item;
    }

    public PlayerEntity getPlayer() {
        return player;
    }
    @Override
    public LivingEntity getEntityLiving() {
        return super.getEntityLiving();
    }

    public ItemStack getItem() {
        return item;
    }
}
