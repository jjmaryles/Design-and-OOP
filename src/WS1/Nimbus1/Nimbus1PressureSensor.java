package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor {

    Random rnd = RandomSupplier.getRnd();

    public Nimbus1PressureSensor(String s, int n){
        super(s, n);
        System.out.println("pressure registered to clock");
        //System.out.println(s+" was created");

        //(AlarmClock.theInstance()).register(1100,()->read());
    }

    public int read(){

        return rnd.nextInt(1050  - 950) + 950;
    }


}
