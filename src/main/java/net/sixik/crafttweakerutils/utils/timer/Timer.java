package net.sixik.crafttweakerutils.utils.timer;

import com.blamejared.crafttweaker.api.actions.IRuntimeAction;
import net.minecraft.world.World;

public class Timer implements IRuntimeAction {
    private final String TimerID;
    private final int time;
    private final boolean complete;

    public Timer(String timerID, int time, boolean complete) {
        this.TimerID = timerID;
        this.time = time*20;
        this.complete = complete;
    }

    @Override
    public void apply() {
        AddTimer.INSTANCE.addTimerInfo(TimerID, time);
    }

    @Override
    public String describe() {
        return null;
    }
}
