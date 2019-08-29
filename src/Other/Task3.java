package Other;

public class Task3 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*500);
        int b = (int)(Math.random()*500);
        int c = (int)(Math.random()*500);

        if (a < b){
            if (a < c){
                System.out.println(a);
                if (b < c){
                    System.out.println(b);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(b);
                }
            }
            else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
        else if (b < c) {
            if (c < a) {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
            else {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }
        }
        else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
