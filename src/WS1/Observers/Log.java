package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class Log {


    public Log(WeatherMonitoringSystem ws){
        System.out.println("Log was created");
        ws.addPressureObserver(new LogPressObserver(this),"");
        ws.addPressureTrendObserver(new LogPressTrendObserver(this),"");
    }

    void displayPressureTrend(String s){
        System.out.println("Log: pressure trend = "+s);
    }

    void displayPressure(int n ){
        System.out.println("Log: pressure = "+n+" millibars");
    }


}
