package schildt;

import java.util.Scanner;

public class Sound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your time: ");
        float time = s.nextFloat();
        double distance = time * 1100;
        System.out.println("Your distance from the lightning is " + distance + " feet.");
    }
}
