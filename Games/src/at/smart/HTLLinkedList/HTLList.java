package at.smart.HTLLinkedList;

public class HTLList {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Queue queue1 = new Queue();
        InterfaceQueue int1 = new Queue();
        int1.queue(12);
        System.out.println(int1.getValue());
        int1.unqueue();

        InterfaceStack int2 = new Stack();

        int2.push(12);
        System.out.println(int2.peekValue());
        int2.pop();
    }
}
