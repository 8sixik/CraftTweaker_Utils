package net.sixik.crafttweakerutils.source.events;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.entity.player.PlayerEvent;

import java.util.List;


public class EatFoodEvent extends PlayerEvent {
    ItemStack food;

    public EatFoodEvent(PlayerEntity player, ItemStack foodItem) {
        super(player);
        food = foodItem;
    }

    @Override
    public boolean isCancelable() {
        return false;
    }

    public ItemStack getFood() {
        return food;
    }

    public boolean isFastFood(){
        return food.getItem().getFoodProperties().isFastFood();
    }
    public boolean canAlwaysEat(){
        return food.getItem().getFoodProperties().canAlwaysEat();
    }
    public boolean isMeat(){
        return food.getItem().getFoodProperties().isMeat();
    }
    public int getNutrition(){
        return food.getItem().getFoodProperties().getNutrition();
    }
    public float getSaturationModifier(){
        return food.getItem().getFoodProperties().getSaturationModifier();
    }
}
