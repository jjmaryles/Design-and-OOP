package WS1.Observers;

public class LogPressTrendObserver implements Observer {
    Log itsLog;

    LogPressTrendObserver(Log log) {
        System.out.println("LogPressTrendObserver was created");
        System.out.println("LogPressTrendObserver observes pressure trend");
        itsLog = log;
    }


    @Override
    public void update(int data) {

        switch (data) {
            case 0:
                itsLog.displayPressureTrend("RISING");
                break;
            case 1:
                itsLog.displayPressureTrend("FALLING");
                break;
            case 2:
                itsLog.displayPressureTrend("STABLE");
                break;
        }
    }
}
