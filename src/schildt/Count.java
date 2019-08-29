package schildt;

import java.io.IOException;

public class Count {
    public static void main(String[] args) throws IOException {
        char ch;
        int space = 0;
        System.out.println("Enter text: ");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') {
                space++;
            }
        } while (ch != '.');
        System.out.println("Number of spaces is " + space);

    }
}
