package WS1.Observables;

public class SensorAlarmListener implements AlarmListener {

    Sensor itsSensor;
    SensorAlarmListener(Sensor s){
        itsSensor = s;
    }

    @Override
    public void wakeup() {
        itsSensor.check();
    }
}
