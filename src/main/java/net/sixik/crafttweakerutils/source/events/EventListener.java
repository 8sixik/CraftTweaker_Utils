package net.sixik.crafttweakerutils.source.events;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

@Mod.EventBusSubscriber(modid = "crafttweakerutils", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class EventListener {

    @SubscribeEvent
    public static void onEntityDied(LivingDeathEvent event){
        LivingEntity entity = event.getEntityLiving();
        DamageSource damageSource = event.getSource();
        if(damageSource.getDirectEntity() == null || damageSource.getEntity() == null) return;
        if(damageSource.getDirectEntity() instanceof Player || damageSource.getEntity() instanceof Player){
            Player player = (Player) damageSource.getEntity();
            MinecraftForge.EVENT_BUS.post(new LivingEnityKillByPlayerEvent(entity, player, player.getInventory().getSelected()));
        }
    }

//    @SubscribeEvent
//    public static void onBlockBreak(BlockEvent.BreakEvent event){
//        Player player = event.getPlayer();
//        BlockPos pos = event.getPos();
//        BlockState state = event.getState();
//        ItemStack blockItem = state.getBlock().asItem().getDefaultInstance();
//        Level level = (Level) event.getLevel();
//        if(player == null) return;
//        if(level.isClientSide || player.getLevel().isClientSide)return;
//        ItemStack itemBreak = player.getInventory().getSelected();
//        int expBlokc = event.getExpToDrop();
//        System.out.printf(blockItem.getTags().toString());
//        if(blockItem.getTag().contains("forge:ores")){
//
//        }
//    }
}
