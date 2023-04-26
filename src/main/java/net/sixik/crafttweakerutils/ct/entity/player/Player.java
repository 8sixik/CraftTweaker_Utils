package net.sixik.crafttweakerutils.ct.entity.player;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.world.storage.MapData;
import org.openzen.zencode.java.ZenCodeType;
import org.spongepowered.asm.mixin.Mutable;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotResult;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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
    public static IItemStack getCuriosItem(PlayerEntity inventory, int index){
        if(CuriosApi.getCuriosHelper().findCurios(inventory).size() == 0) return null;
        else {
            return new MCItemStack(CuriosApi.getCuriosHelper().findCurios(inventory).get(index).getStack());
        }
    }
    @ZenCodeType.Method
    public static int getCuriosItemSlot(PlayerEntity inventory, IItemStack item){
        for(int i = 0; i < CuriosApi.getCuriosHelper().findCurios(inventory).size(); i++){
            if(CuriosApi.getCuriosHelper().findCurios(inventory).get(i).getStack().equals(item.getInternal())){
                return i;
            }
        }
        return -1;
    }
    @ZenCodeType.Method
    public static boolean isCuriosEquip(PlayerEntity inventory, IItemStack item){
        for(int i = 0; i < CuriosApi.getCuriosHelper().findCurios(inventory).size(); i++){
            if(CuriosApi.getCuriosHelper().findCurios(inventory).get(i).getStack().equals(item.getInternal())){
                return true;
            }
        }
        return false;
    }
    @ZenCodeType.Method
    public static int getSlotsCount(PlayerEntity inventory){
        return CuriosApi.getCuriosHelper().findCurios(inventory).size();
    }
    @ZenCodeType.Method
    public static int getSlotsCount(PlayerEntity inventory, String slot){
        for(int i = 0; i < CuriosApi.getSlotHelper().getSlotTypes(inventory).size(); i++){
            if(CuriosApi.getSlotHelper().getSlotTypes(inventory).toArray()[i] == slot){
               return CuriosApi.getSlotHelper().getSlotType(slot).get().getSize();
            }
        }
        return -1;
    }
    @ZenCodeType.Method
    public static String[] getSlotsType(PlayerEntity inventory){
        List<String> curiosList = new ArrayList<>();
        String[] t = {};
        if(CuriosApi.getSlotHelper().getSlotTypes(inventory).isEmpty() || CuriosApi.getSlotHelper().getSlotTypes(inventory).size() == 0) return t;
        for(int i = 0; i < CuriosApi.getSlotHelper().getSlotTypes(inventory).size(); i++){
            curiosList.add((String) CuriosApi.getSlotHelper().getSlotTypes(inventory).toArray()[i]);
        }
        return (String[]) curiosList.toArray();
    }


}
