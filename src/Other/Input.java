package Other;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s;

        do {
            s = new Scanner(System.in);
            System.out.println("Enter something: ");
            if (!s.hasNextInt()) {
                System.out.println("Try again");
            }
        }
        while (!s.hasNextInt());

        int string = s.nextInt();
        System.out.println("You entered " + string);

    }
}
