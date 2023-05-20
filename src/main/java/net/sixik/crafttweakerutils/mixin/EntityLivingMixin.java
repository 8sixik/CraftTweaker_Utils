package net.sixik.crafttweakerutils.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakerutils.source.events.LivingItemPickUpEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class EntityLivingMixin {

    @Inject(at = @At("TAIL"), method = "Lnet/minecraft/entity/LivingEntity;onItemPickup(Lnet/minecraft/entity/item/ItemEntity;)V")
    public void onItemPickUp(ItemEntity p_233630_1_, CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new LivingItemPickUpEvent((LivingEntity) (Object)this, p_233630_1_));
    }
}
