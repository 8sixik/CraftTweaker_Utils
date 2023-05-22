package net.sixik.crafttweakerutils.source.events;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootParameters;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.eventbus.api.Event;

public class ChestLootedEvent extends Event {
    public PlayerEntity player;
    public LootContext ctx;
    public IInventory inventory;
    public BlockPos pos;

    public ChestLootedEvent(PlayerEntity player, LootContext ctx, IInventory inventory, BlockPos pos) {
        this.player = player;
        this.ctx = ctx;
        this.inventory = inventory;
        this.pos = pos;
    }

    public PlayerEntity getPlayer() {
        return player;
    }

    public BlockPos getPos() {
        return pos;
    }

    public IInventory getInventory() {
        return inventory;
    }
}
