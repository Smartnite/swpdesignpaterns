package at.smart.observermesswerte;

public class TableChart implements MeasurementObserver {
    @Override
    public void alarm(int x, int y) {
        System.out.println(x + " " + y + " Alarm");
    }
}
