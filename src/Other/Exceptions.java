package Other;

public class Exceptions {
    public static void main(String[] args) throws MyException {
        int a = 2;
        if (a > 0) {
            new MyException().MyException();
            throw new MyException();
        }
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.err.println("Error!");
            new MyException().MyException();
        } finally {
            System.out.println(5);
        }
    }
}
