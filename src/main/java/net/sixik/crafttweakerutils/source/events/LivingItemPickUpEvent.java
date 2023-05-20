package net.sixik.crafttweakerutils.source.events;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingItemPickUpEvent extends LivingEvent {
    ItemStack itemStack;
    ItemEntity itemEntity;
    public LivingItemPickUpEvent(LivingEntity entity, ItemEntity itemStack) {
        super(entity);
        this.itemEntity = itemStack;
        this.itemStack = itemStack.getItem();
    }

    @Override
    public LivingEntity getEntityLiving() {
        return super.getEntityLiving();
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public ItemEntity getItemEntity() {
        return itemEntity;
    }
}
