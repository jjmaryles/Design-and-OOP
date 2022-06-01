package WS1.Observables;

import java.nio.channels.Selector;

public class AlarmClockRecord {

    int interval;
    int _remainingTime;

    AlarmListener itsAlarmListener;

    public AlarmClockRecord(int interval, AlarmListener pal) {
        _remainingTime = this.interval = interval;
        this.itsAlarmListener = pal;
    }

    public int remainingTime(){
        return _remainingTime;
    }


    public AlarmListener getListener() {
        return itsAlarmListener;
    }

    public void setRemainingTime(int time){
        _remainingTime = time;
    }

    public int getInterval() {
        return interval;
    }

    public void decrementRemainingTime(int clock_interval_millis) {
        _remainingTime-=clock_interval_millis;
    }
}
