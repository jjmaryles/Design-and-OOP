package WS1.Observers;

public class MSPressObserver  implements  Observer{
    MonitoringScreen itsMonitoringScreen;

    MSPressObserver(MonitoringScreen ms){
        System.out.println("MSPressObserver was created");
        System.out.println("MSPressObserver observes pressure");
        itsMonitoringScreen = ms;
    }


    @Override
    public void update(int data) {
        itsMonitoringScreen.displayPressure(data);
    }
}
