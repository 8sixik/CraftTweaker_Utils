package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.sixik.crafttweakersixikutils.source.events.LivingEntityTickEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
@NativeTypeRegistration(value = LivingEntityTickEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCLivingTickEvent")
=======
@Document("mods/sixikutils/utils/events/entity/living/LivingTickEvent")
@NativeTypeRegistration(value = LivingEntityTickEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.LivingTickEvent")
>>>>>>> Stashed changes
public class ExpandLivingTickEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("entityLiving")
    public static LivingEntity getEntity(LivingEntityTickEvent event){
        return event.getEntity();
    }
}
