package schildt;

import java.util.jar.JarOutputStream;

public class GalToLit {
    public static void main(String[] args) {
       double gallons, liters;
        for (int i = 1; i <= 100; i++) {
            gallons = i;
            liters = gallons * 3.7854;

            System.out.println(gallons + " gallons is " + liters + " liters.");

            if (gallons % 10 == 0){
                System.out.println();
            }
        }
    }
}
