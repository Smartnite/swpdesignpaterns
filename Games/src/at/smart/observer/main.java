package at.smart.observer;

public class main {
    public static void main(String[] args) {
        Salt s1 = new Salt();
        Klima k1 = new Klima();
        Heating h1 = new Heating();
        SuperSalt sup1 = new SuperSalt();


        TemperaturSensor temps = new TemperaturSensor();
        temps.addObserver(s1);
        temps.addObserver(h1);
        temps.addObserver(k1);
        temps.addObserver(sup1);

        sup1.superFunction();


        temps.alarm();
    }
}
