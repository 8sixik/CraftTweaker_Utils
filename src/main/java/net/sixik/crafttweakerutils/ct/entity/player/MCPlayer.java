package net.sixik.crafttweakerutils.ct.entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.sixik.crafttweakerutils.ct.entity.player.client.ClientPlayer;
import net.sixik.crafttweakerutils.ct.entity.player.inventory.MCEnderChestInventory;
import net.sixik.crafttweakerutils.ct.misc.MCStatisticsManager;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.Map;


@ZenRegister
@NativeTypeRegistration(value = Player.class, zenCodeName = "crafttweaker.api.entity.type.player.Player")
public class MCPlayer {

    @ZenCodeType.Method
    public static int getLeftBlocksToUp(Player player){
        return player.level.getMaxBuildHeight() - (int) player.getY();
    }

    @ZenCodeType.Method
    public static boolean isFallFlying(Player player){
        return player.isFallFlying();
    }
    @ZenCodeType.Method
    public static boolean isSleeping(Player player){
        return player.isSleeping();
    }
    @ZenCodeType.Method
    public static boolean isAttackable(Player player){
        return player.isAttackable();
    }
    @ZenCodeType.Method
    public static boolean isShiftKeyDown(Player player){
        return player.isShiftKeyDown();
    }
    @ZenCodeType.Method
    public static boolean isInWaterOrBubble(Player player){
        return player.isInWaterOrBubble();
    }
    @ZenCodeType.Method
    public static boolean isInWaterOrRain(Player player){
        return player.isInWaterOrRain();
    }
    @ZenCodeType.Method
    public static boolean isInWaterRainOrBubble(Player player){
        return player.isInWaterRainOrBubble();
    }
    @ZenCodeType.Method
    public static boolean isInvisible(Player player){
        return player.isInvisible();
    }
    @ZenCodeType.Method
    public static float experienceProgress(Player player){
        return player.experienceProgress;
    }
    @ZenCodeType.Method
    public static boolean isNoGravity(Player player){
        return player.isNoGravity();
    }
    @ZenCodeType.Method
    public static void setNoGravity(Player player, boolean type){
        player.setNoGravity(type);
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("xrot")
    public static float getxRot(Player player) {
        return player.xRotO;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("yrot")
    public static float getyRot(Player player){
        return player.yRotO;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("xrot")
    public static void setxRot(Player player, float rot) {
        player.xRotO = rot;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("yrot")
    public static void setyRot(Player player, float yaw){
        player.yRotO = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("headrot")
    public static float getyHeadRot(Player player){
        return player.yHeadRot;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("headrot")
    public static void setyHeadRot(Player player, float yaw){
        player.yHeadRot = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("bodyrot")
    public static float getyBodyRot(Player player){
        return player.yBodyRot;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("bodyrot")
    public static void setyBodyRot(Player player, float yaw){
        player.yBodyRot = yaw;
    }

    @ZenCodeType.Method
    public static boolean isOnPortalCooldown(Player player){
        return player.isOnPortalCooldown();
    }
    @ZenCodeType.Method
    public static void setPortalCooldown(Player player){
        player.setPortalCooldown();
    }
    @ZenCodeType.Method
    public static int getPortalWaitTime(Player player){
        return player.getPortalWaitTime();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("enderChest")
    public static MCEnderChestInventory getEnderChestInventory(Player player) {return MCEnderChestInventory.getForPlayer(player);}

    @ZenCodeType.Method
    public static BlockPos getRespawnPosition(Player player){
        BlockPos playerPos = new BlockPos(0, 0, 0);
        if(player instanceof ServerPlayer){
            ServerPlayer Splayer = (ServerPlayer) player;
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
    public static ResourceLocation getRespawnDimension(Player player){
        if(player instanceof ServerPlayer){
            ServerPlayer Splayer = (ServerPlayer) player;
            return Splayer.getRespawnDimension().registry();
        }
        return null;
    }
    @ZenCodeType.Method
    public static float getRespawnAngle(Player player){
        if(player instanceof ServerPlayer){
            ServerPlayer Splayer = (ServerPlayer) player;
            return Splayer.getRespawnAngle();
        }
        return -1.0f;
    }
    @ZenCodeType.Method
    public static long getLastActionTime(Player player){
        if(player instanceof ServerPlayer){
            ServerPlayer Splayer = (ServerPlayer) player;
            return Splayer.getLastActionTime();
        }
        return -1;
    }
    @ZenCodeType.Method
    public static boolean isRespawnForced(Player player){
        if(player instanceof ServerPlayer){
            ServerPlayer Splayer = (ServerPlayer) player;
            return Splayer.isRespawnForced();
        }
        return false;
    }

//    public static Map<BlockState, BlockPos> blocksAround(Player player){
//        ServerPlayer sPlayer = (ServerPlayer) player;
//        Level level = player.getLevel();
//        Map<BlockState, BlockPos> map = new HashMap<>();
//    }

//    private static Map<BlockState, BlockPos> arround(){
//        int x,y,z = 0;
//    }
//    @ZenCodeType.Method
//    public static void setRespawnPosition(Player player, ResourceLocation res, BlockPos pos, float respawnAngle, boolean respawnForced, boolean flag){
//        if(player instanceof ServerPlayer) {
//            ServerPlayer Splayer = (ServerPlayer) player;
//            Registry<Level> world = Registry.register(Registry.DIMENSION_REGISTRY, res);
//            Splayer.setRespawnPosition(world, pos, respawnAngle, respawnForced, flag);
//        } else return;
//    }
//    @ZenCodeType.Method
//    public static void changeDimension(Player player, ResourceLocation res){
//        if(player instanceof ServerPlayer) {
//            player.changeDimension(Objects.requireNonNull(Objects.requireNonNull(player.getServer()).getLevel(RegistryKey.create(Registry.DIMENSION_REGISTRY, res))));
//        }
//    }

    @ZenCodeType.Method
    public static void playerDropItemIndex(Player player, int i, boolean t){
        if(player.level.isClientSide()) return;
        player.drop(player.getInventory().getItem(i),t);
        player.getInventory().setItem(i, new ItemStack(Items.AIR));
    }

    @ZenCodeType.Method
    public static ClientPlayer getClient(Player player){
        if(player.getUUID() == Minecraft.getInstance().player.getUUID()){
            return ClientPlayer.getClient(player);
        }
        return null;
    }

    @ZenCodeType.Method
    public static MCStatisticsManager getStatisticsManager(Player player){
        if(player instanceof ServerPlayer sPlayer){
            return MCStatisticsManager.getPlayer(sPlayer);
        }
        else return null;
    }
}
