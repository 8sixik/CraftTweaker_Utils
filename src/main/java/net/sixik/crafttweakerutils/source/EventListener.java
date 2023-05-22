package net.sixik.crafttweakerutils.source;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sixik.crafttweakerutils.source.events.LivingEnityKillByPlayerEvent;

@Mod.EventBusSubscriber(modid = "crafttweakerutils", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class EventListener {

    @SubscribeEvent
    public static void onEntityDied(LivingDeathEvent event){
        LivingEntity entity = event.getEntityLiving();
        DamageSource damageSource = event.getSource();
        if(damageSource.getDirectEntity() == null || damageSource.getEntity() == null) return;
        if(damageSource.getDirectEntity() instanceof PlayerEntity || damageSource.getEntity() instanceof PlayerEntity){
            PlayerEntity player = (PlayerEntity) damageSource.getEntity();
            MinecraftForge.EVENT_BUS.post(new LivingEnityKillByPlayerEvent(entity, player, player.inventory.getSelected()));
        }
    }
}
