package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.Map;

@ZenRegister
@Document("mods/sixikutils/utils/world/Container")
@NativeTypeRegistration(value = Container.class, zenCodeName = "crafttweaker.api.world.Container")
@ZenCodeType.Expansion("crafttweaker.api.world.Container")
public class ExpandContainer {

    @ZenCodeType.Method
    public static boolean SplitContainer(Container container, Container container2){
        if(!container.isEmpty()){
            Map<Integer, ItemStack> itemsContainer1 = new HashMap<>();
            for(int i = 0; i < container.getContainerSize(); i++){
                itemsContainer1.put(i,container.getItem(i));
                container.setChanged();
            }
            for(int i = 0; i < container2.getContainerSize(); i++){
                if(i > container.getContainerSize()) return true;
                container2.setItem(i,itemsContainer1.get(i));
                container2.setChanged();
            }
            return true;
        }
        return false;
    }

    @ZenCodeType.Method
    public static boolean SplitContainer(Container container, Container container2, boolean bool){
        if(!container.isEmpty()){
            Map<Integer, ItemStack> itemsContainer1 = new HashMap<>();
            for(int i = 0; i < container.getContainerSize(); i++){
                if(i > container.getContainerSize()) return true;
                itemsContainer1.put(i,container.getItem(i));
                if(bool){
                    container.setItem(i, Items.AIR.getDefaultInstance());
                    container.setChanged();
                }
            }
            for(int i = 0; i < container2.getContainerSize(); i++){
                container2.setItem(i,itemsContainer1.get(i));
                container2.setChanged();
            }
            return true;
        }
        return false;
    }
}
