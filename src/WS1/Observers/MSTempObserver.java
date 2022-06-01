package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class MSTempObserver implements  Observer {

    MonitoringScreen itsMonitoringScreen;

    MSTempObserver(MonitoringScreen ms){

        System.out.println("MSTempObserver was created");
        System.out.println("MSTempObserver observes temperature");
        itsMonitoringScreen = ms;
    }

    @Override
    public void update(int data) {
        itsMonitoringScreen.displayTemperature(data);
    }
}
