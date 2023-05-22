package net.sixik.crafttweakerutils.mixin;

import net.minecraft.inventory.IInventory;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootTable;
import net.sixik.crafttweakerutils.source.events.method.ChestGenLootMethod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LootTable.class})
public class ChestLootGenMixin {

    @Inject(
            method = {"fill"},
            at = {@At("TAIL")}
    )
    public void onLootGen(IInventory inventory, LootContext context, CallbackInfo ci) {
        try {
            ChestGenLootMethod.onLootGen(inventory, context);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }
}
