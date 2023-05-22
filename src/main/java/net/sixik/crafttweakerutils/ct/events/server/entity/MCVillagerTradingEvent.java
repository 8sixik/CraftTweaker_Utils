package net.sixik.crafttweakerutils.ct.events.server.entity;


import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.impl.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.villager.VillagerType;
import net.sixik.crafttweakerutils.source.events.VillagerTradingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = VillagerTradingEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCVillagerTradingEvent")
public class MCVillagerTradingEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(VillagerTradingEvent event){
        return new MCItemStack(event.getItemStack());
    }
    @ZenCodeType.Method
    public static VillagerType getType(VillagerTradingEvent event){
        return event.getType();
    }
    @ZenCodeType.Method
    public static VillagerProfession getProfession(VillagerTradingEvent event){
        return event.getProfession();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("lastPlayer")
    public static PlayerEntity getLastPlayer(VillagerTradingEvent event){
        return event.getLastPlayer();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static PlayerEntity getPlayer(VillagerTradingEvent event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    public static boolean isCancelable(VillagerTradingEvent event){
        return event.isCancelable();
    }


}
