package schildt;

import java.io.IOException;

public class HelpClassDemo {


    public static void main(String[] args) throws IOException {
        char ch, ignore;
        Help4 help = new Help4();
        for (; ; ) {
            do {
                help.showMenu();
                ch = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (help.isInvalid(ch));
            if (ch == 'q') break;
            System.out.println();
            help.helpOn(ch);
            System.out.println();
        }
    }
}

