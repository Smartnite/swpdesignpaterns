package at.smart.testbeispiel;

import at.smart.observermesswerte.MeasurementObserver;

import java.util.ArrayList;
import java.util.List;

public class Measurement {
    private List<ModeObserver> observers;

    public Measurement() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(ModeObserver observer) {
        this.observers.add(observer);
    }

    public void rangeReached(int x) {

        for (ModeObserver observer : this.observers) {
            observer.rangeReached (x);
        }
    }
}
