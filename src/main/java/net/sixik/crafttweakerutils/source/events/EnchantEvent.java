package net.sixik.crafttweakerutils.source.events;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class EnchantEvent extends PlayerEvent {
    EnchantmentData enchantmentData;
    Enchantment enchantment;
    ItemStack stack;
    World world;
    BlockPos pos;

    public EnchantEvent(PlayerEntity player, ItemStack stack, EnchantmentData enchantment, World world, BlockPos pos) {
        super(player);
        this.stack = stack;
        this.enchantmentData = enchantment;
        this.enchantment = enchantment.enchantment;
        this.world = world;
        this.pos = pos;
    }


    @Override
    public boolean isCancelable() {return false;}
    public Enchantment getEnchantment() {return enchantment;}
    public ItemStack getItem() {return stack;}

    public World getWorld() {
        return world;
    }

    public BlockPos getPos() {
        return pos;
    }
}
