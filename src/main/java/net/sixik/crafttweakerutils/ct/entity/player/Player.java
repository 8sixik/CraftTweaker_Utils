package net.sixik.crafttweakerutils.ct.entity.player;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EnderChestInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.ServerStatisticsManager;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.sixik.crafttweakerutils.ct.entity.player.inventory.MCEnderChestInventory;
import net.sixik.crafttweakerutils.utils.StatisticsManager;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Objects;

import static net.minecraft.world.World.RESOURCE_KEY_CODEC;

@ZenRegister
@NativeTypeRegistration(value = PlayerEntity.class, zenCodeName = "crafttweaker.api.player.MCPlayerEntity")
public class Player {

    @ZenCodeType.Method
    public static int getLeftBlocksToUp(PlayerEntity player){
       return player.level.getMaxBuildHeight() - (int) player.getY();
    }

    @ZenCodeType.Method
    public static boolean isFallFlying(PlayerEntity player){
       return player.isFallFlying();
    }
    @ZenCodeType.Method
    public static boolean isSleeping(PlayerEntity player){
       return player.isSleeping();
    }
    @ZenCodeType.Method
    public static boolean isAttackable(PlayerEntity player){
       return player.isAttackable();
    }
    @ZenCodeType.Method
    public static boolean isShiftKeyDown(PlayerEntity player){
       return player.isShiftKeyDown();
    }
    @ZenCodeType.Method
    public static boolean isInWaterOrBubble(PlayerEntity player){
       return player.isInWaterOrBubble();
    }
    @ZenCodeType.Method
    public static boolean isInWaterOrRain(PlayerEntity player){
       return player.isInWaterOrRain();
    }
    @ZenCodeType.Method
    public static boolean isInWaterRainOrBubble(PlayerEntity player){
       return player.isInWaterRainOrBubble();
    }
    @ZenCodeType.Method
    public static boolean isInvisible(PlayerEntity player){
       return player.isInvisible();
    }
    @ZenCodeType.Method
    public static float experienceProgress(PlayerEntity player){
       return player.experienceProgress;
    }
    @ZenCodeType.Method
    public static boolean isNoGravity(PlayerEntity player){
       return player.isNoGravity();
    }
    @ZenCodeType.Method
    public static void setNoGravity(PlayerEntity player, boolean type){
        player.setNoGravity(type);
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("xrot")
    public static float getxRot(PlayerEntity player) {
       return player.xRot;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("yrot")
    public static float getyRot(PlayerEntity player){
        return player.yRot;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("xrot")
    public static void setxRot(PlayerEntity player, float rot) {
       player.xRot = rot;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("yrot")
    public static void setyRot(PlayerEntity player, float yaw){
        player.yRot = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("headrot")
    public static float getyHeadRot(PlayerEntity player){
        return player.yHeadRot;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("headrot")
    public static void setyHeadRot(PlayerEntity player, float yaw){
        player.yHeadRot = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("bodyrot")
    public static float getyBodyRot(PlayerEntity player){
        return player.yBodyRot;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("bodyrot")
    public static void setyBodyRot(PlayerEntity player, float yaw){
        player.yBodyRot = yaw;
    }

    @ZenCodeType.Method
    public static boolean isOnPortalCooldown(PlayerEntity player){
        return player.isOnPortalCooldown();
    }
    @ZenCodeType.Method
    public static void setPortalCooldown(PlayerEntity player){
        player.setPortalCooldown();
    }
    @ZenCodeType.Method
    public static int getPortalWaitTime(PlayerEntity player){
        return player.getPortalWaitTime();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("enderChest")
    public static MCEnderChestInventory getEnderChestInventory(PlayerEntity player) {return MCEnderChestInventory.getForPlayer(player);}

    @ZenCodeType.Method
    public static BlockPos getRespawnPosition(PlayerEntity player){
        BlockPos playerPos = new BlockPos(0, 0, 0);
        if(player instanceof ServerPlayerEntity){
            ServerPlayerEntity Splayer = (ServerPlayerEntity) player;
            try {
                if(Splayer.getRespawnPosition() != null){
                    playerPos = Splayer.getRespawnPosition();
                    return playerPos;
                }
                else {
                    playerPos = new BlockPos(-1,-1,-1);
                    return playerPos;
                }
            }
            catch (java.lang.NullPointerException e){
                return new BlockPos(-1,-1,-1);
            }
        }
        else return new BlockPos(-1,-1,-1);
    }
    @ZenCodeType.Method
    public static ResourceLocation getRespawnDimension(PlayerEntity player){
        if(player instanceof ServerPlayerEntity){
            ServerPlayerEntity Splayer = (ServerPlayerEntity) player;
            return Splayer.getRespawnDimension().getRegistryName();
        }
        return null;
    }
    @ZenCodeType.Method
    public static float getRespawnAngle(PlayerEntity player){
        if(player instanceof ServerPlayerEntity){
            ServerPlayerEntity Splayer = (ServerPlayerEntity) player;
            return Splayer.getRespawnAngle();
        }
        return -1.0f;
    }
    @ZenCodeType.Method
    public static long getLastActionTime(PlayerEntity player){
        if(player instanceof ServerPlayerEntity){
            ServerPlayerEntity Splayer = (ServerPlayerEntity) player;
            return Splayer.getLastActionTime();
        }
        return -1;
    }
    @ZenCodeType.Method
    public static boolean isRespawnForced(PlayerEntity player){
        if(player instanceof ServerPlayerEntity){
            ServerPlayerEntity Splayer = (ServerPlayerEntity) player;
            return Splayer.isRespawnForced();
        }
        return false;
    }
    @ZenCodeType.Method
    public static void setRespawnPosition(PlayerEntity player, ResourceLocation res, BlockPos pos, float respawnAngle, boolean respawnForced, boolean flag){
        if(player instanceof ServerPlayerEntity) {
            ServerPlayerEntity Splayer = (ServerPlayerEntity) player;
            RegistryKey<World> world = RegistryKey.create(Registry.DIMENSION_REGISTRY, res);
            Splayer.setRespawnPosition(world, pos, respawnAngle, respawnForced, flag);
        } else return;
    }
    @ZenCodeType.Method
    public static void changeDimension(PlayerEntity player, ResourceLocation res){
        if(player instanceof ServerPlayerEntity) {
            player.changeDimension(Objects.requireNonNull(Objects.requireNonNull(player.getServer()).getLevel(RegistryKey.create(Registry.DIMENSION_REGISTRY, res))));
        }
    }

    @ZenCodeType.Method
    public static void playerDropItemIndex(PlayerEntity player, int i, boolean t){
        if(player.level.isClientSide()) return;
        player.drop(player.inventory.getItem(i), t);
        player.setSlot(i, new ItemStack(Items.AIR));
    }

    @ZenCodeType.Method
    public static ClientPlayer getClient(PlayerEntity player){
        if(player.getUUID() == Minecraft.getInstance().player.getUUID()){
            ClientPlayerEntity Cplayer = Minecraft.getInstance().player;
            return ClientPlayer.getClient(Cplayer);
        }
        return null;
    }

    @ZenCodeType.Method
    public static StatisticsManager getStatisticsManager(PlayerEntity player){
        if(player instanceof ServerPlayerEntity){
            ServerPlayerEntity sPlayer = (ServerPlayerEntity) player;
            return StatisticsManager.getPlayer(sPlayer);
        }
        else return null;
    }
//    public static void test(PlayerEntity player){
//        return player.get
//    }
}
