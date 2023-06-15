package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Direction;
import net.minecraft.core.SectionPos;
import net.minecraft.core.Vec3i;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/SectionPos")
@NativeTypeRegistration(value = SectionPos.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.SectionPos")
public class ExpandSectionPos {

//    @ZenCodeType.Method
//    @ZenCodeType.Getter("pos")
//    public static int getPos(SectionPos internal, Direction.Axis axis){
//        return internal.get(axis);
//    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("x")
    public static int getX(SectionPos internal){
        return internal.getX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("y")
    public static int getY(SectionPos internal){
        return internal.getY();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("z")
    public static int getZ(SectionPos internal){
        return internal.getZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxX")
    public static int maxBlockX(SectionPos internal){
        return internal.maxBlockX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxY")
    public static int maxBlockY(SectionPos internal){
        return internal.maxBlockY();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxZ")
    public static int maxBlockZ(SectionPos internal){
        return internal.maxBlockZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minX")
    public static int minBlockX(SectionPos internal){
        return internal.minBlockX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minY")
    public static int minBlockY(SectionPos internal){
        return internal.minBlockY();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minZ")
    public static int minBlockZ(SectionPos internal){
        return internal.minBlockZ();
    }
    @ZenCodeType.Method
    public static Vec3i relative(SectionPos internal, Direction direction){
        return internal.relative(direction);
    }
    @ZenCodeType.Method
    public static Vec3i relative(SectionPos internal, Direction axis, int num){
        return internal.relative(axis, num);
    }
    @ZenCodeType.Method
    public static Vec3i relative(SectionPos internal, Direction.Axis axis, int num){
        return internal.relative(axis, num);
    }
}
