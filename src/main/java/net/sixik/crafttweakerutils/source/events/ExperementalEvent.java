package net.sixik.crafttweakerutils.source.events;

import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class ExperementalEvent extends PlayerEvent {
    private MenuProvider menuProvider;
    public ExperementalEvent(Player player, MenuProvider menuProvider) {
        super(player);
        this.menuProvider = menuProvider;
    }

    @Override
    public Player getEntity() {
        return super.getPlayer();
    }

    public MenuProvider getMenuProvider() {
        return menuProvider;
    }
}
