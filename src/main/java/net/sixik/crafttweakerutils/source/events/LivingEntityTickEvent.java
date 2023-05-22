package net.sixik.crafttweakerutils.source.events;

import net.minecraft.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingEntityTickEvent extends LivingEvent {

    public LivingEntityTickEvent(LivingEntity entity) {
        super(entity);
    }

    @Override
    public LivingEntity getEntityLiving() {
        return super.getEntityLiving();
    }
}
