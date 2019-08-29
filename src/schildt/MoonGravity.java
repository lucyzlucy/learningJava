package schildt;

import java.util.Scanner;

public class MoonGravity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = s.nextDouble();
        double moonWeight = weight * 17 / 100;
        System.out.println("Your weight on Moon is " + moonWeight);

    }
}
