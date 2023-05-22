package net.sixik.crafttweakerutils.mixin;

import net.minecraft.entity.merchant.villager.VillagerData;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakerutils.source.events.VillagerTradingEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import javax.annotation.Nullable;

@Mixin(VillagerEntity.class)
public abstract class VillagerMixin {

    @Shadow public abstract VillagerData getVillagerData();

    @Shadow @Nullable private PlayerEntity lastTradedPlayer;

    @Inject(method = "Lnet/minecraft/entity/merchant/villager/VillagerEntity;mobInteract(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResultType;",
    at = @At(value = "INVOKE",
    target = "Lnet/minecraft/entity/merchant/villager/VillagerEntity;startTrading(Lnet/minecraft/entity/player/PlayerEntity;)V"),
    locals = LocalCapture.CAPTURE_FAILHARD)
    public void onTrading(PlayerEntity player, Hand p_230254_2_, CallbackInfoReturnable<ActionResultType> cir, ItemStack itemstack, boolean flag){
        MinecraftForge.EVENT_BUS.post(new VillagerTradingEvent(player, itemstack, getVillagerData(), lastTradedPlayer));
    }

}
