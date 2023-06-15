package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.levelgen.RandomState;

@ZenRegister
@Document("mods/sixikutils/utils/world/RandomState")
@NativeTypeRegistration(value = RandomState.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.RandomState")
public class ExpandRandomState {

}
