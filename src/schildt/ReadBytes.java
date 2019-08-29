package schildt;
import java.io.*;

public class ReadBytes {
    public static void main(String[] args) throws IOException{

        byte data[] = new byte[10];

        System.out.println("Enter");
        System.in.read(data, 2, 2);
        System.out.println("You entered");
        for (var x:data) {
            System.out.print((char)x);
        }

    }
}
