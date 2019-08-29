package schildt;

import java.io.IOException;

public class Kbln {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("Enter text: ");
        ch = (char) System.in.read();
        System.out.println("Your key is " + ch );

    }
}
