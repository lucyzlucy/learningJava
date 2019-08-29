package Other;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 155;
        int c = (int) (Math.random() * (b-a) + a);
        if (c >= 25 && c <= 100) System.out.println("Hooray!");

        System.out.println(c);
    }
}
