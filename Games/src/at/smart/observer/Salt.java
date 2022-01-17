package at.smart.observer;

public class Salt implements Observer{

    @Override
    public void alarm(int temperature) {
        System.out.println("Salt:" + temperature);
    }

    public void doSalting(){
        System.out.println("does Salting");
    }

    public double getSaltAmount(){
        var SaltAmount =12.0f;
        return SaltAmount;
    }
}
