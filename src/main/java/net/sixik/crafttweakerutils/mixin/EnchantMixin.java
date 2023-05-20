package net.sixik.crafttweakerutils.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.EnchantmentContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakerutils.source.events.EnchantEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;

@Mixin(EnchantmentContainer.class)
public class EnchantMixin {

    @Inject(method = "lambda$clickMenuButton$1(Lnet/minecraft/item/ItemStack;ILnet/minecraft/entity/player/PlayerEntity;ILnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V",
    at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/item/ItemStack;enchant(Lnet/minecraft/enchantment/Enchantment;I)V"),
    locals = LocalCapture.CAPTURE_FAILHARD)
    private void enchantHandler(ItemStack itemstack, int p_75140_2_, PlayerEntity player, int i, ItemStack itemstack1, World world, BlockPos pos, CallbackInfo ci, ItemStack itemstack2, List list, boolean flag, int j, EnchantmentData enchantmentdata ){
        MinecraftForge.EVENT_BUS.post(new EnchantEvent(player, itemstack, enchantmentdata, world, pos));
    }
}
