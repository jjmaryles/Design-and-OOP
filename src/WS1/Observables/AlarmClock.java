package WS1.Observables;

import WS1.Observables.AlarmClockRecord;
import WS1.Observables.AlarmListener;

import java.util.ArrayList;

public class AlarmClock
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();

    protected AlarmClock() {}

    int counterTicks = 0 ;

    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }

    protected void tic()  {
        for(AlarmClockRecord record: itsAlarmClockRecords){
            if(record.remainingTime() - CLOCK_INTERVAL_MILLIS <= 0){
                record.getListener().wakeup();
                record.setRemainingTime(record.getInterval());
            }
            else
                record.decrementRemainingTime(CLOCK_INTERVAL_MILLIS);    }

        //TODO: fix
    }

    public void register(int interval, AlarmListener pal) {
        //TODO: fix

        itsAlarmClockRecords.add(new AlarmClockRecord(interval, pal));
    }
}


