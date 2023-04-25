package net.sixik.crafttweakerutils.ct.entity.player;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.storage.MapData;
import org.openzen.zencode.java.ZenCodeType;
import org.spongepowered.asm.mixin.Mutable;

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
    public static float getxRot(PlayerEntity player) {
       return player.xRot;
    }
    @ZenCodeType.Method
    public static float getyRot(PlayerEntity player){
        return player.yRot;
    }
    @ZenCodeType.Method
    public static void setxRot(PlayerEntity player, float rot) {
       player.xRot = rot;
    }
    @ZenCodeType.Method
    public static void setyRot(PlayerEntity player, float yaw){
        player.yRot = yaw;
    }
    @ZenCodeType.Method
    public static float getyHeadRot(PlayerEntity player){
        return player.yHeadRot;
    }
    @ZenCodeType.Method
    public static void setyHeadRot(PlayerEntity player, float yaw){
        player.yHeadRot = yaw;
    }
    @ZenCodeType.Method
    public static float getyBodyRot(PlayerEntity player){
        return player.yBodyRot;
    }
    @ZenCodeType.Method
    public static void setyBodyRot(PlayerEntity player, float yaw){
        player.yBodyRot = yaw;
    }
}
