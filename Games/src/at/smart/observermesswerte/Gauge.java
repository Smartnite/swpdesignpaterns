package at.smart.observermesswerte;

import at.smart.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Gauge {

    private List<MeasurementObserver> observers;

    public Gauge() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(MeasurementObserver observer) {

        this.observers.add(observer);
    }

    public void alarm(int x, int y) {
        for (MeasurementObserver observer : this.observers) {
            observer.alarm (x, y );
        }
    }
}
