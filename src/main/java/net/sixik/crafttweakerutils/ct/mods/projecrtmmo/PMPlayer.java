package net.sixik.crafttweakerutils.ct.mods.projecrtmmo;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import harmonised.pmmo.api.APIUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.fml.ModList;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;


@ZenRegister
@NativeTypeRegistration(value = PlayerEntity.class, zenCodeName = "crafttweaker.api.player.MCPlayerEntity")
public class PMPlayer {


    public static class PMPlayerm {
        @ZenCodeType.Method
        public static void addLevel(PlayerEntity player, String skillName, double amount, boolean skip, boolean ignoreBonuses) {
            APIUtils.addLevel(skillName, player.getUUID(), amount, null, skip, ignoreBonuses);
        }

        @ZenCodeType.Method
        public static void setLevel(PlayerEntity player, String skillName, double amount) {
            APIUtils.setLevel(skillName, (ServerPlayerEntity) player, amount);
        }

        @ZenCodeType.Method
        public static int getLevel(PlayerEntity player, String skillName) {
            return APIUtils.getLevel(skillName, player);
        }

        @ZenCodeType.Method
        public static void addXp(PlayerEntity player, String skillName, double amount, boolean skip, boolean ignoreBonuses) {
            APIUtils.addXp(skillName, player.getUUID(), amount, null, skip, ignoreBonuses);
        }

        @ZenCodeType.Method
        public static void addXp(PlayerEntity player, String skillName, double amount) {
            APIUtils.setXp(skillName, (ServerPlayerEntity) player, amount);
        }

        @ZenCodeType.Method
        public static void awardXpTrigger(PlayerEntity player, String triggerName, double amount, boolean skip, boolean ignoreBonuses) {
            APIUtils.awardXpTrigger(player.getUUID(), triggerName, null, skip, ignoreBonuses);
        }

        @ZenCodeType.Method
        public static double getPlayerXpBoost(PlayerEntity player, String skillName) {
            return APIUtils.getPlayerXpBoost(player, skillName);
        }

        @ZenCodeType.Method
        public static void setPlayerXpBoost(PlayerEntity player, String xpBoost, Map<String, Double> newXpBoost) {
            APIUtils.setPlayerXpBoost((ServerPlayerEntity) player, xpBoost, newXpBoost);
        }

        @ZenCodeType.Method
        public static Map<String, Double> getXpBoost(PlayerEntity player, String xpBoostKey) {
            return APIUtils.getXpBoostMap(player, xpBoostKey);
        }

        @ZenCodeType.Method
        public static Map<String, Map<String, Double>> getXpBoost(PlayerEntity player) {
            return APIUtils.getXpBoostsMap(player);
        }
    }

}
