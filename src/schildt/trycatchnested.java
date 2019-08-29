package schildt;

public class trycatchnested {
    public static void main(String[] args) {
        int numer[] = {1, 8, 16, 35, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("Can't divide by 0");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No element");
        }
        System.out.println("A");
    }
}
