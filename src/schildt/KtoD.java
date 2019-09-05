package schildt;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text (stop to quit)");
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.println(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) {
                    break;
                }
            } while (str.compareTo("stop") != 0);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

    }


}
