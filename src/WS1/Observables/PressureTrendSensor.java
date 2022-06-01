package WS1.Observables;

//import WS1.Nimbus1.Trend;
import WS1.Observers.Observer;

public class PressureTrendSensor extends  Observable  implements Observer {
    int lastReading1;
    int lastReading2;
    int lastReading3;
    int pressureState;
    String lastState;
    int times = -1;

    public String calc(){

        if( lastReading1 > lastReading2 && lastReading2 > lastReading3){
            return "RISING";
        }

        else if( lastReading1 < lastReading2 && lastReading2 < lastReading3){
            return "FALLING";
        }

        else {
            return "STABLE";
        }

    }

    public void check(){

        times++;

        if(times < 2){
            lastReading3 = lastReading2;
            lastReading2 = lastReading1;
            lastReading1 = pressureState;
            return;
        }
        else  {
            lastReading3 = lastReading2;
            lastReading2 = lastReading1;
            lastReading1 = pressureState;
        }

        String trend = calc();



//        if(trend != lastState) {

            switch (trend){
                case "RISING":
                    notifyObservers(0);
                    break;
                case "FALLING":
                    notifyObservers(1);
                    break;
                case "STABLE":
                    notifyObservers(2);
           // }

//            lastReading3 = lastReading2;
//            lastReading2 = lastReading1;
//            lastReading1 = pressureState;

        }

        lastState = trend;
    }

    public void update(int data){

        pressureState = data;
        check();
    }

}
