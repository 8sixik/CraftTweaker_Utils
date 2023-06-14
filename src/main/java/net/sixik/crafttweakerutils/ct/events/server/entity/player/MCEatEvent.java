package net.sixik.crafttweakerutils.ct.events.server.entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.sixik.crafttweakerutils.source.events.EatFoodEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = EatFoodEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.MCEatFoodEvent")
public class MCEatEvent{


    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(EatFoodEvent event){
        return new MCItemStack(event.getFood());
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(EatFoodEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(EatFoodEvent event){
        return event.isCancelable();
    }
    @ZenCodeType.Method
    public static boolean isFastFood(EatFoodEvent event){return event.isFastFood();}
    @ZenCodeType.Method
    public static boolean canAlwaysEat(EatFoodEvent event){return event.canAlwaysEat();}
    @ZenCodeType.Method
    public static boolean isMeat(EatFoodEvent event){return event.isMeat();}
    @ZenCodeType.Method
    @ZenCodeType.Getter("nutrition")
    public static int getNutrition(EatFoodEvent event){return event.getNutrition();}
    @ZenCodeType.Method
    @ZenCodeType.Getter("saturation")
    public static float getSaturationModifier(EatFoodEvent event){return event.getSaturationModifier();}
}