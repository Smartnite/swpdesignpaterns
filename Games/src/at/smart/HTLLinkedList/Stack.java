package at.smart.HTLLinkedList;

import java.util.ArrayList;

public class Stack implements InterfaceStack {

    private ArrayList<Integer> arrStack = new ArrayList<Integer>();

    public void push(int number) {
        arrStack.add(number);
    }

    public int peekValue() {
        int StackSize = arrStack.size();
        return arrStack.get(StackSize - 1);
    }

    public void pop() {
        int StackSize = arrStack.size();
        int lastValue = arrStack.get(StackSize - 1);
        arrStack.remove(StackSize - 1);
        System.out.println("Last Value is " + lastValue);
    }
}

