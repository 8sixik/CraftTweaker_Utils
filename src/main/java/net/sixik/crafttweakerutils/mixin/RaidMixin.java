package net.sixik.crafttweakerutils.mixin;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.raid.Raid;
import net.minecraft.world.raid.RaidManager;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakerutils.source.events.RaidEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Mixin(RaidManager.class)
public class RaidMixin {

    @Shadow @Final private Map<Integer, Raid> raidMap;

    @Shadow @Final private ServerWorld level;

    @Inject(method = "Lnet/minecraft/world/raid/RaidManager;createOrExtendRaid(Lnet/minecraft/entity/player/ServerPlayerEntity;)Lnet/minecraft/world/raid/Raid;",
            at = @At(value = "INVOKE",
            target = "Ljava/util/Map;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"),
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void onStartRaid(ServerPlayerEntity player, CallbackInfoReturnable<Raid> cir, DimensionType dimensiontype, BlockPos blockpos, List list, int i, Vector3d vector3d, BlockPos blockpos1, Raid raid, boolean flag){
        MinecraftForge.EVENT_BUS.post(new RaidEvent.StartRaidEvent(player, raid, dimensiontype, blockpos, level, raidMap));
    }

    @Inject(method = "Lnet/minecraft/world/raid/RaidManager;tick()V",
            at = @At(value = "INVOKE",
            target = "Lnet/minecraft/world/raid/Raid;tick()V"),
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void onTickRaid(CallbackInfo ci, Iterator iterator, Raid raid){
        MinecraftForge.EVENT_BUS.post(new RaidEvent.TickRaidEvent(raid, level, raidMap));

    }

    @Inject(method = "Lnet/minecraft/world/raid/RaidManager;tick()V",
            at = @At(value = "INVOKE",
            target = "Ljava/util/Iterator;remove()V"),
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void onStopRaid(CallbackInfo ci, Iterator iterator, Raid raid){
        MinecraftForge.EVENT_BUS.post(new RaidEvent.StopRaidEvent(raid, level, raidMap));
    }
}
