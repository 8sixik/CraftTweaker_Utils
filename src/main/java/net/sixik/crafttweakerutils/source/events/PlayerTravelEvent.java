package net.sixik.crafttweakerutils.source.events;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerTravelEvent extends PlayerEvent {

    Vector3d vector3d;
    public PlayerTravelEvent(PlayerEntity player, Vector3d vector3d) {
        super(player);
        this.vector3d = vector3d;
    }

    @Override
    public PlayerEntity getPlayer() {
        return super.getPlayer();
    }

    @Override
    public boolean isCancelable() {
        return false;
    }

    public Vector3d getVector3d() {
        return vector3d;
    }
}
