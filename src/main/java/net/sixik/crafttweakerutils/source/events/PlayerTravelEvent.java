package net.sixik.crafttweakerutils.source.events;

import com.mojang.math.Vector3d;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerTravelEvent extends PlayerEvent {

    Vec3 vector3d;
    public PlayerTravelEvent(Player player, Vec3 vector3d) {
        super(player);
        this.vector3d = vector3d;
    }

    @Override
    public Player getEntity() {
        return super.getPlayer();
    }

    @Override
    public boolean isCancelable() {
        return false;
    }

    public Vec3 getVector3d() {
        return vector3d;
    }
}