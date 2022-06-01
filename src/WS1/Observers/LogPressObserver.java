package WS1.Observers;

public class LogPressObserver implements Observer {
    Log itsLog;

    LogPressObserver(Log log){
        System.out.println("LogPressObserver was created");
        System.out.println("LogPressObserver observes pressure");

        itsLog = log;
    }

    @Override
    public void update(int data) {
         itsLog.displayPressure(data);
    }
}
