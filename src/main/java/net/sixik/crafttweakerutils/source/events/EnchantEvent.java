package net.sixik.crafttweakerutils.source.events;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class EnchantEvent extends PlayerEvent {
    EnchantmentInstance enchantmentData;
    Enchantment enchantment;
    ItemStack stack;
    Level world;
    BlockPos pos;

    public EnchantEvent(Player player, ItemStack itemstack, BlockPos pos, EnchantmentInstance enchantmentinstance, net.minecraft.world.level.Level level) {
        super(player);
        this.stack = itemstack;
        this.enchantmentData = enchantmentinstance;
        this.enchantment = enchantmentinstance.enchantment;
        this.world = level;
        this.pos = pos;
    }

//    public EnchantEvent(Player player, ItemStack itemstack, BlockPos pos, EnchantmentInstance enchantmentinstance, net.minecraft.world.level.Level level) {
//        super(player);
//    }


    @Override
    public boolean isCancelable() {return false;}
    public Enchantment getEnchantment() {return enchantment;}
    public ItemStack getItem() {return stack;}

    public net.minecraft.world.level.Level getWorld() {
        return world;
    }

    public BlockPos getPos() {
        return pos;
    }
}
