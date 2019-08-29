package schildt;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("Help on:\n\t1.if\n\t2.switch\nChoose one: ");
        ch = (char) System.in.read();
        switch (ch+1){
            case '1':
                System.out.println("The if:\n\nif(condition) statement; \nelse statement;");
                break;
            case '2':
                System.out.println("The switch:\n\nswitch(expression) {\ncase constant:\n\tstatement sequence;\n\tbreak;\n // ... \n}");
                break;

            default:
                System.out.println("You entered wrong choice");
        }


    }
}
