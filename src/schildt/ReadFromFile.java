package schildt;

import java.io.*;

public class ReadFromFile {


    public static void main(String[] args) {
        String str;
        try (BufferedReader br1 = new BufferedReader(new FileReader("test4.txt"))) {

            while ((str = br1.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}


