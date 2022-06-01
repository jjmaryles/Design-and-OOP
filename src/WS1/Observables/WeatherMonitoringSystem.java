package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observers.MonitoringScreen;
import WS1.Observers.Observer;

public class WeatherMonitoringSystem {
    static WeatherMonitoringSystem instance;

    Sensor pressureSensor;
    Sensor tempSensor;
    PressureTrendSensor pressureTrendSensor;


    private WeatherMonitoringSystem()  {
        System.out.println("WeatherMonitoringSystem was created");
        Nimbus1Clock.theInstance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }


        pressureTrendSensor = new PressureTrendSensor();
        pressureSensor = new Nimbus1PressureSensor("",1100);
        tempSensor = new Nimbus1TemperatureSensor("",700);

        pressureSensor.addObserver(pressureTrendSensor);
        System.out.println("PressureTrendSensor observes pressure");


    };

    public static WeatherMonitoringSystem theInstance()
    {
        if(null==instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }

    public void addPressureObserver(Observer obs, String s){

        //System.out.println(s);
        pressureSensor.addObserver(obs);
    }

    public void addTemperatureObserver(Observer obs, String s){
        //System.out.println(s);
        tempSensor.addObserver(obs);
    }

    public void addPressureTrendObserver(Observer obs, String s){
        //System.out.println(s);
        pressureTrendSensor.addObserver(obs);
    }


}
