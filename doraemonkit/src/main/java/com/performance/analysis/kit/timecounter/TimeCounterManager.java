package com.performance.analysis.kit.timecounter;

public class TimeCounterManager {
    private boolean mIsRunning;

    private static class Holder {
        private static TimeCounterManager INSTANCE = new TimeCounterManager();
    }

    public static TimeCounterManager get() {
        return TimeCounterManager.Holder.INSTANCE;
    }

    public void setOnTimeCounterListener(OnTimeCounterListener onTimeCounterListener) {
    }
}
