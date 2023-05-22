package net.sixik.crafttweakerutils.source.events;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.raid.Raid;
import net.minecraftforge.eventbus.api.Event;
import net.sixik.crafttweakerutils.ct.misc.MCRaid;

import java.util.Map;

public class RaidEvent {

    public static class StartRaidEvent extends Event {

        ServerPlayerEntity player;
        Raid raid;
        DimensionType dimensionType;
        BlockPos blockpos;
        World world;
        Map<Integer, Raid> raidMap;
        public StartRaidEvent(ServerPlayerEntity player, Raid raid, DimensionType dimensionType, BlockPos blockpos, World world, Map<Integer, Raid> raidMap){
            this.player = player;
            this.raid = raid;
            this.dimensionType = dimensionType;
            this.blockpos = blockpos;
            this.world = world;
            this.raidMap =raidMap;

        }

        public MCRaid getRaid() {
            return MCRaid.getRaid(raid);
        }

        public BlockPos getBlockpos() {
            return blockpos;
        }

        public DimensionType getDimensionType() {
            return dimensionType;
        }

        public ServerPlayerEntity getPlayer() {
            return player;
        }

        public World getWorld() {
            return world;
        }

        public Map<Integer, Raid> getRaidMap() {
            return raidMap;
        }
    }

    public static class TickRaidEvent extends Event {
        Raid raid;
        World world;
        Map<Integer, Raid> raidMap;
        public TickRaidEvent(Raid raid, World world, Map<Integer, Raid> raidMap){
            this.raid = raid;
            this.world = world;
            this.raidMap =raidMap;
        }

        @Override
        public boolean isCancelable() {
            return false;
        }

        public MCRaid getRaid() {
            return new MCRaid(raid);
        }

        public World getWorld() {
            return world;
        }

        public Map<Integer, Raid> getRaidMap() {
            return raidMap;
        }
    }

    public static class StopRaidEvent extends Event{

        Raid raid;
        World world;
        Map<Integer, Raid> raidMap;
        public StopRaidEvent(Raid raid, World world, Map<Integer, Raid> raidMap){
            this.raid = raid;
            this.world = world;
            this.raidMap = raidMap;
        }

        @Override
        public boolean isCancelable() {
            return false;
        }

        public MCRaid getRaid() {
            return new MCRaid(raid);
        }

        public World getWorld() {
            return world;
        }

        public Map<Integer, Raid> getRaidMap() {
            return raidMap;
        }
    }

}
