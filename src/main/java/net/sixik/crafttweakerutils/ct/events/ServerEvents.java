package net.sixik.crafttweakerutils.ct.events;

import com.mojang.brigadier.LiteralMessage;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.DifficultyChangeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sixik.crafttweakerutils.CraftTweakerUtils;
import net.sixik.crafttweakerutils.source.items.ItemsUpgrade;

import java.awt.*;


@Mod.EventBusSubscriber(modid = CraftTweakerUtils.MOD_ID)
public class ServerEvents {

    @SubscribeEvent
    public static void onPlayerLogIn(PlayerEvent.PlayerLoggedInEvent event){
        PlayerEntity player = event.getPlayer();
        World world = player.level;
        if(world.isClientSide) return;
        boolean hasTimer = player.getPersistentData().contains(CraftTweakerUtils.MOD_ID + "timer");
        boolean isTStart = player.getPersistentData().getBoolean(CraftTweakerUtils.MOD_ID + "timer");

        if(hasTimer && isTStart){
            long tStart = player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "timestart");
            long tEnd = player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "timeend");
            long tLeft = player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "lefttime");
            tLeft = tLeft + world.getGameTime();
            player.getPersistentData().putLong(CraftTweakerUtils.MOD_ID + "timeend", tLeft);
        }
    }
    @SubscribeEvent
    public static void onPlayerLogOut(PlayerEvent.PlayerLoggedOutEvent event){
        PlayerEntity player = event.getPlayer();
        World world = player.level;
        if(world.isClientSide) return;

        boolean hasTimer = player.getPersistentData().contains(CraftTweakerUtils.MOD_ID + "timer");
        boolean isTStart = player.getPersistentData().getBoolean(CraftTweakerUtils.MOD_ID + "timer");
        if(hasTimer && isTStart){
            //long tStart = player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "timestart");
            long tEnd = player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "timeend");
            long leftTime = world.getGameTime() - tEnd;
            player.getPersistentData().putLong(CraftTweakerUtils.MOD_ID + "lefttime", leftTime);
        }
    }
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event){
        PlayerEntity player = event.player;
        World world = player.level;
        if(world.isClientSide) return;
        boolean hasTimer = player.getPersistentData().contains(CraftTweakerUtils.MOD_ID + "timer");
        boolean isTStart = player.getPersistentData().getBoolean(CraftTweakerUtils.MOD_ID + "timer");

        if(!hasTimer) return;
        long tStart = player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "timestart");
        long tEnd = player.getPersistentData().getLong(CraftTweakerUtils.MOD_ID + "timeend");
        if (world.getGameTime() == tEnd) {
            player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "timer");
            player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "lefttime");
            player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "timestart");
            player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "timeend");
            player.getPersistentData().putBoolean(CraftTweakerUtils.MOD_ID + "timer", false);
            player.getPersistentData().putBoolean(CraftTweakerUtils.MOD_ID + "timercomplite", true);
        }

        if(world.getGameTime() > tEnd){
            player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "timer");
            player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "lefttime");
            player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "timestart");
            player.getPersistentData().remove(CraftTweakerUtils.MOD_ID + "timeend");
            player.getPersistentData().putBoolean(CraftTweakerUtils.MOD_ID + "timer", false);
            player.getPersistentData().putBoolean(CraftTweakerUtils.MOD_ID + "timercomplite", true);
        }
    }


}
