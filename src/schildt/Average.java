package schildt;

public class Average {
    public static void main(String[] args) {
        double [] arr = {2, 20, 42, 62.2, 2.2, 12, 12.3, 2.5, 2.5, 22.2};
        double sum = 0.0;
        for (var x: arr) {
            sum += x;
        }
        System.out.println(sum/arr.length);
    }
}
