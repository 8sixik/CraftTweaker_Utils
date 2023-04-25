package net.sixik.crafttweakerutils.ct.world;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import org.openzen.zencode.java.ZenCodeType;

import java.util.UUID;

@ZenRegister
@NativeTypeRegistration(value = ServerWorld.class, zenCodeName = "crafttweaker.api.world.MCServerWorld")
public class AServerWorld {

    @ZenCodeType.Method
    public static BlockPos getRandomPos(ServerWorld world, int[] t){
        if(t == null) return null;
        return world.getBlockRandomPos(t[0], t[1], t[2], t[3]);
    }
    @ZenCodeType.Method
    public static int getMaxLocalRawBrightness(ServerWorld world, BlockPos pos){
        return world.getMaxLocalRawBrightness(pos);
    }
    @ZenCodeType.Method
    public static int getMaxBuildHeight(ServerWorld world){
        return world.getMaxBuildHeight();
    }
    @ZenCodeType.Method
    public static int getMaxLightLevel(ServerWorld world){
        return world.getMaxLightLevel();
    }
    @ZenCodeType.Method
    public static int getMoonPhase(ServerWorld world){
        return world.getMoonPhase();
    }
    @ZenCodeType.Method
    public static float getMoonBrightness(ServerWorld world){
        return world.getMoonBrightness();
    }
    @ZenCodeType.Method
    public static int getHeight(ServerWorld world){
        return world.getHeight();
    }
    @ZenCodeType.Method
    public static int getSeaLevel(ServerWorld world){
        return world.getSeaLevel();
    }
    @ZenCodeType.Method
    public static ServerPlayerEntity getRandomPlayer(ServerWorld world){
        return world.getRandomPlayer();
    }
    @ZenCodeType.Method
    public static void createOrExtendRaid(ServerWorld world, ServerPlayerEntity player){
        world.getRaids().createOrExtendRaid(player);
    }
    @ZenCodeType.Method
    public static double getMaxEntityRadius(ServerWorld world){
        return world.getMaxEntityRadius();
    }
    @ZenCodeType.Method
    public static String getDifficultyString(ServerWorld world){
        return world.getDifficulty().getDisplayName().toString();
    }
    @ZenCodeType.Method
    public static int getDifficultyIndex(ServerWorld world){
        return world.getDifficulty().getId();
    }
    @ZenCodeType.Method
    public static String getDifficultyKey(ServerWorld world){
        return world.getDifficulty().getKey();
    }
    @ZenCodeType.Method
    public static String getGameRulesString(ServerWorld world){
        return world.getGameRules().toString();
    }
    @ZenCodeType.Method
    public static void setWorldBorderSize(ServerWorld world, double size){
        world.getWorldBorder().setSize(size);
    }
    @ZenCodeType.Method
    public static double getWorldBorderSize(ServerWorld world){
        return world.getWorldBorder().getSize();
    }
    @ZenCodeType.Method
    public static double getDistanceToWorldBorder(ServerWorld world, Entity entity){
        return world.getWorldBorder().getDistanceToBorder(entity);
    }
    @ZenCodeType.Method
    public static void setAbsoluteMaxWorldBorderSize(ServerWorld world, int size){
        world.getWorldBorder().setAbsoluteMaxSize(size);
    }
    @ZenCodeType.Method
    public static int getAbsoluteMaxWorldBorderSize(ServerWorld world){
        return world.getWorldBorder().getAbsoluteMaxSize();
    }
    @ZenCodeType.Method
    public static void setWorldBorderCenter(ServerWorld world, double x, double z){
        world.getWorldBorder().setCenter(x, z);
    }
    @ZenCodeType.Method
    public static double getWorldBorderCenterX(ServerWorld world){
       return world.getWorldBorder().getCenterX();
    }
    @ZenCodeType.Method
    public static double getWorldBorderCenterZ(ServerWorld world){
       return world.getWorldBorder().getCenterZ();
    }
    @ZenCodeType.Method
    public static void setDamagePerBlock(ServerWorld world, double damage){
        world.getWorldBorder().setDamagePerBlock(damage);
    }
    @ZenCodeType.Method
    public static double getDamagePerBlock(ServerWorld world){
        return world.getWorldBorder().getDamagePerBlock();
    }
    @ZenCodeType.Method
    public static void setWarningBlocks(ServerWorld world, int warn){
        world.getWorldBorder().setWarningBlocks(warn);
    }
    @ZenCodeType.Method
    public static int getWarningBlocks(ServerWorld world){
        return world.getWorldBorder().getWarningBlocks();
    }
    @ZenCodeType.Method
    public static void setDamageSafeZone(ServerWorld world, double damage){
        world.getWorldBorder().setDamageSafeZone(damage);
    }
    @ZenCodeType.Method
    public static double getDamageSafeZone(ServerWorld world){
        return world.getWorldBorder().getDamageSafeZone();
    }
    @ZenCodeType.Method
    public static void setWarningTime(ServerWorld world, int time){
        world.getWorldBorder().setWarningTime(time);
    }
    @ZenCodeType.Method
    public static int getWarningTime(ServerWorld world){
        return world.getWorldBorder().getWarningTime();
    }
    @ZenCodeType.Method
    public static Entity getEntity(ServerWorld world, String id){
        return world.getEntity(UUID.fromString(id));
    }
    @ZenCodeType.Method
    public static Entity getEntity(ServerWorld world, int id){
        return world.getEntity(id);
    }
    @ZenCodeType.Method
    public static int getChunkMaxBlockX(ServerWorld world, BlockPos pos){
        return world.getChunk(pos).getPos().getMaxBlockX();
    }
    @ZenCodeType.Method
    public static int getChunkMaxBlockZ(ServerWorld world, BlockPos pos){
        return world.getChunk(pos).getPos().getMaxBlockZ();
    }
    @ZenCodeType.Method
    public static int getChunkMinBlockX(ServerWorld world, BlockPos pos){
        return world.getChunk(pos).getPos().getMinBlockX();
    }
    @ZenCodeType.Method
    public static int getChunkMinBlockZ(ServerWorld world, BlockPos pos){
        return world.getChunk(pos).getPos().getMinBlockZ();
    }

//    public static void getGameRule(ServerWorld world, boolean t, int type){
//        GameRules rule = world.getGameRules();
//        rule.getRule()
//        switch (type){
//            case 1:
//                rule.getRule(GameRules.RULE_DOENTITYDROPS).set(t, world.getServer());
//                return;
//            default:
//                CraftTweakerAPI.logInfo("Нету такого типа");
//                return;
//        }
//    }


}
