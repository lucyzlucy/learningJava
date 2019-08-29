package schildt;

public class InchToMeters {
    public static void main(String[] args) {
        double inches, meters;
        for (int i = 1; i <= 12*12; i++) {
            inches = i;
            meters = inches * 39.37;

            System.out.println(inches + " inches is " + meters + " meters.");

            if (inches % 12 == 0){
                System.out.println();
            }
        }
    }
}
