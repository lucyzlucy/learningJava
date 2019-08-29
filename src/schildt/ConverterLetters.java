package schildt;

import java.io.IOException;

public class ConverterLetters {
    public static void main(String[] args) throws IOException {
        char ch;
        int change = 0;
        System.out.println("Enter text: ");
        do {
            ch = (char) System.in.read();
            if ((ch > 64 && ch < 91) || (ch > 96 && ch < 123)) {
                change++;
                if (ch < 91) {
                    ch += 32;
                } else ch -= 32;
                System.out.println("Converted letter " + ch);
            }
        } while (ch != '.');
        System.out.println("Number of changes is " + change);

    }
}
