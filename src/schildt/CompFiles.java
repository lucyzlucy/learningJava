package schildt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompFiles {


    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        if (args.length != 2) {
            System.out.println("No file/s");
            return;
        }
        try (var fin = new FileInputStream(args[0]); var fin2 = new FileInputStream(args[1])) {
            do {
                i = fin.read();
                j = fin2.read();
                if (i != j) {
                    System.out.println("Files differ");
                    return;
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("Files are the same");
    }
}



