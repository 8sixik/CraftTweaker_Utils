package net.sixik.crafttweakerutils.source.client.events;

import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.Event;

import java.util.Objects;

@OnlyIn(Dist.CLIENT)
public class ScreenEvent extends Event {

    private final Screen screen;

    public ScreenEvent(Screen screen)
    {
        this.screen = Objects.requireNonNull(screen);
    }

    public Screen getScreen()
    {
        return screen;
    }
}
