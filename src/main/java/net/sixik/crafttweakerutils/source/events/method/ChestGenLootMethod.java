package net.sixik.crafttweakerutils.source.events.method;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootParameters;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakerutils.source.events.ChestLootedEvent;

import java.util.Objects;

public class ChestGenLootMethod {

    public static void onLootGen(IInventory inventory, LootContext context){
        try {

            if(context.hasParam(LootParameters.THIS_ENTITY) && context.hasParam(LootParameters.ORIGIN)
                    && context.getParamOrNull(LootParameters.THIS_ENTITY) instanceof PlayerEntity){
                TileEntity chest = null;
                BlockPos pos = new BlockPos((Vector3d) Objects.requireNonNull(context.getParamOrNull(LootParameters.ORIGIN)));
                PlayerEntity player = (PlayerEntity)context.getParamOrNull(LootParameters.THIS_ENTITY);
                World world = player.level;
                if(inventory instanceof TileEntity){
                    chest = (TileEntity) inventory;
                }

                if(world == null){
                    return;
                }

                if(chest instanceof LockableLootTileEntity){
                    MinecraftForge.EVENT_BUS.post(new ChestLootedEvent(player, context, inventory, pos));
                }
            }

        } catch (Exception var6){
            var6.printStackTrace();
        }
    }
}
