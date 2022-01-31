package at.smart.testbeispiel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Economy e1 = new Economy();
        SuperSpar s1 = new SuperSpar();
        TopSpeed t1 = new TopSpeed();
        GUI speed = new GUI();

        int pace;

        pace = speed.getpace();

        MotorControll motorcontroller = new MotorControll(e1);

        if (pace > 50 && pace < 101){
            motorcontroller.setAlgorythm(t1);
            motorcontroller.driving();
        } else if (pace > 100){
            motorcontroller.setAlgorythm(s1);
            motorcontroller.driving();
        }
        else {
            motorcontroller.setAlgorythm(e1);
            motorcontroller.driving();
        }


    }
}
