package net.sixik.crafttweakerutils.ct.curios.items;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

@ZenCodeType.Name("mods.crafttweakerutils.ct.curios.items.ACuriosItems")
@ZenRegister
public class ACuriosItems extends Item implements ICurioItem {

    public String eff;
    public boolean isFoil;

    public ACuriosItems(Properties properties, String effect, boolean foil)
    {
        super(properties);
        this.eff = effect;
        this.isFoil = foil;
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {

    }

    @Override
    public void onEquip(String identifier, int index, LivingEntity livingEntity, ItemStack stack){

    }

    @Override
    public boolean canUnequip(String identifier, LivingEntity livingEntity, ItemStack stack){
        return true;
    }
}
