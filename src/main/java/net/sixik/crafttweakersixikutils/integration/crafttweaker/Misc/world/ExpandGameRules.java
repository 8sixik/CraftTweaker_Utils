package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import com.blamejared.crafttweaker_annotations.annotations.Document;
//import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
//import com.google.common.collect.BiMap;
//import com.google.common.collect.HashBiMap;
//import net.minecraft.Util;
//import net.minecraft.world.level.GameRules;
//import org.openzen.zencode.java.ZenCodeType;
//
//import java.util.Locale;
//import java.util.Optional;
//
//@ZenRegister
//@Document("mods/sixikutils/utils/world/GameRules")
//@NativeTypeRegistration(value = GameRules.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.GameRules")
//public class ExpandGameRules {
//
//    public static final BiMap<String, GameRules.Key<?>> GAME_RULES = Util.make(HashBiMap.create(), (map) -> {
//        map.put("DOFIRETICK", GameRules.RULE_DOFIRETICK);
//        map.put("MOBGRIEFING", GameRules.RULE_MOBGRIEFING);
//        map.put("KEEPINVENTORY", GameRules.RULE_KEEPINVENTORY);
//        map.put("DOMOBSPAWNING", GameRules.RULE_DOMOBSPAWNING);
//        map.put("DOMOBLOOT", GameRules.RULE_DOMOBLOOT);
//        map.put("DOBLOCKDROPS", GameRules.RULE_DOBLOCKDROPS);
//        map.put("DOENTITYDROPS", GameRules.RULE_DOENTITYDROPS);
//        map.put("COMMANDBLOCKOUTPUT", GameRules.RULE_COMMANDBLOCKOUTPUT);
//        map.put("NATURAL_REGENERATION", GameRules.RULE_NATURAL_REGENERATION);
//        map.put("DAYLIGHT", GameRules.RULE_DAYLIGHT);
//        map.put("LOGADMINCOMMANDS", GameRules.RULE_LOGADMINCOMMANDS);
//        map.put("SHOWDEATHMESSAGES", GameRules.RULE_SHOWDEATHMESSAGES);
//        //map.put("RANDOMTICKING", GameRules.RULE_RANDOMTICKING);
//        map.put("SENDCOMMANDFEEDBACK", GameRules.RULE_SENDCOMMANDFEEDBACK);
//        map.put("REDUCEDDEBUGINFO", GameRules.RULE_REDUCEDDEBUGINFO);
//        map.put("SPECTATORSGENERATECHUNKS", GameRules.RULE_SPECTATORSGENERATECHUNKS);
//        //map.put("SPAWN_RADIUS", GameRules.RULE_SPAWN_RADIUS);
//        map.put("DISABLE_ELYTRA_MOVEMENT_CHECK", GameRules.RULE_DISABLE_ELYTRA_MOVEMENT_CHECK);
//        //map.put("MAX_ENTITY_CRAMMING", GameRules.RULE_MAX_ENTITY_CRAMMING);
//        map.put("WEATHER_CYCLE", GameRules.RULE_WEATHER_CYCLE);
//        map.put("LIMITED_CRAFTING", GameRules.RULE_LIMITED_CRAFTING);
//        //map.put("MAX_COMMAND_CHAIN_LENGTH", GameRules.RULE_MAX_COMMAND_CHAIN_LENGTH);
//        map.put("ANNOUNCE_ADVANCEMENTS", GameRules.RULE_ANNOUNCE_ADVANCEMENTS);
//        map.put("DISABLE_RAIDS", GameRules.RULE_DISABLE_RAIDS);
//        map.put("DOINSOMNIA", GameRules.RULE_DOINSOMNIA);
//        map.put("DO_IMMEDIATE_RESPAWN", GameRules.RULE_DO_IMMEDIATE_RESPAWN);
//        map.put("DROWNING_DAMAGE", GameRules.RULE_DROWNING_DAMAGE);
//        map.put("FALL_DAMAGE", GameRules.RULE_FALL_DAMAGE);
//        map.put("FIRE_DAMAGE", GameRules.RULE_FIRE_DAMAGE);
//        map.put("FREEZE_DAMAGE", GameRules.RULE_FREEZE_DAMAGE);
//        map.put("DO_PATROL_SPAWNING", GameRules.RULE_DO_PATROL_SPAWNING);
//        map.put("DO_TRADER_SPAWNING", GameRules.RULE_DO_TRADER_SPAWNING);
//        map.put("DO_WARDEN_SPAWNING", GameRules.RULE_DO_WARDEN_SPAWNING);
//        map.put("FORGIVE_DEAD_PLAYERS", GameRules.RULE_FORGIVE_DEAD_PLAYERS);
//        map.put("UNIVERSAL_ANGER", GameRules.RULE_UNIVERSAL_ANGER);
//        //map.put("PLAYERS_SLEEPING_PERCENTAGE", GameRules.RULE_PLAYERS_SLEEPING_PERCENTAGE);
//    });

//    public static Optional<GameRules.Key<GameRules.BooleanValue>> getOptionalStatus(String tokens) {
//        return Optional.ofNullable(GAME_RULES.get(tokens));
//    }
//
//    @ZenCodeType.Method
//    public static GameRules.BooleanValue getRule(GameRules internal, GameRules.Key<GameRules.BooleanValue> key){
//       return internal.getRule(key);
//    }
//    @ZenCodeType.Method
//    public static boolean getBoolean(GameRules internal, GameRules.Key<GameRules.BooleanValue> key){
//       return internal.getBoolean(key);
//    }
//    @ZenCodeType.Method
//    public static int getInt(GameRules internal, GameRules.Key<?> key){
//       return internal.getInt((GameRules.Key<GameRules.IntegerValue>) key);
//    }
//
//    @ZenCodeType.Method
//    @ZenCodeType.Getter("commandString")
//    public static String getCommandString(GameRules.Key<?> internal) {
//        BiMap<GameRules.Key<?>, String> inverse = GAME_RULES.inverse();
//        String name = inverse.getOrDefault(internal, "UNKNOWN");
//        return "<gamerule:" + name.toLowerCase(Locale.ROOT) + ">";
//    }
//}
