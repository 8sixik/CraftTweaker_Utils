package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
>>>>>>> Stashed changes
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
<<<<<<< Updated upstream
=======
@Document("mods/sixikutils/utils/events/entity/living/LivingJumpEvent")
>>>>>>> Stashed changes
@NativeTypeRegistration(value = LivingEvent.LivingJumpEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.LivingJumpEvent")
public class ExpandLivingJumpEvent {

    @ZenCodeType.Method
    public static LivingEntity getEntity(LivingEvent.LivingJumpEvent event){
       return event.getEntity();
    }
}
