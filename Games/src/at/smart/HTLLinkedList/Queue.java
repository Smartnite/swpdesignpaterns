package at.smart.HTLLinkedList;

import java.util.ArrayList;

public class Queue implements InterfaceQueue {

    private ArrayList<Integer> arrQueue = new ArrayList<Integer>();

    public void queue(int number) {
        arrQueue.add(number);
    }

    public int getValue() {
        return arrQueue.get(0);
    }

    public int unqueue() {
        int value = arrQueue.get(0);
        arrQueue.remove(0);
        return value;
    }

}
