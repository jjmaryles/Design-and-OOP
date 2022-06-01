package WS1.Observables;

public abstract class Sensor extends  Observable{
    protected int lastReading = 0;
    protected int interval;
    protected String type;

    public Sensor(String s, int n) {
        //System.out.println(s + " was created");
        AlarmClock.theInstance().register(n,new SensorAlarmListener(this));
    }

    public abstract int read();

    public void check() {

        int temp = read();
        if (lastReading != temp) {
            lastReading = temp;
            notifyObservers(lastReading);
        }


    }
}
