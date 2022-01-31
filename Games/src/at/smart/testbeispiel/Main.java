package at.smart.testbeispiel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pace;

        Economy e1 = new Economy();
        SuperSpar s1 = new SuperSpar();
        TopSpeed t1 = new TopSpeed();
        GUI speed = new GUI();
        LightControlling l1 = new LightControlling();
        MotorControlling m1 = new MotorControlling();

        pace = speed.getpace();

        MotorControll motorcontroller = new MotorControll(e1);

        Measurement measurement = new Measurement();

        measurement.addObserver(l1);
        measurement.addObserver(m1);
        measurement.rangeReached(pace);

        /*if (pace > 50 && pace < 101){ //for TopSpeed mode
            motorcontroller.setAlgorythm(t1);
            motorcontroller.driving();
        } else if (pace > 100){ //for SuperSpar mode
            motorcontroller.setAlgorythm(s1);
            motorcontroller.driving();
        }
        else if (pace > 0 && pace < 51){ //for Economy Mode
            motorcontroller.setAlgorythm(e1);
            motorcontroller.driving();
        }
        else {
            System.out.println("Wrong Input"); //for negative pace
        }*/


    }
}
