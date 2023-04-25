package net.sixik.crafttweakerutils.ct.entity.player;


import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import mezz.jei.config.IClientConfig;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent;
import net.sixik.crafttweakerutils.CraftTweakerUtils;
import net.sixik.crafttweakerutils.ct.entity.player.inventory.AInvenory;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.type.ISlotType;

@ZenCodeType.Name("mods.crafttweakerutils.APlayer")
@ZenRegister
public class APlayer extends AInvenory {
    private net.sixik.crafttweakerutils.ct.entity.player.inventory.AInvenory AInvenory;
    public final AInvenory invenory = AInvenory;

    @ZenCodeType.Method
    @ZenCodeType.Getter("inventoryHelper")
    public static AInvenory getInventoryHelper(AInvenory internal){
        return internal;
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



}
