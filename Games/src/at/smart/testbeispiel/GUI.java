package at.smart.testbeispiel;

import java.util.Scanner;

public class GUI {
    public int getpace(){
        System.out.println("Bitte geben Sie eine Geschwindigkeit an:");

        Scanner sc= new Scanner(System.in);
        int inputpace= sc.nextInt();

        return inputpace;
    }
}
