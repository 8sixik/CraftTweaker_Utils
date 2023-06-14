package net.sixik.crafttweakerutils.source.events;

import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.eventbus.api.Event;

public class ChestLootedEvent extends Event {
    public Player player;
    public LootContext ctx;
    public Container inventory;
    public BlockPos pos;

    public ChestLootedEvent(Player player, LootContext ctx, Container inventory, BlockPos pos) {
        this.player = player;
        this.ctx = ctx;
        this.inventory = inventory;
        this.pos = pos;
    }

    public Player getPlayer() {
        return player;
    }

    public BlockPos getPos() {
        return pos;
    }

    public Container getInventory() {
        return inventory;
    }
}
