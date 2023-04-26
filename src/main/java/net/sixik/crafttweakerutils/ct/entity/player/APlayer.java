package net.sixik.crafttweakerutils.ct.entity.player;


import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.sixik.crafttweakerutils.CraftTweakerUtils;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.CuriosCapability;

@ZenCodeType.Name("mods.crafttweakerutils.APlayer")
@ZenRegister
public class APlayer extends PlayerEntity {

    public APlayer(World p_i241920_1_, BlockPos p_i241920_2_, float p_i241920_3_, GameProfile p_i241920_4_) {
        super(p_i241920_1_, p_i241920_2_, p_i241920_3_, p_i241920_4_);
    }

    @ZenCodeType.Method
    public static void playerDropItemIndex(PlayerEntity player, int i, boolean t){
        if(player.level.isClientSide()) return;
        player.drop(player.inventory.getItem(i), t);
        player.setSlot(i, new ItemStack(Items.AIR));
    }
    @ZenCodeType.Method
    public static void setFlyPlayer(PlayerEntity player){
        if(player.level.isClientSide) return;
        World world = player.level;
        if(world instanceof ServerWorld){
            ServerWorld server = (ServerWorld) world;
            ServerPlayerEntity playerS = (ServerPlayerEntity) player;
            if(!player.isFallFlying()){
                player.startFallFlying();
                player.getPersistentData().putBoolean(CraftTweakerUtils.MOD_ID + "isflying", true);
            }
        }
    }

    public static int getCurios(PlayerEntity player){
        return CuriosCapability.INVENTORY.getDefaultInstance().getSlots();
//        CuriosApi.getSlotHelper().getSlotType().get().getIdentifier();
    }


    @Override
    public boolean isSpectator() {
        return false;
    }

    @Override
    public boolean isCreative() {
        return false;
    }
}
