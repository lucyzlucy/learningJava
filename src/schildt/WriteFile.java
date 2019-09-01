package schildt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream out = null;

        if (args.length != 1) {
            System.out.println("No file");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            out = new FileOutputStream("b.txt");
            do {
                i = fin.read();
                if (i != -1) {
                    out.write((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing");
            }
        }

    }
}

