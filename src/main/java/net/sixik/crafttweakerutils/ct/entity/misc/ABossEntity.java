package net.sixik.crafttweakerutils.ct.entity.misc;
//
//import com.blamejared.crafttweaker.api.CraftTweakerAPI;
//import com.blamejared.crafttweaker.api.annotations.ZenRegister;
//import com.blamejared.crafttweaker.api.entity.CTEntityIngredient;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityType;
//import net.minecraft.world.storage.MapData;
//import org.openzen.zencode.java.ZenCodeType;
//
//import java.util.HashMap;
//@ZenCodeType.Name("mods.crafttweakerutils.api.entity.misc.ABossEntity")
//@ZenRegister
//public class ABossEntity {
//
//    private static EntityType[] BossEntity = {};
//    private static HashMap<EntityType, String> BossEntityStages = new HashMap<>();
//    private static HashMap<String, EntityType> BossStagesEntity = new HashMap<>();
//    private static HashMap<EntityType, MapData> BossEntityData = new HashMap<>();
//
//    @ZenCodeType.Method
//    public static void setBossEntitys(EntityType[] entity){
//        BossEntity = entity;
//    }
//    @ZenCodeType.Method
//    public static EntityType[] getBossEntities(){
//        return BossEntity;
//    }
//    @ZenCodeType.Method
//    public static EntityType getBossEntity(int i){
//        if(BossEntity.length == 0) return null;
//        else {
//            return BossEntity[i];
//        }
//    }
//    @ZenCodeType.Method
//    public static void setBossEntityData(EntityType entity, MapData data){
//        BossEntityData.put(entity, data);
//    }
//    @ZenCodeType.Method
//    public static HashMap<EntityType, MapData> getBossEntitiesData(){
//        if(BossEntityData.isEmpty()) return new HashMap<>();
//        else {
//            return BossEntityData;
//        }
//    }
//    @ZenCodeType.Method
//    public static MapData getBossEntityData(EntityType entity){
//        if(BossEntityData.isEmpty()) return new MapData("null");
//        else {
//            return BossEntityData.get(entity);
//        }
//    }
//    @ZenCodeType.Method
//    public static void setBossEntityStage(EntityType entity, String stage){
//        BossEntityStages.put(entity, stage);
//        BossStagesEntity.put(stage, entity);
//    }
//    @ZenCodeType.Method
//    public static HashMap<EntityType, String> getBossEntitiesStage(){
//        if(BossEntityStages.isEmpty()) return new HashMap<>();
//        else {
//            return BossEntityStages;
//        }
//    }
//    @ZenCodeType.Method
//    public static String getBossEntityStage(EntityType entity){
//        if(BossEntityStages.isEmpty()) return null;
//        else {
//            return BossEntityStages.get(entity);
//        }
//    }
//    @ZenCodeType.Method
//    public static HashMap<String, EntityType> getBossStageEntities(){
//        if(BossStagesEntity.isEmpty()) return new HashMap<>();
//        else {
//            return BossStagesEntity;
//        }
//    }
//    @ZenCodeType.Method
//    public static EntityType getBossStageEntity(String stage){
//        if(BossStagesEntity.isEmpty()) return null;
//        else {
//            return BossStagesEntity.get(stage);
//        }
//    }
//    @ZenCodeType.Method
//    public static boolean isEmpty(int type){
//        switch (type){
//            case 1:
//                if(BossEntity.length == 0) return true;
//                else return false;
//            case 2:
//                if(BossEntityStages.isEmpty()) return true;
//                else return false;
//            case 3:
//                if(BossStagesEntity.isEmpty()) return true;
//                else return false;
//            case 4:
//                if(BossEntityData.isEmpty()) return true;
//                else return false;
//            default:
//                CraftTweakerAPI.logInfo("There is no such type");
//                CraftTweakerAPI.logInfo("1 - BossEntity");
//                CraftTweakerAPI.logInfo("2 - BossEntityStages");
//                CraftTweakerAPI.logInfo("3 - BossStagesEntity");
//                CraftTweakerAPI.logInfo("4 - BossEntityData");
//                return false;
//        }
//    }
//}
