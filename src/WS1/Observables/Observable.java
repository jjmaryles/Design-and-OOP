package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<Observer> itsObservers = new ArrayList<>();

    public void notifyObservers(int data){
        for (Observer observer: itsObservers)
        {
            observer.update( data);
        }
    }

    public void addObserver(Observer obs){
        itsObservers.add(obs);
    }

    public void removeObserver(Observer obs){
        itsObservers.remove(obs);
    }

}
