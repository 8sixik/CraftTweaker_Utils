package net.sixik.crafttweakerutils.ct.entity;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.LivingEntity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingEntity.class, zenCodeName = "crafttweaker.api.entity.MCLivingEntity")
public class MCLivingEntity {

    @ZenCodeType.Method
    public static boolean isFriendly(LivingEntity entity){
        return entity.getType().getCategory().isFriendly();
    }
    @ZenCodeType.Method
    public static boolean isPersistent(LivingEntity entity){
        return entity.getType().getCategory().isPersistent();
    }
    @ZenCodeType.Method
    public static int getDespawnDistance(LivingEntity entity){
        return entity.getType().getCategory().getDespawnDistance();
    }
    @ZenCodeType.Method
    public static int getNoDespawnDistance(LivingEntity entity){
        return entity.getType().getCategory().getNoDespawnDistance();
    }
    @ZenCodeType.Method
    public static int getMaxInstancesPerChunk(LivingEntity entity){
        return entity.getType().getCategory().getMaxInstancesPerChunk();
    }
    @ZenCodeType.Method
    public static int getArrowCount(LivingEntity entity){
        return entity.getArrowCount();
    }
    @ZenCodeType.Method
    public static int getArmorValue(LivingEntity entity){
        return entity.getArmorValue();
    }
}
