package at.smart.observer;

public class Heating implements Observer{
    @Override
    public void alarm(int temperature) {
        System.out.println("heating" + temperature);
    }
}
