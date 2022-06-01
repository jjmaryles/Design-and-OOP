package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {

    Random rnd = RandomSupplier.getRnd();

    public Nimbus1TemperatureSensor(String s, int n) {
        super(s, n);
        System.out.println("temperature registered to clock");
        //System.out.println(s + " was created");

        //(AlarmClock.theInstance()).register(700, () -> read());
    }

    public int read() {
        return rnd.nextInt(40);
    }


}
