package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
<<<<<<< Updated upstream
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;

=======
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.Entity;

import net.minecraft.world.entity.EntityType;
>>>>>>> Stashed changes
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.Map;
@ZenRegister
<<<<<<< Updated upstream
@NativeTypeRegistration(value = Entity.class, zenCodeName = "crafttweaker.api.entity.Entity")
public class ExpandEntity {

    @ZenCodeType.Method
    public static Map<BlockState, BlockPos> getBlocksAround(Entity entity, int size) {
=======
@Document("mods/sixikutils/utils/entity/Entity")
@NativeTypeRegistration(value = Entity.class, zenCodeName = "crafttweaker.api.entity.Entity")
@ZenCodeType.Expansion("crafttweaker.api.entity.Entity")
public class ExpandEntity {

    @ZenCodeType.Method
    public static Map<BlockPos,BlockState> getBlocksAround(Entity entity, int size) {
>>>>>>> Stashed changes
        Level level = entity.getLevel();
        return getBlocks(entity);
    }

<<<<<<< Updated upstream
    private static Map<BlockState, BlockPos> getBlocks(Entity player) {
        Map<BlockState, BlockPos> map = new HashMap<>();
=======
    @ZenCodeType.Method
    public static int getLeftBlocksToUp(Entity player) {
        return player.level.getMaxBuildHeight() - (int) player.getY();
    }

    private static Map<BlockPos,BlockState> getBlocks(Entity player) {
        Map<BlockPos,BlockState> map = new HashMap<>();
>>>>>>> Stashed changes
        Vec3 pos = player.position();
        int Zone = 10;
        int ZoneY = 6;
        int posX1 = (int) (pos.x - Zone);
        int posY1 = (int) pos.y - ZoneY;
        int posZ1 = (int) pos.z - Zone;
        int posX2 = (int) pos.x + Zone;
        int posY2 = (int) pos.y + ZoneY;
        int posZ2 = (int) pos.z + Zone;
        int privateX = posX1;
        int privateZ = posZ1;
        int privateY = posY1;
        //var newPos as BlockPos = new BlockPos(pos.getX(), 0, pos.getZ());

        while (privateX <= posX2) {
            while (privateY <= posY2) {
                while (privateZ <= posZ2) {
                    BlockPos blockPos = new BlockPos(privateX, privateY, privateZ);
                    if (player.level.getBlockState(blockPos).getBlock().asItem() != Items.AIR) {
<<<<<<< Updated upstream
                        map.put(player.level.getBlockState(blockPos), blockPos);
=======
                        map.put(blockPos, player.level.getBlockState(blockPos));
>>>>>>> Stashed changes
                    }
                    privateZ++;
                }
                privateY++;
                privateZ = posZ1;
            }
            privateX++;
            privateY = posY1;
        }
        return map;
    }
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
}
