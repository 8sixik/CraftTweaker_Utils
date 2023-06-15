package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.misc;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/entity/type/misc/PrimedTnt")
@NativeTypeRegistration(value = PrimedTnt.class, zenCodeName = "mods.crafttweakerutils.api.entity.type.misc.PrimedTnt")
public class ExpandPrimedTnt {

    @ZenCodeType.Method
    public static int getFuse(PrimedTnt internal){
        return internal.getFuse();
    }
    @ZenCodeType.Method
    public static LivingEntity getOwner(PrimedTnt internal){
        return internal.getOwner();
    }
}
