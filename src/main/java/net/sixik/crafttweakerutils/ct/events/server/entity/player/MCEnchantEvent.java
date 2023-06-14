package net.sixik.crafttweakerutils.ct.events.server.entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.sixik.crafttweakerutils.source.events.EnchantEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = EnchantEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCEnchantEvent")
public class MCEnchantEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(EnchantEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("enchantment")
    public static Enchantment getEnchantment(EnchantEvent event){
        return event.getEnchantment();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(EnchantEvent event){
        return new MCItemStack(event.getItem());
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("world")
    public static Level getWorld(EnchantEvent event){
        return event.getWorld();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getBlockPos(EnchantEvent event){
        return event.getPos();
    }
}