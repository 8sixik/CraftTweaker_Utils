package net.sixik.crafttweakerutils.source.client.events;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sixik.crafttweakerutils.CraftTweakerUtils;

public class ClientsEvents {


    @Mod.EventBusSubscriber(modid = "crafttweakerutils", value = Dist.CLIENT)
    public static class Events{
        @SubscribeEvent
        public static void onScreenEvent(ScreenEvent event){
            MinecraftForge.EVENT_BUS.post(new net.sixik.crafttweakerutils.source.client.events.ScreenEvent(event.getScreen()));
        }
    }
}
