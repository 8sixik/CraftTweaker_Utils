package net.sixik.crafttweakerutils.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakerutils.source.events.EatFoodEvent;
import net.sixik.crafttweakerutils.source.events.PlayerTravelEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class MixinEntityPlayer  {
    @Inject(at = @At("HEAD"),
            method = "Lnet/minecraft/entity/player/PlayerEntity;eat(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;")
    public void FoodEating(World level, ItemStack stack, CallbackInfoReturnable<?> ci){
        MinecraftForge.EVENT_BUS.post(new EatFoodEvent(((PlayerEntity)(Object)this), stack));
    }
    @Inject(at = @At("TAIL"),method = "Lnet/minecraft/entity/player/PlayerEntity;travel(Lnet/minecraft/util/math/vector/Vector3d;)V")
    public void onTavel(Vector3d p_213352_1_, CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new PlayerTravelEvent((PlayerEntity) (Object)this, p_213352_1_));
    }
}

