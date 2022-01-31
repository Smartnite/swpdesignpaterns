package at.smart.observermesswerte;

public class Main {
    public static void main(String[] args) {

        BarChart b1 = new BarChart();
        BarChart b2 = new BarChart();
        LineChart l1 = new LineChart();
        LineChart l2 = new LineChart();
        TableChart t1 = new TableChart();
        TableChart t2 = new TableChart();


        Gauge gauge = new Gauge();

        gauge.addObserver(b1);
        gauge.addObserver(b2);
        gauge.addObserver(l1);
        gauge.addObserver(l2);
        gauge.addObserver(t1);
        gauge.addObserver(t2);

        gauge.alarm(1,2);
        gauge.alarm(3,4);

    }
}
