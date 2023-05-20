package net.sixik.crafttweakerutils.utils.timer;

public class TimerInfo {
    private final String uniqueID;
    private final int time;
    private boolean complete;

    public TimerInfo(String uniqueID, int time, boolean complete) {
        this.uniqueID = uniqueID;
        this.time = time;
        this.complete = complete;
    }

    public String getUniqueID() {
        return uniqueID;
    }
    public int getTime() {
        return this.time;
    }
    public void setComplete(boolean t){
        this.complete = t;
    }

    public boolean isComplete(){
        return this.complete;
    }
}
