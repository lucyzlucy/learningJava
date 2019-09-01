package schildt;


import javax.imageio.IIOException;
import java.io.IOException;

public class MainExceptions {

    public static void main(String[] args) {

        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            try {
                System.out.println("a");
                throw new BB();

            } catch (BB exc) {
                System.out.println("Inner");
                throw new AA();

            }
        } catch (AA exc) {
            System.out.println("Outer");
        }


    }
}

class AA extends Exception {
}

class BB extends AA {


}

class BBB {


}