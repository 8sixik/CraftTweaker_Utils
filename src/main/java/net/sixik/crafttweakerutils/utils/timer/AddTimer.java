package net.sixik.crafttweakerutils.utils.timer;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AddTimer {
    public static AddTimer INSTANCE;
    public static final Map<String, TimerInfo> timers = new ConcurrentHashMap<>();
    public AddTimer(){
        INSTANCE = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void addTimerInfo(String uniqueID, int time) {
        TimerInfo timer_info = new TimerInfo(uniqueID, time, false);
        if (!timers.containsValue(timer_info) || !timers.containsKey(uniqueID)) {
            timers.put(uniqueID, timer_info);
        }
    }

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.START) return;
        final PlayerEntity player = event.player;
        if (!player.level.isClientSide && player.isAlive() && player.level.getGameTime() % 20 == 0) {
            if (timers != null && !timers.isEmpty()) {
                ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
                for (HashMap.Entry<String, TimerInfo> entry : timers.entrySet()) {
                    TimerInfo info = entry.getValue();
                    final String uniqueID = info.getUniqueID();
                    final int time = info.getTime();
                    int timer = getEntityTimeData(serverPlayer, uniqueID);
                    if (timer >= time) {
                        info.setComplete(true);
                        setEntityTimeData(serverPlayer, uniqueID, 0);

                    }
                    else {
                        ++timer;
                        setEntityTimeData(serverPlayer, uniqueID, timer);
                    }
                }
            }
        }
    }

    public static boolean isComplete(String id){
        if(timers.containsKey(id) || !timers.isEmpty()) {
            return timers.get(id).isComplete();
        }
        return false;
    }


    public static void setEntityTimeData(ServerPlayerEntity player, String valueTag, int time) {
        CompoundNBT playerData = player.getPersistentData();
        playerData.putInt(valueTag, time);
    }


    public static int getEntityTimeData(ServerPlayerEntity player, String valueTag) {
        CompoundNBT playerData = player.getPersistentData();
        return playerData.getInt(valueTag);
    }
}
