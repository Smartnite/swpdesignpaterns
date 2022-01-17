package at.smart.singleton;

public class Main {

    public static void main(String[] args) {

        SingeltonCounter sc = new SingeltonCounter();

        SingeltonCounter s1 = SingeltonCounter.getInstance();
        SingeltonCounter s2 = SingeltonCounter.getInstance();


        s1.increaseCounter();
        s2.increaseCounter();


        System.out.println(s1.getCounter());
        System.out.println(s2.getCounter());
    }

}
