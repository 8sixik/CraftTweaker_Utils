package net.sixik.crafttweakerutils.mixin;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakerutils.source.events.LivingEntityTickEvent;
import net.sixik.crafttweakerutils.source.events.LivingItemPickUpEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class EntityLivingMixin {

    @Inject(at = @At("TAIL"),
            method = "Lnet/minecraft/world/entity/LivingEntity;onItemPickup(Lnet/minecraft/world/entity/item/ItemEntity;)V")
    public void ctus$$onItemPickUp(ItemEntity p_21054_, CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new LivingItemPickUpEvent((LivingEntity) (Object)this, p_21054_));
    }

    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/world/entity/LivingEntity;tick()V")
    public void onEntityTick(CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new LivingEntityTickEvent((LivingEntity) (Object)this));
    }
}
