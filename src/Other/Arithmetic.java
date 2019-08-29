package Other;

class Arithmetic {
    public static double myDelete(double a, double b) throws MyDivByZero {
        double c;
        try {
            if (b == 0) {
                throw new MyDivByZero();
            }
            c = a / b;
        } catch (MyDivByZero e) {
            c = 0.0;
            new MyDivByZero().MyDivByZero();
            System.out.println("a");
        }
        return c;
    }

    public static void main(String[] args) {
        try {
            System.out.println("5.1, разделить на 1.2 будет "
                    + myDelete(5.1, 1));
            System.out.println("3.6, разделить на 0 будет "
                    + myDelete(3.6, 0));
            System.out.println("7.8, разделить на 3.9 будет "
                    + myDelete(7.8, 3.9));

        } catch (MyDivByZero e) {
            new MyDivByZero().MyDivByZero();
        }
    }
}