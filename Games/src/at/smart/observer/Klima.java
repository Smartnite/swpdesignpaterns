package at.smart.observer;

public class Klima implements Observer{
    @Override
    public void alarm(int temperature) {
        System.out.println("Klimaanlage" + temperature);
    }
}
